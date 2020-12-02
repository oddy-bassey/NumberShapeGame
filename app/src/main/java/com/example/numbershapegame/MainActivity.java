package com.example.numbershapegame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int userNumber;

    public void onClick(View view){
        TextView textView = (TextView)findViewById(R.id.textField);
        userNumber = Integer.parseInt(textView.getText().toString().trim());
        String message = ""+userNumber;

        if(isSquare(userNumber) && isTriangular(userNumber)){
            message += " is both a triangular and a square number shape!";
        }else if(isSquare(userNumber)){
            message +=" is a square number shape!";
        }else if(isTriangular(userNumber)){
            message += " is a triangular number shape!";
        }else{
            message += " is neither a triangular or a square number shape!";
        }
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    public boolean isSquare(double value){

        boolean outcome = false;
        double squareRoot = Math.sqrt(value);

        if(Math.floor(squareRoot) == squareRoot){
            outcome = true;
        }

        return outcome;
    }

    public boolean isTriangular(double value){

        boolean outcome = false;
        int triangularNumber = 1;
        int x = 1;

        while(triangularNumber < value){
            x++;
            triangularNumber = triangularNumber + x;
        }
        if(triangularNumber == value){
            outcome = true;
        }

        return outcome;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

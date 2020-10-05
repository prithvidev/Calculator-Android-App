package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnDivision,btnMultiply,btnAddition,btnSubtract,btnDot,btnPercentile,btnBrackets,btnEquals,btnClear;
    TextView inputArea,outputArea;
    String process;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);//enable full screen
        setContentView(R.layout.input_layout);
        btn0=findViewById(R.id.btn0);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);

        btnAddition=findViewById(R.id.btnAddition);
        btnSubtract=findViewById(R.id.btnSubtract);
        btnMultiply=findViewById(R.id.btnMultiply);
        btnDivision=findViewById(R.id.btnDivision);

        btnEquals=findViewById(R.id.btnEquals);

        btnBrackets=findViewById(R.id.btnBrackets);
        btnPercentile=findViewById(R.id.btnPercentile);
        btnDot=findViewById(R.id.btnDot);
        btnClear=findViewById(R.id.btnClear);

        inputArea=findViewById(R.id.inputArea);
        outputArea=findViewById(R.id.outputArea);
    }
}
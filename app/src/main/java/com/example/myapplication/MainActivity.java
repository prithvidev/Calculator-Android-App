package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnDivision,btnMultiply,btnAddition,btnSubtract,btnDot,btnPercentile,btnBrackets,btnEquals,btnClear;
    TextView inputArea,outputArea;
    String process;
    boolean br = true;

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

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputArea.setText("");
                outputArea.setText("");
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process = inputArea.getText().toString();
                inputArea.setText(process+"0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process = inputArea.getText().toString();
                inputArea.setText(process+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process = inputArea.getText().toString();
                inputArea.setText(process+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process = inputArea.getText().toString();
                inputArea.setText(process+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process = inputArea.getText().toString();
                inputArea.setText(process+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process = inputArea.getText().toString();
                inputArea.setText(process+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process = inputArea.getText().toString();
                inputArea.setText(process+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process = inputArea.getText().toString();
                inputArea.setText(process+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process = inputArea.getText().toString();
                inputArea.setText(process+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process = inputArea.getText().toString();
                inputArea.setText(process+"9");
            }
        });
        btnAddition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process = inputArea.getText().toString();
                inputArea.setText(process+"+");
            }
        });
        btnSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process = inputArea.getText().toString();
                inputArea.setText(process+"-");
            }
        });
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process = inputArea.getText().toString();
                inputArea.setText(process+"x");
            }
        });
        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process = inputArea.getText().toString();
                inputArea.setText(process+"÷");
            }
        });
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process = inputArea.getText().toString();
                inputArea.setText(process+".");
            }
        });
        btnBrackets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(br){
                process = inputArea.getText().toString();
                inputArea.setText(process+"(");
                br = false;
                }
                else{
                    process = inputArea.getText().toString();
                    inputArea.setText(process+")");
                    br = true;
                }
            }
        });
        btnPercentile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process = inputArea.getText().toString();
                inputArea.setText(process+"%");
            }
        });
        btnEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process = inputArea.getText().toString();

                process = process.replaceAll("x","*");
                process = process.replaceAll("÷","/");
                process = process.replaceAll("%","/100");
                char[] s = process.toCharArray();
                for(int i =0; i<=s.length; i++){

                }

            }
        });

    }
}
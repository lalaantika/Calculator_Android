package com.demoapp.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button button0, button1, button2, button3, button4, button5,
            button6, button7, button8, button9, buttondot, buttonadd, buttonsub, buttondiv, buttonmul,
            buttoneql, buttonAC;

    EditText calEditText;

    float mValueOne, mValueTwo;
    boolean add, sub, mul, div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttonadd = (Button) findViewById(R.id.buttonadd);
        buttonsub = (Button) findViewById(R.id.buttonsub);
        buttonmul = (Button) findViewById(R.id.buttonmul);
        buttondiv = (Button) findViewById(R.id.buttondiv);
        buttonAC = (Button) findViewById(R.id.buttonAC);
        buttondot = (Button) findViewById(R.id.buttondot);
        buttoneql = (Button) findViewById(R.id.buttoneql);
        calEditText = (EditText) findViewById(R.id.CalScreen);

        button0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                calEditText.setText(calEditText.getText()+ "0");
            }
        });

        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                calEditText.setText(calEditText.getText()+ "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                calEditText.setText(calEditText.getText()+ "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                calEditText.setText(calEditText.getText()+ "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                calEditText.setText(calEditText.getText()+ "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                calEditText.setText(calEditText.getText()+ "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                calEditText.setText(calEditText.getText()+ "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                calEditText.setText(calEditText.getText()+ "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                calEditText.setText(calEditText.getText()+ "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                calEditText.setText(calEditText.getText()+ "9");
            }
        });

        buttonAC.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                calEditText.setText("");
            }
        });

        buttondot.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                calEditText.setText(calEditText.getText()+ ".");
            }
        });

        buttonadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(calEditText == null){
                    calEditText.setText("");
                }else {
                    mValueOne = Float.parseFloat(calEditText.getText()+"");
                    add = true;
                    calEditText.setText(null);
                }
            }
        });

        buttonsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(calEditText == null){
                    calEditText.setText("");
                }else {
                    mValueOne = Float.parseFloat(calEditText.getText()+"");
                    sub = true;
                    calEditText.setText(null);
                }
            }
        });


        buttoneql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(calEditText.getText() + "");

                if(add==true){
                    calEditText.setText(mValueOne+mValueTwo+"");
                    add = false;
                }

                if(sub==true){
                    calEditText.setText(mValueOne-mValueTwo + "");
                    sub = false;
                }
            }
        });
    }
}
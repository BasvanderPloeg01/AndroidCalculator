package com.example.dennis.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText e;
    String tempString = "";
    Float awnser = 0f;
    Calculator c;
    String[] splitString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e = (EditText) findViewById(R.id.editText);
        c = new Calculator(e, tempString, splitString, awnser);
    }

    public void operatorFunction(View v) {
       c.operatorFunction(v);
    }

    public void calculate(View v) {
        c.calculate(v);
    }

    public void addNumber(View v) {
        c.addNumber(v);
    }


    public void clearEntry(View v) {
        c.clearEntry(v);
    }

    public void backSpace(View v) {
        c.backSpace(v);
    }
}


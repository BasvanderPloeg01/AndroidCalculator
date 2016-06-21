package com.example.dennis.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText e;
    Button one;
    Button two;
    Button three;
    Button four;
    Button five;
    Button six;
    Button seven;
    Button eight;
    Button nine;
    Button nul;
    Button plus;
    Button minus;
    Button times;
    Button divided;
    Button equals;
    Button dot;
    String tempString;
    Float tempNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       instanceObj();


    }


    public void operatorFunction(View v){
       // tempNumber = Float.parseFloat((tempString));
    switch (v.getId()){
        case R.id.button4:
            tempString = tempString + "+";
            e.setText(tempString);
            break;
        case R.id.button5:
            tempString = tempString+ "-";
            e.setText(tempString);
            break;
        case R.id.button6:
            tempString = tempString+ "*";
            e.setText(tempString);
            break;
        case R.id.button7:
            tempString = tempString+ "/";
            e.setText(tempString);
            break;
        case R.id.button19:
            tempString = tempString+ ".";
            e.setText(tempString);
            break;
    }
    }



    public void addNumber(View v) {
    switch (v.getId())
    {
        case R.id.button14:
            if(e.getText().equals("")){
                e.setText(one.getText());}
            else{
                 tempString = (""+e.getText()) + (""+one.getText());
                e.setText(tempString);
            }
            break;
        case R.id.button15:
            if(e.getText().equals("")){
                e.setText(two.getText());}
            else{
                 tempString = (""+e.getText()) + (""+two.getText());
                e.setText(tempString);
            }
            break;
        case R.id.button16:
            if(e.getText().equals("")){
                e.setText(three.getText());}
            else{
                tempString = (""+e.getText()) + (""+three.getText());
                e.setText(tempString);
            }
            break;
        case R.id.button11:
            if(e.getText().equals("")){
                e.setText(four.getText());}
            else{
                 tempString = (""+e.getText()) + (""+four.getText());
                e.setText(tempString);
            }
            break;
        case R.id.button12:
            if(e.getText().equals("")){
                e.setText(five.getText());}
            else{
                 tempString = (""+e.getText()) + (""+five.getText());
                e.setText(tempString);
            }
            break;
        case R.id.button13:
            if(e.getText().equals("")){
                e.setText(six.getText());}
            else{
                 tempString = (""+e.getText()) + (""+six.getText());
                e.setText(tempString);
            }
            break;
        case R.id.button8:
            if(e.getText().equals("")){
                e.setText(seven.getText());}
            else{
                 tempString = (""+e.getText()) + (""+seven.getText());
                e.setText(tempString);
            }
            break;
        case R.id.button9:
            if(e.getText().equals("")){
                e.setText(eight.getText());}
            else{
                 tempString = (""+e.getText()) + (""+eight.getText());
                e.setText(tempString);
            }
            break;
        case R.id.button10:
            if(e.getText().equals("")){
                e.setText(nine.getText());}
            else{
                 tempString = (""+e.getText()) + (""+nine.getText());
                e.setText(tempString);
            }
            break;
        case R.id.button17:
            if(e.getText().equals("")){
                e.setText(nul.getText());}
            else{
                 tempString = (""+e.getText()) + (""+nul.getText());
                e.setText(tempString);
            }
            break;
    }
    }

    public void clearEntry(View v) {
        e.setText("");
    }

    public void instanceObj(){
        e = (EditText) findViewById(R.id.editText);
        one = (Button) findViewById(R.id.button14);
        two  = (Button) findViewById(R.id.button15);
        three  = (Button) findViewById(R.id.button16);
        four  = (Button) findViewById(R.id.button11);
        five  = (Button) findViewById(R.id.button12);
        six  = (Button) findViewById(R.id.button13);
        seven = (Button) findViewById(R.id.button8);
        eight  = (Button) findViewById(R.id.button9);
        nine  = (Button) findViewById(R.id.button10);
        nul  = (Button) findViewById(R.id.button17);
        plus = (Button) findViewById(R.id.button4);
        minus = (Button) findViewById(R.id.button5);
        times = (Button) findViewById(R.id.button6);
        divided = (Button) findViewById(R.id.button7);
        equals = (Button) findViewById(R.id.button18);
        dot = (Button) findViewById(R.id.button19);
    }
}


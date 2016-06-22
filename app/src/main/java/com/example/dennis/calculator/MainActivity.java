package com.example.dennis.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
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
    String tempString = "";
    Float awnser = 0f;
    String[] splitString;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       instanceObj();


    }


    public void operatorFunction(View v){
       Button btn = (Button) v;
        tempString = tempString + btn.getText();
        e.setText(tempString);
    }

    public void calculate(View v)
    {
        switch (v.getId()){
            case R.id.button18:
                if(tempString.contains("+")) {
                    splitString = tempString.split("\\+");
                     awnser = Float.parseFloat(splitString[0]) + Float.parseFloat(splitString[1]);
                    e.setText("" + awnser);
                }
                if(tempString.contains("-")){
                    splitString = tempString.split("\\-");
                     awnser = Float.parseFloat(splitString[0])-Float.parseFloat(splitString[1]);
                    e.setText(""+awnser);
                }
                if(tempString.contains("*")){
                    splitString = tempString.split("\\*");
                     awnser = Float.parseFloat(splitString[0])*Float.parseFloat(splitString[1]);
                    e.setText(""+awnser);
                }
                if(tempString.contains("/")){
                    splitString = tempString.split("/");
                     awnser = Float.parseFloat(splitString[0])/Float.parseFloat(splitString[1]);
                    e.setText(""+awnser);
                }
                break;
        }
    }

    public void addNumber(View v) {
        Button btn = (Button) v;
        if(e.getText().equals("")||(awnser!=0f))
        {
            e.setText(btn.getText());
            tempString = ""+e.getText();
            awnser = 0f;
        }else{
            tempString = (""+e.getText()) + (""+btn.getText());
            e.setText(tempString);
        }
    }


    public void clearEntry(View v) {
        tempString = "";
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


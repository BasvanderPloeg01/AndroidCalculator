package com.example.dennis.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText e;
    String tempString = "";
    Float awnser = 0f;
    String[] splitString;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e = (EditText) findViewById(R.id.editText);
    }


    public void operatorFunction(View v){
       Button btn = (Button) v;
        tempString = tempString + btn.getText();
        e.setText(tempString);
    }

    public void calculate(View v) {
        switch (v.getId()) {
            case R.id.button18:
                if(tempString.contains("+")) {
                    splitString = tempString.split("\\+");
                     awnser = Float.parseFloat(splitString[0]) + Float.parseFloat(splitString[1]);
                    e.setText("" + awnser);
                }

                if(tempString.contains("-")) {
                    splitString = tempString.split("\\-");
                     awnser = Float.parseFloat(splitString[0])-Float.parseFloat(splitString[1]);
                    e.setText(""+awnser);
                }

                if(tempString.contains("*")) {
                    splitString = tempString.split("\\*");
                     awnser = Float.parseFloat(splitString[0])*Float.parseFloat(splitString[1]);
                    e.setText(""+awnser);
                }

                if(tempString.contains("/")) {
                    splitString = tempString.split("/");
                     awnser = Float.parseFloat(splitString[0])/Float.parseFloat(splitString[1]);
                    e.setText(""+awnser);
                }

                break;
        }
    }

    public void addNumber(View v) {
        Button btn = (Button) v;
        if(e.getText().equals("") || (awnser!=0f)) {
            e.setText(btn.getText());
            tempString = ""+e.getText();
            awnser = 0f;
        } else {
            tempString = (""+e.getText()) + (""+btn.getText());
            e.setText(tempString);
        }
    }


    public void clearEntry(View v) {
        tempString = "";
        e.setText("");
    }
}


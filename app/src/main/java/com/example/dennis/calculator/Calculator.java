package com.example.dennis.calculator;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Calculator extends AppCompatActivity {
    public EditText e;
    public String tempString;
    public String[] splitString;
    public float awnser;

    public Calculator(EditText et, String tempString, String[] splitString, float awnser) {
        this.e = et;
        this.tempString = tempString;
        this.splitString = splitString;
        this.awnser = awnser;
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

    public void operatorFunction(View v) {
        Button btn = (Button) v;
        tempString = tempString + btn.getText();
        e.setText(tempString);
    }

    public void clearEntry(View v) {
        tempString = "";
        e.setText("");
    }

    public void backSpace(View v) {
        if(awnser != 0) {
            tempString="";
        }

        tempString = backSpaceManager(tempString);
        e.setText(tempString);
    }

    public String backSpaceManager(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }

        return s.substring(0, s.length()-1);
    }
}

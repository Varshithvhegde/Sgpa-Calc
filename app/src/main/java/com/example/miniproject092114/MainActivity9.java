package com.example.miniproject092114;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity9 extends AppCompatActivity {

    EditText s81,s82,s83,s84,s85,sgpa8;
    Button calculate8;
    EditText grade81,grade82,grade83,grade84,grade85;
    float value81,value82,value83,value84,value85;
    float v81,v82,v83,v84,v85;
    String vv81,vv82,vv83,vv84,vv85;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
        s81=(EditText) findViewById(R.id.S81);
        s82=(EditText) findViewById(R.id.S82);
        s83=(EditText) findViewById(R.id.S83);
        s84=(EditText) findViewById(R.id.S84);
        s85=(EditText) findViewById(R.id.S85);
        calculate8=(Button)findViewById(R.id.CALCULATE8);
        sgpa8=(EditText) findViewById(R.id.SGPA2);
        grade81=(EditText)findViewById(R.id.GRADE81);
        grade82=(EditText)findViewById(R.id.GRADE82);
        grade83=(EditText)findViewById(R.id.GRADE83);
        grade84=(EditText)findViewById(R.id.GRADE84);
        grade85=(EditText)findViewById(R.id.GRADE85);


        calculate8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value81= Float.parseFloat(String.valueOf(s81.getText()));
                v81=checkfunction(value81);
                vv81=String.valueOf(v81);
                grade81.setText(String.valueOf(checkgrade(String.valueOf(vv81))));

                value82= Float.parseFloat(String.valueOf(s82.getText()));
                v82=checkfunction(value82);
                vv82=String.valueOf(v82);
                grade82.setText(String.valueOf(checkgrade(String.valueOf(vv82))));

                value83= Float.parseFloat(String.valueOf(s83.getText()));
                v83=checkfunction(value83);
                vv83=String.valueOf(v83);
                grade83.setText(String.valueOf(checkgrade(String.valueOf(vv83))));

                value84= Float.parseFloat(String.valueOf(s84.getText()));
                v84=checkfunction(value84);
                vv84=String.valueOf(v84);
                grade84.setText(String.valueOf(checkgrade(String.valueOf(vv84))));

                value85= Float.parseFloat(String.valueOf(s85.getText()));
                v85=checkfunction(value85);
                vv85=String.valueOf(v85);
                grade85.setText(String.valueOf(checkgrade(String.valueOf(vv85))));

                sgpa8.setText(String.valueOf ((v81*3)+(v82*3)+(v83*8)+(v84*1)+(v85*3)/18));
            }
        });

    }
    private float checkfunction(float valuesem8)
    {
        if(valuesem8>100 | valuesem8<0)
        {
            System.out.println("Invalid");
            Toast.makeText(MainActivity9.this,"Invalid",Toast.LENGTH_LONG).show();
        }
        if(valuesem8>=90) {
            valuesem8=10;

        }
        else if(valuesem8>=80) {
            valuesem8=9;

        }
        else if(valuesem8>=70) {
            valuesem8=8;
        }
        else if(valuesem8>=60) {
            valuesem8=7;
        }
        else if(valuesem8>=50){
            valuesem8=6;
        }
        else if(valuesem8>=45) {
            valuesem8=4;
        }
        else {
            valuesem8=0;
        }
        return valuesem8;
    }

    private String checkgrade(String grade8)
    {
        if(grade8.equals("10.0"))
            grade8="S";
        else if(grade8.equals("9.0"))
            grade8="A";
        else if(grade8.equals("8.0"))
            grade8="B";
        else if(grade8.equals("7.0"))
            grade8="C";
        else if(grade8.equals("6.0"))
            grade8="D";
        else if(grade8.equals("4.0"))
            grade8="E";
        else
            grade8="F";
        return grade8;

    }

}
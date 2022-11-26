package com.example.miniproject092114;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity6 extends AppCompatActivity {

    EditText s51,s52,s53,s54,s55,s56,s57,s58,s59,sgpa5;
    Button calculate5,edit;
    EditText grade51,grade52,grade53,grade54,grade55,grade56,grade57,grade58,grade59;
    float value51,value52,value53,value54,value55,value56,value57,value58,value59;
    float v51,v52,v53,v54,v55,v56,v57,v58,v59;
    String vv51,vv52,vv53,vv54,vv55,vv56,vv57,vv58,vv59;
    String[] subnames ={"18MAT11","18PHY12","18ELE13","18CIV14","18EGDL15","18PHYL16","18ELEL17","18EGH18","18MAT21","18CHE22","18CPS23","18ELN24","18ME25","18CHEL26",
            "18CPL27","18EGH28","18**31","18**32","18**33","18**34","18**35","18**36","18**37","18**38","18***39","18**41","18**42",
            "18**43","18**44","18**45","18**46","18**47","18**48","18***49"};
    LinearLayout lin ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        s51=(EditText) findViewById(R.id.S51);
        s52=(EditText) findViewById(R.id.S52);
        s53=(EditText) findViewById(R.id.S53);
        s54=(EditText) findViewById(R.id.S54);
        s55=(EditText) findViewById(R.id.S55);
        s56=(EditText) findViewById(R.id.S56);
        s57=(EditText) findViewById(R.id.S57);
        s58=(EditText) findViewById(R.id.S58);
        s59=(EditText) findViewById(R.id.S59);
        calculate5=(Button)findViewById(R.id.CALCULATE5);
        edit=(Button) findViewById(R.id.subs);
        sgpa5=(EditText) findViewById(R.id.SGPA2);
        grade51=(EditText)findViewById(R.id.GRADE51);
        grade52=(EditText)findViewById(R.id.GRADE52);
        grade53=(EditText)findViewById(R.id.GRADE53);
        grade54=(EditText)findViewById(R.id.GRADE54);
        grade55=(EditText)findViewById(R.id.GRADE55);
        grade56=(EditText)findViewById(R.id.GRADE56);
        grade57=(EditText)findViewById(R.id.GRADE57);
        grade58=(EditText)findViewById(R.id.GRADE58);
        grade59=(EditText)findViewById(R.id.GRADE59);
        lin=(LinearLayout) findViewById(R.id.linear);


        calculate5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value51= Float.parseFloat(String.valueOf(s51.getText()));
                v51=checkfunction(value51);
                vv51=String.valueOf(v51);
                grade51.setText(String.valueOf(checkgrade(String.valueOf(vv51))));

                value52= Float.parseFloat(String.valueOf(s52.getText()));
                v52=checkfunction(value52);
                vv52=String.valueOf(v52);
                grade52.setText(String.valueOf(checkgrade(String.valueOf(vv52))));

                value53= Float.parseFloat(String.valueOf(s53.getText()));
                v53=checkfunction(value53);
                vv53=String.valueOf(v53);
                grade53.setText(String.valueOf(checkgrade(String.valueOf(vv53))));

                value54= Float.parseFloat(String.valueOf(s54.getText()));
                v54=checkfunction(value54);
                vv54=String.valueOf(v54);
                grade54.setText(String.valueOf(checkgrade(String.valueOf(vv54))));

                value55= Float.parseFloat(String.valueOf(s55.getText()));
                v55=checkfunction(value55);
                vv55=String.valueOf(v55);
                grade55.setText(String.valueOf(checkgrade(String.valueOf(vv55))));

                value56= Float.parseFloat(String.valueOf(s56.getText()));
                v56=checkfunction(value56);
                vv56=String.valueOf(v56);
                grade56.setText(String.valueOf(checkgrade(String.valueOf(vv56))));

                value57= Float.parseFloat(String.valueOf(s57.getText()));
                v57=checkfunction(value57);
                vv57=String.valueOf(v57);
                grade57.setText(String.valueOf(checkgrade(String.valueOf(vv57))));

                value58= Float.parseFloat(String.valueOf(s58.getText()));
                v58=checkfunction(value58);
                vv58=String.valueOf(v58);
                grade58.setText(String.valueOf(checkgrade(String.valueOf(vv58))));

                value59= Float.parseFloat(String.valueOf(s59.getText()));
                v59=checkfunction(value59);
                vv59=String.valueOf(v59);
                grade59.setText(String.valueOf(checkgrade(String.valueOf(vv59))));


                sgpa5.setText(String.valueOf (((v51*3)+(v52*4)+(v53*4)+(v54*3)+(v55*3)+(v56*3)+(v57*2)+(v58*2)+(v59*1))/25));
            }
        });

        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LayoutInflater inflater = (LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View layout = inflater.inflate(R.layout.sem3, null);
                Spinner spinner = (Spinner)layout.findViewById(R.id.drop);

                ArrayAdapter aa = new ArrayAdapter(getApplicationContext(),android.R.layout.simple_spinner_item,subnames);
                aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinner.setAdapter(aa);
                spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                        Toast.makeText(getApplicationContext(), subnames[i], Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> adapterView) {

                    }
                });
                lin.addView(layout);




            }
        });

    }
    private float checkfunction(float valuesem5)
    {
        if(valuesem5>100 | valuesem5<0)
        {
            System.out.println("Invalid");
            Toast.makeText(MainActivity6.this,"Invalid",Toast.LENGTH_LONG).show();
        }
        if(valuesem5>=90) {
            valuesem5=10;

        }
        else if(valuesem5>=80) {
            valuesem5=9;

        }
        else if(valuesem5>=70) {
            valuesem5=8;
        }
        else if(valuesem5>=60) {
            valuesem5=7;
        }
        else if(valuesem5>=50){
            valuesem5=6;
        }
        else if(valuesem5>=45) {
            valuesem5=4;
        }
        else {
            valuesem5=0;
        }
        return valuesem5;
    }

    private String checkgrade(String grade5)
    {
        if(grade5.equals("10.0"))
            grade5="S";
        else if(grade5.equals("9.0"))
            grade5="A";
        else if(grade5.equals("8.0"))
            grade5="B";
        else if(grade5.equals("7.0"))
            grade5="C";
        else if(grade5.equals("6.0"))
            grade5="D";
        else if(grade5.equals("4.0"))
            grade5="E";
        else
            grade5="F";
        return grade5;

    }

}
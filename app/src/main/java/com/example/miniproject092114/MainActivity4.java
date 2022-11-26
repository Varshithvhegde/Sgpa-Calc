package com.example.miniproject092114;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.app.ActionBar;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {

    EditText s31,s32,s33,s34,s35,s36,s37,s38,s39,sgpa3;
    Button calculate3,edit;
    EditText grade31,grade32,grade33,grade34,grade35,grade36,grade37,grade38,grade39;
    float value31,value32,value33,value34,value35,value36,value37,value38,value39;
    float v31,v32,v33,v34,v35,v36,v37,v38,v39;
    String vv31,vv32,vv33,vv34,vv35,vv36,vv37,vv38,vv39;
    String[] subnames ={"18MAT11","18PHY12","18ELE13","18CIV14","18EGDL15","18PHYL16","18ELEL17","18EGH18","18MAT21","18CHE22","18CPS23","18ELN24","18ME25","18CHEL26",
                        "18CPL27","18EGH28"};
    LinearLayout lin ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        lin=(LinearLayout)findViewById(R.id.linear);
        s31=(EditText) findViewById(R.id.S31);
        s32=(EditText) findViewById(R.id.S32);
        s33=(EditText) findViewById(R.id.S33);
        s34=(EditText) findViewById(R.id.S34);
        s35=(EditText) findViewById(R.id.S35);
        s36=(EditText) findViewById(R.id.S36);
        s37=(EditText) findViewById(R.id.S37);
        s38=(EditText) findViewById(R.id.S38);
        s39=(EditText) findViewById(R.id.S39);
        calculate3=(Button)findViewById(R.id.CALCULATE3);
        edit=(Button) findViewById(R.id.subs);
        sgpa3=(EditText) findViewById(R.id.SGPA2);
        grade31=(EditText)findViewById(R.id.GRADE31);
        grade32=(EditText)findViewById(R.id.GRADE32);
        grade33=(EditText)findViewById(R.id.GRADE33);
        grade34=(EditText)findViewById(R.id.GRADE34);
        grade35=(EditText)findViewById(R.id.GRADE35);
        grade36=(EditText)findViewById(R.id.GRADE36);
        grade37=(EditText)findViewById(R.id.GRADE37);
        grade38=(EditText)findViewById(R.id.GRADE38);
        grade39=(EditText)findViewById(R.id.GRADE39);

        calculate3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value31= Float.parseFloat(String.valueOf(s31.getText()));
                v31=checkfunction(value31);
                vv31=String.valueOf(v31);
                grade31.setText(String.valueOf(checkgrade(String.valueOf(vv31))));

                value32= Float.parseFloat(String.valueOf(s32.getText()));
                v32=checkfunction(value32);
                vv32=String.valueOf(v32);
                grade32.setText(String.valueOf(checkgrade(String.valueOf(vv32))));

                value33= Float.parseFloat(String.valueOf(s33.getText()));
                v33=checkfunction(value33);
                vv33=String.valueOf(v33);
                grade33.setText(String.valueOf(checkgrade(String.valueOf(vv33))));

                value34= Float.parseFloat(String.valueOf(s34.getText()));
                v34=checkfunction(value34);
                vv34=String.valueOf(v34);
                grade34.setText(String.valueOf(checkgrade(String.valueOf(vv34))));

                value35= Float.parseFloat(String.valueOf(s35.getText()));
                v35=checkfunction(value35);
                vv35=String.valueOf(v35);
                grade35.setText(String.valueOf(checkgrade(String.valueOf(vv35))));

                value36= Float.parseFloat(String.valueOf(s36.getText()));
                v36=checkfunction(value36);
                vv36=String.valueOf(v36);
                grade36.setText(String.valueOf(checkgrade(String.valueOf(vv36))));

                value37= Float.parseFloat(String.valueOf(s37.getText()));
                v37=checkfunction(value37);
                vv37=String.valueOf(v37);
                grade37.setText(String.valueOf(checkgrade(String.valueOf(vv37))));

                value38= Float.parseFloat(String.valueOf(s38.getText()));
                v38=checkfunction(value38);
                vv38=String.valueOf(v38);
                grade38.setText(String.valueOf(checkgrade(String.valueOf(vv38))));

                value39= Float.parseFloat(String.valueOf(s39.getText()));
                v39=checkfunction(value39);
                vv39=String.valueOf(v39);
                grade39.setText(String.valueOf(checkgrade(String.valueOf(vv39))));
                grade39.setText(String.valueOf(checkgrade(String.valueOf(vv39))));


                sgpa3.setText(String.valueOf (((v31*3)+(v32*4)+(v33*3)+(v34*3)+(v35*3)+(v36*3)+(v37*2)+(v38*2)+(v39*1))/24));
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
    private float checkfunction(float valuesem3)
    {
        if(valuesem3>100 | valuesem3<0)
        {
            System.out.println("Invalid");
            Toast.makeText(MainActivity4.this,"Invalid",Toast.LENGTH_LONG).show();
        }
        if(valuesem3>=90) {
            valuesem3=10;

        }
        else if(valuesem3>=80) {
            valuesem3=9;

        }
        else if(valuesem3>=70) {
            valuesem3=8;
        }
        else if(valuesem3>=60) {
            valuesem3=7;
        }
        else if(valuesem3>=50){
            valuesem3=6;
        }
        else if(valuesem3>=45) {
            valuesem3=4;
        }
        else {
            valuesem3=0;
        }
        return valuesem3;
    }

    private String checkgrade(String grade3)
    {
        if(grade3.equals("10.0"))
            grade3="S";
        else if(grade3.equals("9.0"))
            grade3="A";
        else if(grade3.equals("8.0"))
            grade3="B";
        else if(grade3.equals("7.0"))
            grade3="C";
        else if(grade3.equals("6.0"))
            grade3="D";
        else if(grade3.equals("4.0"))
            grade3="E";
        else
            grade3="F";
        return grade3;

    }

}
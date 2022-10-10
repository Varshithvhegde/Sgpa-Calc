package com.example.miniproject092114;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity7 extends AppCompatActivity {

    EditText s61,s62,s63,s64,s65,s66,s67,s68,s69,sgpa6;
    Button calculate6;
    EditText grade61,grade62,grade63,grade64,grade65,grade66,grade67,grade68;
    float value61,value62,value63,value64,value65,value66,value67,value68;
    float v61,v62,v63,v64,v65,v66,v67,v68;
    String vv61,vv62,vv63,vv64,vv65,vv66,vv67,vv68;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        s61=(EditText) findViewById(R.id.S81);
        s62=(EditText) findViewById(R.id.S82);
        s63=(EditText) findViewById(R.id.S83);
        s64=(EditText) findViewById(R.id.S84);
        s65=(EditText) findViewById(R.id.S85);
        s66=(EditText) findViewById(R.id.S76);
        s67=(EditText) findViewById(R.id.S77);
        s68=(EditText) findViewById(R.id.S68);
        calculate6=(Button)findViewById(R.id.CALCULATE6);
        sgpa6=(EditText) findViewById(R.id.SGPA2);
        grade61=(EditText)findViewById(R.id.GRADE61);
        grade62=(EditText)findViewById(R.id.GRADE62);
        grade63=(EditText)findViewById(R.id.GRADE63);
        grade64=(EditText)findViewById(R.id.GRADE64);
        grade65=(EditText)findViewById(R.id.GRADE65);
        grade66=(EditText)findViewById(R.id.GRADE66);
        grade67=(EditText)findViewById(R.id.GRADE67);
        grade68=(EditText)findViewById(R.id.GRADE68);



        calculate6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value61= Float.parseFloat(String.valueOf(s61.getText()));
                v61=checkfunction(value61);
                vv61=String.valueOf(v61);
                grade61.setText(String.valueOf(checkgrade(String.valueOf(vv61))));

                value62= Float.parseFloat(String.valueOf(s62.getText()));
                v62=checkfunction(value62);
                vv62=String.valueOf(v62);
                grade62.setText(String.valueOf(checkgrade(String.valueOf(vv62))));

                value63= Float.parseFloat(String.valueOf(s63.getText()));
                v63=checkfunction(value63);
                vv63=String.valueOf(v63);
                grade63.setText(String.valueOf(checkgrade(String.valueOf(vv63))));

                value64= Float.parseFloat(String.valueOf(s64.getText()));
                v64=checkfunction(value64);
                vv64=String.valueOf(v64);
                grade64.setText(String.valueOf(checkgrade(String.valueOf(vv64))));

                value65= Float.parseFloat(String.valueOf(s65.getText()));
                v65=checkfunction(value65);
                vv65=String.valueOf(v65);
                grade65.setText(String.valueOf(checkgrade(String.valueOf(vv65))));

                value66= Float.parseFloat(String.valueOf(s66.getText()));
                v66=checkfunction(value66);
                vv66=String.valueOf(v66);
                grade66.setText(String.valueOf(checkgrade(String.valueOf(vv66))));

                value67= Float.parseFloat(String.valueOf(s67.getText()));
                v67=checkfunction(value67);
                vv67=String.valueOf(v67);
                grade67.setText(String.valueOf(checkgrade(String.valueOf(vv67))));

                value68= Float.parseFloat(String.valueOf(s68.getText()));
                v68=checkfunction(value68);
                vv68=String.valueOf(v68);
                grade68.setText(String.valueOf(checkgrade(String.valueOf(vv68))));

                sgpa6.setText(String.valueOf (((v61*4)+(v62*4)+(v63*4)+(v64*3)+(v65*3)+(v66*2)+(v67*2)+(v68*2))/24));
            }
        });

    }
    private float checkfunction(float valuesem6)
    {
        if(valuesem6>100 | valuesem6<0)
        {
            System.out.println("Invalid");
            Toast.makeText(MainActivity7.this,"Invalid",Toast.LENGTH_LONG).show();
        }
        if(valuesem6>=90) {
            valuesem6=10;

        }
        else if(valuesem6>=80) {
            valuesem6=9;

        }
        else if(valuesem6>=70) {
            valuesem6=8;
        }
        else if(valuesem6>=60) {
            valuesem6=7;
        }
        else if(valuesem6>=50){
            valuesem6=6;
        }
        else if(valuesem6>=45) {
            valuesem6=4;
        }
        else {
            valuesem6=0;
        }
        return valuesem6;
    }

    private String checkgrade(String grade6)
    {
        if(grade6.equals("10.0"))
            grade6="S";
        else if(grade6.equals("9.0"))
            grade6="A";
        else if(grade6.equals("8.0"))
            grade6="B";
        else if(grade6.equals("7.0"))
            grade6="C";
        else if(grade6.equals("6.0"))
            grade6="D";
        else if(grade6.equals("4.0"))
            grade6="E";
        else
            grade6="F";
        return grade6;

    }

}
package com.example.miniproject092114;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    EditText mat21,che21,cps23,eln24,me25,chel26,cpl27,egh28,sgpa2;
    Button calculate2;
    float value21,value22,value23,value24,value25,value26,value27,value28;
    float v21,v22,v23,v24,v25,v26,v27,v28;
    EditText grade21,grade22,grade23,grade24,grade25,grade26,grade27,grade28;
    String vv21,vv22,vv23,vv24,vv25,vv26,vv27,vv28;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        mat21=(EditText) findViewById(R.id.MAT21);
        che21=(EditText) findViewById(R.id.CHE22);
        cps23=(EditText) findViewById(R.id.CPS23);
        eln24=(EditText) findViewById(R.id.ELN24);
        me25=(EditText) findViewById(R.id.ME25);
        chel26=(EditText) findViewById(R.id.CHEL26);
        cpl27=(EditText) findViewById(R.id.CPL27);
        egh28=(EditText) findViewById(R.id.EGH28);
        calculate2=(Button)findViewById(R.id.CALCULATE2);
        sgpa2=(EditText) findViewById(R.id.SGPA2);
        grade21=(EditText)findViewById(R.id.GRADE21);
        grade22=(EditText)findViewById(R.id.GRADE22);
        grade23=(EditText)findViewById(R.id.GRADE23);
        grade24=(EditText)findViewById(R.id.GRADE24);
        grade25=(EditText)findViewById(R.id.GRADE25);
        grade26=(EditText)findViewById(R.id.GRADE26);
        grade27=(EditText)findViewById(R.id.GRADE27);
        grade28=(EditText)findViewById(R.id.GRADE28);

        calculate2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value21= Float.parseFloat(String.valueOf(mat21.getText()));
                v21=checkfunction(value21);
                vv21=String.valueOf(v21);
                grade21.setText(String.valueOf(checkgrade(String.valueOf(vv21))));

                value22= Float.parseFloat(String.valueOf(che21.getText()));
                v22=checkfunction(value22);
                vv22=String.valueOf(v22);
                grade22.setText(String.valueOf(checkgrade(String.valueOf(vv22))));

                value23= Float.parseFloat(String.valueOf(cps23.getText()));
                v23=checkfunction(value23);
                vv23=String.valueOf(v23);
                grade23.setText(String.valueOf(checkgrade(String.valueOf(vv23))));

                value24= Float.parseFloat(String.valueOf(eln24.getText()));
                v24=checkfunction(value24);
                vv24=String.valueOf(v24);
                grade24.setText(String.valueOf(checkgrade(String.valueOf(vv24))));

                value25= Float.parseFloat(String.valueOf(me25.getText()));
                v25=checkfunction(value25);
                vv25=String.valueOf(v25);
                grade25.setText(String.valueOf(checkgrade(String.valueOf(vv25))));

                value26= Float.parseFloat(String.valueOf(chel26.getText()));
                v26=checkfunction(value26);
                vv26=String.valueOf(v26);
                grade26.setText(String.valueOf(checkgrade(String.valueOf(vv26))));

                value27= Float.parseFloat(String.valueOf(cpl27.getText()));
                v27=checkfunction(value27);
                vv27=String.valueOf(v27);
                grade27.setText(String.valueOf(checkgrade(String.valueOf(vv27))));

                value28= Float.parseFloat(String.valueOf(egh28.getText()));
                v28=checkfunction(value28);
                vv28=String.valueOf(v28);
                grade28.setText(String.valueOf(checkgrade(String.valueOf(vv28))));


                sgpa2.setText(String.valueOf (((v21*4)+(v22*4)+(v23*3)+(v24*3)+(v25*3)+(v26*2)+(v27*2)+(v28*1))/22));
            }
        });

    }
    private float checkfunction(float valuesem2)
    {
        if(valuesem2>100 | valuesem2<0)
        {
            System.out.println("Invalid");
            Toast.makeText(MainActivity3.this,"Invalid",Toast.LENGTH_LONG).show();
        }
        if(valuesem2>=90) {
            valuesem2=10;

        }
        else if(valuesem2>=80) {
            valuesem2=9;

        }
        else if(valuesem2>=70) {
            valuesem2=8;
        }
        else if(valuesem2>=60) {
            valuesem2=7;
        }
        else if(valuesem2>=45){
            valuesem2=6;
        }
        else if(valuesem2>=40) {
            valuesem2=4;
        }
        else {
            valuesem2=0;
        }
        return valuesem2;
    }

    private String checkgrade(String grade2)
    {
        if(grade2.equals("10.0"))
            grade2="S";
        else if(grade2.equals("9.0"))
            grade2="A";
        else if(grade2.equals("8.0"))
            grade2="B";
        else if(grade2.equals("7.0"))
            grade2="C";
        else if(grade2.equals("6.0"))
            grade2="D";
        else if(grade2.equals("4.0"))
            grade2="E";
        else
            grade2="F";
        return grade2;

    }

}
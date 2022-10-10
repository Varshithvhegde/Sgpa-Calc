package com.example.miniproject092114;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity11 extends AppCompatActivity {

    EditText sem1,sem2,sem3,sem4,sem5,sem6,sem7,sem8,cgpacalculate;
    Button calculatecgpa;
    float value1,value2,value3,value4,value5,value6,value7,value8;
    float C1,C2,C3,C4,C5,C6,C7,C8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);
        sem1=(EditText) findViewById(R.id.SEMESTER1);
        sem2=(EditText) findViewById(R.id.SEMESTER2);
        sem3=(EditText) findViewById(R.id.SEMESTER3);
        sem4=(EditText) findViewById(R.id.SEMESTER4);
        sem5=(EditText) findViewById(R.id.SEMESTER5);
        sem6=(EditText) findViewById(R.id.SEMESTER6);
        sem7=(EditText) findViewById(R.id.SEMESTER7);
        sem8=(EditText) findViewById(R.id.SEMESTER8);
        calculatecgpa=(Button)findViewById(R.id.CALCULATECGPA);
        cgpacalculate=(EditText) findViewById(R.id.CGPACALCULATE);
        calculatecgpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value1= Float.parseFloat(String.valueOf(sem1.getText()));
                if(value1==0)
                    C1=0;
                else C1=22;

                value2= Float.parseFloat(String.valueOf(sem2.getText()));
                if(value2==0)
                    C2=0;
                else C2=22;

                value3= Float.parseFloat(String.valueOf(sem3.getText()));
                if(value3==0)
                    C3=0;
                else C3=24;

                value4= Float.parseFloat(String.valueOf(sem4.getText()));
                if(value4==0)
                    C4=0;
                else C4=24;

                value5= Float.parseFloat(String.valueOf(sem5.getText()));
                if(value5==0)
                    C5=0;
                else C5=25;

                value6= Float.parseFloat(String.valueOf(sem6.getText()));
                if(value6==0)
                    C6=0;
                else C6=24;

                value7= Float.parseFloat(String.valueOf(sem7.getText()));
                if(value7==0)
                    C7=0;
                else C1=20;

                value8= Float.parseFloat(String.valueOf(sem8.getText()));
                if(value8==0)
                    C8=0;
                else C8=18;

                cgpacalculate.setText(String.valueOf (((value1*C1)+(value2*C2)+(value3*C3)+(value4*C4)+(value5*C5)+(value6*C6)+(value7*C7)+(value8*C8))/(C1+C2+C3+C4+C5+C6+C7+C8)));
            }
        });
    }
}
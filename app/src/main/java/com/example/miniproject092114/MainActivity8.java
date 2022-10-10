package com.example.miniproject092114;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity8 extends AppCompatActivity {

    EditText s71,s72,s73,s74,s75,s76,s77,sgpa7;
    Button calculate7;
    float value71,value72,value73,value74,value75,value76,value77;
    float v71,v72,v73,v74,v75,v76,v77;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        s71=(EditText) findViewById(R.id.S81);
        s72=(EditText) findViewById(R.id.S82);
        s73=(EditText) findViewById(R.id.S83);
        s74=(EditText) findViewById(R.id.S84);
        s75=(EditText) findViewById(R.id.S85);
        s76=(EditText) findViewById(R.id.S76);
        s77=(EditText) findViewById(R.id.S77);
        calculate7=(Button)findViewById(R.id.CALCULATE7);
        sgpa7=(EditText) findViewById(R.id.SGPA2);

        calculate7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value71= Float.parseFloat(String.valueOf(s71.getText()));
                v71=checkfunction(value71);

                value72= Float.parseFloat(String.valueOf(s72.getText()));
                v72=checkfunction(value72);

                value73= Float.parseFloat(String.valueOf(s73.getText()));
                v73=checkfunction(value73);

                value74= Float.parseFloat(String.valueOf(s74.getText()));
                v74=checkfunction(value74);

                value75= Float.parseFloat(String.valueOf(s75.getText()));
                v75=checkfunction(value75);

                value76= Float.parseFloat(String.valueOf(s76.getText()));
                v76=checkfunction(value76);

                value77= Float.parseFloat(String.valueOf(s77.getText()));
                v77=checkfunction(value77);

                sgpa7.setText(String.valueOf ((v71*4)+(v72*4)+(v73*3)+(v74*3)+(v75*3)+(v76*2)+(v77*1)/20));
            }
        });

    }
    private float checkfunction(float valuesem7)
    {
        if(valuesem7>100 | valuesem7<0)
        {
            System.out.println("Invalid");
            Toast.makeText(MainActivity8.this,"Invalid",Toast.LENGTH_LONG).show();
        }
        if(valuesem7>=90) {
            valuesem7=10;

        }
        else if(valuesem7>=80) {
            valuesem7=9;

        }
        else if(valuesem7>=70) {
            valuesem7=8;
        }
        else if(valuesem7>=60) {
            valuesem7=7;
        }
        else if(valuesem7>=50){
            valuesem7=6;
        }
        else if(valuesem7>=45) {
            valuesem7=4;
        }
        else {
            valuesem7=0;
        }
        return valuesem7;
    }

}
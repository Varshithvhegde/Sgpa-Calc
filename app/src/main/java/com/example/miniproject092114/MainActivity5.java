package com.example.miniproject092114;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity5 extends AppCompatActivity {

    EditText s41,s42,s43,s44,s45,s46,s47,s48,s49,sgpa4;
    Button calculate4;
    float value41,value42,value43,value44,value45,value46,value47,value48,value49;
    float v41,v42,v43,v44,v45,v46,v47,v48,v49;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        s41=(EditText) findViewById(R.id.S81);
        s42=(EditText) findViewById(R.id.S82);
        s43=(EditText) findViewById(R.id.S83);
        s44=(EditText) findViewById(R.id.S84);
        s45=(EditText) findViewById(R.id.S85);
        s46=(EditText) findViewById(R.id.S76);
        s47=(EditText) findViewById(R.id.S77);
        s48=(EditText) findViewById(R.id.S68);
        s49=(EditText) findViewById(R.id.S59);
        calculate4=(Button)findViewById(R.id.CALCULATE4);
        sgpa4=(EditText) findViewById(R.id.SGPA2);

        calculate4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value41= Float.parseFloat(String.valueOf(s41.getText()));
                v41=checkfunction(value41);

                value42= Float.parseFloat(String.valueOf(s42.getText()));
                v42=checkfunction(value42);

                value43= Float.parseFloat(String.valueOf(s43.getText()));
                v43=checkfunction(value43);

                value44= Float.parseFloat(String.valueOf(s44.getText()));
                v44=checkfunction(value44);

                value45= Float.parseFloat(String.valueOf(s45.getText()));
                v45=checkfunction(value45);

                value46= Float.parseFloat(String.valueOf(s46.getText()));
                v46=checkfunction(value46);

                value47= Float.parseFloat(String.valueOf(s47.getText()));
                v47=checkfunction(value47);

                value48= Float.parseFloat(String.valueOf(s48.getText()));
                v48=checkfunction(value48);

                value49= Float.parseFloat(String.valueOf(s49.getText()));
                v49=checkfunction(value49);


                sgpa4.setText(String.valueOf (((v41*3)+(v42*4)+(v43*3)+(v44*3)+(v45*3)+(v46*3)+(v47*2)+(v48*2)+(v49*1))/24));
            }
        });

    }
    private float checkfunction(float valuesem4)
    {
        if(valuesem4>100 | valuesem4<0)
        {
            System.out.println("Invalid");
            Toast.makeText(MainActivity5.this,"Invalid",Toast.LENGTH_LONG).show();
        }
        if(valuesem4>=90) {
            valuesem4=10;

        }
        else if(valuesem4>=80) {
            valuesem4=9;

        }
        else if(valuesem4>=70) {
            valuesem4=8;
        }
        else if(valuesem4>=60) {
            valuesem4=7;
        }
        else if(valuesem4>=50){
            valuesem4=6;
        }
        else if(valuesem4>=45) {
            valuesem4=4;
        }
        else {
            valuesem4=0;
        }
        return valuesem4;
    }

}
package com.example.miniproject092114;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity10 extends AppCompatActivity {
    Button phycycle,chemcycle,S3,S4,S5,S6,S7,S8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
        phycycle=(Button) findViewById(R.id.PHYCYCLE);
        chemcycle=(Button) findViewById(R.id.CHEMCYCLE);
        S3=(Button)findViewById(R.id.SEM3) ;
        S4=(Button)findViewById(R.id.SEM4) ;
        S5=(Button)findViewById(R.id.SEM5) ;
        S6=(Button)findViewById(R.id.SEM6) ;
        S7=(Button)findViewById(R.id.SEM7) ;
        S8=(Button)findViewById(R.id.SEM8) ;
        phycycle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opensem1Activity();

            }
        });
        chemcycle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opensemActivity();

            }
        });
        S3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opensem3Activity();

            }
        });
        S4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opensem4Activity();

            }
        });
        S5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opensem5Activity();

            }
        });
        S6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opensem6Activity();

            }
        });
        S7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opensem7Activity();

            }
        });
        S8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opensem8Activity();

            }
        });
    }
    public void opensem1Activity(){
        Intent intent=new Intent(this,MainActivity2.class);
        startActivity(intent);
    }
    public void opensemActivity(){
        Intent intent=new Intent(this,MainActivity3.class);
        startActivity(intent);
    }
    public void opensem3Activity(){
        Intent intent=new Intent(this,MainActivity4.class);
        startActivity(intent);
    }
    public void opensem4Activity(){
        Intent intent=new Intent(this,MainActivity5.class);
        startActivity(intent);
    }
    public void opensem5Activity(){
        Intent intent=new Intent(this,MainActivity6.class);
        startActivity(intent);
    }
    public void opensem6Activity(){
        Intent intent=new Intent(this,MainActivity7.class);
        startActivity(intent);
    }
    public void opensem7Activity(){
        Intent intent=new Intent(this,MainActivity8.class);
        startActivity(intent);
    }
    public void opensem8Activity(){
        Intent intent=new Intent(this,MainActivity9.class);
        startActivity(intent);
    }
}
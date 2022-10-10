package com.example.miniproject092114;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button sgpa,cgpa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sgpa=(Button) findViewById(R.id.SGPA);
        cgpa=(Button) findViewById(R.id.CGPA);
        sgpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opensgpaActivity();
            }
        });
        cgpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opencgpaActivity();
            }
        });

    }
    public void opensgpaActivity(){
        Intent intent=new Intent(this,MainActivity10.class);
        startActivity(intent);
    }
    public void opencgpaActivity(){
        Intent intent=new Intent(this,MainActivity11.class);
        startActivity(intent);
    }

}
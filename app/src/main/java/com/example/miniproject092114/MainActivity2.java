package com.example.miniproject092114;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    EditText mat11, phy12, ele13, civ14, egdl15, phyl16, elel17, egh18, sgpa1;
    Button calculate1;
    EditText grade11,grade12,grade13,grade14,grade15,grade16,grade17,grade18;
    float value11, value12, value13, value14, value15, value16, value17, value18;
    float  v11,v12, v13, v14, v15, v16, v17, v18;
    String vv11,vv12,vv13,vv14,vv15,vv16,vv17,vv18;
    //String grade1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mat11 = (EditText) findViewById(R.id.MAT11);
        phy12 = (EditText) findViewById(R.id.PHY12);
        ele13 = (EditText) findViewById(R.id.ELE13);
        civ14 = (EditText) findViewById(R.id.CIV14);
        egdl15 = (EditText) findViewById(R.id.EGDL15);
        phyl16 = (EditText) findViewById(R.id.PHYL16);
        elel17 = (EditText) findViewById(R.id.ELEL17);
        egh18 = (EditText) findViewById(R.id.EGH18);
        calculate1 = (Button) findViewById(R.id.CALCULATE1);
        sgpa1 = (EditText) findViewById(R.id.SGPA2);
        grade11=(EditText)findViewById(R.id.GRADE11);
        grade12=(EditText)findViewById(R.id.GRADE12);
        grade13=(EditText)findViewById(R.id.GRADE13);
        grade14=(EditText)findViewById(R.id.GRADE14);
        grade15=(EditText)findViewById(R.id.GRADE15);
        grade16=(EditText)findViewById(R.id.GRADE16);
        grade17=(EditText)findViewById(R.id.GRADE17);
        grade18=(EditText)findViewById(R.id.GRADE18);

        calculate1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value11 = Float.parseFloat(String.valueOf(mat11.getText()));
                v11 = checkfunction(value11);
                vv11=String.valueOf(v11);
                grade11.setText(String.valueOf(checkgrade(String.valueOf(vv11))));

                value12 = Float.parseFloat(String.valueOf(phy12.getText()));
                v12 = checkfunction(value12);
                vv12=String.valueOf(v12);
                grade12.setText(String.valueOf(checkgrade(String.valueOf(vv12))));

                value13 = Float.parseFloat(String.valueOf(ele13.getText()));
                v13 = checkfunction(value13);
                vv13=String.valueOf(v13);
                grade13.setText(String.valueOf(checkgrade(String.valueOf(vv13))));

                value14 = Float.parseFloat(String.valueOf(civ14.getText()));
                v14 = checkfunction(value14);
                vv14=String.valueOf(v14);
                grade14.setText(String.valueOf(checkgrade(String.valueOf(vv14))));

                value15 = Float.parseFloat(String.valueOf(egdl15.getText()));
                v15 = checkfunction(value15);
                vv15=String.valueOf(v15);
                grade15.setText(String.valueOf(checkgrade(String.valueOf(vv15))));

                value16 = Float.parseFloat(String.valueOf(phyl16.getText()));
                v16 = checkfunction(value16);
                vv16=String.valueOf(v16);
                grade16.setText(String.valueOf(checkgrade(String.valueOf(vv16))));

                value17 = Float.parseFloat(String.valueOf(elel17.getText()));
                v17 = checkfunction(value17);
                vv17=String.valueOf(v17);
                grade17.setText(String.valueOf(checkgrade(String.valueOf(vv17))));

                value18 = Float.parseFloat(String.valueOf(egh18.getText()));
                v18 = checkfunction(value18);
                vv18=String.valueOf(v18);
                grade18.setText(String.valueOf(checkgrade(String.valueOf(vv18))));


                sgpa1.setText(String.valueOf(((v11 * 4) + (v12 * 4) + (v13 * 3) + (v14 * 3) + (v15 * 3) + (v16 * 2) + (v17 * 2) + (v18 * 1)) / 22));

            }
        });

    }
    private float checkfunction(float valuesem1) {
        if (valuesem1 > 100 | valuesem1<0) {
            System.out.println("Invalid");
            Toast.makeText(MainActivity2.this, "Invalid", Toast.LENGTH_LONG).show();
        }
        if (valuesem1 >= 90) {
            valuesem1 = 10;

        } else if (valuesem1 >= 80) {
            valuesem1 = 9;

        } else if (valuesem1 >= 70) {
            valuesem1 = 8;
        } else if (valuesem1 >= 60) {
            valuesem1 = 7;
        } else if (valuesem1 >= 45) {
            valuesem1 = 6;
        } else if (valuesem1 >= 40) {
            valuesem1 = 4;
        } else {
            valuesem1 = 0;
        }
        return valuesem1;
    }

    private String checkgrade(String grade1)
    {
        if(grade1.equals("10.0"))
            grade1="S";
        else if(grade1.equals("9.0"))
            grade1="A";
        else if(grade1.equals("8.0"))
            grade1="B";
        else if(grade1.equals("7.0"))
            grade1="C";
        else if(grade1.equals("6.0"))
            grade1="D";
        else if(grade1.equals("4.0"))
            grade1="E";
        else
            grade1="F";
            return grade1;

    }


}

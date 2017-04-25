package com.pro.codex;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText eT, dT;
    String c="",m="";
    Button eB, dB;
    int a,b,i,x,y;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_layout);

        eT = (EditText)findViewById(R.id.et1);
        dT = (EditText)findViewById(R.id.et2);
        eB = (Button)findViewById(R.id.eb);
        dB = (Button)findViewById(R.id.db);
    }

    public void encrypt(View view) {
        m = eT.getText().toString();
        a= m.length();
        char[] arr1 = m.toCharArray();
        for (i=0; i<a; i++){

                x = (int)arr1[i];
                x=x+3;
                arr1[i] = (char)x;
        }
        dT.setText(arr1.toString());
    }

    public void decrypt(View view) {
        c = dT.getText().toString();
        b= c.length();
        char[] arr2 = c.toCharArray();
        for (i=0; i<b; i++){

                y = (int)arr2[i];
                y=y-3;
                arr2[i] = (char)y;
        }
        eT.setText(arr2.toString());
    }
}

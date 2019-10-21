package com.example.testdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import javax.xml.validation.Validator;

public class MainActivity extends AppCompatActivity {
    EditText et1;
    EditText et2;
    TextView textView;
    Button button1, button2, button3, button4, button5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        textView = findViewById(R.id.t1);
        button1 = findViewById(R.id.b1);
        button2 = findViewById(R.id.b2);
        button3 = findViewById(R.id.b3);
        button4 = findViewById(R.id.b4);
        button5 = findViewById(R.id.b5);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et1.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "enter the first number", Toast.LENGTH_SHORT).show();
                } else if (et2.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "enter second number", Toast.LENGTH_SHORT).show();
                } else {
                    String x = et1.getText().toString();
                    String y = et2.getText().toString();
                    double a = Double.parseDouble(x);
                    double b = Double.parseDouble(y);
                    double d = a + b;
                    String z1 = String.valueOf(d);
                    textView.setText(z1);

                }
            }


        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et1.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "enter the first number", Toast.LENGTH_SHORT).show();
                } else if (et2.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "enter second number", Toast.LENGTH_SHORT).show();
                } else {
                    String x = et1.getText().toString();
                    String y = et2.getText().toString();
                    double a = Double.parseDouble(x);
                    double b = Double.parseDouble(y);
                    double c = a - b;
                    String z2 = String.valueOf(c);
                    textView.setText(z2);
                }
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et1.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "enter the first number", Toast.LENGTH_SHORT).show();
                } else if (et2.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "enter second number", Toast.LENGTH_SHORT).show();
                } else {

                    String x1 = et1.getText().toString();
                    String y1 = et2.getText().toString();
                    double a1 = Double.parseDouble(x1);
                    double b1 = Double.parseDouble(y1);
                    double c1 = a1 * b1;
                    String z3 = String.valueOf(c1);
                    textView.setText(z3);
                }
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et1.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "enter the first number", Toast.LENGTH_SHORT).show();
                } else if (et2.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "enter second number", Toast.LENGTH_SHORT).show();
                } else {

                    String x2 = et1.getText().toString();
                    String y2 = et2.getText().toString();
                    double a2 = Double.parseDouble(x2);
                    double b2 =Double.parseDouble(y2);
                    double c = a2 / b2;
                    String z4 = String.valueOf(c);
                    textView.setText(z4);
                }
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("");
                et1.setText("");
                et2.setText("");
            }
        });
    }
}

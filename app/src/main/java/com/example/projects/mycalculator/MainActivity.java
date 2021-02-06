package com.example.projects.mycalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    double input1 = 0 , input2 = 0;
    TextView edit;
    TextView result, text;
    boolean Addition, Subtraction, Multiplication, Division, mRemainder, decimal;
    Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, ba, bs, bm, bd, bequal, bdelete, bdot, Remainder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b0=  findViewById (R.id.b0);
        b1=  findViewById (R.id.b1);
        b2=  findViewById (R.id.b2);
        b3=  findViewById (R.id.b3);
        b4=  findViewById (R.id.b4);
        b5=  findViewById (R.id.b5);
        b6=  findViewById (R.id.b6);
        b7=  findViewById (R.id.b7);
        b8=  findViewById (R.id.b8);
        b9=  findViewById (R.id.b9);
        ba=  findViewById (R.id.ba);
        bs=  findViewById (R.id.bs);
        bm=  findViewById (R.id.bm);
        bd=  findViewById (R.id.bd);
        bequal=  findViewById (R.id.bequal);
        bdelete= findViewById (R.id.bdelete);
        bdot=  findViewById (R.id.bdot);
        Remainder=  findViewById (R.id.Remainder);
        edit = findViewById(R.id.edit);
        result = findViewById(R.id.result);
        text = findViewById(R.id.text);

        final DecimalFormat decimalFormat = new DecimalFormat("#.##########");

        b0.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                edit.setText(edit.getText()+ "0");
            }
        });
        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                edit.setText(edit.getText()+ "1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                edit.setText(edit.getText()+ "2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                edit.setText(edit.getText()+ "3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                edit.setText(edit.getText()+ "4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                edit.setText(edit.getText()+ "5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                edit.setText(edit.getText()+ "6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                edit.setText(edit.getText()+ "7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                edit.setText(edit.getText()+ "8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                edit.setText(edit.getText()+ "9");
            }
        });
        ba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edit.getText().length() != 0) {
                    input1 = Float.parseFloat(edit.getText() + "");
                    text.setText(decimalFormat.format(input1) + " +");
                    Addition = true;
                    decimal = false;
                    edit.setText(null);
                }
            }
        });
        bs.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (edit.getText().length() != 0){
                        input1 = Float.parseFloat(edit.getText() + "");
                        text.setText(decimalFormat.format(input1) + "-");
                        Subtraction = true;
                        decimal = false;
                        edit.setText(null);
                    }
                }
        });
        bm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edit.getText().length() != 0){
                    input1 = Float.parseFloat(edit.getText() + "");
                    text.setText(decimalFormat.format(input1) + " *");
                    Multiplication= true;
                    decimal = false;
                    edit.setText(null);
                }
            }
        });
        bd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edit.getText().length() != 0){
                    input1 = Float.parseFloat(edit.getText() + "");
                    text.setText(decimalFormat.format(input1) + " /");
                    Division = true;
                    decimal = false;
                    edit.setText(null);
                }
            }
        });
        Remainder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edit.getText().length() != 0){
                    input1 = Float.parseFloat(edit.getText() + "");
                    text.setText(decimalFormat.format(input1) + " %");
                    mRemainder= true;
                    decimal = false;
                    edit.setText(null);
                }
            }
        });
        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (Addition || Subtraction || Multiplication || Division || mRemainder) {
                    input2 = Float.parseFloat(edit.getText() + "");
                }

                if (Addition) {
                    result.setText(input1 + input2 + "");
                    Addition = false;
                }

                if (Subtraction) {
                    result.setText(input1 - input2 + "");
                    Subtraction = false;
                }

                if (Multiplication) {
                    result.setText(input1 * input2 + "");
                    Multiplication = false;
                }

                if (Division) {
                    result.setText(input1 / input2 + "");
                    Division = false;
                }
                if (mRemainder) {
                    result.setText(input1 % input2 + "");
                    mRemainder = false;
                }
            }
        });
        bdelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit.setText("");
                result.setText("");
                text.setText("");
                input1 = 0.0;
                input2 = 0.0;
            }
        });

        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (decimal) {
                } else {
                    edit.setText(edit.getText() + ".");
                    decimal = true;
                }

            }
        });

    }
}
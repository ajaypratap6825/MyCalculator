package com.example.projects.mycalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    double input1 = 0, input2 = 0;
    EditText edit;
    boolean Addition, Subtraction, Multiplication, Division, mRemainder, decimal;
    Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, ba, bs, bm, bd, bequal, bdelete, bdot, Remainder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b0= (Button) findViewById (R.id.b0);
        b1= (Button) findViewById (R.id.b1);
        b2= (Button) findViewById (R.id.b2);
        b3= (Button) findViewById (R.id.b3);
        b4= (Button) findViewById (R.id.b4);
        b5= (Button) findViewById (R.id.b5);
        b6= (Button) findViewById (R.id.b6);
        b7= (Button) findViewById (R.id.b7);
        b8= (Button) findViewById (R.id.b8);
        b9= (Button) findViewById (R.id.b9);
        ba= (Button) findViewById (R.id.ba);
        bs= (Button) findViewById (R.id.bs);
        bm= (Button) findViewById (R.id.bm);
        bd= (Button) findViewById (R.id.bd);
        bequal= (Button) findViewById (R.id.bequal);
        bdelete= (Button) findViewById (R.id.bdelete);
        bdot= (Button) findViewById (R.id.bdot);
        Remainder= (Button) findViewById (R.id.Remainder);
        edit = (EditText) findViewById(R.id.edit);

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

                    edit.setText(input1 + input2 + "");
                    Addition = false;
                }

                if (Subtraction) {

                    edit.setText(input1 - input2 + "");
                    Subtraction = false;
                }

                if (Multiplication) {
                    edit.setText(input1 * input2 + "");
                    Multiplication = false;
                }

                if (Division) {
                    edit.setText(input1 / input2 + "");
                    Division = false;
                }
                if (mRemainder) {
                    edit.setText(input1 % input2 + "");
                    mRemainder = false;
                }
            }
        });
        bdelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit.setText("");
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
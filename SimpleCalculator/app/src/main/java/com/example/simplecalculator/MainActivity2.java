package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    double br, mres, res2;
    TextView edittext2;
    boolean ms, decimal, resDone;
    Button btn_0, btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9, btn_Sqrt, btn_On2,
            btn_On3, btn_Exp, btn_Ln, btn_Dot, btn_MS, btn_MR, btn_BSC, btn_CLR;

    public static String RESPONSE_MESSAGE = "Response_text1";
    public static String RESPONSE_MESSAGE2 = "Response_text2";
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btn_0 = (Button) findViewById(R.id.btn0);
        btn_1 = (Button) findViewById(R.id.btn1);
        btn_2 = (Button) findViewById(R.id.btn2);
        btn_3 = (Button) findViewById(R.id.btn3);
        btn_4 = (Button) findViewById(R.id.btn4);
        btn_5 = (Button) findViewById(R.id.btn5);
        btn_6 = (Button) findViewById(R.id.btn6);
        btn_7 = (Button) findViewById(R.id.btn7);
        btn_8 = (Button) findViewById(R.id.btn8);
        btn_9 = (Button) findViewById(R.id.btn9);
        btn_Dot = (Button) findViewById(R.id.btnDot);
        btn_Sqrt = (Button) findViewById(R.id.btnSqrt);
        btn_Ln = (Button) findViewById(R.id.btnLn);
        btn_On2 = (Button) findViewById(R.id.btnOn2);
        btn_On3 = (Button) findViewById(R.id.btnOn3);
        btn_Exp = (Button) findViewById(R.id.btnExp);
        btn_MS = (Button) findViewById(R.id.btnMS);
        btn_MR = (Button) findViewById(R.id.btnMR);
        btn_BSC = (Button) findViewById(R.id.btnBSC);
        btn_CLR = (Button) findViewById(R.id.btnCLR);

        edittext2 = (TextView) findViewById(R.id.tvDisplay);
        edittext2.setText(edittext2.getText() + "0");

        intent = getIntent();
        String resResp = (String) intent.getExtras().getString(MainActivity.RES);

        if(resResp == null){
            edittext2.setText('0');
        }
        else
            edittext2.setText(resResp);

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resDone == true){
                    edittext2.setText("");
                    resDone = false;
                }
                edittext2.setText(edittext2.getText() + "1");
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resDone == true){
                    edittext2.setText("");
                    resDone = false;
                }
                edittext2.setText(edittext2.getText() + "2");
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resDone == true){
                    edittext2.setText("");
                    resDone = false;
                }
                edittext2.setText(edittext2.getText() + "3");
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resDone == true){
                    edittext2.setText("");
                    resDone = false;
                }
                edittext2.setText(edittext2.getText() + "4");
            }
        });

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resDone){
                    edittext2.setText("");
                    resDone = false;
                }
                edittext2.setText(edittext2.getText() + "5");
            }
        });

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resDone == true){
                    edittext2.setText("");
                    resDone = false;
                }
                edittext2.setText(edittext2.getText() + "6");
            }
        });

        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resDone == true){
                    edittext2.setText("");
                    resDone = false;
                }
                edittext2.setText(edittext2.getText() + "7");
            }
        });

        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resDone == true){
                    edittext2.setText("");
                    resDone = false;
                }
                edittext2.setText(edittext2.getText() + "8");
            }
        });

        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resDone == true){
                    edittext2.setText("");
                    resDone = false;
                }
                edittext2.setText(edittext2.getText() + "9");
            }
        });

        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edittext2.getText().length() != 0) {
                    if (resDone == true) {
                        edittext2.setText("");
                        resDone = false;
                    }
                    edittext2.setText(edittext2.getText() + "0");
                }
            }
        });

        btn_Sqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edittext2.getText().length() != 0) {
                    br = Float.parseFloat(edittext2.getText() + "");
                    res2 = Math.sqrt(br);
                    edittext2.setText(res2 + "");
                    decimal = false;
                    resDone = true;
                }
            }
        });

        btn_On2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edittext2.getText().length() != 0) {
                    br = Float.parseFloat(edittext2.getText() + "");
                    res2 = Math.pow(br,2);
                    edittext2.setText(res2 + "");
                    decimal = false;
                    resDone = true;
                }
            }
        });

        btn_On3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edittext2.getText().length() != 0) {
                    br = Float.parseFloat(edittext2.getText() + "");
                    res2 = Math.pow(br,3);
                    edittext2.setText(res2 + "");
                    decimal = false;
                    resDone = true;
                }
            }
        });

        btn_Exp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edittext2.getText().length() != 0) {
                    br = Float.parseFloat(edittext2.getText() + "");
                    res2 = Math.exp(br);
                    edittext2.setText(res2 + "");
                    decimal = false;
                    resDone = true;
                }
            }
        });

        btn_Ln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edittext2.getText().length() != 0) {
                    br = Float.parseFloat(edittext2.getText() + "");
                    res2 = Math.log10(br);
                    edittext2.setText(res2 + "");
                    decimal = false;
                    resDone = true;
                }
            }
        });

        btn_Dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (decimal == true) {
                    //do nothing or you can show the error
                } else {
                    edittext2.setText(edittext2.getText() + ".");
                    decimal = true;
                    resDone = true;
                }
            }
        });

        btn_MS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resDone == true) {
                    mres = Float.parseFloat(edittext2.getText() + "");
                    ms = true;
                }
            }
        });

        btn_MR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ms == true) {
                    edittext2.setText(mres + "");
                }
            }
        });

        btn_CLR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext2.setText("");
                decimal = false;
                resDone = false;
            }
        });

        btn_BSC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String m = edittext2.getText().toString();
                intent.putExtra(RESPONSE_MESSAGE,m);
                setResult(RESULT_OK, intent);
                finish();
            }
        });


    }
}
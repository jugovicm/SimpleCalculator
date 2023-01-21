package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;


public class MainActivity extends AppCompatActivity {

    // EditText etText; // polje moje klase tipa text
    // Button btnReverse;

    double op1 = 0, op2 = 0, mRes = 0;
    TextView edittext1;
    boolean Add, Sub, Mul, Div, deci, ms, res;
    Button button_0, button_1, button_2, button_3, button_4, button_5, button_6, button_7, button_8, button_9, button_Add, button_Sub,
            button_Mul, button_Div, button_Equ, button_Dot, button_MS, button_MR, button_ADV, button_CLR;

    public static String MR = "Snimljen rezultat";
    public static String RES = "Rezultat";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //poziva se pri kreiranju aktivnost
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // etText = findViewById(R.id.etText); //povezivanje sa xml -> pronalazimo view na osnovu id, medju resursima trazi onaj sa tim id
        // btnReverse = findViewById(R.id.btnReverse);

        button_0 = (Button) findViewById(R.id.b0);
        button_1 = (Button) findViewById(R.id.b1);
        button_2 = (Button) findViewById(R.id.b2);
        button_3 = (Button) findViewById(R.id.b3);
        button_4 = (Button) findViewById(R.id.b4);
        button_5 = (Button) findViewById(R.id.b5);
        button_6 = (Button) findViewById(R.id.b6);
        button_7 = (Button) findViewById(R.id.b7);
        button_8 = (Button) findViewById(R.id.b8);
        button_9 = (Button) findViewById(R.id.b9);
        button_Dot = (Button) findViewById(R.id.bDot);
        button_Add = (Button) findViewById(R.id.bAdd);
        button_Sub = (Button) findViewById(R.id.bSub);
        button_Mul = (Button) findViewById(R.id.bMul);
        button_Div = (Button) findViewById(R.id.bDiv);
        button_Equ = (Button) findViewById(R.id.bEqu);
        button_MS = (Button) findViewById(R.id.bMS);
        button_MR = (Button) findViewById(R.id.bMR);
        button_ADV = (Button) findViewById(R.id.bADV);
        button_CLR = (Button) findViewById(R.id.bCLR);

        edittext1 = (TextView) findViewById(R.id.tvDisplay);
        //edittext1.setText(edittext1.getText() + "0");

        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (res == true) {
                    edittext1.setText("");
                    res = false;
                    deci = false;
                }
                edittext1.setText(edittext1.getText() + "1");
            }
        });

        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (res == true) {
                    edittext1.setText("");
                    res = false;
                    deci = false;
                }
                edittext1.setText(edittext1.getText() + "2");
            }
        });

        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (res == true) {
                    edittext1.setText("");
                    res = false;
                    deci = false;
                }
                edittext1.setText(edittext1.getText() + "3");
            }
        });

        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (res == true) {
                    edittext1.setText("");
                    res = false;
                    deci = false;
                }
                edittext1.setText(edittext1.getText() + "4");
            }
        });

        button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (res == true) {
                    edittext1.setText("");
                    res = false;
                    deci = false;
                }
                edittext1.setText(edittext1.getText() + "5");
            }
        });

        button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (res == true) {
                    edittext1.setText("");
                    res = false;
                    deci = false;
                }
                edittext1.setText(edittext1.getText() + "6");
            }
        });

        button_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (res == true) {
                    edittext1.setText("");
                    res = false;
                    deci = false;
                }
                edittext1.setText(edittext1.getText() + "7");
            }

        });

        button_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (res == true) {
                    edittext1.setText("");
                    res = false;
                    deci = false;
                }
                edittext1.setText(edittext1.getText() + "8");
            }

        });

        button_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (res == true) {
                    edittext1.setText("");
                    res = false;
                    deci = false;
                }
                edittext1.setText(edittext1.getText() + "9");
            }
        });

        button_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (res == true) {
                    edittext1.setText("");
                    res = false;
                    deci = false;
                }
                edittext1.setText(edittext1.getText() + "0");
            }
        });

        button_Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Add || Div || Sub || Mul){
                    if (Add) {
                        op2 = Double.parseDouble(edittext1.getText() + "");
                        edittext1.setText(op1 + op2 + "");
                        Add = false;
                        deci = false;
                        //edittext1.setText(null);
                    }

                    if (Sub) {
                        op2 = Double.parseDouble(edittext1.getText() + "");
                        edittext1.setText(op1 - op2 + "");
                        Sub = false;
                        deci = false;
                        //edittext1.setText(null);
                    }

                    if (Mul) {
                        op2 = Double.parseDouble(edittext1.getText() + "");
                        edittext1.setText(op1 * op2 + "");
                        Mul = false;
                        deci = false;
                        //edittext1.setText(null);
                    }

                    if (Div) {
                        op2 = Double.parseDouble(edittext1.getText() + "");
                        edittext1.setText(op1 / op2 + "");
                        Div = false;
                        deci = false;
                        //edittext1.setText(null);
                    }
                }

                    if (edittext1.getText().length() != 0) {
                            op1 = Double.parseDouble(edittext1.getText() + "");
                            Add = true;
                            deci = false;
                            edittext1.setText(null);
                    }
                    else {
                        op1 = 0;
                        Add = true;
                        deci = false;
                        edittext1.setText(null);
                    }

            }
        });

        button_Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Add || Div || Sub || Mul){
                    if (Add) {
                        op2 = Double.parseDouble(edittext1.getText() + "");
                        edittext1.setText(op1 + op2 + "");
                        Add = false;
                        deci = false;
                        //edittext1.setText(null);
                    }

                    if (Sub) {
                        op2 = Double.parseDouble(edittext1.getText() + "");
                        edittext1.setText(op1 - op2 + "");
                        Sub = false;
                        deci = false;
                        //edittext1.setText(null);
                    }

                    if (Mul) {
                        op2 = Double.parseDouble(edittext1.getText() + "");
                        edittext1.setText(op1 * op2 + "");
                        Mul = false;
                        deci = false;
                        //edittext1.setText(null);
                    }

                    if (Div) {
                        op2 = Double.parseDouble(edittext1.getText() + "");
                        edittext1.setText(op1 / op2 + "");
                        Div = false;
                        deci = false;
                        //edittext1.setText(null);
                    }
                }
                if (edittext1.getText().length() != 0) {
                    op1 = Double.parseDouble(edittext1.getText() + "");
                    Sub = true;
                    deci = false;
                    edittext1.setText(null);
                }
                else {
                    op1 = 0;
                    Sub = true;
                    deci = false;
                    edittext1.setText(null);
                }
            }
        });

        button_Mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Add || Div || Sub || Mul){
                    if (Add) {
                        op2 = Double.parseDouble(edittext1.getText() + "");
                        edittext1.setText(op1 + op2 + "");
                        Add = false;
                        deci = false;
                        //edittext1.setText(null);
                    }

                    if (Sub) {
                        op2 = Double.parseDouble(edittext1.getText() + "");
                        edittext1.setText(op1 - op2 + "");
                        Sub = false;
                        deci = false;
                        //edittext1.setText(null);
                    }

                    if (Mul) {
                        op2 = Double.parseDouble(edittext1.getText() + "");
                        edittext1.setText(op1 * op2 + "");
                        Mul = false;
                        deci = false;
                        //edittext1.setText(null);
                    }

                    if (Div) {
                        op2 = Double.parseDouble(edittext1.getText() + "");
                        edittext1.setText(op1 / op2 + "");
                        Div = false;
                        deci = false;
                        //edittext1.setText(null);
                    }
                }
                if (edittext1.getText().length() != 0) {
                    op1 = Double.parseDouble(edittext1.getText() + "");
                    Mul = true;
                    deci = false;
                    edittext1.setText(null);
                }
                else {
                    op1 = 0;
                    Mul = true;
                    deci = false;
                    edittext1.setText(null);
                }
            }
        });

        button_Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Add || Div || Sub || Mul){
                    if (Add) {
                        op2 = Double.parseDouble(edittext1.getText() + "");
                        edittext1.setText(op1 + op2 + "");
                        Add = false;
                        deci = false;
                        //edittext1.setText(null);
                    }

                    if (Sub) {
                        op2 = Double.parseDouble(edittext1.getText() + "");
                        edittext1.setText(op1 - op2 + "");
                        Sub = false;
                        deci = false;
                        //edittext1.setText(null);
                    }

                    if (Mul) {
                        op2 = Double.parseDouble(edittext1.getText() + "");
                        edittext1.setText(op1 * op2 + "");
                        Mul = false;
                        deci = false;
                        //edittext1.setText(null);
                    }

                    if (Div) {
                        op2 = Double.parseDouble(edittext1.getText() + "");
                        edittext1.setText(op1 / op2 + "");
                        Div = false;
                        deci = false;
                        //edittext1.setText(null);
                    }
                }
                if (edittext1.getText().length() != 0) {
                    op1 = Double.parseDouble(edittext1.getText() + "");
                    Div = true;
                    deci = false;
                    edittext1.setText(null);
                }
                else {
                    op1 = 0;
                    Div = true;
                    deci = false;
                    edittext1.setText(null);
                }
            }
        });

        button_Equ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                res = true;
                if (Add || Sub || Mul || Div) {
                    op2 = Double.parseDouble(edittext1.getText() + "");
                }

                if (Add) {
                    edittext1.setText(op1 + op2 + "");
                    Add = false;
                    //deci = false;
                }

                if (Sub) {
                    edittext1.setText(op1 - op2 + "");
                    Sub = false;
                    //deci = false;
                }

                if (Mul) {
                    edittext1.setText(op1 * op2 + "");
                    Mul = false;
                    //deci = false;
                }

                if (Div) {
                    edittext1.setText(op1 / op2 + "");
                    Div = false;
                    //deci = false;
                }
                op1 = 0;
                op2 = 0;
            }
        });

        button_Dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edittext1.getText().length() != 0) {
                    if (deci == false) {
                        edittext1.setText(edittext1.getText() + ".");
                        deci = true;
                    }
                } else {
                    if (deci == false) {
                        edittext1.setText("0.");
                        res = false;
                        deci = true;
                    }
                }
            }
        });

        button_MS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (res == true) {
                    mRes = Double.parseDouble(edittext1.getText() + "");
                    ms = true;
                }
            }
        });

        button_MR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ms == true) {
                    edittext1.setText(mRes + "");
                }
            }
        });

        button_CLR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext1.setText("");
                deci = false;
                res = false;
                op1 = 0;
                op2 = 0;
            }
        });

        button_ADV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra(RES, edittext1.getText().toString());
                activity2Launcher.launch(intent);
            }
        });
    }
    ActivityResultLauncher<Intent> activity2Launcher = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    edittext1.setText("");
                    if (result.getResultCode() == RESULT_OK){
                        Intent data = result.getData();
                        String resResponse;
                        resResponse = data.getStringExtra(MainActivity2.RESPONSE_MESSAGE);

                        if(resResponse == null){
                            edittext1.setText('0');
                        }
                        else
                            edittext1.setText(resResponse);
                    }
                }
            }
    );
}




   /* public void btnReverseClick(View view) {
        // moze da se koristi za vise btn
        // npr tasteri za cifre u kalkulatoru i onda menjati na osnovu view event
        String tekst = etText.getText().toString(); // String iz EditText polja
        //mora .toString jer vraca vrednost polja
        StringBuilder sb = new StringBuilder(tekst); // Dinamicki string
        etText.setText(sb.reverse().toString());
    }*/

package com.example.myapplication;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;



public class MainActivity extends AppCompatActivity {
    Button button;
    TextView viewText;
    double ValueOne, ValueTwo;
    boolean Addtion, Subtract, Multiplication, Division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewText = findViewById(R.id.textView);
        button = findViewById(R.id.button);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        Button button7 = findViewById(R.id.button7);
        Button button8 = findViewById(R.id.button8);
        Button button9 = findViewById(R.id.button9);
        Button button_ = findViewById(R.id.button_);
        Button button0 = findViewById(R.id.button0);
        Button buttonC = findViewById(R.id.buttonC);
        Button Add = findViewById(R.id.buttonplus);
        Button sub = findViewById(R.id.buttonsub);
        Button mult = findViewById(R.id.buttonmult);
        Button div = findViewById(R.id.buttondiv);
        Button equal = findViewById(R.id.buttonequl);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewText.setText( "1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewText.setText("2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewText.setText( "3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewText.setText("4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewText.setText("5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewText.setText("6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewText.setText("7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewText.setText("8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewText.setText( "9");
            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewText.setText(viewText.getText()+ "0");
            }
        });

        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (viewText == null) {
                    viewText.setText("");
                } else {
                    ValueOne = Float.parseFloat(viewText.getText() + "");
                    Addtion = true;
                    viewText.setText(null);
                }
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (viewText == null) {
                    viewText.setText("");
                } else{
                ValueOne = Float.parseFloat(viewText.getText() + "");
                Subtract = true;
                viewText.setText(null);}}

        });
        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (viewText == null) {
                    viewText.setText("");
                } else{
                ValueOne = Float.parseFloat(viewText.getText() + "");
                Multiplication = true;
                viewText.setText(null);}
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (viewText == null) {
                    viewText.setText("");
                } else{
                ValueOne = Float.parseFloat(viewText.getText() + "");
                Division = true;
                viewText.setText(null);}
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ValueTwo = Float.parseFloat(viewText.getText() + "");

                if (Addtion == true) {
                    viewText.setText(ValueOne + ValueTwo + "");
                    Addtion = false;
                }

                if (Subtract == true) {
                    viewText.setText(ValueOne - ValueTwo + "");
                    Subtract = false;
                }

                if (Multiplication == true) {
                    viewText.setText(ValueOne * ValueTwo + "");
                   Multiplication = false;
                }

                if (Division == true) {
                    viewText.setText(ValueOne / ValueTwo + "");
                   Division = false;
                }
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewText.setText( "");
            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewText.setText(viewText.getText() +"0");
            }
        });
        button_.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewText.setText( ".");
            }
        });
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewText.setText( "");
            }
        });

    }

//    public void onClick(View view) {
//        switch (view.getId()){
//            case R.id.button:
//                viewText.setText("1");
//                break;
//            case R.id.button2:
//                viewText.setText("2");
//                break;
//            case R.id.button3:
//                viewText.setText("3");
//                break;
//            case R.id.button4:
//                viewText.setText("4");
//                break;
//            case R.id.button5:
//                viewText.setText("5");
//                break;
//            case R.id.button6:
//                viewText.setText("6");
//                break;
//            case R.id.button7:
//                viewText.setText("7");
//                break;
//            case R.id.button8:
//                viewText.setText("8");
//                break;
//            case R.id.button9:
//                viewText.setText("9");
//                break;
//            case R.id.button_:
//                viewText.setText(".");
//                break;
//            case R.id.button0:
//                viewText.setText("0");
//                break;
//            case R.id.buttonC:
//                viewText.setText("");
//                break;
//                case  s
//    }
}



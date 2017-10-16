package com.example.freaksoul.androidcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.util.Log;
import android.widget.EditText;
import android.widget.EditText;
import android.view.View;
import android.widget.TextView;
import android.widget.*;
import android.view.View.OnClickListener;

import org.w3c.dom.Text;

import static com.example.freaksoul.androidcalculator.R.id.buttonFive;
import static com.example.freaksoul.androidcalculator.R.id.buttonOne;
import static com.example.freaksoul.androidcalculator.R.id.textView1;

public class MainActivity extends AppCompatActivity {
    TextView textView1;
    Button buttonOne, buttonTwo, buttonThree, buttonFour, buttonFive, buttonSix, buttonSeven, buttonEight, buttonNine, buttonZero;
    Button buttonMul, buttonSum, buttonDiff, buttonDiv, buttonResult, buttonClear, buttonDot;
    String buttonValue = "";
    Double Answer;
    Double val1 = 0.0;
    Double val2 = 0.0;
    String Sign;
    boolean solved = false;
    boolean solvedWithouEqu = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView1 = (TextView) findViewById(R.id.textView1);
        buttonZero = (Button) findViewById(R.id.buttonZero);
        buttonOne = (Button) findViewById(R.id.buttonOne);
        buttonTwo = (Button) findViewById(R.id.buttonTwo);
        buttonThree = (Button) findViewById(R.id.buttonThree);
        buttonFour = (Button) findViewById(R.id.buttonFour);
        buttonFive = (Button) findViewById(R.id.buttonFive);
        buttonSix = (Button) findViewById(R.id.buttonSix);
        buttonSeven = (Button) findViewById(R.id.buttonSeven);
        buttonEight = (Button) findViewById(R.id.buttonEight);
        buttonNine = (Button) findViewById(R.id.buttonNine);
        buttonMul = (Button) findViewById(R.id.buttonMul);
        buttonSum = (Button) findViewById(R.id.buttonSum);
        buttonDiff = (Button) findViewById(R.id.buttonDiff);
        buttonDiv = (Button) findViewById(R.id.buttonDiv);
        buttonResult = (Button) findViewById(R.id.buttonResult);
        buttonClear = (Button) findViewById(R.id.buttonClear);
        buttonDot = (Button) findViewById(R.id.buttonDot);

        buttonZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (solved == true || solvedWithouEqu == true) {
                    textView1.setText("");
                    solved = false;
                    solvedWithouEqu = false;
                }
                textView1.setText(textView1.getText().toString() + buttonZero.getText().toString());
            }
        });
        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (solved == true || solvedWithouEqu == true) {
                    textView1.setText("");
                    solved = false;
                    solvedWithouEqu = false;
                }
                textView1.setText(textView1.getText().toString() + buttonOne.getText().toString());
            }
        });
        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (solved == true || solvedWithouEqu == true) {
                    textView1.setText("");
                    solved = false;
                    solvedWithouEqu = false;
                }
                textView1.setText(textView1.getText().toString() + buttonTwo.getText().toString());
            }
        });
        buttonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (solved == true || solvedWithouEqu == true) {
                    textView1.setText("");
                    solved = false;
                    solvedWithouEqu = false;
                }
                textView1.setText(textView1.getText().toString() + buttonThree.getText().toString());
            }
        });
        buttonFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (solved == true || solvedWithouEqu == true) {
                    textView1.setText("");
                    solved = false;
                    solvedWithouEqu = false;
                }
                textView1.setText(textView1.getText().toString() + buttonFour.getText().toString());
            }
        });
        buttonFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (solved == true || solvedWithouEqu == true) {
                    textView1.setText("");
                    solved = false;
                    solvedWithouEqu = false;
                }
                textView1.setText(textView1.getText().toString() + buttonFive.getText().toString());
            }
        });
        buttonSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (solved == true || solvedWithouEqu == true) {
                    textView1.setText("");
                    solved = false;
                    solvedWithouEqu = false;
                }
                textView1.setText(textView1.getText().toString() + buttonSix.getText().toString());
            }
        });
        buttonSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (solved == true || solvedWithouEqu == true) {
                    textView1.setText("");
                    solved = false;
                    solvedWithouEqu = false;
                }
                textView1.setText(textView1.getText().toString() + buttonSeven.getText().toString());
            }
        });
        buttonEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (solved == true || solvedWithouEqu == true) {
                    textView1.setText("");
                    solved = false;
                    solvedWithouEqu = false;
                }
                textView1.setText(textView1.getText().toString() + buttonEight.getText().toString());
            }
        });
        buttonNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (solved == true || solvedWithouEqu == true) {
                    textView1.setText("");
                    solved = false;
                    solvedWithouEqu = false;
                }
                textView1.setText(textView1.getText().toString() + buttonNine.getText().toString());
            }
        });
        buttonSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (val2 == 0.0) {
                        val1 = Double.parseDouble(textView1.getText().toString());
                        textView1.setText("");
                        Sign = "+";
                        val2 = Double.parseDouble("1");
                    } else {
                        val1 = val1 + Double.parseDouble(textView1.getText().toString());
                        textView1.setText(val1.toString());
                        Sign = "+";
                        solvedWithouEqu = true;
                    }
                } catch (Exception ex) {
                    textView1.setText("0");
                } finally {

                }
            }
        });
        buttonDiff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (val2 == 0.0) {
                        val1 = Double.parseDouble(textView1.getText().toString());
                        textView1.setText("");
                        Sign = "-";
                        val2 = Double.parseDouble("1");
                    } else {
                        val1 = val1 - Double.parseDouble(textView1.getText().toString());
                        textView1.setText(val1.toString());
                        Sign = "-";
                        solvedWithouEqu = true;
                    }
                } catch (Exception ex) {
                    textView1.setText("0");
                } finally {

                }

            }
        });
        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView1.setText("");
                val2 = 0.0;
                val1 = 0.0;
            }
        });
        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (val2 == 0.0) {
                        val1 = Double.parseDouble(textView1.getText().toString());
                        textView1.setText("");
                        Sign = "*";
                        val2 = Double.parseDouble("1");
                    } else {
                        val1 = val1 * Double.parseDouble(textView1.getText().toString());
                        textView1.setText(val1.toString());
                        Sign = "*";
                        solvedWithouEqu = true;
                    }
                } catch (Exception ex) {
                    textView1.setText("0");
                } finally {

                }

            }
        });
        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (val2 == 0.0) {
                        val1 = Double.parseDouble(textView1.getText().toString());
                        textView1.setText("");
                        Sign = "/";
                        val2 = Double.parseDouble("1");
                    } else {
                        val1 = val1 / Double.parseDouble(textView1.getText().toString());
                        textView1.setText(val1.toString());
                        Sign = "/";
                        solvedWithouEqu = true;
                    }
                } catch (Exception ex) {
                    textView1.setText("0");
                } finally {

                }

            }
        });
        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (solved == true || solvedWithouEqu == true) {
                    textView1.setText("");
                    solved = false;
                    solvedWithouEqu = false;
                }
                textView1.setText(textView1.getText().toString() + buttonDot.getText().toString());
            }
        });
        buttonResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    val2 = Double.parseDouble(textView1.getText().toString());
                    switch (Sign) {
                        case "+":
                            Answer = val1 + val2;
                            break;
                        case "-":
                            Answer = val1 - val2;
                            break;
                        case "*":
                            Answer = val1 * val2;
                            break;
                        case "/":
                            Answer = val1 / val2;
                            break;
                        default:
                    }
                    textView1.setText(String.format(Answer.toString()));
                    val2 = 0.0;
                    val1 = 0.0;
                    solved = true;
                    Sign = "";
                } catch (Exception ex) {
                    textView1.setText("0");
                } finally {

                }

            }
        });
    }
}

  /*  private View.OnClickListener numberlistener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Button sender = (Button) v;
            buttonValue += sender.getText().toString();
            textView1.setText(buttonValue);
            value1 = Float.parseFloat(buttonValue);
        }
    };*/


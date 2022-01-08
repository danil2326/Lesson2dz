package ru.gb.course1.lesson2dz;

import static ru.gb.course1.lesson2dz.InputSymbol.NUM_0;
import static ru.gb.course1.lesson2dz.InputSymbol.NUM_1;
import static ru.gb.course1.lesson2dz.InputSymbol.NUM_2;
import static ru.gb.course1.lesson2dz.InputSymbol.NUM_3;
import static ru.gb.course1.lesson2dz.InputSymbol.NUM_4;
import static ru.gb.course1.lesson2dz.InputSymbol.NUM_5;
import static ru.gb.course1.lesson2dz.InputSymbol.NUM_6;
import static ru.gb.course1.lesson2dz.InputSymbol.NUM_7;
import static ru.gb.course1.lesson2dz.InputSymbol.NUM_8;
import static ru.gb.course1.lesson2dz.InputSymbol.NUM_9;
import static ru.gb.course1.lesson2dz.InputSymbol.OP_CLEAR;
import static ru.gb.course1.lesson2dz.InputSymbol.OP_DIVIDE;
import static ru.gb.course1.lesson2dz.InputSymbol.OP_DOT;
import static ru.gb.course1.lesson2dz.InputSymbol.OP_EQUALS;
import static ru.gb.course1.lesson2dz.InputSymbol.OP_MINUS;
import static ru.gb.course1.lesson2dz.InputSymbol.OP_MYLTYPLI;
import static ru.gb.course1.lesson2dz.InputSymbol.OP_PLUS;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String KEY = "key";
    private int number = 0;
    private TextView textInput;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button0;
    private Button buttonPlus;
    private Button buttonMinuse;
    private Button buttonEquals;
    private Button buttonMyltiply;
    private Button buttonDivide;
    private Button buttonDot;
    private Button buttonClear;
    private Button buttonSecond;
    private CalculatorModel calculatorModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calculatorModel = new CalculatorModel();
        initView();
        initListener();



        if (savedInstanceState != null && savedInstanceState.containsKey(KEY)) {
            number = savedInstanceState.getInt(KEY);

        }


        findViewById(R.id.second_button).setOnClickListener(view -> {
            Intent intent = new Intent(this, SecondActivity.class);
            intent.putExtra("extra_key", number);
            startActivity(intent);
        });



    }
    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(KEY, number);

    }

    private void initListener() {

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateInput(NUM_1);


            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateInput(NUM_2);

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateInput(NUM_3);

            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateInput(NUM_4);

            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateInput(NUM_5);


            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateInput(NUM_6);


            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateInput(NUM_7);


            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateInput(NUM_8);


            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateInput(NUM_9);


            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateInput(NUM_0);


            }
        });
        buttonMinuse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateInputOp(OP_MINUS);


            }
        });
        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateInputOp(OP_PLUS);

            }
        });
        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateInputOp(OP_DOT);

            }
        });
        buttonMyltiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateInputOp(OP_MYLTYPLI);

            }
        });
        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateInputOp(OP_DIVIDE);

            }
        });
        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateInputOp(OP_CLEAR);

            }
        });
        buttonEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateInputOp(OP_EQUALS);

            }
        });




    }

    private void updateInput(InputSymbol inputSymbol) {


        calculatorModel.onClickButton(inputSymbol);
        List<InputSymbol> inputSymbolList = calculatorModel.getInput();
        textInput.setText(convertInputSymbolToString(inputSymbolList));



    }
    private void updateInputOp(InputSymbol inputSymbol) {


        calculatorModel.onClickButton(inputSymbol);
        List<InputSymbol> inputSymbolList = calculatorModel.getInput();
        textInput.setText(convertInputSymbolToString(inputSymbolList));



    }

    private String convertInputSymbolToString(List<InputSymbol> inputSymbolList) {
        final StringBuilder sb = new StringBuilder();
        for (InputSymbol inputSymbol : inputSymbolList) {
            switch (inputSymbol) {
                case NUM_1:
                    sb.append("1");
                    break;
                case NUM_2:
                    sb.append("2");
                    break;
                case NUM_3:
                    sb.append("3");
                    break;
                case NUM_4:
                    sb.append("4");
                    break;
                case NUM_5:
                    sb.append("5");
                    break;
                case NUM_6:
                    sb.append("6");
                    break;
                case NUM_7:
                    sb.append("7");
                    break;
                case NUM_8:
                    sb.append("8");
                    break;
                case NUM_9:
                    sb.append("9");
                    break;
                case NUM_0:
                    sb.append("0");
                    break;
                case OP_DOT:
                    sb.append(".");
                    break;
                case OP_MINUS:
                    sb.append("-");
                    break;
                case OP_PLUS:
                    sb.append("+");
                    break;
                case OP_DIVIDE:
                    sb.append("/");
                    break;
                case OP_MYLTYPLI:
                    sb.append("X");
                    break;
                case OP_EQUALS:
                    sb.append("=");
                    break;
            }

        }
        return sb.toString();

    }


    private void initView() {
        button1 = findViewById(R.id.button_1);
        button2 = findViewById(R.id.button_2);
        button3 = findViewById(R.id.button_3);
        button4 = findViewById(R.id.button_4);
        button5 = findViewById(R.id.button_5);
        button6 = findViewById(R.id.button_6);
        button7 = findViewById(R.id.button_7);
        button8 = findViewById(R.id.button_8);
        button9 = findViewById(R.id.button_9);
        button0 = findViewById(R.id.button_null);
        buttonClear = findViewById(R.id.button_clear);
        buttonDivide = findViewById(R.id.button_divide);
        buttonPlus = findViewById(R.id.button_plus);
        buttonMyltiply = findViewById(R.id.button_multiply);
        buttonDot = findViewById(R.id.button_dot);
        buttonMinuse = findViewById(R.id.button_minus);
        buttonEquals = findViewById(R.id.button_equals);
        buttonSecond = findViewById(R.id.second_button);


        textInput = findViewById(R.id.text_input);


    }
    private void showInput() {
        number = Integer.parseInt(textInput.getText().toString());
        textInput.setText(String.valueOf(number));
    }


}
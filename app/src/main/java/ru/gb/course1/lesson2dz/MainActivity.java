package ru.gb.course1.lesson2dz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1 = Integer.parseInt(button1.getText().toString());
                textInput.setText(String.valueOf(number1));

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number2 = Integer.parseInt(button2.getText().toString());
                textInput.setText(String.valueOf(number2));

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number3 = Integer.parseInt(button3.getText().toString());
                textInput.setText(String.valueOf(number3));

            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number4 = Integer.parseInt(button4.getText().toString());
                textInput.setText(String.valueOf(number4));

            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number5 = Integer.parseInt(button5.getText().toString());
                textInput.setText(String.valueOf(number5));

            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number6 = Integer.parseInt(button6.getText().toString());
                textInput.setText(String.valueOf(number6));

            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number7 = Integer.parseInt(button7.getText().toString());
                textInput.setText(String.valueOf(number7));

            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number8 = Integer.parseInt(button8.getText().toString());
                textInput.setText(String.valueOf(number8));

            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number9 = Integer.parseInt(button9.getText().toString());
                textInput.setText(String.valueOf(number9));

            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number0 = Integer.parseInt(button0.getText().toString());
                textInput.setText(String.valueOf(number0));

            }
        });
    }


    private void initView (){
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
        textInput = findViewById(R.id.text_input);
    }
}
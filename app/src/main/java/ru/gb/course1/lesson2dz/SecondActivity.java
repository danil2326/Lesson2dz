package ru.gb.course1.lesson2dz;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    private TextView numberTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        numberTextView = findViewById(R.id.number_text_view);
        int number = getIntent().getExtras().getInt("extra_key");
        numberTextView.setText(String.valueOf(number));


    }
}

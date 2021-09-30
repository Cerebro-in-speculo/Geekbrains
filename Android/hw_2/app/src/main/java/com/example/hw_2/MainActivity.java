package com.example.hw_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_0 = findViewById(R.id.button_0);
        Button btn_1 = findViewById(R.id.button_1);
        Button btn_2 = findViewById(R.id.button_2);
        Button btn_3 = findViewById(R.id.button_3);
        Button btn_4 = findViewById(R.id.button_4);
        Button btn_5 = findViewById(R.id.button_5);
        Button btn_6 = findViewById(R.id.button_6);
        Button btn_7 = findViewById(R.id.button_7);
        Button btn_8 = findViewById(R.id.button_8);
        Button btn_9 = findViewById(R.id.button_9);
        Button btn_point = findViewById(R.id.button_point);
        Button btn_add = findViewById(R.id.button_add);
        Button btn_subtract = findViewById(R.id.button_subtract);
        Button btn_equally = findViewById(R.id.button_equally);
        Button btn_multiplication = findViewById(R.id.button_multiplication);
        Button btn_division = findViewById(R.id.button_division);
        Button btn_percent = findViewById(R.id.button_percent);
        EditText input = findViewById(R.id.textResult);
        TextView result = findViewById(R.id.textInput);
        buttonsPush(btn_0,input);
        buttonsPush(btn_1,input);

    }
    public static void buttonsPush(Button button,EditText input){
        button.setOnClickListener(view -> {
            input.setText(button.getText().toString());
        });
    }
}
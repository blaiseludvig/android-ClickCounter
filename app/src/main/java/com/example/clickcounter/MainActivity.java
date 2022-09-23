package com.example.clickcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnPlus;
    private TextView textView;
    private Button btnMinus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

    }

    private void init() {
        setComponents();
        addEventListeners();



    }

    private void addEventListeners() {
        btnPlus.setOnClickListener(view -> {
            int n = Integer.parseInt(textView.getText().toString());
            n += 1;
            textView.setText(String.valueOf(n));

            if (n > 0)  {
                textView.setTextColor(Color.GREEN);
            }

            if (n == 0) {
                textView.setTextColor(Color.parseColor("#00FFFF"));
            }

        });

        btnMinus.setOnClickListener(view -> {
            int n = Integer.parseInt(textView.getText().toString());
            n -= 1;
            textView.setText(String.valueOf(n));

            if (n < 0){
                textView.setTextColor(Color.RED);
            }

            if (n == 0) {
                textView.setTextColor(Color.parseColor("#00ffFF"));
            }

        });

        btnPlus.setOnLongClickListener(view -> {
            textView.setText(String.valueOf(0));
            textView.setTextColor(Color.parseColor("#00FFFF"));
            return true;
        });

        btnMinus.setOnLongClickListener(view -> {
            textView.setText(String.valueOf(0));
            textView.setTextColor(Color.parseColor("#00FFFF"));
            return true;
        });

    }

    private void setComponents() {
        btnPlus = findViewById(R.id.btnPlus);
        textView = findViewById(R.id.textView);
        btnMinus = findViewById(R.id.btnMinus);

    }


}
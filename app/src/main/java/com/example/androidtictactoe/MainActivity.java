package com.example.androidtictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.button_1);
        btn2 = findViewById(R.id.button_2);
        btn3 = findViewById(R.id.button_3);
        btn4 = findViewById(R.id.button_4);
        btn5 = findViewById(R.id.button_5);
        btn6 = findViewById(R.id.button_6);
        btn7 = findViewById(R.id.button_7);
        btn8 = findViewById(R.id.button_8);
        btn9 = findViewById(R.id.button_9);

        Button btn_reset = findViewById(R.id.btn_reset);
        btn_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setStart();
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonClick(view);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonClick(view);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonClick(view);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonClick(view);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonClick(view);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonClick(view);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonClick(view);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonClick(view);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonClick(view);
            }
        });
    }

    int count = 0;

    void buttonClick(View view){
        if(count%2 == 0) {
            ((Button) view).setText("X");
        }else{
            ((Button) view).setText("0");
        }
        count++;
        checkWin();
        if (count == 10){
            setStart();
        }
    }

    void checkWin(){
        checkButton(btn1, btn2, btn3, "X", "Y");
        checkButton(btn1, btn4, btn7, "X", "Y");
        checkButton(btn1, btn5, btn9, "X", "Y");
        checkButton(btn2, btn5, btn8, "X", "Y");
        checkButton(btn3, btn6, btn9, "X", "Y");
        checkButton(btn3, btn5, btn7, "X", "Y");
        checkButton(btn4, btn5, btn6, "X", "Y");
        checkButton(btn7, btn8, btn9, "X", "Y");
    }

    void checkButton(Button a, Button b, Button c, String text, String text2) {
        if (a.getText().equals(text) && b.getText().equals(text) && c.getText().equals(text)) {
            Toast.makeText(this, text + " win", Toast.LENGTH_SHORT).show();
            setStart();
        }
        if (a.getText().equals(text) && b.getText().equals(text) && c.getText().equals(text2)) {
            Toast.makeText(this, text2 + " win", Toast.LENGTH_SHORT).show();
            setStart();
        }
    }
    void setStart(){
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        count = 0;
    }


}
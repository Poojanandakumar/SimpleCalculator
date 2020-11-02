package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText1, editText2;
    Button addButton;
    TextView result;
    Button subButton;
    Button mulButton;
    Button divbutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        addButton = findViewById(R.id.add_button);
        subButton = findViewById(R.id.sub_button);
        mulButton = findViewById(R.id.mul_button);
        divbutton = findViewById(R.id.div_button);
        result = findViewById(R.id.answerView);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float first = Float.parseFloat(editText1.getText().toString());
                float second = Float.parseFloat(editText2.getText().toString());
              result.setText((first+second)+"");

            }
        });

        subButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float first =Float.parseFloat(editText1.getText().toString());
                float second = Float.parseFloat(editText2.getText().toString());
                result.setText((first-second)+"");
            }

        });

        mulButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float first =Float.parseFloat(editText1.getText().toString());
                float second = Float.parseFloat(editText2.getText().toString());
                result.setText((first*second)+"");
            }

        });

        divbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float first =Float.parseFloat(editText1.getText().toString());
                float second = Float.parseFloat(editText2.getText().toString());
                if(second==0) {
                    result.setText("Undefined");
                }
                else {
                    result.setText((first / second) + "");
                }
            }

        });


    }
}

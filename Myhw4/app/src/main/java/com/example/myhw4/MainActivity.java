package com.example.myhw4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.myhw4.R;

public class MainActivity extends AppCompatActivity {




    private Object getReset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button Reset = findViewById(R.id.button2);
        final EditText one = findViewById(R.id.editText1);
        final EditText two = findViewById(R.id.editText2);
        final EditText three = findViewById(R.id.editText3);
        final EditText four = findViewById(R.id.editText4);


        Reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                one.setText(" ");
                two.setText(" ");
                three.setText(" ");
                four.setText(" ");


            }
        });


    }}



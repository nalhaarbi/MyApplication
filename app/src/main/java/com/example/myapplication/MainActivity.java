package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button b;
    EditText e;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b = (Button) findViewById(R.id.Hbutton);
        e = (EditText) findViewById(R.id.PersonName);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String st = e.getText().toString();
                sendData(st);

            }
        });

    }

    private void sendData(String st) {
        Intent intent = new Intent(this, HActivity.class);
        intent.putExtra("personName",st);
        startActivity(intent);
    }
}
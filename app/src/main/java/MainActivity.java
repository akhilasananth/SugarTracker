package com.example.startgazer.sugartracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Converter gramsToTeaspoons = new GramsToTeaspoons();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b = (Button) findViewById(R.id.button);

        b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText g = (EditText) findViewById(R.id.gramsInput);
                double inputGrams = Double.parseDouble(g.getText().toString());
                gramsToTeaspoons.setGrams(inputGrams);

                EditText t = (EditText) findViewById(R.id.output);
                t.setText(Double.toString(gramsToTeaspoons.getTeaspoons()), TextView.BufferType.NORMAL);


            }
        });
    }
}
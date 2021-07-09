package com.example.thecaatapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et1;
    Button btn1;
    TextView tvRes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.et1);
        btn1 = findViewById(R.id.btn1);
        tvRes = findViewById(R.id.tvRes);
        tvRes.setVisibility(View.GONE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et1.getText().toString().isEmpty())
                {
                    Toast.makeText(MainActivity.this, "please enter the number", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    int chirps = Integer.parseInt(et1.getText().toString().trim());
                    double temp = (chirps/3) +4 ;
                    String result = "THE APPROX TEMP OUTSIDE IS " + temp +"°C";
                    tvRes.setText(result);
                    tvRes.setVisibility(View.VISIBLE);
                }

            }
        });

    }
}
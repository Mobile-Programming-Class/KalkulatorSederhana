package com.allam.kalkulatorsederhana;

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
    }

    public void hitung (View v) {
        float in1, in2, out=0.0f;
        Button bt;

        EditText input1 = findViewById(R.id.input1);
        EditText input2 = findViewById(R.id.input2);

        if(input1.getText().toString().equals("")) {
            input1.setText("0.0");
        }
        if(input2.getText().toString().equals("")) {
            input2.setText("0.0");
        }

        in1 = Float.parseFloat(input1.getText().toString());
        in2 = Float.parseFloat(input2.getText().toString());

        switch (v.getId()) {
            case R.id.tambah: out = in1 + in2; break;
            case R.id.kurang: out = in1 - in2; break;
            case R.id.kali: out = in1 * in2; break;
            case R.id.bagi: out = in1 / in2; break;
        }
        bt = (Button)findViewById(v.getId());

        TextView hasil_txt = findViewById(R.id.hasil);
        hasil_txt.setText(String.valueOf(in1) + " " + bt.getText() + " " + String.valueOf(in2) + " = " + String.valueOf(out));
    }
}
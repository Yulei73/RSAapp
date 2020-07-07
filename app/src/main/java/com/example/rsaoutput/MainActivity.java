package com.example.rsaoutput;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private TextView textoutput;
    private TextView textniyuan;
    private EditText edittexte;
    private EditText edittextphin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edittexte = (EditText) findViewById(R.id.edittext_e);
        edittextphin = (EditText) findViewById(R.id.edittext_phin);
        textoutput =(TextView) findViewById(R.id.text_output);
        textniyuan = (TextView) findViewById(R.id.text_niyuan);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button:
                String string_e = edittexte.getText().toString();
                String string_phin = edittextphin.getText().toString();
                if (TextUtils.isEmpty(string_e)|| TextUtils.isEmpty(string_phin)){
                    break;
                }
                int e = Integer.parseInt(string_e);
                int phin = Integer.parseInt(string_phin);
                StringBuilder str = new StringBuilder();
                str.append("ax+by=gcd(a,b)\n");
                int d=RSAd.calculated(e,phin,str);
                String string_d = Integer.toString(d);
                textniyuan.setText(string_d);
                textoutput.setText(str.toString());
                break;
            default:
                break;
        }

    }
}
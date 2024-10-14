package com.example.contador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnToast;
    private Button btnCount;
    private TextView labelCount;
    private int numero = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnToast=findViewById(R.id.BtnToast);
        btnCount=findViewById(R.id.BtnCount);
        labelCount=findViewById(R.id.LabelCount);

    }

    public void contar(View view){
        numero += 1;
        String strNumero = String.valueOf(numero);
        labelCount.setText(strNumero);
    }

    public void showText(View view){
        Toast toast = Toast.makeText(MainActivity.this,R.string.toast_message,Toast.LENGTH_LONG);
        toast.show();
    }
}
package com.example.pract21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //присвоили кнопку к кнопке на леяуте
        Button btn = (Button) findViewById(R.id.button2);
        //повесили на него листенера
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //переходим с первой на вторую активность
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });
    }
}
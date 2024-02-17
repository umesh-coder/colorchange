package com.example.colorchange;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1,btn2;
        final LinearLayout l1;

        btn1=findViewById(R.id.a_b1);
        btn2=findViewById(R.id.a_b2);

        l1=findViewById(R.id.l);

        btn1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                Toast.makeText(MainActivity.this, "LONG PRESSES", Toast.LENGTH_SHORT).show();

                return true;
            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                l1.setBackgroundResource(R.color.black);
            }
        });
    }




}
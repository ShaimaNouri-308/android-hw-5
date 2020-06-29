package com.example.hw5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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

        TextView details = findViewById(R.id.details);
        final EditText name = findViewById(R.id.one);
        final EditText age = findViewById(R.id.two);
        final EditText job = findViewById(R.id.three);
        final EditText number = findViewById(R.id.four);
        final EditText email = findViewById(R.id.five);
        Button next = findViewById(R.id.next);



        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n = name.getText().toString();
                String a = age.getText().toString();
                String j = job.getText().toString();
                String p = number.getText().toString();
                String e = email.getText().toString();

                    Intent i = new Intent (MainActivity.this,MainActivity2.class);
                    i.putExtra("data1",n);
                    i.putExtra("data2",a);
                    i.putExtra("data3",j);
                    i.putExtra("data4",p);
                    i.putExtra("data5",e);
                    startActivity(i);

            }
        });


    }
}
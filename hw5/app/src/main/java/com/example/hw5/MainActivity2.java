package com.example.hw5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView cv = findViewById(R.id.cv);
        TextView n1 = findViewById(R.id.n);
        TextView a1 = findViewById(R.id.a);
        TextView j1 = findViewById(R.id.j);
        TextView p1 = findViewById(R.id.p);
        TextView e1 = findViewById(R.id.e);


        Bundle b = getIntent().getExtras();
        n1.setText(b.getString("data1"));
        a1.setText(b.getString("data2"));
        j1.setText(b.getString("data3"));
        p1.setText(b.getString("data4"));
        e1.setText(b.getString("data5"));
    }
}
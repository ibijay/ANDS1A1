package com.example.bijay.myfirstapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button=null;
    private TextView textView=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.button);
        textView=(TextView)findViewById(R.id.textView);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                textView.setText("My First Test");
            }
        });
    }
}

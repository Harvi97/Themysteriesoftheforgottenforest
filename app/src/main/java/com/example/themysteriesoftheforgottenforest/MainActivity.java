package com.example.themysteriesoftheforgottenforest;

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
        final Button startButton = (Button)findViewById(R.id.buttonStart);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startButton.setBackgroundResource(R.drawable.button_click);
                try{
                    Intent intent = new Intent(MainActivity.this, One_level.class); startActivity(intent); finish();
                } catch (Exception e){
                    e.printStackTrace();
                }
            }
        });

    }
}

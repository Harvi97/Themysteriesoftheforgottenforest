package com.example.themysteriesoftheforgottenforest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Game_Over extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_over);
        final Button button_go_menu = (Button)findViewById(R.id.button_go_menu);
        button_go_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button_go_menu.setBackgroundResource(R.drawable.button_go_menu_press);
                try{
                    Intent intent = new Intent(Game_Over.this, MainActivity.class); startActivity(intent); finish();
                } catch (Exception e){
                    e.printStackTrace();
                }
            }
        });

        final Button button_restart = (Button)findViewById(R.id.button_restart);
        button_restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button_restart.setBackgroundResource(R.drawable.button_restart_press);
                try{
                    Intent intent = new Intent(Game_Over.this, One_level.class); startActivity(intent); finish();
                } catch (Exception e){
                    e.printStackTrace();
                }
            }
        });
    }
}

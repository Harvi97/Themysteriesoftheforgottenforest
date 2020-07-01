package com.example.themysteriesoftheforgottenforest;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Four_level extends AppCompatActivity {

    Four_scen four_scen = new Four_scen();
    Delay delay = new Delay();

    public TextView textView1;
    public TextView textView2;
    public TextView textView3;
    public TextView textView4;
    public TextView textView5;
    public TextView textView6;
    public TextView textView7;
    public TextView textView8;
    public TextView textView9;
    public TextView textView10;
    public TextView textView11;
    public TextView textView12;
    public TextView textView13;
    public TextView textView14;
    public TextView textView15;
    public TextView textView16;
    public TextView textView17;
    public Button button_go;
    public Button button_stay;
    public TextView textView18;
    public TextView textView19;
    public TextView textView20;
    public TextView textView21;
    public TextView textView22;
    public TextView textView23;
    public TextView textView24;
    public Button button_yes_two;
    public Button button_no_two;
    public TextView textView25;
    public Button button_game_over;
    public TextView textView26;
    public TextView textView27;
    public Button button_game_over_two;
    public Button button_next;
    public int vanVariant=0;
    public int twoVar=0;
    public int vanGameOv=0;
    public int twoGameOv=0;
    public int nextl=0;

    public int line=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.four_level);
        final TextView textView1 = (TextView)findViewById(R.id.textView1);
        final TextView textView2 = (TextView)findViewById(R.id.textView2);
        final TextView textView3 = (TextView)findViewById(R.id.textView3);
        final TextView textView4 = (TextView)findViewById(R.id.textView4);
        final TextView textView5 = (TextView)findViewById(R.id.textView5);
        final TextView textView6 = (TextView)findViewById(R.id.textView6);
        final TextView textView7 = (TextView)findViewById(R.id.textView7);
        final TextView textView8 = (TextView)findViewById(R.id.textView8);
        final TextView textView9 = (TextView)findViewById(R.id.textView9);
        final TextView textView10 = (TextView)findViewById(R.id.textView10);
        final TextView textView11 = (TextView)findViewById(R.id.textView11);
        final TextView textView12 = (TextView)findViewById(R.id.textView12);
        final TextView textView13 = (TextView)findViewById(R.id.textView13);
        final TextView textView14 = (TextView)findViewById(R.id.textView14);
        final TextView textView15 = (TextView)findViewById(R.id.textView15);
        final TextView textView16 = (TextView)findViewById(R.id.textView16);
        final TextView textView17 = (TextView)findViewById(R.id.textView17);
        final Button button_go = (Button)findViewById(R.id.button_go);
        final Button button_stay = (Button)findViewById(R.id.button_stay);
        final TextView textView18 = (TextView)findViewById(R.id.textView18);
        final TextView textView19 = (TextView)findViewById(R.id.textView19);
        final TextView textView20 = (TextView)findViewById(R.id.textView20);
        final TextView textView21 = (TextView)findViewById(R.id.textView21);
        final TextView textView22 = (TextView)findViewById(R.id.textView22);
        final TextView textView23 = (TextView)findViewById(R.id.textView23);
        final TextView textView24 = (TextView)findViewById(R.id.textView24);
        final Button button_yes_two = (Button)findViewById(R.id.button_yes_two);
        final Button button_no_two = (Button)findViewById(R.id.button_no_two);
        final TextView textView25 = (TextView)findViewById(R.id.textView25);
        final Button button_game_over = (Button)findViewById(R.id.button_game_over);
        final TextView textView26 = (TextView)findViewById(R.id.textView26);
        final TextView textView27 = (TextView)findViewById(R.id.textView27);
        final Button button_game_over_two = (Button)findViewById(R.id.button_game_over_two);
        final Button button_next = (Button)findViewById(R.id.button_next);

        textView1.setText(four_scen.fourscenariy[0]);
        textView2.setText(four_scen.fourscenariy[1]);
        textView3.setText(four_scen.fourscenariy[2]);
        textView4.setText(four_scen.fourscenariy[3]);
        textView5.setText(four_scen.fourscenariy[4]);
        textView6.setText(four_scen.fourscenariy[5]);
        textView7.setText(four_scen.fourscenariy[6]);
        textView8.setText(four_scen.fourscenariy[7]);
        textView9.setText(four_scen.fourscenariy[8]);
        textView10.setText(four_scen.fourscenariy[9]);
        textView11.setText(four_scen.fourscenariy[10]);
        textView12.setText(four_scen.fourscenariy[11]);
        textView13.setText(four_scen.fourscenariy[12]);
        textView14.setText(four_scen.fourscenariy[13]);
        textView15.setText(four_scen.fourscenariy[14]);
        textView16.setText(four_scen.fourscenariy[15]);
        textView17.setText(four_scen.fourscenariy[16]);
        textView18.setText(four_scen.fourscenariy[17]);
        textView19.setText(four_scen.fourscenariy[18]);
        textView20.setText(four_scen.fourscenariy[19]);
        textView21.setText(four_scen.fourscenariy[20]);
        textView22.setText(four_scen.fourscenariy[21]);
        textView23.setText(four_scen.fourscenariy[22]);
        textView24.setText(four_scen.fourscenariy[23]);
        textView25.setText(four_scen.fourscenariy[24]);
        textView26.setText(four_scen.fourscenariy[25]);
        textView27.setText(four_scen.fourscenariy[26]);

        textView1.setVisibility(View.INVISIBLE);
        textView2.setVisibility(View.INVISIBLE);
        textView3.setVisibility(View.INVISIBLE);
        textView4.setVisibility(View.INVISIBLE);
        textView5.setVisibility(View.INVISIBLE);
        textView6.setVisibility(View.INVISIBLE);
        textView7.setVisibility(View.INVISIBLE);
        textView8.setVisibility(View.INVISIBLE);
        textView9.setVisibility(View.INVISIBLE);
        textView10.setVisibility(View.INVISIBLE);
        textView11.setVisibility(View.INVISIBLE);
        textView12.setVisibility(View.INVISIBLE);
        textView13.setVisibility(View.INVISIBLE);
        textView14.setVisibility(View.INVISIBLE);
        textView15.setVisibility(View.INVISIBLE);
        textView16.setVisibility(View.INVISIBLE);
        textView17.setVisibility(View.INVISIBLE);
        button_go.setVisibility(View.INVISIBLE);
        button_stay.setVisibility(View.INVISIBLE);
        textView18.setVisibility(View.INVISIBLE);
        textView19.setVisibility(View.INVISIBLE);
        textView20.setVisibility(View.INVISIBLE);
        textView21.setVisibility(View.INVISIBLE);
        textView22.setVisibility(View.INVISIBLE);
        textView23.setVisibility(View.INVISIBLE);
        textView24.setVisibility(View.INVISIBLE);
        button_yes_two.setVisibility(View.INVISIBLE);
        button_no_two.setVisibility(View.INVISIBLE);
        textView25.setVisibility(View.INVISIBLE);
        button_game_over.setVisibility(View.INVISIBLE);
        textView26.setVisibility(View.INVISIBLE);
        textView27.setVisibility(View.INVISIBLE);
        button_game_over_two.setVisibility(View.INVISIBLE);
        button_next.setVisibility(View.INVISIBLE);

        delay.execute();
    }

    @Override
    public void onBackPressed(){
        delay.cancel(true);
        delay = null;
        try{
            Intent intent = new Intent(Four_level.this, MainActivity.class); startActivity(intent); finish();
        } catch (Exception e){
            e.printStackTrace();
        }
        finish();
    }

    class Delay extends AsyncTask<Void, Integer, Void> {

        @Override
        protected Void doInBackground(Void... params){
            while (line<=33){
                if (vanVariant==0 & line==18) {
                    line=18;
                }else {if (twoVar==0 & line==26){
                    line=26;
                }else {if (vanGameOv==0 & line==28){
                    line=28;
                }else {if (twoGameOv==0 & line==31){
                    line=31;
                }else {if (nextl==0 & line==32){
                    line=32;
                }
                    publishProgress(line=line+1);
                    try {
                        Thread.sleep(3000);
                    }catch (Exception e){}
                }}}}}
            return null;
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            final TextView textView1 = (TextView) findViewById(R.id.textView1);
            final TextView textView2 = (TextView) findViewById(R.id.textView2);
            final TextView textView3 = (TextView) findViewById(R.id.textView3);
            final TextView textView4 = (TextView) findViewById(R.id.textView4);
            final TextView textView5 = (TextView) findViewById(R.id.textView5);
            final TextView textView6 = (TextView) findViewById(R.id.textView6);
            final TextView textView7 = (TextView) findViewById(R.id.textView7);
            final TextView textView8 = (TextView) findViewById(R.id.textView8);
            final TextView textView9 = (TextView) findViewById(R.id.textView9);
            final TextView textView10 = (TextView) findViewById(R.id.textView10);
            final TextView textView11 = (TextView) findViewById(R.id.textView11);
            final TextView textView12 = (TextView) findViewById(R.id.textView12);
            final TextView textView13 = (TextView) findViewById(R.id.textView13);
            final TextView textView14 = (TextView) findViewById(R.id.textView14);
            final TextView textView15 = (TextView) findViewById(R.id.textView15);
            final TextView textView16 = (TextView) findViewById(R.id.textView16);
            final TextView textView17 = (TextView) findViewById(R.id.textView17);
            final Button button_go = (Button) findViewById(R.id.button_go);
            final Button button_stay = (Button) findViewById(R.id.button_stay);
            final TextView textView18 = (TextView) findViewById(R.id.textView18);
            final TextView textView19 = (TextView) findViewById(R.id.textView19);
            final TextView textView20 = (TextView) findViewById(R.id.textView20);
            final TextView textView21 = (TextView) findViewById(R.id.textView21);
            final TextView textView22 = (TextView) findViewById(R.id.textView22);
            final TextView textView23 = (TextView) findViewById(R.id.textView23);
            final TextView textView24 = (TextView) findViewById(R.id.textView24);
            final Button button_yes_two = (Button) findViewById(R.id.button_yes_two);
            final Button button_no_two = (Button) findViewById(R.id.button_no_two);
            final TextView textView25 = (TextView) findViewById(R.id.textView25);
            final Button button_game_over = (Button) findViewById(R.id.button_game_over);
            final TextView textView26 = (TextView) findViewById(R.id.textView26);
            final TextView textView27 = (TextView) findViewById(R.id.textView27);
            final Button button_game_over_two = (Button) findViewById(R.id.button_game_over_two);
            final Button button_next = (Button) findViewById(R.id.button_next);

            final Animation a = AnimationUtils.loadAnimation(Four_level.this, R.anim.alpha);

            switch (line){
                case 1: textView1.setVisibility(View.VISIBLE);
                textView1.startAnimation(a);break;
                case 2: textView2.setVisibility(View.VISIBLE);
                textView2.startAnimation(a);break;
                case 3: textView3.setVisibility(View.VISIBLE);
                textView3.startAnimation(a);break;
                case 4: textView4.setVisibility(View.VISIBLE);
                    textView4.startAnimation(a);break;
                case 5: textView5.setVisibility(View.VISIBLE);
                    textView5.startAnimation(a);break;
                case 6: textView6.setVisibility(View.VISIBLE);
                    textView6.startAnimation(a);break;
                case 7: textView7.setVisibility(View.VISIBLE);
                    textView7.startAnimation(a);break;
                case 8: textView8.setVisibility(View.VISIBLE);
                    textView8.startAnimation(a);break;
                case 9: textView9.setVisibility(View.VISIBLE);
                    textView9.startAnimation(a);break;
                case 10: textView10.setVisibility(View.VISIBLE);
                    textView10.startAnimation(a);break;
                case 11: textView11.setVisibility(View.VISIBLE);
                    textView11.startAnimation(a);break;
                case 12: textView12.setVisibility(View.VISIBLE);
                    textView12.startAnimation(a);break;
                case 13: textView13.setVisibility(View.VISIBLE);
                    textView13.startAnimation(a);break;
                case 14: textView14.setVisibility(View.VISIBLE);
                    textView14.startAnimation(a);break;
                case 15: textView15.setVisibility(View.VISIBLE);
                    textView15.startAnimation(a);break;
                case 16: textView16.setVisibility(View.VISIBLE);
                    textView16.startAnimation(a);break;
                case 17: textView17.setVisibility(View.VISIBLE);
                    textView17.startAnimation(a);break;
                case 18: button_go.setVisibility(View.VISIBLE);
                button_go.startAnimation(a);
                button_go.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        try {
                            if (vanVariant==0) {
                                button_go.setBackgroundResource(R.drawable.button_go_press);
                                vanVariant=1;
                                textView19.setVisibility(View.GONE);
                                textView20.setVisibility(View.GONE);
                                textView21.setVisibility(View.GONE);
                                textView22.setVisibility(View.GONE);
                                textView23.setVisibility(View.GONE);
                                textView24.setVisibility(View.GONE);
                                button_yes_two.setVisibility(View.GONE);
                                button_no_two.setVisibility(View.GONE);
                                textView25.setVisibility(View.GONE);
                                button_game_over.setVisibility(View.GONE);
                                textView26.setVisibility(View.GONE);
                                textView27.setVisibility(View.GONE);
                                button_game_over_two.setVisibility(View.GONE);
                                line=line+13;

                            }
                        }catch (Exception e){}
                    }
                });
                    button_stay.setVisibility(View.VISIBLE);
                    button_stay.startAnimation(a);
                    button_stay.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            try {
                                if (vanVariant==0){
                                    button_stay.setBackgroundResource(R.drawable.button_stay_press);
                                    vanVariant=1;
                                    textView18.setVisibility(View.GONE);
                                    line=line+1;
                                }
                            }catch (Exception e){}
                        }
                    });break;
                case 19: textView18.setVisibility(View.VISIBLE);
                textView18.startAnimation(a);break;
                case 20: textView19.setVisibility(View.VISIBLE);
                    textView19.startAnimation(a);break;
                case 21: textView20.setVisibility(View.VISIBLE);
                    textView20.startAnimation(a);break;
                case 22: textView21.setVisibility(View.VISIBLE);
                    textView21.startAnimation(a);break;
                case 23: textView22.setVisibility(View.VISIBLE);
                    textView22.startAnimation(a);break;
                case 24: textView23.setVisibility(View.VISIBLE);
                    textView23.startAnimation(a);break;
                case 25: textView24.setVisibility(View.VISIBLE);
                    textView24.startAnimation(a);break;
                case 26: button_yes_two.setVisibility(View.VISIBLE);
                    button_yes_two.startAnimation(a);
                    button_yes_two.setOnClickListener(new View.OnClickListener(){
                        @Override
                        public void onClick(View v) {
                            try {
                                if (twoVar == 0) {
                                    button_yes_two.setBackgroundResource(R.drawable.button_yes_press_two);
                                    twoVar = 1;
                                    textView25.setVisibility(View.GONE);
                                    button_game_over.setVisibility(View.GONE);
                                    line = line + 2;
                                }
                            } catch (Exception e) {
                            }
                        }
                    });
                    button_no_two.setVisibility(View.VISIBLE);
                    button_no_two.startAnimation(a);
                    button_no_two.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            try {
                                if (twoVar==0){
                                    button_no_two.setBackgroundResource(R.drawable.button_no_press_two);
                                    twoVar=1;
                                }
                            }catch (Exception e){}
                        }
                    });break;
                case 27: textView25.setVisibility(View.VISIBLE);
                textView25.startAnimation(a);break;
                case 28: button_game_over.setVisibility(View.VISIBLE);
                button_game_over.startAnimation(a);
                button_game_over.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        try{
                            if (vanGameOv==0) {
                                button_game_over.setBackgroundResource(R.drawable.button_yes_press);
                                Intent intent = new Intent(Four_level.this, Game_Over.class);
                                startActivity(intent);
                                finish();
                                vanGameOv = 1;
                            }
                        }catch (Exception e){
                            e.printStackTrace();
                        }
                    }
                });break;
                case 29: textView26.setVisibility(View.VISIBLE);
                textView26.startAnimation(a);break;
                case 30: textView27.setVisibility(View.VISIBLE);
                textView27.startAnimation(a);break;
                case 31: button_game_over_two.setVisibility(View.VISIBLE);
                button_game_over_two.startAnimation(a);
                button_game_over_two.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        try {
                            if (twoGameOv==0)
                            button_game_over_two.setBackgroundResource(R.drawable.button_game_over_press_two);
                            Intent intent = new Intent(Four_level.this, Game_Over.class);
                            startActivity(intent);
                            finish();
                            twoGameOv=1;
                        } catch(Exception e){
                            e.printStackTrace();
                        }
                    }
                });break;
                case 32: button_next.setVisibility(View.VISIBLE);
                button_next.startAnimation(a);
                button_next.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        button_next.setBackgroundResource(R.drawable.button_next_click);
                        try{
                            Intent intent = new Intent(Four_level.this, Five_level.class);
                            startActivity(intent);
                            finish();
                        } catch (Exception e){
                            e.printStackTrace();
                        }
                    }
                });
                default:break;
                }

            }
        }


}


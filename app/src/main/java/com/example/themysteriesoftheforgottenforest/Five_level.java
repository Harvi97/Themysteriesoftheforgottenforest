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

public class Five_level extends AppCompatActivity {

    Five_scene five_scen = new Five_scene();
    Delay delay = new Delay();

    public Animation a;
    public TextView textView1;
    public TextView textView2;
    public Button button_wakeup;
    public Button button_sleep;
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
    public Button button_fire;
    public Button button_sled;
    public TextView textView13;
    public TextView textView14;
    public TextView textView15;
    public TextView textView16;
    public TextView textView17;
    public TextView textView18;
    public TextView textView19;
    public TextView textView20;
    public TextView textView21;
    public TextView textView22;
    public TextView textView23;
    public TextView textView24;
    public Button button_yes;
    public Button button_no;
    public TextView textView25;
    public Button button_game_over;
    public Button button_next;
    public int Twovar = 0;
    public int Vanvar = 0;
    public int Frevar = 0;
    public int GameOv = 0;
    public int Stop = 0;


    public int line=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.five_level);
        final TextView textView1 = (TextView)findViewById(R.id.textView1);
        final TextView textView2 = (TextView)findViewById(R.id.textView2);
        final Button button_wakeup = (Button)findViewById(R.id.button_wakeup);
        final Button button_sleep = (Button)findViewById(R.id.button_sleep);
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
        final Button button_fire = (Button)findViewById(R.id.button_fire);
        final Button button_sled = (Button)findViewById(R.id.button_sled);
        final TextView textView13 = (TextView)findViewById(R.id.textView13);
        final TextView textView14 = (TextView)findViewById(R.id.textView14);
        final TextView textView15 = (TextView)findViewById(R.id.textView15);
        final TextView textView16 = (TextView)findViewById(R.id.textView16);
        final TextView textView17 = (TextView)findViewById(R.id.textView17);
        final TextView textView18 = (TextView)findViewById(R.id.textView18);
        final TextView textView19 = (TextView)findViewById(R.id.textView19);
        final TextView textView20 = (TextView)findViewById(R.id.textView20);
        final TextView textView21 = (TextView)findViewById(R.id.textView21);
        final TextView textView22 = (TextView)findViewById(R.id.textView22);
        final TextView textView23 = (TextView)findViewById(R.id.textView23);
        final TextView textView24 = (TextView)findViewById(R.id.textView24);
        final Button button_yes = (Button)findViewById(R.id.button_yes);
        final Button button_no = (Button)findViewById(R.id.button_no);
        final TextView textView25 = (TextView)findViewById(R.id.textView25);
        final Button button_game_over = (Button)findViewById(R.id.button_game_over);
        final Button button_next = (Button)findViewById(R.id.button_next);


        textView1.setText(five_scen.fivescenariy[0]);
        textView2.setText(five_scen.fivescenariy[1]);
        textView3.setText(five_scen.fivescenariy[2]);
        textView4.setText(five_scen.fivescenariy[3]);
        textView5.setText(five_scen.fivescenariy[4]);
        textView6.setText(five_scen.fivescenariy[5]);
        textView7.setText(five_scen.fivescenariy[6]);
        textView8.setText(five_scen.fivescenariy[7]);
        textView9.setText(five_scen.fivescenariy[8]);
        textView10.setText(five_scen.fivescenariy[9]);
        textView11.setText(five_scen.fivescenariy[10]);
        textView12.setText(five_scen.fivescenariy[11]);
        textView13.setText(five_scen.fivescenariy[12]);
        textView14.setText(five_scen.fivescenariy[13]);
        textView15.setText(five_scen.fivescenariy[14]);
        textView16.setText(five_scen.fivescenariy[15]);
        textView17.setText(five_scen.fivescenariy[16]);
        textView18.setText(five_scen.fivescenariy[17]);
        textView19.setText(five_scen.fivescenariy[18]);
        textView20.setText(five_scen.fivescenariy[19]);
        textView21.setText(five_scen.fivescenariy[20]);
        textView22.setText(five_scen.fivescenariy[21]);
        textView23.setText(five_scen.fivescenariy[22]);
        textView24.setText(five_scen.fivescenariy[23]);
        textView25.setText(five_scen.fivescenariy[24]);

        textView1.setVisibility(View.INVISIBLE);
        textView2.setVisibility(View.INVISIBLE);
        button_wakeup.setVisibility(View.INVISIBLE);
        button_sleep.setVisibility(View.INVISIBLE);
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
        button_fire.setVisibility(View.INVISIBLE);
        button_sled.setVisibility(View.INVISIBLE);
        textView13.setVisibility(View.INVISIBLE);
        textView14.setVisibility(View.INVISIBLE);
        textView15.setVisibility(View.INVISIBLE);
        textView16.setVisibility(View.INVISIBLE);
        textView17.setVisibility(View.INVISIBLE);
        textView18.setVisibility(View.INVISIBLE);
        textView19.setVisibility(View.INVISIBLE);
        textView20.setVisibility(View.INVISIBLE);
        textView21.setVisibility(View.INVISIBLE);
        textView22.setVisibility(View.INVISIBLE);
        textView23.setVisibility(View.INVISIBLE);
        textView24.setVisibility(View.INVISIBLE);
        button_yes.setVisibility(View.INVISIBLE);
        button_no.setVisibility(View.INVISIBLE);
        textView25.setVisibility(View.INVISIBLE);
        button_game_over.setVisibility(View.INVISIBLE);
        button_next.setVisibility(View.INVISIBLE);

        delay.execute();
    }

    @Override
    public void onBackPressed(){
        delay.cancel(true);
        delay = null;
        try{
            Intent intent = new Intent(Five_level.this, MainActivity.class); startActivity(intent); finish();
        } catch (Exception e){
            e.printStackTrace();
        }
        finish();
    }
    class Delay extends AsyncTask<Void, Integer, Void> {

        @Override
        protected Void doInBackground(Void... params){
        while (line<=30){
            if (Vanvar==0 & line==3){
                line=3;
            }else {
                if (Twovar==0 & line==14){
                    line=14;
                }else {
                    if (Frevar==0 & line==27)
                    {
                    line=27;
                }else {
                    if(GameOv==0 & line==29) {
                    line=29;
                }else {
                    if (Stop==0 & line==30){
                    line=30;

                publishProgress(line=line+1);
            try {
                Thread.sleep(3000);
            }catch (Exception e){}
        }}}}}}
        return null;
        }


        @Override
        protected void onProgressUpdate(Integer... values) {
            final TextView textView1 = (TextView)findViewById(R.id.textView1);
            final TextView textView2 = (TextView)findViewById(R.id.textView2);
            final Button button_wakeup = (Button)findViewById(R.id.button_wakeup);
            final Button button_sleep = (Button)findViewById(R.id.button_sleep);
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
            final Button button_fire = (Button)findViewById(R.id.button_fire);
            final Button button_sled = (Button)findViewById(R.id.button_sled);
            final TextView textView13 = (TextView)findViewById(R.id.textView13);
            final TextView textView14 = (TextView)findViewById(R.id.textView14);
            final TextView textView15 = (TextView)findViewById(R.id.textView15);
            final TextView textView16 = (TextView)findViewById(R.id.textView16);
            final TextView textView17 = (TextView)findViewById(R.id.textView17);
            final TextView textView18 = (TextView)findViewById(R.id.textView18);
            final TextView textView19 = (TextView)findViewById(R.id.textView19);
            final TextView textView20 = (TextView)findViewById(R.id.textView20);
            final TextView textView21 = (TextView)findViewById(R.id.textView21);
            final TextView textView22 = (TextView)findViewById(R.id.textView22);
            final TextView textView23 = (TextView)findViewById(R.id.textView23);
            final TextView textView24 = (TextView)findViewById(R.id.textView24);
            final Button button_yes = (Button)findViewById(R.id.button_yes);
            final Button button_no = (Button)findViewById(R.id.button_no);
            final TextView textView25 = (TextView)findViewById(R.id.textView25);
            final Button button_game_over = (Button)findViewById(R.id.button_game_over);
            final Button button_next = (Button)findViewById(R.id.button_next);

            final Animation a = AnimationUtils.loadAnimation(Five_level.this, R.anim.alpha);

            switch (line){
                case 1: textView1.setVisibility(View.VISIBLE);
                textView1.startAnimation(a);break;
                case 2: textView2.setVisibility(View.VISIBLE);
                textView2.startAnimation(a);break;
                case 3: button_wakeup.setVisibility(View.VISIBLE);
                button_wakeup.startAnimation(a);
                button_wakeup.setOnClickListener(new View.OnClickListener(){
                        @Override
                        public void onClick(View v) {
                            try {
                                if (Vanvar==0) {
                                    button_wakeup.setBackgroundResource(R.drawable.button_wakeup_press);
                                    Vanvar = 1;
                                    textView3.setVisibility(View.GONE);
                                    line=line+1;
                                }
                        }catch (Exception e){}
                     }
                 });
                button_sleep.setVisibility(View.VISIBLE);
                button_sleep.startAnimation(a);
                button_sleep.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        try {
                            if (Vanvar==0){
                             button_sleep.setBackgroundResource(R.drawable.button_sleep_press);
                                Vanvar=1;
                            }
                        }catch (Exception e){}
                    }
                });break;
                case 4: textView3.setVisibility(View.VISIBLE);
                textView3.startAnimation(a);break;
                case 5: textView4.setVisibility(View.VISIBLE);
                textView4.startAnimation(a);break;
                case 6: textView5.setVisibility(View.VISIBLE);
                    textView5.startAnimation(a);break;
                case 7: textView6.setVisibility(View.VISIBLE);
                    textView6.startAnimation(a);break;
                case 8: textView7.setVisibility(View.VISIBLE);
                    textView7.startAnimation(a);break;
                case 9: textView8.setVisibility(View.VISIBLE);
                    textView8.startAnimation(a);break;
                case 10: textView9.setVisibility(View.VISIBLE);
                    textView9.startAnimation(a);break;
                case 11: textView10.setVisibility(View.VISIBLE);
                    textView10.startAnimation(a);break;
                case 12: textView11.setVisibility(View.VISIBLE);
                    textView11.startAnimation(a);break;
                case 13: textView12.setVisibility(View.VISIBLE);
                    textView12.startAnimation(a);break;
                case 14: button_fire.setVisibility(View.VISIBLE);
                button_fire.startAnimation(a);
                button_fire.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                     try {if (Twovar==0){
                         button_fire.setBackgroundResource(R.drawable.button_fire);
                         Twovar=1;
                         textView13.setVisibility(View.GONE);
                         textView14.setVisibility(View.GONE);
                         line=line+2;
                     }
                     }catch (Exception e){}
                    }
                });
                button_sled.setVisibility(View.VISIBLE);
                button_sled.startAnimation(a);
                button_sled.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        try {if (Twovar==0) {
                            button_sled.setBackgroundResource(R.drawable.button_sled);
                            Twovar=1;
                        }
                        }catch (Exception e){}
                    }
                });break;
                case 15: textView13.setVisibility(View.VISIBLE);
                textView13.startAnimation(a);break;
                case 16: textView14.setVisibility(View.VISIBLE);
                    textView14.startAnimation(a);break;
                case 17: textView15.setVisibility(View.VISIBLE);
                    textView15.startAnimation(a);break;
                case 18: textView16.setVisibility(View.VISIBLE);
                    textView16.startAnimation(a);break;
                case 19: textView17.setVisibility(View.VISIBLE);
                    textView17.startAnimation(a);break;
                case 20: textView18.setVisibility(View.VISIBLE);
                    textView18.startAnimation(a);break;
                case 21: textView19.setVisibility(View.VISIBLE);
                    textView19.startAnimation(a);break;
                case 22: textView20.setVisibility(View.VISIBLE);
                    textView20.startAnimation(a);break;
                case 23: textView21.setVisibility(View.VISIBLE);
                    textView21.startAnimation(a);break;
                case 24: textView22.setVisibility(View.VISIBLE);
                    textView22.startAnimation(a);break;
                case 25: textView23.setVisibility(View.VISIBLE);
                    textView23.startAnimation(a);break;
                case 26: textView24.setVisibility(View.VISIBLE);
                    textView24.startAnimation(a);break;
                case 27: button_yes.setVisibility(View.VISIBLE);
                    button_yes.startAnimation(a);
                    button_yes.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            try {if (Frevar==0){
                                button_yes.setBackgroundResource(R.drawable.button_yes_press);
                                Frevar=1;
                                textView25.setVisibility(View.GONE);
                                button_game_over.setVisibility(View.GONE);
                                line=line+2;
                            }
                            }catch (Exception e){}
                        }
                    });
                    button_no.setVisibility(View.VISIBLE);
                    button_no.startAnimation(a);
                    button_no.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            try {if (Frevar==0) {
                                button_no.setBackgroundResource(R.drawable.button_no_press);
                                Frevar=1;
                            }
                            }catch (Exception e){}
                        }
                    });
                    break;
                case 28: textView25.setVisibility(View.VISIBLE);
                    textView25.startAnimation(a);break;
                case 29: button_game_over.setVisibility(View.VISIBLE);
                    button_game_over.startAnimation(a);
                    button_game_over.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            try {
                                if (GameOv==0)
                                    button_game_over.setBackgroundResource(R.drawable.button_game_over_press);
                                Intent intent = new Intent(Five_level.this, Game_Over.class);
                                startActivity(intent);
                                finish();
                                GameOv=1;
                            } catch(Exception e){
                                e.printStackTrace();
                            }
                        }
                    });break;
                case 30: button_next.setVisibility(View.VISIBLE);
                    button_next.startAnimation(a);
                    button_next.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            button_next.setBackgroundResource(R.drawable.button_next_click);
                            try{
                                Intent intent = new Intent(Five_level.this, Game_Over.class);
                                startActivity(intent);
                                finish();
                            } catch (Exception e){
                                e.printStackTrace();
                            }
                        }
                    });default:break;

            }
        }

    }
}

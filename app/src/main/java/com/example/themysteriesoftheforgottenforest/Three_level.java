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

public class Three_level extends AppCompatActivity {

    Three_scene three_scene= new Three_scene();
    Delay delay = new Delay();

    public Animation a;
    public TextView textView1;
    public TextView textView2;
    public TextView textView3;
    public TextView textView4;
    public TextView textView5;
    public TextView textView6;
    public Button button_yes;
    public Button button_no;
    public TextView textView7;
    public TextView textView8;
    public TextView textView9;
    public TextView textView10;
    public TextView textView11;
    public TextView textView12;
    public TextView textView13;
    public Button button_next;
    public int vanVariant=0;
    public int twoVar=0;

    public int line=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.three_level);
        final TextView textView1 = (TextView)findViewById(R.id.textView1);
        final TextView textView2 = (TextView)findViewById(R.id.textView2);
        final TextView textView3 = (TextView)findViewById(R.id.textView3);
        final TextView textView4 = (TextView)findViewById(R.id.textView4);
        final TextView textView5 = (TextView)findViewById(R.id.textView5);
        final TextView textView6 = (TextView)findViewById(R.id.textView6);
        final Button button_yes = (Button)findViewById(R.id.button_yes);
        final Button button_no = (Button)findViewById(R.id.button_no);
        final TextView textView7 = (TextView)findViewById(R.id.textView7);
        final TextView textView8 = (TextView)findViewById(R.id.textView8);
        final TextView textView9 = (TextView)findViewById(R.id.textView9);
        final TextView textView10 = (TextView)findViewById(R.id.textView10);
        final TextView textView11 = (TextView)findViewById(R.id.textView11);
        final TextView textView12 = (TextView)findViewById(R.id.textView12);
        final TextView textView13 = (TextView)findViewById(R.id.textView13);
        final Button button_next = (Button)findViewById(R.id.button_next);

        textView1.setText(three_scene.threescenariy[0]);
        textView2.setText(three_scene.threescenariy[1]);
        textView3.setText(three_scene.threescenariy[2]);
        textView4.setText(three_scene.threescenariy[3]);
        textView5.setText(three_scene.threescenariy[4]);
        textView6.setText(three_scene.threescenariy[5]);
        textView7.setText(three_scene.threescenariy[6]);
        textView8.setText(three_scene.threescenariy[7]);
        textView9.setText(three_scene.threescenariy[8]);
        textView10.setText(three_scene.threescenariy[9]);
        textView11.setText(three_scene.threescenariy[10]);
        textView12.setText(three_scene.threescenariy[11]);
        textView13.setText(three_scene.threescenariy[12]);

        textView1.setVisibility(View.INVISIBLE);
        textView2.setVisibility(View.INVISIBLE);
        textView3.setVisibility(View.INVISIBLE);
        textView4.setVisibility(View.INVISIBLE);
        textView5.setVisibility(View.INVISIBLE);
        textView6.setVisibility(View.INVISIBLE);
        button_yes.setVisibility(View.INVISIBLE);
        button_no.setVisibility(View.INVISIBLE);
        textView7.setVisibility(View.INVISIBLE);
        textView8.setVisibility(View.INVISIBLE);
        textView9.setVisibility(View.INVISIBLE);
        textView10.setVisibility(View.INVISIBLE);
        textView11.setVisibility(View.INVISIBLE);
        textView12.setVisibility(View.INVISIBLE);
        textView13.setVisibility(View.INVISIBLE);
        button_next.setVisibility(View.INVISIBLE);

        delay.execute();

    }

    @Override
    public void onBackPressed(){
        delay.cancel(true);
        delay = null;
        try{
            Intent intent = new Intent(Three_level.this, MainActivity.class); startActivity(intent); finish();
        } catch (Exception e){
            e.printStackTrace();
        }
        finish();
    }

    class Delay extends AsyncTask<Void, Integer, Void> {

        @Override
        protected Void doInBackground(Void... params){
            while (line<=15){
                if (vanVariant==0 & line==9) {
                    line=9;}
                else {if (twoVar==0 & line==15){
                        line=15;
                }
                    publishProgress(line=line+1);
                    try {
                        Thread.sleep(3000);
                    }catch (Exception e){}
            }}
            return null;
        }

        @Override
        protected void onProgressUpdate(Integer... values){
            final TextView textView1 = (TextView)findViewById(R.id.textView1);
            final TextView textView2 = (TextView)findViewById(R.id.textView2);
            final TextView textView3 = (TextView)findViewById(R.id.textView3);
            final TextView textView4 = (TextView)findViewById(R.id.textView4);
            final TextView textView5 = (TextView)findViewById(R.id.textView5);
            final TextView textView6 = (TextView)findViewById(R.id.textView6);
            final Button button_yes = (Button)findViewById(R.id.button_yes);
            final Button button_no = (Button)findViewById(R.id.button_no);
            final TextView textView7 = (TextView)findViewById(R.id.textView7);
            final TextView textView8 = (TextView)findViewById(R.id.textView8);
            final TextView textView9 = (TextView)findViewById(R.id.textView9);
            final TextView textView10 = (TextView)findViewById(R.id.textView10);
            final TextView textView11 = (TextView)findViewById(R.id.textView11);
            final TextView textView12 = (TextView)findViewById(R.id.textView12);
            final TextView textView13 = (TextView)findViewById(R.id.textView13);
            final Button button_next = (Button)findViewById(R.id.button_next);

            final Animation a = AnimationUtils.loadAnimation(Three_level.this, R.anim.alpha);

            switch (line){
                case 1: textView1.setVisibility(View.VISIBLE);
                    textView1.startAnimation(a);
                    break;
                case 2: textView2.setVisibility(View.VISIBLE);
                    textView2.startAnimation(a);
                    break;
                case 3: textView3.setVisibility(View.VISIBLE);
                    textView3.startAnimation(a);
                    break;
                case 4: textView4.setVisibility(View.VISIBLE);
                    textView4.startAnimation(a);
                    break;
                case 5: textView5.setVisibility(View.VISIBLE);
                    textView5.startAnimation(a);
                    break;
                case 6: textView6.setVisibility(View.VISIBLE);
                    textView6.startAnimation(a);
                    break;
                case 7: textView7.setVisibility(View.VISIBLE);
                    textView7.startAnimation(a);
                    break;
                case 8: textView8.setVisibility(View.VISIBLE);
                    textView8.startAnimation(a);
                    break;
                case 9:button_yes.setVisibility(View.VISIBLE);
                    button_yes.startAnimation(a);
                    button_yes.setOnClickListener(new View.OnClickListener(){
                        @Override
                        public void onClick(View v) {
                            try {
                                if (vanVariant==0) {
                                    button_yes.setBackgroundResource(R.drawable.button_yes_press);
                                    vanVariant=1;
                                    textView9.setVisibility(View.GONE);
                                    textView10.setVisibility(View.GONE);
                                    textView11.setVisibility(View.GONE);
                                    textView12.setVisibility(View.GONE);
                                    textView13.setVisibility(View.GONE);
                                    line=line+5;
                                }
                            }catch (Exception e){}
                        }
                    });
                    button_no.setVisibility(View.VISIBLE);
                    button_no.startAnimation(a);
                    button_no.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            try {
                                if (vanVariant==0){
                                    button_no.setBackgroundResource(R.drawable.button_no_press);
                                    vanVariant=1;
                                    textView9.setVisibility(View.GONE);
                                    line=line+1;
                                }
                            }catch (Exception e){}
                        }
                    });break;
                case 10: textView9.setVisibility(View.VISIBLE);
                    textView9.startAnimation(a);
                    break;
                case 11: textView10.setVisibility(View.VISIBLE);
                    textView10.startAnimation(a);
                    break;
                case 12: textView11.setVisibility(View.VISIBLE);
                    textView11.startAnimation(a);
                    break;
                case 13: textView12.setVisibility(View.VISIBLE);
                    textView12.startAnimation(a);
                    break;
                case 14: textView13.setVisibility(View.VISIBLE);
                    textView13.startAnimation(a);
                    break;
                case 15: button_next.setVisibility(View.VISIBLE);
                    button_next.startAnimation(a);
                    button_next.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            button_next.setBackgroundResource(R.drawable.button_next_click);
                            try{
                                Intent intent = new Intent(Three_level.this, Four_level.class);
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
}}

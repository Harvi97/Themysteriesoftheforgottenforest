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

public class One_level extends AppCompatActivity {

    One_scen one_Scen = new One_scen();
    Delay delay = new Delay();
    public Animation a;
    public TextView textView1;
    public TextView textView2;
    public TextView textView3;
    public TextView textView4;
    public TextView textView5;
    public TextView textView6;
    public TextView textView7;
    public TextView textView8;
    public Button button_yes;
    public Button button_no;
    public TextView textView9;
    public Button button_game_over;
    public TextView textView10;
    public TextView textView11;
    public TextView textView12;
    public Button button_yes_two;
    public Button button_no_two;
    public TextView textView13;
    public Button button_game_over_two;
    public TextView textView14;
    public TextView textView15;
    public TextView TextView16;
    public Button button_next;

    public int vanVariant=0;
    public int vanGameOver=0;
    public int twoVariant=0;
    public int twoGameOver=0;
    public int next=0;

    public int line=0;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.one_level);
        final TextView textView1 = (TextView)findViewById(R.id.textView1);
        final TextView textView2 = (TextView)findViewById(R.id.textView2);
        final TextView textView3 = (TextView)findViewById(R.id.textView3);
        final TextView textView4 = (TextView)findViewById(R.id.textView4);
        final TextView textView5 = (TextView)findViewById(R.id.textView5);
        final TextView textView6 = (TextView)findViewById(R.id.textView6);
        final TextView textView7 = (TextView)findViewById(R.id.textView7);
        final TextView textView8 = (TextView)findViewById(R.id.textView8);
        final Button button_yes = (Button)findViewById(R.id.button_yes);
        final Button button_no = (Button)findViewById(R.id.button_no);
        final TextView textView9 = (TextView)findViewById(R.id.textView9);
        final Button button_game_over = (Button)findViewById(R.id.button_game_over);
        final TextView textView10 = (TextView)findViewById(R.id.textView10);
        final TextView textView11 = (TextView)findViewById(R.id.textView11);
        final TextView textView12 = (TextView)findViewById(R.id.textView12);
        final Button button_yes_two = (Button)findViewById(R.id.button_yes_two);
        final Button button_no_two = (Button)findViewById(R.id.button_no_two);
        final TextView textView13 = (TextView)findViewById(R.id.textView13);
        final Button button_game_over_two = (Button)findViewById(R.id.button_game_over_two);
        final TextView textView14 = (TextView)findViewById(R.id.textView14);
        final TextView textView15 = (TextView)findViewById(R.id.textView15);
        final TextView textView16 = (TextView)findViewById(R.id.textView16);
        final Button button_next = (Button)findViewById(R.id.button_next);

        textView1.setText(one_Scen.onescenariy[0]);
        textView2.setText(one_Scen.onescenariy[1]);
        textView3.setText(one_Scen.onescenariy[2]);
        textView4.setText(one_Scen.onescenariy[3]);
        textView5.setText(one_Scen.onescenariy[4]);
        textView6.setText(one_Scen.onescenariy[5]);
        textView7.setText(one_Scen.onescenariy[6]);
        textView8.setText(one_Scen.onescenariy[7]);
        textView9.setText(one_Scen.onescenariy[8]);
        textView10.setText(one_Scen.onescenariy[9]);
        textView11.setText(one_Scen.onescenariy[10]);
        textView12.setText(one_Scen.onescenariy[11]);
        textView13.setText(one_Scen.onescenariy[12]);
        textView14.setText(one_Scen.onescenariy[13]);
        textView15.setText(one_Scen.onescenariy[14]);
        textView16.setText(one_Scen.onescenariy[15]);

        //код який ховатиме текст
        textView1.setVisibility(View.INVISIBLE);
        textView2.setVisibility(View.INVISIBLE);
        textView3.setVisibility(View.INVISIBLE);
        textView4.setVisibility(View.INVISIBLE);
        textView5.setVisibility(View.INVISIBLE);
        textView6.setVisibility(View.INVISIBLE);
        textView7.setVisibility(View.INVISIBLE);
        textView8.setVisibility(View.INVISIBLE);
        button_yes.setVisibility(View.INVISIBLE);
        button_no.setVisibility(View.INVISIBLE);
        textView9.setVisibility(View.INVISIBLE);
        button_game_over.setVisibility(View.INVISIBLE);
        textView10.setVisibility(View.INVISIBLE);
        textView11.setVisibility(View.INVISIBLE);
        textView12.setVisibility(View.INVISIBLE);
        textView13.setVisibility(View.INVISIBLE);
        button_yes_two.setVisibility(View.INVISIBLE);
        button_no_two.setVisibility(View.INVISIBLE);
        textView14.setVisibility(View.INVISIBLE);
        button_game_over_two.setVisibility(View.INVISIBLE);
        textView15.setVisibility(View.INVISIBLE);
        textView16.setVisibility(View.INVISIBLE);
        button_next.setVisibility(View.INVISIBLE);

        delay.execute();

    }

    @Override
    public void onBackPressed(){
        delay.cancel(true);
        delay = null;
        try{
            Intent intent = new Intent(One_level.this, MainActivity.class); startActivity(intent); finish();
        } catch (Exception e){
            e.printStackTrace();
        }
        finish();
    }

    class Delay extends AsyncTask<Void, Integer, Void>{

        @Override
        protected Void doInBackground(Void... params){
            while (line<=21){
                if (vanVariant==0 & line==8){
                    line=8;
                    }else {
                        if (vanGameOver==0 & line==10) {
                            line = 10;
                            }else {
                                if (twoVariant==0 & line==16){
                                line=16;
                                }else {
                                    if (twoGameOver==0 & line==18){
                                        line=18;
                                    }else {if (next==0 & line==21){
                                        line=21;
                                    }

            publishProgress(line=line+1);
                try {
                    Thread.sleep(3000);
                } catch (Exception e) {}
            }}}}}
            return null;
        }

    @Override
    protected void onProgressUpdate (Integer... Value){
         final TextView textView1 = (TextView)findViewById(R.id.textView1);
         final TextView textView2 = (TextView)findViewById(R.id.textView2);
         final TextView textView3 = (TextView)findViewById(R.id.textView3);
         final TextView textView4 = (TextView)findViewById(R.id.textView4);
         final TextView textView5 = (TextView)findViewById(R.id.textView5);
         final TextView textView6 = (TextView)findViewById(R.id.textView6);
         final TextView textView7 = (TextView)findViewById(R.id.textView7);
         final Button button_yes = (Button)findViewById(R.id.button_yes);
         final Button button_no = (Button)findViewById(R.id.button_no);
         final TextView textView8 = (TextView)findViewById(R.id.textView8);
         final Button button_game_over = (Button)findViewById(R.id.button_game_over);
         final TextView textView9 = (TextView)findViewById(R.id.textView9);
         final TextView textView10 = (TextView)findViewById(R.id.textView10);
         final TextView textView11 = (TextView)findViewById(R.id.textView11);
         final TextView textView12 = (TextView)findViewById(R.id.textView12);
         final TextView textView13 = (TextView)findViewById(R.id.textView13);
         final Button button_yes_two = (Button)findViewById(R.id.button_yes_two);
         final Button button_no_two = (Button)findViewById(R.id.button_no_two);
         final TextView textView14 = (TextView)findViewById(R.id.textView14);
         final Button button_game_over_two = (Button)findViewById(R.id.button_game_over_two);
         final TextView textView15 = (TextView)findViewById(R.id.textView15);
         final TextView textView16 = (TextView)findViewById(R.id.textView16);
         final Button button_next = (Button)findViewById(R.id.button_next);

         final Animation a = AnimationUtils.loadAnimation(One_level.this, R.anim.alpha);

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
                case 8: button_yes.setVisibility(View.VISIBLE);
                    button_yes.startAnimation(a);
                    button_yes.setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View v) {
                        try {
                            if (vanVariant==0){
                                button_yes.setBackgroundResource(R.drawable.button_yes_press);
                                vanVariant=1;
                                textView8.setVisibility(View.GONE);
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
                        try {
                            if (vanVariant==0){
                                button_no.setBackgroundResource(R.drawable.button_no_press);
                                vanVariant=1;
                                textView9.setVisibility(View.GONE);
                                textView10.setVisibility(View.GONE);
                                textView11.setVisibility(View.GONE);
                                textView12.setVisibility(View.GONE);
                                textView13.setVisibility(View.GONE);
                                button_yes_two.setVisibility(View.GONE);
                                button_no_two.setVisibility(View.GONE);
                                textView14.setVisibility(View.GONE);
                                button_game_over_two.setVisibility(View.GONE);
                                textView15.setVisibility(View.GONE);
                                button_next.setVisibility(View.GONE);
                            }
                        }catch (Exception e){
                        }
                     }
                    });break;
                    case 9: textView8.setVisibility(View.VISIBLE);
                    textView8.startAnimation(a);
                    break;
                    case 10: button_game_over.setVisibility(View.VISIBLE);
                    button_game_over.startAnimation(a);
                    button_game_over.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            try{
                                if (vanGameOver==0){
                                    button_game_over.setBackgroundResource(R.drawable.button_game_over_press);
                                    Intent intent = new Intent(One_level.this, Game_Over.class); startActivity(intent); finish();
                                    vanGameOver=1;
                                    line=line+10;
                                }
                            }catch (Exception e){
                                e.printStackTrace();
                            }
                        }
                    });break;
                    case 11: textView9.setVisibility(View.VISIBLE);
                    textView9.startAnimation(a);
                    break;
                    case 12: textView10.setVisibility(View.VISIBLE);
                    textView10.startAnimation(a);
                    break;
                    case 13: textView11.setVisibility(View.VISIBLE);
                    textView11.startAnimation(a);
                    break;
                    case 14: textView12.setVisibility(View.VISIBLE);
                    textView12.startAnimation(a);
                    break;
                    case 15: textView13.setVisibility(View.VISIBLE);
                    textView13.startAnimation(a);
                    break;
                    case 16: button_yes_two.setVisibility(View.VISIBLE);
                    button_yes_two.startAnimation(a);
                    button_yes_two.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                           try {
                               if (twoVariant==0){
                                   button_yes_two.setBackgroundResource(R.drawable.button_yes_press_two);
                                   twoVariant=1;
                                   textView14.setVisibility(View.GONE);
                                   button_game_over_two.setVisibility(View.GONE);
                                   line=line+2;
                               }
                           }catch (Exception e){} }
                                        });
                    button_no_two.setVisibility(View.VISIBLE);
                    button_no_two.startAnimation(a);
                    button_no_two.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                           try {
                               if (twoVariant==0){
                                   button_no_two.setBackgroundResource(R.drawable.button_no_press_two);
                                   twoVariant=1;
                                   textView15.setVisibility(View.GONE);
                                   textView16.setVisibility(View.GONE);
                                   button_next.setVisibility(View.GONE);

                               }
                           }catch (Exception e){
                           } }
                    });break;
                    case 17: textView14.setVisibility(View.VISIBLE);
                    textView14.startAnimation(a);break;
                    case 18: button_game_over_two.setVisibility(View.VISIBLE);
                    button_game_over_two.startAnimation(a);
                    button_game_over_two.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                         try{
                             if (twoGameOver==0){
                                 button_game_over_two.setBackgroundResource(R.drawable.button_game_over_press_two);
                                 Intent intent = new Intent(One_level.this, Game_Over.class); startActivity(intent); finish();
                                 twoGameOver=1;
                                 line=line+3;
                             }
                         }catch (Exception e){
                             e.printStackTrace();
                         }
                        }
                    });break;
                    case 19: textView15.setVisibility(View.VISIBLE);
                    textView15.startAnimation(a);
                    break;
                    case 20: textView16.setVisibility(View.VISIBLE);
                    textView16.startAnimation(a);
                    break;
                    case 21: button_next.setVisibility(View.VISIBLE);
                    button_next.startAnimation(a);
                    button_next.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            button_next.setBackgroundResource(R.drawable.button_next_click);
                            try{
                                    Intent intent = new Intent(One_level.this, Two_level.class);
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


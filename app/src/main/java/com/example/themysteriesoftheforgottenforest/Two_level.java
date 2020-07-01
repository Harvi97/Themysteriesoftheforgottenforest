package com.example.themysteriesoftheforgottenforest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.os.AsyncTask;

import androidx.appcompat.app.AppCompatActivity;

public class Two_level extends AppCompatActivity {

    Two_scen two_scen = new Two_scen();
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
    public TextView textView9;
    public TextView textView10;
    public Button buttonyes;
    public Button buttonno;
    public TextView textView13;
    public Button button_game_over;
    public TextView textView14;
    public TextView textView15;
    public TextView textView16;
    public TextView textView17;
    public TextView textView18;
    public Button button_next;
    public int line=0;
    public int counterFirstLine=0;
    public int counterSeconLine=0;
    public int vannext=0;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.two_level);
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
        final Button buttonyes = (Button)findViewById(R.id.buttonyes);
        final Button buttonno = (Button)findViewById(R.id.buttonno);
        final TextView textView13 = (TextView)findViewById(R.id.textView13);
        final Button button_game_over = (Button)findViewById(R.id.button_game_over);
        final TextView textView14 = (TextView)findViewById(R.id.textView14);
        final TextView textView15 = (TextView)findViewById(R.id.textView15);
        final TextView textView16 = (TextView)findViewById(R.id.textView16);
        final TextView textView17 = (TextView)findViewById(R.id.textView17);
        final TextView textView18 = (TextView)findViewById(R.id.textView18);
        final Button button_next = (Button)findViewById(R.id.button_next);


        textView1.setText(two_scen.twoscenariy[0]);
        textView2.setText(two_scen.twoscenariy[1]);
        textView3.setText(two_scen.twoscenariy[2]);
        textView4.setText(two_scen.twoscenariy[3]);
        textView5.setText(two_scen.twoscenariy[4]);
        textView6.setText(two_scen.twoscenariy[5]);
        textView7.setText(two_scen.twoscenariy[6]);
        textView8.setText(two_scen.twoscenariy[7]);
        textView9.setText(two_scen.twoscenariy[8]);
        textView10.setText(two_scen.twoscenariy[9]);
        textView13.setText(two_scen.twoscenariy[10]);
        textView14.setText(two_scen.twoscenariy[11]);
        textView15.setText(two_scen.twoscenariy[12]);
        textView16.setText(two_scen.twoscenariy[13]);
        textView17.setText(two_scen.twoscenariy[14]);
        textView18.setText(two_scen.twoscenariy[15]);



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
        buttonyes.setVisibility(View.INVISIBLE);
        buttonno.setVisibility(View.INVISIBLE);
        textView13.setVisibility(View.INVISIBLE);
        button_game_over.setVisibility(View.INVISIBLE);
        textView14.setVisibility(View.INVISIBLE);
        textView15.setVisibility(View.INVISIBLE);
        textView16.setVisibility(View.INVISIBLE);
        textView17.setVisibility(View.INVISIBLE);
        textView18.setVisibility(View.INVISIBLE);
        button_next.setVisibility(View.INVISIBLE);

        delay.execute();
    }

    @Override
    public void onBackPressed(){
        delay.cancel(true);
        delay = null;
        try{
            Intent intent = new Intent(Two_level.this, MainActivity.class); startActivity(intent); finish();
        } catch (Exception e){
            e.printStackTrace();
        }
        finish();
    }

    class Delay extends AsyncTask<Void, Integer, Void>{

        @Override
        protected Void doInBackground(Void... params){
          while (line<=19){
              if (counterFirstLine==0 & line==11){
                  line = 11;
              }else {
                  if (counterSeconLine==0 & line==13) {
                      line = 13;
                     }else {if (vannext==0 & line==19){
                         line=19;
                  }
              publishProgress(line=line+1);
              try {
                  Thread.sleep(3000);
              }catch (Exception e){}
          }}}
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
            final TextView textView7 = (TextView)findViewById(R.id.textView7);
            final TextView textView8 = (TextView)findViewById(R.id.textView8);
            final TextView textView9 = (TextView)findViewById(R.id.textView9);
            final TextView textView10 = (TextView)findViewById(R.id.textView10);
            final Button buttonyes = (Button)findViewById(R.id.buttonyes);
            final Button buttonno = (Button)findViewById(R.id.buttonno);
            final TextView textView13 = (TextView)findViewById(R.id.textView13);
            final Button button_game_over = (Button)findViewById(R.id.button_game_over);
            final TextView textView14 = (TextView)findViewById(R.id.textView14);
            final TextView textView15 = (TextView)findViewById(R.id.textView15);
            final TextView textView16 = (TextView)findViewById(R.id.textView16);
            final TextView textView17 = (TextView)findViewById(R.id.textView17);
            final TextView textView18 = (TextView)findViewById(R.id.textView18);
            final Button button_next = (Button)findViewById(R.id.button_next);

            final Animation a = AnimationUtils.loadAnimation(Two_level.this, R.anim.alpha);

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
                case 9: textView9.setVisibility(View.VISIBLE);
                    textView9.startAnimation(a);
                    break;
                case 10: textView10.setVisibility(View.VISIBLE);
                    textView10.startAnimation(a);
                    break;
                case 11: buttonyes.setVisibility(View.VISIBLE);
                    buttonyes.startAnimation(a);
                    buttonyes.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            try {
                                if (counterFirstLine==0){
                                buttonyes.setBackgroundResource(R.drawable.button_yes_press);
                                    counterFirstLine=1;
                                textView13.setVisibility(View.GONE);
                                button_game_over.setVisibility(View.GONE);
                                line=line+2;
                                }
                            }catch (Exception e){}
                        }
                    });
                    buttonno.setVisibility(View.VISIBLE);
                    buttonno.startAnimation(a);
                    buttonno.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            try {
                                if (counterFirstLine==0){
                                buttonno.setBackgroundResource(R.drawable.button_no_press);
                                    counterFirstLine=1;
                                    textView14.setVisibility(View.GONE);
                                    textView15.setVisibility(View.GONE);
                                    textView16.setVisibility(View.GONE);
                                    textView17.setVisibility(View.GONE);
                                    textView18.setVisibility(View.GONE);
                                    button_next.setVisibility(View.GONE);

                                }
                            }catch (Exception e){

                            }
                        }
                    });break;
                case 12: textView13.setVisibility(View.VISIBLE);
                    textView13.startAnimation(a);
                        break;
                case 13: button_game_over.setVisibility(View.VISIBLE);
                    button_game_over.startAnimation(a);
                    button_game_over.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            try{
                                if (counterSeconLine==0){
                                button_game_over.setBackgroundResource(R.drawable.button_game_over_press);
                                Intent intent = new Intent(Two_level.this, Game_Over.class); startActivity(intent); finish();
                                    counterSeconLine=1;
                                    line=line+6;
                                }
                            }catch (Exception e){
                                e.printStackTrace();
                            }
                        }
                    });break;
                case 14: textView14.setVisibility(View.VISIBLE);
                    textView14.startAnimation(a);
                    break;
                case 15: textView15.setVisibility(View.VISIBLE);
                    textView15.startAnimation(a);
                    break;
                case 16: textView16.setVisibility(View.VISIBLE);
                    textView16.startAnimation(a);
                    break;
                case 17: textView17.setVisibility(View.VISIBLE);
                    textView17.startAnimation(a);
                    break;
                case 18: textView18.setVisibility(View.VISIBLE);
                    textView18.startAnimation(a);
                    break;
                case 19: button_next.setVisibility(View.VISIBLE);
                    button_next.startAnimation(a);
                    button_next.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            button_next.setBackgroundResource(R.drawable.button_next_click);
                            try{
                                Intent intent = new Intent(Two_level.this, Three_level.class);
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

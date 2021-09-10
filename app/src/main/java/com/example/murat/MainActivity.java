package com.example.murat;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt10,bt11,bt12,bt13,bt14,bt15,bt16,bt17,bt18,bt19,bt20,bt21;
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1=findViewById(R.id.knopka1);
        bt2=findViewById(R.id.knopka2);
        bt3=findViewById(R.id.knopka3);
        bt4=findViewById(R.id.knopka4);
        bt5=findViewById(R.id.knopka5);
        bt6=findViewById(R.id.knopka6);
        bt7=findViewById(R.id.knopka7);
        bt8=findViewById(R.id.knopka8);
        bt9=findViewById(R.id.knopka9);
        bt10=findViewById(R.id.knopka10);
        bt11=findViewById(R.id.knopka11);
        bt12=findViewById(R.id.knopka12);
        bt13=findViewById(R.id.knopka13);
        bt14=findViewById(R.id.knopka14);
        bt15=findViewById(R.id.knopka15);
        bt16=findViewById(R.id.knopka16);
        bt17=findViewById(R.id.knopka17);
        bt18=findViewById(R.id.knopka18);
        bt19=findViewById(R.id.knopka19);
        bt20=findViewById(R.id.knopka20);
        bt21=findViewById(R.id.knopka21);

        mp=MediaPlayer.create(this,R.raw.privetstvie);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int b=view.getId();
                if(b==bt1.getId()){
                    mus(R.raw.privetstvie);
                }
                else if(b==bt2.getId()){
                    mus(R.raw.auenno);
                }
                else if(b==bt3.getId()){
                    mus(R.raw.k400);
                }
                else if(b==bt4.getId()){
                    mus(R.raw.aux_est);
                }
                else if(b==bt5.getId()){
                    mus(R.raw.bluetooth);
                }
                else if(b==bt6.getId()){
                    mus(R.raw.che_popalo);
                }
                else if(b==bt7.getId()){
                    mus(R.raw.dom3);
                }
                else if(b==bt8.getId()){
                    mus(R.raw.est);
                }
                else if(b==bt9.getId()){
                    mus(R.raw.guba);
                }
                else if(b==bt10.getId()){
                    mus(R.raw.heyhey);
                }
                else if(b==bt11.getId()){
                    mus(R.raw.interesno);
                }
                else if(b==bt12.getId()){
                    mus(R.raw.kushat);
                }
                else if(b==bt13.getId()){
                    mus(R.raw.mahachkala);
                }
                else if(b==bt14.getId()){
                    mus(R.raw.nado_bilo);
                }
                else if(b==bt15.getId()){
                    mus(R.raw.ni_rublya);
                }
                else if(b==bt16.getId()){
                    mus(R.raw.ramazan);
                }
                else if(b==bt17.getId()){
                    mus(R.raw.shamhal);
                }
                else if(b==bt18.getId()){
                    mus(R.raw.sherst);
                }
                else if(b==bt19.getId()){
                    mus(R.raw.sueta);
                }
                else if(b==bt20.getId()){
                    mus(R.raw.verdi);
                }
                else if(b==bt21.getId()){
                    mus(R.raw.yaha);
                }
            }
        };
        bt1.setOnClickListener(listener);
        bt2.setOnClickListener(listener);
        bt3.setOnClickListener(listener);
        bt4.setOnClickListener(listener);
        bt5.setOnClickListener(listener);
        bt6.setOnClickListener(listener);
        bt7.setOnClickListener(listener);
        bt8.setOnClickListener(listener);
        bt9.setOnClickListener(listener);
        bt10.setOnClickListener(listener);
        bt11.setOnClickListener(listener);
        bt12.setOnClickListener(listener);
        bt13.setOnClickListener(listener);
        bt14.setOnClickListener(listener);
        bt15.setOnClickListener(listener);
        bt16.setOnClickListener(listener);
        bt17.setOnClickListener(listener);
        bt18.setOnClickListener(listener);
        bt19.setOnClickListener(listener);
        bt20.setOnClickListener(listener);
        bt21.setOnClickListener(listener);
    }
    public void mus(int i){
        if(mp.isPlaying()) {
            mp.stop();
        }
        this.mp=MediaPlayer.create(MainActivity.this,i);
        mp.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                mp.start();
            }
        });
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                bt1.setEnabled(true);bt2.setEnabled(true);bt3.setEnabled(true);bt4.setEnabled(true);bt5.setEnabled(true);bt6.setEnabled(true);bt7.setEnabled(true);bt8.setEnabled(true);bt9.setEnabled(true);bt10.setEnabled(true);bt11.setEnabled(true);bt12.setEnabled(true);bt13.setEnabled(true);bt14.setEnabled(true);bt15.setEnabled(true);bt16.setEnabled(true);bt17.setEnabled(true);bt18.setEnabled(true);bt19.setEnabled(true);bt20.setEnabled(true);bt21.setEnabled(true);
                mp.reset();
            }
        });
    }
    @Override
    protected void onStop() {
        super.onStop();
        mp.stop();
    }
    @Override
    public void onBackPressed() {
        this.finishAffinity();
    }
}
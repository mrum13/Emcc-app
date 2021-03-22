package com.afila.energiusaha.menu.soal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.afila.energiusaha.R;

public class SoalActivity18 extends AppCompatActivity {
    private TextView tvToolbarSoal;
    private String toolbarText;
    private ImageView toolbarback;

    private ModelJawaban modelJawaban;

    private Button btna,btnb,btnc,btnd,btne;

    private String soal1,soal2,soal3,soal4,soal5,soal6,soal7,soal8,soal9,soal10
            ,soal11,soal12,soal13,soal14,soal15,soal16,soal17,soal18,soal19,soal20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal18);

        tvToolbarSoal = findViewById(R.id.tv_toolbar);
        toolbarback = findViewById(R.id.back_toolbar);

        modelJawaban = new ModelJawaban(soal1,soal2,soal3,soal4,soal5,soal6,soal7,soal8,soal9,soal10
                ,soal11,soal12,soal13,soal14,soal15,soal16,soal17,soal18,soal19,soal20);

        btna = findViewById(R.id.btnA);
        btnb = findViewById(R.id.btnB);
        btnc = findViewById(R.id.btnC);
        btnd = findViewById(R.id.btnD);
        btne = findViewById(R.id.btnE);
        tvToolbarSoal.setText("Soal Tes 18");

        toolbarback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SoalActivity18.this.finish();
            }
        });

        btna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SoalActivity18.this, SoalActivity19.class);
                soal18 = "a";
                Preferences.setSoal18(getBaseContext(),soal18);
                startActivity(intent);
            }
        });

        btnb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SoalActivity18.this, SoalActivity19.class);
                soal18 = "b";
                Preferences.setSoal18(getBaseContext(),soal18);
                startActivity(intent);
            }
        });

        btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SoalActivity18.this, SoalActivity19.class);
                soal18 = "c";
                Preferences.setSoal18(getBaseContext(),soal18);
                startActivity(intent);
            }
        });

        btnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SoalActivity18.this, SoalActivity19.class);
                soal18 = "d";
                Preferences.setSoal18(getBaseContext(),soal18);
                startActivity(intent);
            }
        });

        btne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SoalActivity18.this, SoalActivity19.class);
                soal18 = "e";
                Preferences.setSoal18(getBaseContext(),soal18);
                startActivity(intent);
            }
        });
    }
}
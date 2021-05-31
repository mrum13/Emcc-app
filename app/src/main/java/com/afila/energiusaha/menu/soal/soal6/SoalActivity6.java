package com.afila.energiusaha.menu.soal.soal6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.afila.energiusaha.R;
import com.afila.energiusaha.menu.soal.ModelJawaban;
import com.afila.energiusaha.menu.soal.Preferences;
import com.afila.energiusaha.menu.soal.soal7.SoalActivity7;

public class SoalActivity6 extends AppCompatActivity {
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
        setContentView(R.layout.activity_soal6);

        tvToolbarSoal = findViewById(R.id.tv_toolbar);
        toolbarback = findViewById(R.id.back_toolbar);

        modelJawaban = new ModelJawaban(soal1,soal2,soal3,soal4,soal5,soal6,soal7,soal8,soal9,soal10
                ,soal11,soal12,soal13,soal14,soal15,soal16,soal17,soal18,soal19,soal20);

        btna = findViewById(R.id.btnA);
        btnb = findViewById(R.id.btnB);
        btnc = findViewById(R.id.btnC);
        btnd = findViewById(R.id.btnD);
        btne = findViewById(R.id.btnE);
        tvToolbarSoal.setText("Soal Tes 6");

        toolbarback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SoalActivity6.this.finish();
            }
        });

        btna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SoalActivity6.this, SoalActivity7.class);
                soal6 = "a";
                Preferences.setSoal6(getBaseContext(),soal6);
                startActivity(intent);
            }
        });

        btnb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SoalActivity6.this, SoalActivity7.class);
                soal6 = "b";
                Preferences.setSoal6(getBaseContext(),soal6);
                startActivity(intent);
            }
        });

        btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SoalActivity6.this, SoalActivity7.class);
                soal6 = "c";
                Preferences.setSoal6(getBaseContext(),soal6);
                startActivity(intent);
            }
        });

        btnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SoalActivity6.this, SoalActivity7.class);
                soal6 = "d";
                Preferences.setSoal6(getBaseContext(),soal6);
                startActivity(intent);
            }
        });

        btne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SoalActivity6.this, SoalActivity7.class);
                soal6 = "e";
                Preferences.setSoal6(getBaseContext(),soal6);
                startActivity(intent);
            }
        });
    }
}
package com.afila.energiusaha.menu.materi.energi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.afila.energiusaha.R;
import com.afila.energiusaha.menu.materi.usaha.ResultActivityUsaha;
import com.afila.energiusaha.menu.materi.usaha.UsahaLatihanActivity2;
import com.afila.energiusaha.menu.soal.Preferences;

public class EnergiLatihanActivity2 extends AppCompatActivity {
    private TextView tvToolbarSoal;
    private String toolbarText;
    private ImageView toolbarback;
    private Button btna,btnb,btnc,btnd,btne;
    private String soal2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_energi_latihan2);

        tvToolbarSoal = findViewById(R.id.tv_toolbar);
        toolbarback = findViewById(R.id.back_toolbar);

        btna = findViewById(R.id.btnA);
        btnb = findViewById(R.id.btnB);
        btnc = findViewById(R.id.btnC);
        btnd = findViewById(R.id.btnD);
        btne = findViewById(R.id.btnE);

        tvToolbarSoal.setText("Latihan-Energi 2");

        toolbarback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EnergiLatihanActivity2.this.finish();
            }
        });

        btna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EnergiLatihanActivity2.this, ResultActivityEnergi.class);
                soal2 = "a";
                Preferences.setSoal2(getBaseContext(),soal2);
                startActivity(intent);
                EnergiLatihanActivity2.this.finish();
            }
        });

        btnb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EnergiLatihanActivity2.this, ResultActivityEnergi.class);
                soal2 = "b";
                Preferences.setSoal2(getBaseContext(),soal2);
                startActivity(intent);
                EnergiLatihanActivity2.this.finish();
            }
        });

        btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EnergiLatihanActivity2.this, ResultActivityEnergi.class);
                soal2 = "c";
                Preferences.setSoal2(getBaseContext(),soal2);
                startActivity(intent);
                EnergiLatihanActivity2.this.finish();
            }
        });

        btnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EnergiLatihanActivity2.this, ResultActivityEnergi.class);
                soal2 = "d";
                Preferences.setSoal2(getBaseContext(),soal2);
                startActivity(intent);
                EnergiLatihanActivity2.this.finish();
            }
        });

        btne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EnergiLatihanActivity2.this, ResultActivityEnergi.class);
                soal2 = "e";
                Preferences.setSoal2(getBaseContext(),soal2);
                startActivity(intent);
                EnergiLatihanActivity2.this.finish();
            }
        });
    }
}
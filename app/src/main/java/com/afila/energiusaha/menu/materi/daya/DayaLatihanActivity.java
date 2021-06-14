package com.afila.energiusaha.menu.materi.daya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.afila.energiusaha.R;
import com.afila.energiusaha.menu.materi.energi.EnergiLatihanActivity;
import com.afila.energiusaha.menu.materi.energi.EnergiLatihanActivity2;
import com.afila.energiusaha.menu.soal.Preferences;

public class DayaLatihanActivity extends AppCompatActivity {
    private TextView tvToolbarSoal,time;
    private String toolbarText;
    private ImageView toolbarback;
    private Button btna,btnb,btnc,btnd,btne;
    private String soal1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daya_latihan);

        tvToolbarSoal = findViewById(R.id.tv_toolbar);
        toolbarback = findViewById(R.id.back_toolbar);
        time = findViewById(R.id.timecountdown);

        time.setVisibility(View.GONE);

        btna = findViewById(R.id.btnA);
        btnb = findViewById(R.id.btnB);
        btnc = findViewById(R.id.btnC);
        btnd = findViewById(R.id.btnD);
        btne = findViewById(R.id.btnE);

        if(getIntent().hasExtra("toolbarText")) {
            toolbarText = getIntent().getStringExtra("toolbarText");
            tvToolbarSoal.setText(toolbarText);
        }

        toolbarback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DayaLatihanActivity.this.finish();
            }
        });

        btna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DayaLatihanActivity.this, DayaLatihanActivity2.class);
                soal1 = "a";
                Preferences.setSoal1(getBaseContext(),soal1);
                startActivity(intent);
                DayaLatihanActivity.this.finish();
            }
        });

        btnb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DayaLatihanActivity.this, DayaLatihanActivity2.class);
                soal1 = "b";
                Preferences.setSoal1(getBaseContext(),soal1);
                startActivity(intent);
                DayaLatihanActivity.this.finish();
            }
        });

        btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DayaLatihanActivity.this, DayaLatihanActivity2.class);
                soal1 = "c";
                Preferences.setSoal1(getBaseContext(),soal1);
                startActivity(intent);
                DayaLatihanActivity.this.finish();
            }
        });

        btnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DayaLatihanActivity.this, DayaLatihanActivity2.class);
                soal1 = "d";
                Preferences.setSoal1(getBaseContext(),soal1);
                startActivity(intent);
                DayaLatihanActivity.this.finish();
            }
        });

        btne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DayaLatihanActivity.this, DayaLatihanActivity2.class);
                soal1 = "e";
                Preferences.setSoal1(getBaseContext(),soal1);
                startActivity(intent);
                DayaLatihanActivity.this.finish();
            }
        });
    }
}
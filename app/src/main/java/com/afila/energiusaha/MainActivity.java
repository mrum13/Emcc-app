package com.afila.energiusaha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.afila.energiusaha.menu.ApersActivity;
import com.afila.energiusaha.menu.KIActivity;
import com.afila.energiusaha.menu.MateriActivity;
import com.afila.energiusaha.menu.PetaActivity;
import com.afila.energiusaha.menu.ProfilActivity;
import com.afila.energiusaha.menu.TokohActivity;
import com.afila.energiusaha.menu.soal.SoalActivity;

public class MainActivity extends AppCompatActivity {
    private TextView tvToolbar;
    Intent intent;
    ImageView btn1,btn2,btn3,btn4,btn5,btn6,btn7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvToolbar = findViewById(R.id.tv_toolbar);
        tvToolbar.setText("Usaha & Energi");

        btn1 = findViewById(R.id.btn_apersepsi);
        btn2 = findViewById(R.id.btn_ki);
        btn3 = findViewById(R.id.btn_peta);
        btn4 = findViewById(R.id.btn_tokoh);
        btn5 = findViewById(R.id.btn_materi);
        btn6 = findViewById(R.id.btn_soal);
        btn7 = findViewById(R.id.btn_profil);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this, ApersActivity.class);
                intent.putExtra("toolbarText","Apersepsi");
                startActivity(intent);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this, KIActivity.class);
                intent.putExtra("toolbarText","KI, KD, Indikator, Tujuan Pembelajaran");
                startActivity(intent);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this, PetaActivity.class);
                intent.putExtra("toolbarText","Peta Konsep");
                startActivity(intent);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this, TokohActivity.class);
                intent.putExtra("toolbarText","Tokoh Fisika");
                startActivity(intent);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this, MateriActivity.class);
                intent.putExtra("toolbarText","Materi");
                startActivity(intent);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this, SoalActivity.class);
                intent.putExtra("toolbarText","Soal Tes 1");
                startActivity(intent);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this, ProfilActivity.class);
                intent.putExtra("toolbarText","Tentang Saya");
                startActivity(intent);
            }
        });
    }
}
package com.afila.energiusaha.menu.materi.energi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.afila.energiusaha.R;
import com.afila.energiusaha.menu.materi.WadahVideoActivity;
import com.afila.energiusaha.menu.materi.usaha.MateriUsahaActivity;
import com.afila.energiusaha.menu.materi.usaha.UsahaLatihanActivity;

public class MateriEnergiActivity extends AppCompatActivity {
    private TextView tvToolbar;
    private String toolbarText;
    private ImageView toolbarback;

    private ImageView btnVideo,btnLatihan;

    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi_energi);

        tvToolbar = findViewById(R.id.tv_toolbar);
        toolbarback = findViewById(R.id.back_toolbar);

        btnLatihan = findViewById(R.id.btn_latihan);
        btnVideo = findViewById(R.id.btn_video);

        if(getIntent().hasExtra("toolbarText")) {
            toolbarText = getIntent().getStringExtra("toolbarText");
            tvToolbar.setText(toolbarText);
        }
        btnVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MateriEnergiActivity.this, WadahVideoActivity.class);
                intent.putExtra("idvideo","xkNtaNP5gh8");
                startActivity(intent);
            }
        });

        btnLatihan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MateriEnergiActivity.this, EnergiLatihanActivity.class);
                intent.putExtra("toolbarText","Latihan-Energi 1");
                startActivity(intent);
            }
        });

        toolbarback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MateriEnergiActivity.this.finish();
            }
        });
    }
}
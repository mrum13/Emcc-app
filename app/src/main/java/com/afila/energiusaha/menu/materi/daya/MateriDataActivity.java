package com.afila.energiusaha.menu.materi.daya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.afila.energiusaha.R;
import com.afila.energiusaha.menu.materi.WadahVideoActivity;
import com.afila.energiusaha.menu.materi.energi.EnergiLatihanActivity;
import com.afila.energiusaha.menu.materi.energi.MateriEnergiActivity;
import com.afila.energiusaha.menu.materi.hukum.HukumKekelanEnergiMekanikActivity;

public class MateriDataActivity extends AppCompatActivity {
    private TextView tvToolbar;
    private String toolbarText;
    private ImageView toolbarback;

    private ImageView btnVideo,btnLatihan;

    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi_data);

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
                intent = new Intent(MateriDataActivity.this, WadahVideoActivity.class);
                intent.putExtra("idvideo","SgceGfEQUes");
                startActivity(intent);
            }
        });

        btnLatihan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MateriDataActivity.this, DayaLatihanActivity.class);
                intent.putExtra("toolbarText","Latihan-Daya 1");
                startActivity(intent);
            }
        });

        toolbarback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MateriDataActivity.this.finish();
            }
        });
    }
}
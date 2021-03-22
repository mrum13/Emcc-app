package com.afila.energiusaha.menu.materi.hukum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.afila.energiusaha.R;
import com.afila.energiusaha.menu.materi.WadahVideoActivity;
import com.afila.energiusaha.menu.materi.hubungansahaenergi.HubunganUsahaEnergiActivity;
import com.afila.energiusaha.menu.materi.usaha.MateriUsahaActivity;

public class HukumKekelanEnergiMekanikActivity extends AppCompatActivity {
    private TextView tvToolbar;
    private String toolbarText;
    private ImageView toolbarback;

    private TextView delta;

    private ImageView btnVideo,btnLatihan;

    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hukum_kekelan_energi_mekanik);

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
                intent = new Intent(HukumKekelanEnergiMekanikActivity.this, WadahVideoActivity.class);
                intent.putExtra("idvideo","-VAc_RjMoyA");
                startActivity(intent);
            }
        });

        btnLatihan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(HukumKekelanEnergiMekanikActivity.this, HukunLatihanActivity.class);
                intent.putExtra("toolbarText","Latihan-Hukum 1");
                startActivity(intent);
            }
        });

        toolbarback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HukumKekelanEnergiMekanikActivity.this.finish();
            }
        });
    }
}
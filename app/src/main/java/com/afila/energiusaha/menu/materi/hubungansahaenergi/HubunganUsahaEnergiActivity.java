package com.afila.energiusaha.menu.materi.hubungansahaenergi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.afila.energiusaha.R;
import com.afila.energiusaha.menu.materi.WadahVideoActivity;
import com.afila.energiusaha.menu.materi.energi.MateriEnergiActivity;
import com.afila.energiusaha.menu.materi.usaha.MateriUsahaActivity;

public class HubunganUsahaEnergiActivity extends AppCompatActivity {
    private TextView tvToolbar;
    private String toolbarText;
    private ImageView toolbarback;

    private TextView delta;

    private ImageView btnVideo,btnLatihan;

    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hubungan_usaha_energi);

        btnLatihan = findViewById(R.id.btn_latihan);
        btnVideo = findViewById(R.id.btn_video);

        tvToolbar = findViewById(R.id.tv_toolbar);
        toolbarback = findViewById(R.id.back_toolbar);
        delta = findViewById(R.id.delta_hubungan);

        btnVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(HubunganUsahaEnergiActivity.this, WadahVideoActivity.class);
                intent.putExtra("idvideo","Qq_VDES23NQ");
                startActivity(intent);
            }
        });

        btnLatihan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(HubunganUsahaEnergiActivity.this, HubunganLatihanActivity.class);
                intent.putExtra("toolbarText","Latihan-Hubungan 1");
                startActivity(intent);
            }
        });

        delta.setText(Html.fromHtml("&#8710;EK" ));

        if(getIntent().hasExtra("toolbarText")) {
            toolbarText = getIntent().getStringExtra("toolbarText");
            tvToolbar.setText(toolbarText);
        }

        toolbarback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HubunganUsahaEnergiActivity.this.finish();
            }
        });
    }
}
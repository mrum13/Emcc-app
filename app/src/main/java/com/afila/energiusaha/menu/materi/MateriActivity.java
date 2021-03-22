package com.afila.energiusaha.menu.materi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.afila.energiusaha.R;
import com.afila.energiusaha.menu.materi.daya.MateriDataActivity;
import com.afila.energiusaha.menu.materi.energi.MateriEnergiActivity;
import com.afila.energiusaha.menu.materi.hubungansahaenergi.HubunganUsahaEnergiActivity;
import com.afila.energiusaha.menu.materi.hukum.HukumKekelanEnergiMekanikActivity;
import com.afila.energiusaha.menu.materi.usaha.MateriUsahaActivity;

public class MateriActivity extends AppCompatActivity {
    private TextView tvToolbar;
    private String toolbarText;
    private ImageView toolbarback;

    Intent intent;
    ImageView btn1,btn2,btn3,btn4,btn5,btn6,btn7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi);

        tvToolbar = findViewById(R.id.tv_toolbar);
        toolbarback = findViewById(R.id.back_toolbar);

        btn1 = findViewById(R.id.btn_usaha);
        btn2 = findViewById(R.id.btn_energi);
        btn3 = findViewById(R.id.btn_hubungan);
        btn4 = findViewById(R.id.btn_hukum);
        btn5 = findViewById(R.id.btn_daya);

        if(getIntent().hasExtra("toolbarText")) {
            toolbarText = getIntent().getStringExtra("toolbarText");
            tvToolbar.setText(toolbarText);
        }

        toolbarback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MateriActivity.this.finish();
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MateriActivity.this, MateriUsahaActivity.class);
                intent.putExtra("toolbarText","Usaha");
                startActivity(intent);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MateriActivity.this, MateriEnergiActivity.class);
                intent.putExtra("toolbarText","Energi");
                startActivity(intent);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MateriActivity.this, HubunganUsahaEnergiActivity.class);
                intent.putExtra("toolbarText","Hubungan Usaha dan Energi");
                startActivity(intent);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MateriActivity.this, HukumKekelanEnergiMekanikActivity.class);
                intent.putExtra("toolbarText","Hukum Kekekalan Energi");
                startActivity(intent);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MateriActivity.this, MateriDataActivity.class);
                intent.putExtra("toolbarText","Daya");
                startActivity(intent);
            }
        });
    }
}
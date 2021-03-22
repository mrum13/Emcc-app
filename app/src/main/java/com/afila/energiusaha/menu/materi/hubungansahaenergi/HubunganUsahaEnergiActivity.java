package com.afila.energiusaha.menu.materi.hubungansahaenergi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.afila.energiusaha.R;
import com.afila.energiusaha.menu.materi.usaha.MateriUsahaActivity;

public class HubunganUsahaEnergiActivity extends AppCompatActivity {
    private TextView tvToolbar;
    private String toolbarText;
    private ImageView toolbarback;

    private TextView delta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hubungan_usaha_energi);

        tvToolbar = findViewById(R.id.tv_toolbar);
        toolbarback = findViewById(R.id.back_toolbar);
        delta = findViewById(R.id.delta_hubungan);

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
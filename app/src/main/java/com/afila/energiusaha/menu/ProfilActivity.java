package com.afila.energiusaha.menu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.afila.energiusaha.R;

import org.w3c.dom.Text;

public class ProfilActivity extends AppCompatActivity {
    private TextView tvToolbar,time;
    private String toolbarText;
    private ImageView toolbarback;
    private CardView wa;
    private String number = "+6282296280250";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

        tvToolbar = findViewById(R.id.tv_toolbar);
        toolbarback = findViewById(R.id.back_toolbar);
        wa = findViewById(R.id.card_wa);
        time = findViewById(R.id.timecountdown);

        time.setVisibility(View.GONE);

        wa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://api.whatsapp.com/send?phone="+number;
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        if(getIntent().hasExtra("toolbarText")) {
            toolbarText = getIntent().getStringExtra("toolbarText");
            tvToolbar.setText(toolbarText);
        }

        toolbarback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ProfilActivity.this.finish();
            }
        });
    }
}
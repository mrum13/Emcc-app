package com.afila.energiusaha.menu.materi.hubungansahaenergi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.afila.energiusaha.R;
import com.afila.energiusaha.menu.materi.MateriActivity;
import com.afila.energiusaha.menu.materi.energi.MateriEnergiActivity;
import com.afila.energiusaha.menu.materi.energi.ResultActivityEnergi;
import com.afila.energiusaha.menu.soal.Preferences;

public class ResultActivityHubungan extends AppCompatActivity {
    private TextView tvToolbar,time;
    private String toolbarText;
    private ImageView toolbarback;

    TextView jwb1,jwb2;
    TextView hrs1,hrs2;
    TextView benar1,benar2;
    ImageView imgbenar1,imgbenar2;
    ImageView imgsalah1,imgsalah2;
    String s1,s2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_hubungan);

        tvToolbar = findViewById(R.id.tv_toolbar);
        toolbarback = findViewById(R.id.back_toolbar);
        time = findViewById(R.id.timecountdown);

        time.setVisibility(View.GONE);

        tvToolbar.setText("Hasil");
        toolbarback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ResultActivityHubungan.this.finish();
            }
        });

        jwb1 = findViewById(R.id.jawaban1);
        jwb2 = findViewById(R.id.jawaban2);

        hrs1 = findViewById(R.id.txtharusnya1);
        hrs2 = findViewById(R.id.txtharusnya2);

        benar1 = findViewById(R.id.benar1);
        benar1.setText("d");
        benar2 = findViewById(R.id.benar2);
        benar2.setText("a");

        imgbenar1 = findViewById(R.id.ic_benar1);
        imgbenar2 = findViewById(R.id.ic_benar2);

        imgsalah1 = findViewById(R.id.ic_salah1);
        imgsalah2 = findViewById(R.id.ic_salah2);

        s1 = Preferences.getSoal1(getBaseContext());
        s2 = Preferences.getSoal2(getBaseContext());

        jwb1.setText(s1);
        if (s1.equals("d")){
            imgsalah1.setVisibility(View.GONE);
            hrs1.setVisibility(View.GONE);
            benar1.setVisibility(View.GONE);
//            nilai = nilai+5;
        }
        else {
            imgbenar1.setVisibility(View.GONE);
        }

        jwb2.setText(Preferences.getSoal2(getBaseContext()));
        if (s2.equals("a")){
            imgsalah2.setVisibility(View.GONE);
            hrs2.setVisibility(View.GONE);
            benar2.setVisibility(View.GONE);
//            nilai = nilai+5;
        }
        else {
            imgbenar2.setVisibility(View.GONE);
        }
    }
}
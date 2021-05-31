package com.afila.energiusaha.menu.soal.soal8;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.afila.energiusaha.R;
import com.afila.energiusaha.menu.soal.ModelJawaban;
import com.afila.energiusaha.menu.soal.Preferences;
import com.afila.energiusaha.menu.soal.soal7.Soal7Fragment;
import com.afila.energiusaha.menu.soal.soal9.Soal9Fragment;
import com.afila.energiusaha.menu.soal.soal9.SoalActivity9;

public class Soal8Fragment extends Fragment {
    private TextView tvToolbarSoal;
    private String toolbarText;
    private ImageView toolbarback;

    private ModelJawaban modelJawaban;

    private Fragment fragment7,fragment9;

    private Button btna,btnb,btnc,btnd,btne;

    private String soal1,soal2,soal3,soal4,soal5,soal6,soal7,soal8,soal9,soal10
            ,soal11,soal12,soal13,soal14,soal15,soal16,soal17,soal18,soal19,soal20;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_soal8, container, false);

        tvToolbarSoal = root.findViewById(R.id.tv_toolbar);
        toolbarback = root.findViewById(R.id.back_toolbar);

        modelJawaban = new ModelJawaban(soal1,soal2,soal3,soal4,soal5,soal6,soal7,soal8,soal9,soal10
                ,soal11,soal12,soal13,soal14,soal15,soal16,soal17,soal18,soal19,soal20);

        btna = root.findViewById(R.id.btnA);
        btnb = root.findViewById(R.id.btnB);
        btnc = root.findViewById(R.id.btnC);
        btnd = root.findViewById(R.id.btnD);
        btne = root.findViewById(R.id.btnE);
        tvToolbarSoal.setText("Soal Tes 8");

        fragment7 = new Soal7Fragment();
        fragment9 = new Soal9Fragment();

        toolbarback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                SoalActivity8.this.finish();
                keSoalSebelumnya();
            }
        });

        btna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(SoalActivity8.this, SoalActivity9.class);
                soal8 = "a";
                Preferences.setSoal8(getActivity().getBaseContext(),soal8);
                keSoalSelanjutnya();
//                startActivity(intent);
            }
        });

        btnb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(SoalActivity8.this, SoalActivity9.class);
                soal8 = "b";
                Preferences.setSoal8(getActivity().getBaseContext(),soal8);
                keSoalSelanjutnya();
//                startActivity(intent);
            }
        });

        btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(SoalActivity8.this, SoalActivity9.class);
                soal8 = "c";
                Preferences.setSoal8(getActivity().getBaseContext(),soal8);
                keSoalSelanjutnya();
//                startActivity(intent);
            }
        });

        btnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(SoalActivity8.this, SoalActivity9.class);
                soal8 = "d";
                Preferences.setSoal8(getActivity().getBaseContext(),soal8);
                keSoalSelanjutnya();
//                startActivity(intent);
            }
        });

        btne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(SoalActivity8.this, SoalActivity9.class);
                soal8 = "e";
                Preferences.setSoal8(getActivity().getBaseContext(),soal8);
                keSoalSelanjutnya();
//                startActivity(intent);
            }
        });

        return root;
    }

    private void keSoalSebelumnya(){
        getParentFragmentManager().beginTransaction().replace(R.id.container, fragment7).commit();
    }

    private void keSoalSelanjutnya(){
        getParentFragmentManager().beginTransaction().replace(R.id.container, fragment9).commit();
    }
}
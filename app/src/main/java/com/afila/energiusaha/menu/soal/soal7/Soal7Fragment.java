package com.afila.energiusaha.menu.soal.soal7;

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
import com.afila.energiusaha.menu.soal.soal6.Soal6Fragment;
import com.afila.energiusaha.menu.soal.soal8.Soal8Fragment;
import com.afila.energiusaha.menu.soal.soal8.SoalActivity8;


public class Soal7Fragment extends Fragment {
    private TextView tvToolbarSoal;
    private String toolbarText;
    private ImageView toolbarback;

    private ModelJawaban modelJawaban;

    private Fragment fragment6,fragment8;

    private Button btna,btnb,btnc,btnd,btne;

    private String soal1,soal2,soal3,soal4,soal5,soal6,soal7,soal8,soal9,soal10
            ,soal11,soal12,soal13,soal14,soal15,soal16,soal17,soal18,soal19,soal20;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_soal7, container, false);

        tvToolbarSoal = root.findViewById(R.id.tv_toolbar);
        toolbarback = root.findViewById(R.id.back_toolbar);

        modelJawaban = new ModelJawaban(soal1,soal2,soal3,soal4,soal5,soal6,soal7,soal8,soal9,soal10
                ,soal11,soal12,soal13,soal14,soal15,soal16,soal17,soal18,soal19,soal20);

        btna = root.findViewById(R.id.btnA);
        btnb = root.findViewById(R.id.btnB);
        btnc = root.findViewById(R.id.btnC);
        btnd = root.findViewById(R.id.btnD);
        btne = root.findViewById(R.id.btnE);
        tvToolbarSoal.setText("Soal Tes 7");

        fragment6 = new Soal6Fragment();
        fragment8 = new Soal8Fragment();

        toolbarback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                keSoalSebelumnya();
            }
        });

        btna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(SoalActivity7.this, SoalActivity8.class);
                soal7 = "a";
                Preferences.setSoal7(getActivity().getBaseContext(),soal7);
                keSoalSelanjutnya();
//                startActivity(intent);
            }
        });

        btnb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(SoalActivity7.this, SoalActivity8.class);
                soal7 = "b";
                Preferences.setSoal7(getActivity().getBaseContext(),soal7);
                keSoalSelanjutnya();
//                startActivity(intent);
            }
        });

        btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(SoalActivity7.this, SoalActivity8.class);
                soal7 = "c";
                Preferences.setSoal7(getActivity().getBaseContext(),soal7);
                keSoalSelanjutnya();
//                startActivity(intent);
            }
        });

        btnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(SoalActivity7.this, SoalActivity8.class);
                soal7 = "d";
                Preferences.setSoal7(getActivity().getBaseContext(),soal7);
                keSoalSelanjutnya();
//                startActivity(intent);
            }
        });

        btne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(SoalActivity7.this, SoalActivity8.class);
                soal7 = "e";
                Preferences.setSoal7(getActivity().getBaseContext(),soal7);
                keSoalSelanjutnya();
//                startActivity(intent);
            }
        });

        return root;
    }

    private void keSoalSebelumnya(){
        getParentFragmentManager().beginTransaction().replace(R.id.container, fragment6).commit();
    }

    private void keSoalSelanjutnya(){
        getParentFragmentManager().beginTransaction().replace(R.id.container, fragment8).commit();
    }
}
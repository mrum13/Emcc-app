package com.afila.energiusaha.menu.soal.soal6;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.afila.energiusaha.R;
import com.afila.energiusaha.menu.soal.ModelJawaban;
import com.afila.energiusaha.menu.soal.Preferences;
import com.afila.energiusaha.menu.soal.result.ResultFragment;
import com.afila.energiusaha.menu.soal.soal5.Soal5Fragment;
import com.afila.energiusaha.menu.soal.soal7.Soal7Fragment;
import com.afila.energiusaha.menu.soal.soal7.SoalActivity7;

public class Soal6Fragment extends Fragment {
    private TextView tvToolbarSoal,tvCountdown;
    private String toolbarText;
    private ImageView toolbarback;

    private ModelJawaban modelJawaban;
    private CountDownTimer timer;

    private Button btna,btnb,btnc,btnd,btne;

    private Fragment fragment5,fragment7,fragmentHasil;

    private String soal1,soal2,soal3,soal4,soal5,soal6,soal7,soal8,soal9,soal10
            ,soal11,soal12,soal13,soal14,soal15,soal16,soal17,soal18,soal19,soal20;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_soal6, container, false);

        tvToolbarSoal = root.findViewById(R.id.tv_toolbar);
        toolbarback = root.findViewById(R.id.back_toolbar);

        modelJawaban = new ModelJawaban(soal1,soal2,soal3,soal4,soal5,soal6,soal7,soal8,soal9,soal10
                ,soal11,soal12,soal13,soal14,soal15,soal16,soal17,soal18,soal19,soal20);

        btna = root.findViewById(R.id.btnA);
        btnb = root.findViewById(R.id.btnB);
        btnc = root.findViewById(R.id.btnC);
        btnd = root.findViewById(R.id.btnD);
        btne = root.findViewById(R.id.btnE);
        tvToolbarSoal.setText("Soal Tes 6");

        fragment5 = new Soal5Fragment();
        fragment7 = new Soal7Fragment();

        fragmentHasil = new ResultFragment();

        tvCountdown = root.findViewById(R.id.timecountdown);

        timer = new CountDownTimer(45000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                tvCountdown.setText("Sisa Waktu: " +millisUntilFinished / 1000 +" detik");
            }

            @Override
            public void onFinish() {
                soal6 = "x";
                Preferences.setSoal6(getActivity().getBaseContext(), soal6);
                soal7 = "x";
                Preferences.setSoal7(getActivity().getBaseContext(), soal7);
                soal8 = "x";
                Preferences.setSoal8(getActivity().getBaseContext(), soal8);
                soal9 = "x";
                Preferences.setSoal9(getActivity().getBaseContext(), soal9);
                soal10 = "x";
                Preferences.setSoal10(getActivity().getBaseContext(), soal10);
                keHasil();
            }
        }.start();

        toolbarback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                keSoalSebelumnya();
            }
        });

        btna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(SoalActivity6.this, SoalActivity7.class);
                soal6 = "a";
                Preferences.setSoal6(getActivity().getBaseContext(),soal6);
                keSoalSelanjutnya();
//                startActivity(intent);
            }
        });

        btnb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(SoalActivity6.this, SoalActivity7.class);
                soal6 = "b";
                Preferences.setSoal6(getActivity().getBaseContext(),soal6);
                keSoalSelanjutnya();
//                startActivity(intent);
            }
        });

        btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(SoalActivity6.this, SoalActivity7.class);
                soal6 = "c";
                Preferences.setSoal6(getActivity().getBaseContext(),soal6);
                keSoalSelanjutnya();
//                startActivity(intent);
            }
        });

        btnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(SoalActivity6.this, SoalActivity7.class);
                soal6 = "d";
                Preferences.setSoal6(getActivity().getBaseContext(),soal6);
                keSoalSelanjutnya();
//                startActivity(intent);
            }
        });

        btne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(SoalActivity6.this, SoalActivity7.class);
                soal6 = "e";
                Preferences.setSoal6(getActivity().getBaseContext(),soal6);
                keSoalSelanjutnya();
//                startActivity(intent);
            }
        });

        return root;
    }

    private void keSoalSebelumnya(){
        timer.cancel();
        getParentFragmentManager().beginTransaction().replace(R.id.container, fragment5).commit();
    }

    private void keSoalSelanjutnya(){
        timer.cancel();
        getParentFragmentManager().beginTransaction().replace(R.id.container, fragment7).commit();
    }

    private void keHasil(){
        getParentFragmentManager().beginTransaction().replace(R.id.container, fragmentHasil).commit();
    }
}
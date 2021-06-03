package com.afila.energiusaha.menu.soal.soal9;

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
import com.afila.energiusaha.menu.soal.soal10.Soal10Fragment;
import com.afila.energiusaha.menu.soal.soal10.SoalActivity10;
import com.afila.energiusaha.menu.soal.soal8.Soal8Fragment;

public class Soal9Fragment extends Fragment {
    private TextView tvToolbarSoal,tvCountdown;
    private String toolbarText;
    private ImageView toolbarback;

    private ModelJawaban modelJawaban;
    private CountDownTimer timer;

    private Fragment fragment8,fragment10,fragmentHasil;

    private Button btna,btnb,btnc,btnd,btne;

    private String soal1,soal2,soal3,soal4,soal5,soal6,soal7,soal8,soal9,soal10
            ,soal11,soal12,soal13,soal14,soal15,soal16,soal17,soal18,soal19,soal20;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_soal9, container, false);

        tvToolbarSoal = root.findViewById(R.id.tv_toolbar);
        toolbarback = root.findViewById(R.id.back_toolbar);

        modelJawaban = new ModelJawaban(soal1,soal2,soal3,soal4,soal5,soal6,soal7,soal8,soal9,soal10
                ,soal11,soal12,soal13,soal14,soal15,soal16,soal17,soal18,soal19,soal20);

        btna = root.findViewById(R.id.btnA);
        btnb = root.findViewById(R.id.btnB);
        btnc = root.findViewById(R.id.btnC);
        btnd = root.findViewById(R.id.btnD);
        btne = root.findViewById(R.id.btnE);
        tvToolbarSoal.setText("Soal Tes 9");

        fragment8 = new Soal8Fragment();
        fragment10 = new Soal10Fragment();

        fragmentHasil = new ResultFragment();

        tvCountdown = root.findViewById(R.id.timecountdown);

        timer = new CountDownTimer(60000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                tvCountdown.setText("Sisa Waktu: " +millisUntilFinished / 1000 +" detik");
            }

            @Override
            public void onFinish() {
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
//                SoalActivity9.this.finish();
                keSoalSebelumnya();
            }
        });

        btna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(SoalActivity9.this, SoalActivity10.class);
                soal9 = "a";
                Preferences.setSoal9(getActivity().getBaseContext(),soal9);
                keSoalSelanjutnya();
//                startActivity(intent);
            }
        });

        btnb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(SoalActivity9.this, SoalActivity10.class);
                soal9 = "b";
                Preferences.setSoal9(getActivity().getBaseContext(),soal9);
                keSoalSelanjutnya();
//                startActivity(intent);
            }
        });

        btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(SoalActivity9.this, SoalActivity10.class);
                soal9 = "c";
                Preferences.setSoal9(getActivity().getBaseContext(),soal9);
                keSoalSelanjutnya();
//                startActivity(intent);
            }
        });

        btnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(SoalActivity9.this, SoalActivity10.class);
                soal9 = "d";
                Preferences.setSoal9(getActivity().getBaseContext(),soal9);
                keSoalSelanjutnya();
//                startActivity(intent);
            }
        });

        btne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(SoalActivity9.this, SoalActivity10.class);
                soal9 = "e";
                Preferences.setSoal9(getActivity().getBaseContext(),soal9);
                keSoalSelanjutnya();
//                startActivity(intent);
            }
        });

        return root;
    }

    private void keSoalSebelumnya(){
        timer.cancel();
        getParentFragmentManager().beginTransaction().replace(R.id.container, fragment8).commit();
    }

    private void keSoalSelanjutnya(){
        timer.cancel();
        getParentFragmentManager().beginTransaction().replace(R.id.container, fragment10).commit();
    }

    private void keHasil(){
        getParentFragmentManager().beginTransaction().replace(R.id.container, fragmentHasil).commit();
    }
}
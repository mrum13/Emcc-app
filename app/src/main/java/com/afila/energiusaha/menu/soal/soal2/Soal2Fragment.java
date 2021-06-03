package com.afila.energiusaha.menu.soal.soal2;

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
import com.afila.energiusaha.menu.soal.soal1.SoalFragment;
import com.afila.energiusaha.menu.soal.soal3.Soal3Fragment;

public class Soal2Fragment extends Fragment {
    private TextView tvToolbarSoal,tvCountdown;
    private String toolbarText;
    private ImageView toolbarback;

    private ModelJawaban modelJawaban;

    private CountDownTimer timer;

    private Button btna,btnb,btnc,btnd,btne;

    private Intent sendData;

    private Fragment fragment1,fragment3,fragmentHasil;

    private String soal1,soal2,soal3,soal4,soal5,soal6,soal7,soal8,soal9,soal10
            ,soal11,soal12,soal13,soal14,soal15,soal16,soal17,soal18,soal19,soal20;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_soal2, container, false);

//        sendData = new Intent(SoalActivity2.this, ResultActivity.class);


        tvToolbarSoal = root.findViewById(R.id.tv_toolbar);
        toolbarback = root.findViewById(R.id.back_toolbar);

        btna = root.findViewById(R.id.btnA);
        btnb = root.findViewById(R.id.btnB);
        btnc = root.findViewById(R.id.btnC);
        btnd = root.findViewById(R.id.btnD);
        btne = root.findViewById(R.id.btnE);
        tvToolbarSoal.setText("Soal Tes 2");

        fragment1 = new SoalFragment();
        fragment3 = new Soal3Fragment();
        fragmentHasil = new ResultFragment();

        tvCountdown = root.findViewById(R.id.timecountdown);

        timer = new CountDownTimer(30000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                tvCountdown.setText("Sisa Waktu: " +millisUntilFinished / 1000 +" detik");
            }

            @Override
            public void onFinish() {
                soal2 = "x";
                Preferences.setSoal2(getActivity().getBaseContext(), soal2);
                soal3 = "x";
                Preferences.setSoal3(getActivity().getBaseContext(), soal3);
                soal4 = "x";
                Preferences.setSoal4(getActivity().getBaseContext(), soal4);
                soal5 = "x";
                Preferences.setSoal5(getActivity().getBaseContext(), soal5);
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
//                SoalActivity2.this.finish();
                keSoalSebelumnya();

            }
        });

        btna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(SoalActivity2.this, SoalActivity3.class);
                soal2 = "a";
                Preferences.setSoal2(getActivity().getBaseContext(),soal2);
                keSoalSelanjutnya();
//                startActivity(intent);
            }
        });

        btnb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(SoalActivity2.this, SoalActivity3.class);
                soal2 = "b";
                Preferences.setSoal2(getActivity().getBaseContext(),soal2);
                keSoalSelanjutnya();
//                startActivity(intent);
            }
        });

        btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(SoalActivity2.this, SoalActivity3.class);
                soal2 = "c";
                Preferences.setSoal2(getActivity().getBaseContext(),soal2);
                keSoalSelanjutnya();
//                startActivity(intent);
            }
        });

        btnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(SoalActivity2.this, SoalActivity3.class);
                soal2 = "d";
                Preferences.setSoal2(getActivity().getBaseContext(),soal2);
                keSoalSelanjutnya();
//                startActivity(intent);
            }
        });

        btne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(SoalActivity2.this, SoalActivity3.class);
                soal2 = "e";
                Preferences.setSoal2(getActivity().getBaseContext(),soal2);
                keSoalSelanjutnya();
//                startActivity(intent);
            }
        });

        return root;
    }

    private void keSoalSebelumnya(){
        timer.cancel();
        getParentFragmentManager().beginTransaction().replace(R.id.container, fragment1).commit();
    }

    private void keSoalSelanjutnya(){
        timer.cancel();
        getParentFragmentManager().beginTransaction().replace(R.id.container, fragment3).commit();
    }

    private void keHasil(){
        getParentFragmentManager().beginTransaction().replace(R.id.container, fragmentHasil).commit();
    }
}
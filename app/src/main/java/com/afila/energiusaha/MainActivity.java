package com.afila.energiusaha;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.afila.energiusaha.menu.ki.KIActivity;
import com.afila.energiusaha.menu.appersepsi.ApersFragment;
import com.afila.energiusaha.menu.ki.KiFragment;
import com.afila.energiusaha.menu.materi.MateriActivity;
import com.afila.energiusaha.menu.peta.PetaActivity;
import com.afila.energiusaha.menu.ProfilActivity;
import com.afila.energiusaha.menu.soal.soal1.SoalFragment;
import com.afila.energiusaha.menu.tokoh.TokohActivity;
import com.afila.energiusaha.menu.peta.PetaFragment;
import com.afila.energiusaha.menu.soal.soal1.SoalActivity;
import com.afila.energiusaha.menu.tokoh.TokohFragment;

public class MainActivity extends AppCompatActivity {
    private TextView tvToolbar;
    Intent intent;
    View btn1,btn2,btn3,btn4,btn5,btn6,btn7;
    private LinearLayout l1,l2,l3,l4,l5,l6;
    private Fragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvToolbar = findViewById(R.id.tv_toolbar);
        tvToolbar.setText("Usaha & Energi");

        btn1 = findViewById(R.id.view1);
        btn2 = findViewById(R.id.view2);
        btn3 = findViewById(R.id.view3);
        btn4 = findViewById(R.id.view4);
        btn5 = findViewById(R.id.view5);
        btn6 = findViewById(R.id.view6);
        btn7 = findViewById(R.id.btn_profil);

        l1 = findViewById(R.id.linear1);
        l2 = findViewById(R.id.linear2);
        l3 = findViewById(R.id.linear3);
        l4 = findViewById(R.id.linear4);
        l5 = findViewById(R.id.linear5);
        l6 = findViewById(R.id.linear6);

        openFragment(new ApersFragment());
        l1.setBackgroundColor(getResources().getColor(R.color.teal_200));
        l2.setBackgroundColor(getResources().getColor(R.color.white));
        l3.setBackgroundColor(getResources().getColor(R.color.white));
        l4.setBackgroundColor(getResources().getColor(R.color.white));
        l5.setBackgroundColor(getResources().getColor(R.color.white));
        l6.setBackgroundColor(getResources().getColor(R.color.white));

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                intent = new Intent(MainActivity.this, ApersActivity.class);
//                intent.putExtra("toolbarText","Apersepsi");
                l1.setBackgroundColor(getResources().getColor(R.color.teal_200));
                l2.setBackgroundColor(getResources().getColor(R.color.white));
                l3.setBackgroundColor(getResources().getColor(R.color.white));
                l4.setBackgroundColor(getResources().getColor(R.color.white));
                l5.setBackgroundColor(getResources().getColor(R.color.white));
                l6.setBackgroundColor(getResources().getColor(R.color.white));
//                startActivity(intent);
                fragment = new ApersFragment();
                openFragment(fragment);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this, KIActivity.class);
                intent.putExtra("toolbarText","KI, KD, Indikator, Tujuan Pembelajaran");
                l1.setBackgroundColor(getResources().getColor(R.color.white));
                l2.setBackgroundColor(getResources().getColor(R.color.teal_200));
                l3.setBackgroundColor(getResources().getColor(R.color.white));
                l4.setBackgroundColor(getResources().getColor(R.color.white));
                l5.setBackgroundColor(getResources().getColor(R.color.white));
                l6.setBackgroundColor(getResources().getColor(R.color.white));
//                startActivity(intent);
                fragment = new KiFragment();
                openFragment(fragment);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this, PetaActivity.class);
                intent.putExtra("toolbarText","Peta Konsep");
                l1.setBackgroundColor(getResources().getColor(R.color.white));
                l2.setBackgroundColor(getResources().getColor(R.color.white));
                l3.setBackgroundColor(getResources().getColor(R.color.teal_200));
                l4.setBackgroundColor(getResources().getColor(R.color.white));
                l5.setBackgroundColor(getResources().getColor(R.color.white));
                l6.setBackgroundColor(getResources().getColor(R.color.white));
//                startActivity(intent);
                fragment = new PetaFragment();
                openFragment(fragment);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this, TokohActivity.class);
                intent.putExtra("toolbarText","Tokoh Fisika");
                l1.setBackgroundColor(getResources().getColor(R.color.white));
                l2.setBackgroundColor(getResources().getColor(R.color.white));
                l3.setBackgroundColor(getResources().getColor(R.color.white));
                l4.setBackgroundColor(getResources().getColor(R.color.teal_200));
                l5.setBackgroundColor(getResources().getColor(R.color.white));
                l6.setBackgroundColor(getResources().getColor(R.color.white));
//                startActivity(intent);
                fragment = new TokohFragment();
                openFragment(fragment);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this, MateriActivity.class);
                intent.putExtra("toolbarText","Materi");
                l1.setBackgroundColor(getResources().getColor(R.color.white));
                l2.setBackgroundColor(getResources().getColor(R.color.white));
                l3.setBackgroundColor(getResources().getColor(R.color.white));
                l4.setBackgroundColor(getResources().getColor(R.color.white));
                l5.setBackgroundColor(getResources().getColor(R.color.teal_200));
                l6.setBackgroundColor(getResources().getColor(R.color.white));
                startActivity(intent);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this, SoalActivity.class);
                intent.putExtra("toolbarText","Soal Tes 1");
                l1.setBackgroundColor(getResources().getColor(R.color.white));
                l2.setBackgroundColor(getResources().getColor(R.color.white));
                l3.setBackgroundColor(getResources().getColor(R.color.white));
                l4.setBackgroundColor(getResources().getColor(R.color.white));
                l5.setBackgroundColor(getResources().getColor(R.color.white));
                l6.setBackgroundColor(getResources().getColor(R.color.teal_200));
//                startActivity(intent);
                fragment = new SoalFragment();
                openFragment(fragment);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this, ProfilActivity.class);
                intent.putExtra("toolbarText","Tentang Saya");
                startActivity(intent);
            }
        });
    }

    private boolean openFragment(Fragment fragment){
        if (fragment != null){
            getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).commit();
            return true;
        }
        return false;
    }
}
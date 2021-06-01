package com.afila.energiusaha.menu.materi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.afila.energiusaha.R;
import com.afila.energiusaha.menu.appersepsi.ApersFragment;
import com.afila.energiusaha.menu.ki.KiFragment;
import com.afila.energiusaha.menu.materi.daya.DayaFragment;
import com.afila.energiusaha.menu.materi.daya.MateriDataActivity;
import com.afila.energiusaha.menu.materi.energi.EnergiFragment;
import com.afila.energiusaha.menu.materi.energi.MateriEnergiActivity;
import com.afila.energiusaha.menu.materi.hubungansahaenergi.HubunganFragment;
import com.afila.energiusaha.menu.materi.hubungansahaenergi.HubunganUsahaEnergiActivity;
import com.afila.energiusaha.menu.materi.hukum.HukumFragment;
import com.afila.energiusaha.menu.materi.hukum.HukumKekelanEnergiMekanikActivity;
import com.afila.energiusaha.menu.materi.usaha.MateriUsahaActivity;
import com.afila.energiusaha.menu.materi.usaha.UsahaFragment;
import com.afila.energiusaha.menu.peta.PetaFragment;
import com.afila.energiusaha.menu.tokoh.TokohFragment;

public class MateriActivity extends AppCompatActivity {
    private TextView tvToolbar;
    private String toolbarText;
    private ImageView toolbarback;
    private LinearLayout l1,l2,l3,l4,l5,l6;
    private Fragment fragment;

    Intent intent;
    View btn1,btn2,btn3,btn4,btn5,btn6,btn7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi);

        tvToolbar = findViewById(R.id.tv_toolbar);
        toolbarback = findViewById(R.id.back_toolbar);

        btn1 = findViewById(R.id.viewmateri1);
        btn2 = findViewById(R.id.viewmateri2);
        btn3 = findViewById(R.id.viewmateri3);
        btn4 = findViewById(R.id.viewmateri4);
        btn5 = findViewById(R.id.viewmateri5);

        l1 = findViewById(R.id.linearmateri1);
        l2 = findViewById(R.id.linearmateri2);
        l3 = findViewById(R.id.linearmateri3);
        l4 = findViewById(R.id.linearmateri4);
        l5 = findViewById(R.id.linearmateri5);

        openFragment(new UsahaFragment());
        l1.setBackgroundColor(getResources().getColor(R.color.teal_200));
        l2.setBackgroundColor(getResources().getColor(R.color.white));
        l3.setBackgroundColor(getResources().getColor(R.color.white));
        l4.setBackgroundColor(getResources().getColor(R.color.white));
        l5.setBackgroundColor(getResources().getColor(R.color.white));

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
//                intent = new Intent(MateriActivity.this, MateriUsahaActivity.class);
//                intent.putExtra("toolbarText","Usaha");
//                startActivity(intent);
                l1.setBackgroundColor(getResources().getColor(R.color.teal_200));
                l2.setBackgroundColor(getResources().getColor(R.color.white));
                l3.setBackgroundColor(getResources().getColor(R.color.white));
                l4.setBackgroundColor(getResources().getColor(R.color.white));
                l5.setBackgroundColor(getResources().getColor(R.color.white));
                fragment = new UsahaFragment();
                openFragment(fragment);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                intent = new Intent(MateriActivity.this, MateriEnergiActivity.class);
//                intent.putExtra("toolbarText","Energi");
//                startActivity(intent);
                l1.setBackgroundColor(getResources().getColor(R.color.white));
                l2.setBackgroundColor(getResources().getColor(R.color.teal_200));
                l3.setBackgroundColor(getResources().getColor(R.color.white));
                l4.setBackgroundColor(getResources().getColor(R.color.white));
                l5.setBackgroundColor(getResources().getColor(R.color.white));
                fragment = new EnergiFragment();
                openFragment(fragment);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                intent = new Intent(MateriActivity.this, HubunganUsahaEnergiActivity.class);
//                intent.putExtra("toolbarText","Hubungan Usaha dan Energi");
//                startActivity(intent);
                l1.setBackgroundColor(getResources().getColor(R.color.white));
                l2.setBackgroundColor(getResources().getColor(R.color.white));
                l3.setBackgroundColor(getResources().getColor(R.color.teal_200));
                l4.setBackgroundColor(getResources().getColor(R.color.white));
                l5.setBackgroundColor(getResources().getColor(R.color.white));
                fragment = new HubunganFragment();
                openFragment(fragment);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                intent = new Intent(MateriActivity.this, HukumKekelanEnergiMekanikActivity.class);
//                intent.putExtra("toolbarText","Hukum Kekekalan Energi");
//                startActivity(intent);
                l1.setBackgroundColor(getResources().getColor(R.color.white));
                l2.setBackgroundColor(getResources().getColor(R.color.white));
                l3.setBackgroundColor(getResources().getColor(R.color.white));
                l4.setBackgroundColor(getResources().getColor(R.color.teal_200));
                l5.setBackgroundColor(getResources().getColor(R.color.white));
                fragment = new HukumFragment();
                openFragment(fragment);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                intent = new Intent(MateriActivity.this, MateriDataActivity.class);
//                intent.putExtra("toolbarText","Daya");
//                startActivity(intent);
                l1.setBackgroundColor(getResources().getColor(R.color.white));
                l2.setBackgroundColor(getResources().getColor(R.color.white));
                l3.setBackgroundColor(getResources().getColor(R.color.white));
                l4.setBackgroundColor(getResources().getColor(R.color.white));
                l5.setBackgroundColor(getResources().getColor(R.color.teal_200));
                fragment = new DayaFragment();
                openFragment(fragment);
            }
        });
    }

    private boolean openFragment(Fragment fragment){
        if (fragment != null){
            getSupportFragmentManager().beginTransaction().replace(R.id.container_materi, fragment).commit();
            return true;
        }
        return false;
    }
}
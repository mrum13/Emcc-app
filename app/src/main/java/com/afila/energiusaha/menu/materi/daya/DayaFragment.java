package com.afila.energiusaha.menu.materi.daya;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.afila.energiusaha.R;
import com.afila.energiusaha.menu.materi.WadahVideoActivity;
import com.afila.energiusaha.menu.materi.usaha.UsahaLatihanActivity;


public class DayaFragment extends Fragment {
    private TextView tvToolbar;
    private String toolbarText;
    private ImageView toolbarback;

    private View btnVideo,btnLatihan;

    private Intent intent;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_daya, container, false);
        btnLatihan = root.findViewById(R.id.btn_latihan);
        btnVideo = root.findViewById(R.id.btn_video);

//        tvToolbar.setText("");

        btnVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getActivity(), WadahVideoActivity.class);
                intent.putExtra("idvideo","SgceGfEQUes");
                startActivity(intent);
            }
        });

        btnLatihan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getActivity(), DayaLatihanActivity.class);
                intent.putExtra("toolbarText","Latihan-Daya 1");
                startActivity(intent);
            }
        });
        return root;
    }
}
package com.afila.energiusaha.menu.materi.hubungansahaenergi;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.afila.energiusaha.R;
import com.afila.energiusaha.menu.materi.WadahVideoActivity;
import com.afila.energiusaha.menu.materi.usaha.UsahaLatihanActivity;


public class HubunganFragment extends Fragment {
    private View btnVideo,btnLatihan;

    private Intent intent;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_hubungan, container, false);
        btnLatihan = root.findViewById(R.id.btn_latihan);
        btnVideo = root.findViewById(R.id.btn_video);

        btnVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getActivity(), WadahVideoActivity.class);
                intent.putExtra("idvideo","Qq_VDES23NQ");
                startActivity(intent);
            }
        });

        btnLatihan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getActivity(), HubunganLatihanActivity.class);
                intent.putExtra("toolbarText","Latihan-Hubungan 1");
                startActivity(intent);
            }
        });
        return root;
    }
}
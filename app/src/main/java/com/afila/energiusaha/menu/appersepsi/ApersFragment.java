package com.afila.energiusaha.menu.appersepsi;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.afila.energiusaha.R;

public class ApersFragment extends Fragment {
    private TextView tvToolbar;
    private String toolbarText;
    private ImageView toolbarback;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_apers, container, false);


        return root;
    }
}
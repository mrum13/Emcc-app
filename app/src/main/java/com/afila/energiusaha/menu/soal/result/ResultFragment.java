package com.afila.energiusaha.menu.soal.result;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.afila.energiusaha.MainActivity;
import com.afila.energiusaha.R;
import com.afila.energiusaha.menu.soal.Preferences;


public class ResultFragment extends Fragment {
    private TextView tvToolbar,tvCountdown;
    private String toolbarText;
    private ImageView toolbarback;

    TextView jwb1,jwb2,jwb3,jwb4,jwb5,jwb6,jwb7,jwb8,jwb9,jwb10
            ,jwb11,jwb12,jwb13,jwb14,jwb15,jwb16,jwb17,jwb18,jwb19,jwb20;

    TextView hrs1,hrs2,hrs3,hrs4,hrs5,hrs6,hrs7,hrs8,hrs9,hrs10,
            hrs11,hrs12,hrs13,hrs14,hrs15,hrs16,hrs17,hrs18,hrs19,hrs20;

    TextView benar1,benar2,benar3,benar4,benar5,benar6,benar7,benar8,benar9,benar10,
            benar11,benar12,benar13,benar14,benar15,benar16,benar17,benar18,benar19,benar20;

    ImageView imgbenar1,imgbenar2,imgbenar3,imgbenar4,imgbenar5,imgbenar6,imgbenar7,imgbenar8,imgbenar9,imgbenar10,
            imgbenar11,imgbenar12,imgbenar13,imgbenar14,imgbenar15,imgbenar16,imgbenar17,imgbenar18,imgbenar19,imgbenar20;

    ImageView imgsalah1,imgsalah2,imgsalah3,imgsalah4,imgsalah5,imgsalah6,imgsalah7,imgsalah8,imgsalah9,imgsalah10,
            imgsalah11,imgsalah12,imgsalah13,imgsalah14,imgsalah15,imgsalah16,imgsalah17,imgsalah18,imgsalah19,imgsalah20;

    String s1,s2,s3,s4,s5,s6,s7,s8,s9,s10
            ,s11,s12,s13,s14,s15,s16,s17,s18,s19,s20,nilaiakhir;

    int nilai = 0;

    TextView tvnilai;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_result, container, false);

        tvToolbar = root.findViewById(R.id.tv_toolbar);
        toolbarback = root.findViewById(R.id.back_toolbar);

        tvCountdown = root.findViewById(R.id.timecountdown);
        tvCountdown.setVisibility(View.GONE);

        toolbarback.setVisibility ( View.GONE );

        tvToolbar.setText("Hasil");
        toolbarback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent=new Intent(ResultActivity.this, MainActivity.class);
//                startActivity(intent);
//                ResultActivity.this.finish();
            }
        });

        tvnilai = root.findViewById(R.id.nilai);

        jwb1 = root.findViewById(R.id.jawaban1);
        jwb2 = root.findViewById(R.id.jawaban2);
        jwb3 = root.findViewById(R.id.jawaban3);
        jwb4 = root.findViewById(R.id.jawaban4);
        jwb5 = root.findViewById(R.id.jawaban5);
        jwb6 = root.findViewById(R.id.jawaban6);
        jwb7 = root.findViewById(R.id.jawaban7);
        jwb8 = root.findViewById(R.id.jawaban8);
        jwb9 = root.findViewById(R.id.jawaban9);
        jwb10 = root.findViewById(R.id.jawaban10);

        hrs1 = root.findViewById(R.id.txtharusnya1);
        hrs2 = root.findViewById(R.id.txtharusnya2);
        hrs3 = root.findViewById(R.id.txtharusnya3);
        hrs4 = root.findViewById(R.id.txtharusnya4);
        hrs5 = root.findViewById(R.id.txtharusnya5);
        hrs6 = root.findViewById(R.id.txtharusnya6);
        hrs7 = root.findViewById(R.id.txtharusnya7);
        hrs8 = root.findViewById(R.id.txtharusnya8);
        hrs9 = root.findViewById(R.id.txtharusnya9);
        hrs10 = root.findViewById(R.id.txtharusnya10);

        benar1 = root.findViewById(R.id.benar1);
        benar1.setText("C");
        benar2 = root.findViewById(R.id.benar2);
        benar2.setText("D");
        benar3 = root.findViewById(R.id.benar3);
        benar3.setText("D");
        benar4 = root.findViewById(R.id.benar4);
        benar4.setText("E");
        benar5 = root.findViewById(R.id.benar5);
        benar5.setText("A");
        benar6 = root.findViewById(R.id.benar6);
        benar6.setText("A");
        benar7 = root.findViewById(R.id.benar7);
        benar7.setText("A");
        benar8 = root.findViewById(R.id.benar8);
        benar8.setText("A");
        benar9 = root.findViewById(R.id.benar9);
        benar9.setText("C");
        benar10 = root.findViewById(R.id.benar10);
        benar10.setText("C");

        imgbenar1 = root.findViewById(R.id.ic_benar1);
        imgbenar2 = root.findViewById(R.id.ic_benar2);
        imgbenar3 = root.findViewById(R.id.ic_benar3);
        imgbenar4 = root.findViewById(R.id.ic_benar4);
        imgbenar5 = root.findViewById(R.id.ic_benar5);
        imgbenar6 = root.findViewById(R.id.ic_benar6);
        imgbenar7 = root.findViewById(R.id.ic_benar7);
        imgbenar8 = root.findViewById(R.id.ic_benar8);
        imgbenar9 = root.findViewById(R.id.ic_benar9);
        imgbenar10 = root.findViewById(R.id.ic_benar10);

        imgsalah1 = root.findViewById(R.id.ic_salah1);
        imgsalah2 = root.findViewById(R.id.ic_salah2);
        imgsalah3 = root.findViewById(R.id.ic_salah3);
        imgsalah4 = root.findViewById(R.id.ic_salah4);
        imgsalah5 = root.findViewById(R.id.ic_salah5);
        imgsalah6 = root.findViewById(R.id.ic_salah6);
        imgsalah7 = root.findViewById(R.id.ic_salah7);
        imgsalah8 = root.findViewById(R.id.ic_salah8);
        imgsalah9 = root.findViewById(R.id.ic_salah9);
        imgsalah10 = root.findViewById(R.id.ic_salah10);

        s1 = Preferences.getSoal1(getActivity().getBaseContext());
        s2 = Preferences.getSoal2(getActivity().getBaseContext());
        s3 = Preferences.getSoal3(getActivity().getBaseContext());
        s4 = Preferences.getSoal4(getActivity().getBaseContext());
        s5 = Preferences.getSoal5(getActivity().getBaseContext());
        s6 = Preferences.getSoal6(getActivity().getBaseContext());
        s7 = Preferences.getSoal7(getActivity().getBaseContext());
        s8 = Preferences.getSoal8(getActivity().getBaseContext());
        s9 = Preferences.getSoal9(getActivity().getBaseContext());
        s10 = Preferences.getSoal10(getActivity().getBaseContext());

        jwb1.setText(s1);
        if (s1.equals("c")){
            imgsalah1.setVisibility(View.GONE);
            hrs1.setVisibility(View.GONE);
            benar1.setVisibility(View.GONE);
            nilai = nilai+5;
        }
        else {
            imgbenar1.setVisibility(View.GONE);
        }

        jwb2.setText(s2);
        if (s2.equals("d")){
            imgsalah2.setVisibility(View.GONE);
            hrs2.setVisibility(View.GONE);
            benar2.setVisibility(View.GONE);
            nilai = nilai+5;
        }
        else {
            imgbenar2.setVisibility(View.GONE);
        }

        jwb3.setText(s3);
        if (s3.equals("d")){
            imgsalah3.setVisibility(View.GONE);
            hrs3.setVisibility(View.GONE);
            benar3.setVisibility(View.GONE);
            nilai = nilai+5;
        }
        else {
            imgbenar3.setVisibility(View.GONE);
        }

        jwb4.setText(s4);
        if (s4.equals("e")){
            imgsalah4.setVisibility(View.GONE);
            hrs4.setVisibility(View.GONE);
            benar4.setVisibility(View.GONE);
            nilai = nilai+5;
        }
        else {
            imgbenar4.setVisibility(View.GONE);
        }

        jwb5.setText(s5);
        if (s5.equals("a")){
            imgsalah5.setVisibility(View.GONE);
            hrs5.setVisibility(View.GONE);
            benar5.setVisibility(View.GONE);
            nilai = nilai+5;
        }
        else {
            imgbenar5.setVisibility(View.GONE);
        }

        jwb6.setText(s6);
        if (s6.equals("a")){
            imgsalah6.setVisibility(View.GONE);
            hrs6.setVisibility(View.GONE);
            benar6.setVisibility(View.GONE);
            nilai = nilai+5;
        }
        else {
            imgbenar6.setVisibility(View.GONE);
        }

        jwb7.setText(s7);
        if (s7.equals("a")){
            imgsalah7.setVisibility(View.GONE);
            hrs7.setVisibility(View.GONE);
            benar7.setVisibility(View.GONE);
            nilai = nilai+5;
        }
        else {
            imgbenar7.setVisibility(View.GONE);
        }

        jwb8.setText(s8);
        if (s8.equals("a")){
            imgsalah8.setVisibility(View.GONE);
            hrs8.setVisibility(View.GONE);
            benar8.setVisibility(View.GONE);
            nilai = nilai+5;
        }
        else {
            imgbenar8.setVisibility(View.GONE);
        }

        jwb9.setText(s9);
        if (s9.equals("c")){
            imgsalah9.setVisibility(View.GONE);
            hrs9.setVisibility(View.GONE);
            benar9.setVisibility(View.GONE);
            nilai = nilai+5;
        }
        else {
            imgbenar9.setVisibility(View.GONE);
        }

        jwb10.setText(s10);
        if (s10.equals("c")){
            imgsalah10.setVisibility(View.GONE);
            hrs10.setVisibility(View.GONE);
            benar10.setVisibility(View.GONE);
            nilai = nilai+5;
        }
        else {
            imgbenar10.setVisibility(View.GONE);
        }

        return root;
    }
}
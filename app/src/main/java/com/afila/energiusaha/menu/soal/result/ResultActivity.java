package com.afila.energiusaha.menu.soal.result;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.afila.energiusaha.MainActivity;
import com.afila.energiusaha.R;
import com.afila.energiusaha.menu.soal.Preferences;

public class ResultActivity extends AppCompatActivity {
    private TextView tvToolbar;
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
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        tvToolbar = findViewById(R.id.tv_toolbar);
        toolbarback = findViewById(R.id.back_toolbar);

        tvToolbar.setText("Hasil");
        toolbarback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ResultActivity.this, MainActivity.class);
                startActivity(intent);
                ResultActivity.this.finish();
            }
        });

        tvnilai = findViewById(R.id.nilai);

        jwb1 = findViewById(R.id.jawaban1);
        jwb2 = findViewById(R.id.jawaban2);
        jwb3 = findViewById(R.id.jawaban3);
        jwb4 = findViewById(R.id.jawaban4);
        jwb5 = findViewById(R.id.jawaban5);
        jwb6 = findViewById(R.id.jawaban6);
        jwb7 = findViewById(R.id.jawaban7);
        jwb8 = findViewById(R.id.jawaban8);
        jwb9 = findViewById(R.id.jawaban9);
        jwb10 = findViewById(R.id.jawaban10);

        hrs1 = findViewById(R.id.txtharusnya1);
        hrs2 = findViewById(R.id.txtharusnya2);
        hrs3 = findViewById(R.id.txtharusnya3);
        hrs4 = findViewById(R.id.txtharusnya4);
        hrs5 = findViewById(R.id.txtharusnya5);
        hrs6 = findViewById(R.id.txtharusnya6);
        hrs7 = findViewById(R.id.txtharusnya7);
        hrs8 = findViewById(R.id.txtharusnya8);
        hrs9 = findViewById(R.id.txtharusnya9);
        hrs10 = findViewById(R.id.txtharusnya10);

        benar1 = findViewById(R.id.benar1);
        benar1.setText("C");
        benar2 = findViewById(R.id.benar2);
        benar2.setText("A");
        benar3 = findViewById(R.id.benar3);
        benar3.setText("A");
        benar4 = findViewById(R.id.benar4);
        benar4.setText("D");
        benar5 = findViewById(R.id.benar5);
        benar5.setText("E");
        benar6 = findViewById(R.id.benar6);
        benar6.setText("D");
        benar7 = findViewById(R.id.benar7);
        benar7.setText("D");
        benar8 = findViewById(R.id.benar8);
        benar8.setText("E");
        benar9 = findViewById(R.id.benar9);
        benar9.setText("A");
        benar10 = findViewById(R.id.benar10);
        benar10.setText("A");

        imgbenar1 = findViewById(R.id.ic_benar1);
        imgbenar2 = findViewById(R.id.ic_benar2);
        imgbenar3 = findViewById(R.id.ic_benar3);
        imgbenar4 = findViewById(R.id.ic_benar4);
        imgbenar5 = findViewById(R.id.ic_benar5);
        imgbenar6 = findViewById(R.id.ic_benar6);
        imgbenar7 = findViewById(R.id.ic_benar7);
        imgbenar8 = findViewById(R.id.ic_benar8);
        imgbenar9 = findViewById(R.id.ic_benar9);
        imgbenar10 = findViewById(R.id.ic_benar10);

        imgsalah1 = findViewById(R.id.ic_salah1);
        imgsalah2 = findViewById(R.id.ic_salah2);
        imgsalah3 = findViewById(R.id.ic_salah3);
        imgsalah4 = findViewById(R.id.ic_salah4);
        imgsalah5 = findViewById(R.id.ic_salah5);
        imgsalah6 = findViewById(R.id.ic_salah6);
        imgsalah7 = findViewById(R.id.ic_salah7);
        imgsalah8 = findViewById(R.id.ic_salah8);
        imgsalah9 = findViewById(R.id.ic_salah9);
        imgsalah10 = findViewById(R.id.ic_salah10);

        s1 = Preferences.getSoal1(getBaseContext());
        s2 = Preferences.getSoal2(getBaseContext());
        s3 = Preferences.getSoal3(getBaseContext());
        s4 = Preferences.getSoal4(getBaseContext());
        s5 = Preferences.getSoal5(getBaseContext());
        s6 = Preferences.getSoal6(getBaseContext());
        s7 = Preferences.getSoal7(getBaseContext());
        s8 = Preferences.getSoal8(getBaseContext());
        s9 = Preferences.getSoal9(getBaseContext());
        s10 = Preferences.getSoal10(getBaseContext());

        s11 = Preferences.getSoal11(getBaseContext());
        s12 = Preferences.getSoal12(getBaseContext());
        s13 = Preferences.getSoal13(getBaseContext());
        s14 = Preferences.getSoal14(getBaseContext());
        s15 = Preferences.getSoal15(getBaseContext());
        s16 = Preferences.getSoal16(getBaseContext());
        s17 = Preferences.getSoal17(getBaseContext());
        s18 = Preferences.getSoal18(getBaseContext());
        s19 = Preferences.getSoal19(getBaseContext());
        s20 = Preferences.getSoal20(getBaseContext());





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

        jwb2.setText(Preferences.getSoal2(getBaseContext()));
        if (s2.equals("a")){
            imgsalah2.setVisibility(View.GONE);
            hrs2.setVisibility(View.GONE);
            benar2.setVisibility(View.GONE);
            nilai = nilai+5;
        }
        else {
            imgbenar2.setVisibility(View.GONE);
        }

        jwb3.setText(Preferences.getSoal3(getBaseContext()));
        if (s3.equals("a")){
            imgsalah3.setVisibility(View.GONE);
            hrs3.setVisibility(View.GONE);
            benar3.setVisibility(View.GONE);
            nilai = nilai+5;
        }
        else {
            imgbenar3.setVisibility(View.GONE);
        }

        jwb4.setText(Preferences.getSoal4(getBaseContext()));
        if (s4.equals("d")){
            imgsalah4.setVisibility(View.GONE);
            hrs4.setVisibility(View.GONE);
            benar4.setVisibility(View.GONE);
            nilai = nilai+5;
        }
        else {
            imgbenar4.setVisibility(View.GONE);
        }

        jwb5.setText(Preferences.getSoal5(getBaseContext()));
        if (s5.equals("e")){
            imgsalah5.setVisibility(View.GONE);
            hrs5.setVisibility(View.GONE);
            benar5.setVisibility(View.GONE);
            nilai = nilai+5;
        }
        else {
            imgbenar5.setVisibility(View.GONE);
        }

        jwb6.setText(Preferences.getSoal6(getBaseContext()));
        if (s6.equals("d")){
            imgsalah6.setVisibility(View.GONE);
            hrs6.setVisibility(View.GONE);
            benar6.setVisibility(View.GONE);
            nilai = nilai+5;
        }
        else {
            imgbenar6.setVisibility(View.GONE);
        }

        jwb7.setText(Preferences.getSoal7(getBaseContext()));
        if (s7.equals("d")){
            imgsalah7.setVisibility(View.GONE);
            hrs7.setVisibility(View.GONE);
            benar7.setVisibility(View.GONE);
            nilai = nilai+5;
        }
        else {
            imgbenar7.setVisibility(View.GONE);
        }

        jwb8.setText(Preferences.getSoal8(getBaseContext()));
        if (s8.equals("e")){
            imgsalah8.setVisibility(View.GONE);
            hrs8.setVisibility(View.GONE);
            benar8.setVisibility(View.GONE);
            nilai = nilai+5;
        }
        else {
            imgbenar8.setVisibility(View.GONE);
        }

        jwb9.setText(Preferences.getSoal9(getBaseContext()));
        if (s9.equals("a")){
            imgsalah9.setVisibility(View.GONE);
            hrs9.setVisibility(View.GONE);
            benar9.setVisibility(View.GONE);
            nilai = nilai+5;
        }
        else {
            imgbenar9.setVisibility(View.GONE);
        }

        jwb10.setText(Preferences.getSoal10(getBaseContext()));
        if (s10.equals("a")){
            imgsalah10.setVisibility(View.GONE);
            hrs10.setVisibility(View.GONE);
            benar10.setVisibility(View.GONE);
            nilai = nilai+5;
        }
        else {
            imgbenar10.setVisibility(View.GONE);
        }

        jwb11.setText(Preferences.getSoal11(getBaseContext()));
        if (s11.equals("c")){
            imgsalah11.setVisibility(View.GONE);
            hrs11.setVisibility(View.GONE);
            benar11.setVisibility(View.GONE);
            nilai = nilai+5;
        }
        else {
            imgbenar11.setVisibility(View.GONE);
        }

        jwb12.setText(Preferences.getSoal12(getBaseContext()));
        if (s12.equals("d")){
            imgsalah12.setVisibility(View.GONE);
            hrs12.setVisibility(View.GONE);
            benar12.setVisibility(View.GONE);
            nilai = nilai+5;
        }
        else {
            imgbenar12.setVisibility(View.GONE);
        }

        jwb13.setText(Preferences.getSoal13(getBaseContext()));
        if (s13.equals("a")){
            imgsalah13.setVisibility(View.GONE);
            hrs13.setVisibility(View.GONE);
            benar13.setVisibility(View.GONE);
            nilai = nilai+5;
        }
        else {
            imgbenar13.setVisibility(View.GONE);
        }

        jwb14.setText(Preferences.getSoal14(getBaseContext()));
        if (s14.equals("b")){
            imgsalah14.setVisibility(View.GONE);
            hrs14.setVisibility(View.GONE);
            benar14.setVisibility(View.GONE);
            nilai = nilai+5;
        }
        else {
            imgbenar14.setVisibility(View.GONE);
        }

        jwb15.setText(Preferences.getSoal15(getBaseContext()));
        if (s15.equals("b")){
            imgsalah15.setVisibility(View.GONE);
            hrs15.setVisibility(View.GONE);
            benar15.setVisibility(View.GONE);
            nilai = nilai+5;
        }
        else {
            imgbenar15.setVisibility(View.GONE);
        }

        jwb16.setText(Preferences.getSoal16(getBaseContext()));
        if (s16.equals("a")){
            imgsalah16.setVisibility(View.GONE);
            hrs16.setVisibility(View.GONE);
            benar16.setVisibility(View.GONE);
            nilai = nilai+5;
        }
        else {
            imgbenar16.setVisibility(View.GONE);
        }

        jwb17.setText(Preferences.getSoal17(getBaseContext()));
        if (s17.equals("e")){
            imgsalah17.setVisibility(View.GONE);
            hrs17.setVisibility(View.GONE);
            benar17.setVisibility(View.GONE);
            nilai = nilai+5;
        }
        else {
            imgbenar17.setVisibility(View.GONE);
        }

        jwb18.setText(Preferences.getSoal18(getBaseContext()));
        if (s18.equals("c")){
            imgsalah18.setVisibility(View.GONE);
            hrs18.setVisibility(View.GONE);
            benar18.setVisibility(View.GONE);
            nilai = nilai+5;
        }
        else {
            imgbenar18.setVisibility(View.GONE);
        }

        jwb19.setText(Preferences.getSoal19(getBaseContext()));
        if (s19.equals("e")){
            imgsalah19.setVisibility(View.GONE);
            hrs19.setVisibility(View.GONE);
            benar19.setVisibility(View.GONE);
            nilai = nilai+5;
        }
        else {
            imgbenar19.setVisibility(View.GONE);
        }

        jwb20.setText(Preferences.getSoal20(getBaseContext()));
        if (s20.equals("c")){
            imgsalah20.setVisibility(View.GONE);
            hrs20.setVisibility(View.GONE);
            benar20.setVisibility(View.GONE);
            nilai = nilai+5;
        }
        else {
            imgbenar20.setVisibility(View.GONE);
        }

        nilaiakhir = String.valueOf(nilai);

        tvnilai.setText(nilaiakhir);
    }
}
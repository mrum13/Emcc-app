package com.afila.energiusaha.menu.soal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.afila.energiusaha.R;

public class ResultActivity extends AppCompatActivity {
    ModelJawaban modelJawaban;
    TextView jwb1,jwb2,jwb3,jwb4,jwb5,jwb6,jwb7,jwb8,jwb9,jwb10;
    String j1,j2,j3,j4,j5,j6,j7,j8,j9,j10;

    private String soal1,soal2,soal3,soal4,soal5,soal6,soal7,soal8,soal9,soal10
            ,soal11,soal12,soal13,soal14,soal15,soal16,soal17,soal18,soal19,soal20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        jwb1 = findViewById(R.id.jawaban1);
        jwb2 = findViewById(R.id.jawaban2);

        jwb1.setText(Preferences.getSoal1(getBaseContext()));
        jwb2.setText(Preferences.getSoal2(getBaseContext()));

//        modelJawaban = new ModelJawaban(soal1,soal2,soal3,soal4,soal5,soal6,soal7,soal8,soal9,soal10
//                ,soal11,soal12,soal13,soal14,soal15,soal16,soal17,soal18,soal19,soal20);
//
//
//        jwb1 = findViewById(R.id.jawaban1);
//        jwb2 = findViewById(R.id.jawaban2);
//        jwb3 = findViewById(R.id.jawaban3);
//        jwb4 = findViewById(R.id.jawaban4);
//        jwb5 = findViewById(R.id.jawaban5);
//        jwb6 = findViewById(R.id.jawaban6);
//        jwb7 = findViewById(R.id.jawaban7);
//        jwb8 = findViewById(R.id.jawaban8);
//        jwb9 = findViewById(R.id.jawaban9);
//        jwb10 = findViewById(R.id.jawaban10);
//
//        j1 = modelJawaban.getSoal1().toString().trim();
//        j2 = modelJawaban.getSoal2().toString().trim();
//        j3 = modelJawaban.getSoal3().toString().trim();
//        j4=modelJawaban.getSoal4().toString().trim();
//        j5=modelJawaban.getSoal5().toString().trim();
//        j6=modelJawaban.getSoal6().toString().trim();
//        j7=modelJawaban.getSoal7().toString().trim();
//        j8=modelJawaban.getSoal8().toString().trim();
//        j9=modelJawaban.getSoal9().toString().trim();
//        j10=modelJawaban.getSoal10().toString().trim();
//
//        jwb1.setText(j1);
//        jwb2.setText(j2);
//        jwb3.setText(j3);
//        jwb4.setText(j4);
//        jwb5.setText(j5);
//        jwb6.setText(j6);
//        jwb7.setText(j7);
//        jwb8.setText(j8);
//        jwb9.setText(j9);
//        jwb10.setText(j10);
    }
}
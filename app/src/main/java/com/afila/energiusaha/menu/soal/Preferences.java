package com.afila.energiusaha.menu.soal;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class Preferences {
    /** Pendeklarasian key-data berupa String, untuk sebagai wadah penyimpanan data.
     * Jadi setiap data mempunyai key yang berbeda satu sama lain */
    static final String soal1 ="key1", soal2 ="key2", soal3 ="key3", soal4 ="key4", soal5 ="key5"
            , soal6 ="key6", soal7 ="key7", soal8 ="key8", soal9 ="key9", soal10 ="key10"
            ,soal11 ="key11", soal12 ="key12", soal13 ="key13", soal14 ="key14", soal15 ="key15"
            , soal16 ="key16", soal17 ="key17", soal18 ="key18", soal19 ="key19", soal20 ="key20";

    static final String nilai1 ="key1", nilai2 ="key2", nilai3 ="key3", nilai4 ="key4", nilai5 ="key5"
            , nilai6 ="key6", nilai7 ="key7", nilai8 ="key8", nilai9 ="key9", nilai10 ="key10";

    /** Pendlakarasian Shared Preferences yang berdasarkan paramater context */
    private static SharedPreferences getSharedPreference(Context context){
        return PreferenceManager.getDefaultSharedPreferences(context);
    }



    public static void setSoal1(Context context, String jwb1){
        SharedPreferences.Editor editor = getSharedPreference(context).edit();
        editor.putString(soal1, jwb1);
        editor.apply();
    }

    public static String getSoal1(Context context){
        return getSharedPreference(context).getString(soal1,"");
    }

    public static void setSoal2(Context context, String jwb2){
        SharedPreferences.Editor editor = getSharedPreference(context).edit();
        editor.putString(soal2, jwb2);
        editor.apply();
    }

    public static String getSoal2(Context context){
        return getSharedPreference(context).getString(soal2,"");
    }

    public static void setSoal3(Context context, String jwb3){
        SharedPreferences.Editor editor = getSharedPreference(context).edit();
        editor.putString(soal3, jwb3);
        editor.apply();
    }

    public static String getSoal3(Context context){
        return getSharedPreference(context).getString(soal3,"");
    }

    public static void setSoal4(Context context, String jwb4){
        SharedPreferences.Editor editor = getSharedPreference(context).edit();
        editor.putString(soal4, jwb4);
        editor.apply();
    }

    public static String getSoal4(Context context){
        return getSharedPreference(context).getString(soal4,"");
    }

    public static void setSoal5(Context context, String jwb5){
        SharedPreferences.Editor editor = getSharedPreference(context).edit();
        editor.putString(soal5, jwb5);
        editor.apply();
    }

    public static String getSoal5(Context context){
        return getSharedPreference(context).getString(soal5,"");
    }

    public static void setSoal6(Context context, String jwb6){
        SharedPreferences.Editor editor = getSharedPreference(context).edit();
        editor.putString(soal6, jwb6);
        editor.apply();
    }

    public static String getSoal6(Context context){
        return getSharedPreference(context).getString(soal6,"");
    }

    public static void setSoal7(Context context, String jwb7){
        SharedPreferences.Editor editor = getSharedPreference(context).edit();
        editor.putString(soal7, jwb7);
        editor.apply();
    }

    public static String getSoal7(Context context){
        return getSharedPreference(context).getString(soal7,"");
    }

    public static void setSoal8(Context context, String jwb8){
        SharedPreferences.Editor editor = getSharedPreference(context).edit();
        editor.putString(soal8, jwb8);
        editor.apply();
    }

    public static String getSoal8(Context context){
        return getSharedPreference(context).getString(soal8,"");
    }

    public static void setSoal9(Context context, String jwb9){
        SharedPreferences.Editor editor = getSharedPreference(context).edit();
        editor.putString(soal9, jwb9);
        editor.apply();
    }

    public static String getSoal9(Context context){
        return getSharedPreference(context).getString(soal9,"");
    }

    public static void setSoal10(Context context, String jwb10){
        SharedPreferences.Editor editor = getSharedPreference(context).edit();
        editor.putString(soal10, jwb10);
        editor.apply();
    }

    public static String getSoal10(Context context){
        return getSharedPreference(context).getString(soal10,"");
    }

    public static void setSoal11(Context context, String jwb11){
        SharedPreferences.Editor editor = getSharedPreference(context).edit();
        editor.putString(soal11, jwb11);
        editor.apply();
    }

    public static String getSoal11(Context context){
        return getSharedPreference(context).getString(soal11,"");
    }

    public static void setSoal12(Context context, String jwb12){
        SharedPreferences.Editor editor = getSharedPreference(context).edit();
        editor.putString(soal12, jwb12);
        editor.apply();
    }

    public static String getSoal12(Context context){
        return getSharedPreference(context).getString(soal12,"");
    }

    public static void setSoal13(Context context, String jwb13){
        SharedPreferences.Editor editor = getSharedPreference(context).edit();
        editor.putString(soal13, jwb13);
        editor.apply();
    }

    public static String getSoal13(Context context){
        return getSharedPreference(context).getString(soal13,"");
    }

    public static void setSoal114(Context context, String jwb14){
        SharedPreferences.Editor editor = getSharedPreference(context).edit();
        editor.putString(soal14, jwb14);
        editor.apply();
    }

    public static String getSoal14(Context context){
        return getSharedPreference(context).getString(soal14,"");
    }

    public static void setSoal15(Context context, String jwb15){
        SharedPreferences.Editor editor = getSharedPreference(context).edit();
        editor.putString(soal15, jwb15);
        editor.apply();
    }

    public static String getSoal15(Context context){
        return getSharedPreference(context).getString(soal15,"");
    }

    public static void setSoal16(Context context, String jwb16){
        SharedPreferences.Editor editor = getSharedPreference(context).edit();
        editor.putString(soal16, jwb16);
        editor.apply();
    }

    public static String getSoal16(Context context){
        return getSharedPreference(context).getString(soal16,"");
    }

    public static void setSoal17(Context context, String jwb17){
        SharedPreferences.Editor editor = getSharedPreference(context).edit();
        editor.putString(soal17, jwb17);
        editor.apply();
    }

    public static String getSoal17(Context context){
        return getSharedPreference(context).getString(soal17,"");
    }

    public static void setSoal18(Context context, String jwb18){
        SharedPreferences.Editor editor = getSharedPreference(context).edit();
        editor.putString(soal18, jwb18);
        editor.apply();
    }

    public static String getSoal18(Context context){
        return getSharedPreference(context).getString(soal18,"");
    }

    public static void setSoal19(Context context, String jwb19){
        SharedPreferences.Editor editor = getSharedPreference(context).edit();
        editor.putString(soal19, jwb19);
        editor.apply();
    }

    public static String getSoal19(Context context){
        return getSharedPreference(context).getString(soal19,"");
    }

    public static void setSoal20(Context context, String jwb20){
        SharedPreferences.Editor editor = getSharedPreference(context).edit();
        editor.putString(soal20, jwb20);
        editor.apply();
    }

    public static String getSoal20(Context context){
        return getSharedPreference(context).getString(soal20,"");
    }

    public static void setNilai1(Context context, String nl1){
        SharedPreferences.Editor editor = getSharedPreference(context).edit();
        editor.putString(nilai1, nl1);
        editor.apply();
    }

    public static String getNilai1(Context context){
        return getSharedPreference(context).getString(nilai1,"");
    }

    public static void setNilai2(Context context, String nl2){
        SharedPreferences.Editor editor = getSharedPreference(context).edit();
        editor.putString(nilai2, nl2);
        editor.apply();
    }

    public static String getNilai2(Context context){
        return getSharedPreference(context).getString(nilai2,"");
    }

    public static void setNilai3(Context context, String nl3){
        SharedPreferences.Editor editor = getSharedPreference(context).edit();
        editor.putString(nilai3, nl3);
        editor.apply();
    }

    public static String getNilai3(Context context){
        return getSharedPreference(context).getString(nilai3,"");
    }

    public static void setNilai4(Context context, String nl4){
        SharedPreferences.Editor editor = getSharedPreference(context).edit();
        editor.putString(nilai4, nl4);
        editor.apply();
    }

    public static String getNilai4(Context context){
        return getSharedPreference(context).getString(nilai4,"");
    }

    public static void setNilai5(Context context, String nl5){
        SharedPreferences.Editor editor = getSharedPreference(context).edit();
        editor.putString(nilai5, nl5);
        editor.apply();
    }

    public static String getNilai5(Context context){
        return getSharedPreference(context).getString(nilai5,"");
    }

    public static void setNilai6(Context context, String nl6){
        SharedPreferences.Editor editor = getSharedPreference(context).edit();
        editor.putString(nilai6, nl6);
        editor.apply();
    }

    public static String getNilai6(Context context){
        return getSharedPreference(context).getString(nilai6,"");
    }

    public static void setNilai7(Context context, String nl7){
        SharedPreferences.Editor editor = getSharedPreference(context).edit();
        editor.putString(nilai7, nl7);
        editor.apply();
    }

    public static String getNilai7(Context context){
        return getSharedPreference(context).getString(nilai7,"");
    }

    public static void setNilai8(Context context, String nl8){
        SharedPreferences.Editor editor = getSharedPreference(context).edit();
        editor.putString(nilai8, nl8);
        editor.apply();
    }

    public static String getNilai8(Context context){
        return getSharedPreference(context).getString(nilai8,"");
    }

    public static void setNilai9(Context context, String nl9){
        SharedPreferences.Editor editor = getSharedPreference(context).edit();
        editor.putString(nilai9, nl9);
        editor.apply();
    }

    public static String getNilai9(Context context){
        return getSharedPreference(context).getString(nilai9,"");
    }

    public static void setNilai10(Context context, String nl10){
        SharedPreferences.Editor editor = getSharedPreference(context).edit();
        editor.putString(nilai10, nl10);
        editor.apply();
    }

    public static String getNilai10(Context context){
        return getSharedPreference(context).getString(nilai10,"");
    }
}

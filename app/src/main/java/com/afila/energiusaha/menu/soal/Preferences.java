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

    /** Pendlakarasian Shared Preferences yang berdasarkan paramater context */
    private static SharedPreferences getSharedPreference(Context context){
        return PreferenceManager.getDefaultSharedPreferences(context);
    }

    /** Deklarasi Edit Preferences dan mengubah data
     *  yang memiliki key isi KEY_USER_TEREGISTER dengan parameter username */
    public static void setSoal1(Context context, String jwb1){
        SharedPreferences.Editor editor = getSharedPreference(context).edit();
        editor.putString(soal1, jwb1);
        editor.apply();
    }
    /** Mengembalikan nilai dari key KEY_USER_TEREGISTER berupa String */
    public static String getSoal1(Context context){
        return getSharedPreference(context).getString(soal1,"");
    }

    public static void setSoal2(Context context, String jwb2){
        SharedPreferences.Editor editor = getSharedPreference(context).edit();
        editor.putString(soal2, jwb2);
        editor.apply();
    }
    /** Mengembalikan nilai dari key KEY_USER_TEREGISTER berupa String */
    public static String getSoal2(Context context){
        return getSharedPreference(context).getString(soal2,"");
    }

    public static void setSoal3(Context context, String jwb3){
        SharedPreferences.Editor editor = getSharedPreference(context).edit();
        editor.putString(soal3, jwb3);
        editor.apply();
    }
    /** Mengembalikan nilai dari key KEY_USER_TEREGISTER berupa String */
    public static String getSoal3(Context context){
        return getSharedPreference(context).getString(soal3,"");
    }

    public static void setSoal4(Context context, String jwb4){
        SharedPreferences.Editor editor = getSharedPreference(context).edit();
        editor.putString(soal4, jwb4);
        editor.apply();
    }
    /** Mengembalikan nilai dari key KEY_USER_TEREGISTER berupa String */
    public static String getSoal4(Context context){
        return getSharedPreference(context).getString(soal4,"");
    }

    public static void setSoal5(Context context, String jwb5){
        SharedPreferences.Editor editor = getSharedPreference(context).edit();
        editor.putString(soal5, jwb5);
        editor.apply();
    }
    /** Mengembalikan nilai dari key KEY_USER_TEREGISTER berupa String */
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
    /** Mengembalikan nilai dari key KEY_USER_TEREGISTER berupa String */
    public static String getSoal7(Context context){
        return getSharedPreference(context).getString(soal7,"");
    }

    public static void setSoal8(Context context, String jwb8){
        SharedPreferences.Editor editor = getSharedPreference(context).edit();
        editor.putString(soal8, jwb8);
        editor.apply();
    }
    /** Mengembalikan nilai dari key KEY_USER_TEREGISTER berupa String */
    public static String getSoal8(Context context){
        return getSharedPreference(context).getString(soal8,"");
    }

    public static void setSoal9(Context context, String jwb9){
        SharedPreferences.Editor editor = getSharedPreference(context).edit();
        editor.putString(soal9, jwb9);
        editor.apply();
    }
    /** Mengembalikan nilai dari key KEY_USER_TEREGISTER berupa String */
    public static String getSoal9(Context context){
        return getSharedPreference(context).getString(soal9,"");
    }

    public static void setSoal10(Context context, String jwb10){
        SharedPreferences.Editor editor = getSharedPreference(context).edit();
        editor.putString(soal10, jwb10);
        editor.apply();
    }
    /** Mengembalikan nilai dari key KEY_USER_TEREGISTER berupa String */
    public static String getSoal10(Context context){
        return getSharedPreference(context).getString(soal10,"");
    }

    public static void setSoal11(Context context, String jwb11){
        SharedPreferences.Editor editor = getSharedPreference(context).edit();
        editor.putString(soal11, jwb11);
        editor.apply();
    }
    /** Mengembalikan nilai dari key KEY_USER_TEREGISTER berupa String */
    public static String getSoal11(Context context){
        return getSharedPreference(context).getString(soal11,"");
    }

    public static void setSoal12(Context context, String jwb12){
        SharedPreferences.Editor editor = getSharedPreference(context).edit();
        editor.putString(soal12, jwb12);
        editor.apply();
    }
    /** Mengembalikan nilai dari key KEY_USER_TEREGISTER berupa String */
    public static String getSoal12(Context context){
        return getSharedPreference(context).getString(soal12,"");
    }

    public static void setSoal13(Context context, String jwb13){
        SharedPreferences.Editor editor = getSharedPreference(context).edit();
        editor.putString(soal13, jwb13);
        editor.apply();
    }
    /** Mengembalikan nilai dari key KEY_USER_TEREGISTER berupa String */
    public static String getSoal13(Context context){
        return getSharedPreference(context).getString(soal13,"");
    }

    public static void setSoal114(Context context, String jwb14){
        SharedPreferences.Editor editor = getSharedPreference(context).edit();
        editor.putString(soal14, jwb14);
        editor.apply();
    }
    /** Mengembalikan nilai dari key KEY_USER_TEREGISTER berupa String */
    public static String getSoal14(Context context){
        return getSharedPreference(context).getString(soal14,"");
    }

    public static void setSoal15(Context context, String jwb15){
        SharedPreferences.Editor editor = getSharedPreference(context).edit();
        editor.putString(soal15, jwb15);
        editor.apply();
    }
    /** Mengembalikan nilai dari key KEY_USER_TEREGISTER berupa String */
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
    /** Mengembalikan nilai dari key KEY_USER_TEREGISTER berupa String */
    public static String getSoal17(Context context){
        return getSharedPreference(context).getString(soal17,"");
    }

    public static void setSoal18(Context context, String jwb18){
        SharedPreferences.Editor editor = getSharedPreference(context).edit();
        editor.putString(soal18, jwb18);
        editor.apply();
    }
    /** Mengembalikan nilai dari key KEY_USER_TEREGISTER berupa String */
    public static String getSoal18(Context context){
        return getSharedPreference(context).getString(soal18,"");
    }

    public static void setSoal19(Context context, String jwb19){
        SharedPreferences.Editor editor = getSharedPreference(context).edit();
        editor.putString(soal19, jwb19);
        editor.apply();
    }
    /** Mengembalikan nilai dari key KEY_USER_TEREGISTER berupa String */
    public static String getSoal19(Context context){
        return getSharedPreference(context).getString(soal19,"");
    }

    public static void setSoal20(Context context, String jwb20){
        SharedPreferences.Editor editor = getSharedPreference(context).edit();
        editor.putString(soal20, jwb20);
        editor.apply();
    }
    /** Mengembalikan nilai dari key KEY_USER_TEREGISTER berupa String */
    public static String getSoal20(Context context){
        return getSharedPreference(context).getString(soal20,"");
    }

//    /** Deklarasi Edit Preferences dan menghapus data, sehingga menjadikannya bernilai default
//     *  khusus data yang memiliki key KEY_USERNAME_SEDANG_LOGIN dan KEY_STATUS_SEDANG_LOGIN */
//    public static void clearLoggedInUser (Context context){
//        SharedPreferences.Editor editor = getSharedPreference(context).edit();
//        editor.remove(KEY_USERNAME_SEDANG_LOGIN);
//        editor.remove(KEY_STATUS_SEDANG_LOGIN);
//        editor.apply();
//    }
}

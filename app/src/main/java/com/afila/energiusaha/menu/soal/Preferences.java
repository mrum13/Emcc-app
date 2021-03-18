package com.afila.energiusaha.menu.soal;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class Preferences {
    /** Pendeklarasian key-data berupa String, untuk sebagai wadah penyimpanan data.
     * Jadi setiap data mempunyai key yang berbeda satu sama lain */
    static final String soal1 ="key1", soal2 ="key2", soal3 ="key3", soal4 ="key4", soal5 ="key5"
            , soal6 ="key6", soal7 ="key7", soal8 ="key8", soal9 ="key9", soal10 ="key10";

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

//    /** Deklarasi Edit Preferences dan mengubah data
//     *  yang memiliki key KEY_PASS_TEREGISTER dengan parameter password */
//    public static void setRegisteredPass(Context context, String password){
//        SharedPreferences.Editor editor = getSharedPreference(context).edit();
//        editor.putString(KEY_PASS_TEREGISTER, password);
//        editor.apply();
//    }
//    /** Mengembalikan nilai dari key KEY_PASS_TEREGISTER berupa String */
//    public static String getRegisteredPass(Context context){
//        return getSharedPreference(context).getString(KEY_PASS_TEREGISTER,"");
//    }
//
//    /** Deklarasi Edit Preferences dan mengubah data
//     *  yang memiliki key KEY_USERNAME_SEDANG_LOGIN dengan parameter username */
//    public static void setLoggedInUser(Context context, String username){
//        SharedPreferences.Editor editor = getSharedPreference(context).edit();
//        editor.putString(KEY_USERNAME_SEDANG_LOGIN, username);
//        editor.apply();
//    }
//    /** Mengembalikan nilai dari key KEY_USERNAME_SEDANG_LOGIN berupa String */
//    public static String getLoggedInUser(Context context){
//        return getSharedPreference(context).getString(KEY_USERNAME_SEDANG_LOGIN,"");
//    }
//
//    /** Deklarasi Edit Preferences dan mengubah data
//     *  yang memiliki key KEY_STATUS_SEDANG_LOGIN dengan parameter status */
//    public static void setLoggedInStatus(Context context, boolean status){
//        SharedPreferences.Editor editor = getSharedPreference(context).edit();
//        editor.putBoolean(KEY_STATUS_SEDANG_LOGIN,status);
//        editor.apply();
//    }
//    /** Mengembalikan nilai dari key KEY_STATUS_SEDANG_LOGIN berupa boolean */
//    public static boolean getLoggedInStatus(Context context){
//        return getSharedPreference(context).getBoolean(KEY_STATUS_SEDANG_LOGIN,false);
//    }
//
//    /** Deklarasi Edit Preferences dan menghapus data, sehingga menjadikannya bernilai default
//     *  khusus data yang memiliki key KEY_USERNAME_SEDANG_LOGIN dan KEY_STATUS_SEDANG_LOGIN */
//    public static void clearLoggedInUser (Context context){
//        SharedPreferences.Editor editor = getSharedPreference(context).edit();
//        editor.remove(KEY_USERNAME_SEDANG_LOGIN);
//        editor.remove(KEY_STATUS_SEDANG_LOGIN);
//        editor.apply();
//    }
}

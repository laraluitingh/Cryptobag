package com.example.cryptobag;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class CoinDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coin_detail);

        FragmentManager myManager1 = getSupportFragmentManager();
        FragmentTransaction myTransaction1 = myManager1.beginTransaction();
        Fragment myFragment1 = new FragmentB();
        myTransaction1.replace(R.id.scroll_view, myFragment1);
        myTransaction1.commit();
    }
}

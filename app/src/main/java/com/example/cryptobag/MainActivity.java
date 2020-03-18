package com.example.cryptobag;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

boolean inwide;


    ArrayList<Coin> coin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ScrollView sv=(ScrollView)findViewById(R.id.scroll_view);

        inwide=findViewById(R.id.scroll_view)!=null;

        if (inwide){
            FragmentManager myManager = getSupportFragmentManager();
            FragmentTransaction myTransaction = myManager.beginTransaction();
            Fragment myFragment = new FragmentA();
            myTransaction.replace(R.id.rv_small, myFragment);
            myTransaction.commit();

            FragmentManager myManager1 = getSupportFragmentManager();
            FragmentTransaction myTransaction1 = myManager1.beginTransaction();
            Fragment myFragment1 = new FragmentB();
            myTransaction1.replace(R.id.scroll_view, myFragment1);
            myTransaction1.commit();

        }else {
            FragmentManager myManager3 = getSupportFragmentManager();
            FragmentTransaction myTransaction3 = myManager3.beginTransaction();
            Fragment myFragment3 = new FragmentA();
            myTransaction3.replace(R.id.rv_small, myFragment3);
            myTransaction3.commit();



        }


    }







    //called when the user click launch button
    private void launchApp() {

        RecyclerView rvCoin = (RecyclerView) findViewById(R.id.rvCoin);

        coin = Coin.getCoins();

        CoinAdapter adapter = new CoinAdapter(coin, (CoinAdapter.OnClickListener) this);

        rvCoin.setAdapter(adapter);
        rvCoin.setLayoutManager(new LinearLayoutManager(this));

    }
    }

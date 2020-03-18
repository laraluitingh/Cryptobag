package com.example.cryptobag;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;

public class FragmentA extends Fragment implements CoinAdapter.OnClickListener {

    ArrayList<Coin> coin;

    private static final String TAG = "FragmentA";

    public FragmentA(){

    }




    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflator,  ViewGroup container, Bundle savedInstance){
      View ret=inflator.inflate(R.layout.fragment_a, container,false);

        RecyclerView rvCoin = (RecyclerView)ret.findViewById(R.id.rvCoin);


        coin = Coin.getCoins();

        CoinAdapter coinadapt=new CoinAdapter(coin, this);


        rvCoin.setAdapter(coinadapt);


        rvCoin.setLayoutManager(new LinearLayoutManager(getActivity()));
        return ret;


    }

    @Override
    public void OnClick(int position) {

        Log.d(TAG, "OnClick: ");
        // Intent myIntent=new Intent(getBaseContext(),CoinDetail.class);
        Intent intent;

        Bundle arguments =new Bundle();
        Coin coin1= coin.get(position);

        arguments.putString("name", coin1.getName());

        arguments.putString("symbol", coin1.getSymbol());

        arguments.putDouble("value", coin1.getValue());

        arguments.putDouble("change1", coin1.getChange1h());

        arguments.putDouble("change24", coin1.getChange34h());

        arguments.putDouble("change7",coin1.getChange7d());

        arguments.putDouble("marketcap", coin1.getMarketcap());

        arguments.putDouble("volumes",coin1.getVolume());


       // arguments.get

        //intent = new Intent(this, CoinDetail.class);
        //intent.putExtra("value1", coin.get(position));
        //startActivity(intent);


    }


    /*
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private  RecyclerView.LayoutManager layoutManager;

     */

    /*

    ArrayList<Coin> coin;

    private static final String TAG = "MainActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        launchApp();

        /*
        RecyclerView rvCoin=(RecyclerView) findViewById(R.id.rvCoin);

        coin=Coin.getCoins();

        CoinAdapter adapter=new CoinAdapter(coin);

        rvCoin.setAdapter(adapter);
        rvCoin.setLayoutManager(new LinearLayoutManager(this));


         */

//}






    //called when the user click launch button

    /*
    private void launchApp(){

        RecyclerView rvCoin=(RecyclerView) findViewById(R.id.rvCoin);

        coin=Coin.getCoins();

        CoinAdapter adapter=new CoinAdapter(coin,this);

        rvCoin.setAdapter(adapter);
        rvCoin.setLayoutManager(new LinearLayoutManager(this));
        /*
     //do something in response to the button
        Button button= (Button) findViewById(R.id.button);
      button.setOnClickListener(new View.OnClickListener(){
        @Override
          public void onClick(View view){
             Intent myIntent=new Intent(getBaseContext(),CoinDetail.class);

             String n="Bitcoin";

             //myIntent.putExtra("value1",n);




           Coin coin=Coin.searchCoin(n);



           myIntent.putExtra("value1", coin);

         */

           /*

             myIntent.putExtra("value2", Coin.searchCoin(n).getSymbol());

             String symbol= Double.toString(Coin.searchCoin(n).getValue());

                     myIntent.putExtra("value3", symbol);

                     String change1=Double.toString(Coin.searchCoin(n).getChange1h());

                     myIntent.putExtra("value4", change1);

                     String change34=Double.toString(Coin.searchCoin(n).getChange34h());

                     myIntent.putExtra("value5", change34 );

                     String change7=Double.toString(Coin.searchCoin(n).getChange7d());

                     myIntent.putExtra("value6", change7);

                     String mc=Double.toString(Coin.searchCoin(n).getMarketcap());

                     myIntent.putExtra("value7", mc);

                     String v=Double.toString(Coin.searchCoin(n).getVolume());

                     myIntent.putExtra("value8", v);








             /*
             myIntent.putExtra("value2","BTC" );
             myIntent.putExtra("value3" , "8662.99");
             myIntent.putExtra("value4", "-5.30");
             myIntent.putExtra("value5", "0.06");
             myIntent.putExtra("value6", "6.25");
             myIntent.putExtra("value7", "157394075212.34");
             myIntent.putExtra("value8", "26248451879.217194");

              */

        //startActivity(myIntent);

        //startActivity(new Intent(MainActivity.this, hello2.class));
        //  }
        // });

    //}



    /*
    @Override
    public void OnClick(int position) {
        Log.d(TAG, "OnClick: ");
        // Intent myIntent=new Intent(getBaseContext(),CoinDetail.class);
        Intent intent=new Intent(this, FragmentB.class);
        intent.putExtra("value1", coin.get(position));
        startActivity(intent);
    }

     */
}


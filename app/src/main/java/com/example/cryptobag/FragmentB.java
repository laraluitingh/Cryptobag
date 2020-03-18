package com.example.cryptobag;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class FragmentB extends Fragment {

    private static final String TAG = "CoinDetail";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v=inflater.inflate(R.layout.fragment_b, container, false);

        Log.d(TAG, "onCreate: ");

        //TextView myText1 = (TextView) myText1.findViewById();

        //myText1.setText(coin1.getName());

        TextView myText1 = v.findViewById(R.id.Coin);
        String name= getArguments().getString("name", null);
        myText1.setText(name);

        TextView myText2 = v.findViewById(R.id.symbol);
        String sym= getArguments().getString("symbol", null);
        myText2.setText(sym);

        TextView myText3 = v.findViewById(R.id.valuead);
        String val= getArguments().getString("value", null);
        myText3.setText(val);

        TextView myText4 = v.findViewById(R.id.valuead);
        String c1= getArguments().getString("change1", null);
        myText4.setText(c1);

        TextView myText5 = v.findViewById(R.id.valuead);
        String c24= getArguments().getString("change24", null);
        myText5.setText(c24);

        TextView myText6 = v.findViewById(R.id.valuead);
        String c7= getArguments().getString("change7", null);
        myText6.setText(c7);

        TextView myText7 = v.findViewById(R.id.valuead);
        String mc= getArguments().getString("marketcap", null);
        myText7.setText(mc);

        TextView myText8 = v.findViewById(R.id.valuead);
        String vol= getArguments().getString("volumes", null);
        myText8.setText(vol);





        return v;
    }





    public void browser(View view) {

       TextView myText1 = view.findViewById(R.id.Coin);
        String text1= (String) myText1.getText();

        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q="+text1+"&oq="+text1+"&aqs=chrome..69i57j0l7.2404j1j7&sourceid=chrome&ie=UTF-8"));

        startActivity(browserIntent);
    }

}


package com.example.cryptobag;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CoinAdapter extends RecyclerView.Adapter<CoinAdapter.ViewHolder> {

    private OnClickListener cOnCklickListner;

    public interface OnClickListener {
        void OnClick(int position);
    }


    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        public TextView coinName;
        public TextView value;
        public TextView change1;
        OnClickListener onClickListener;

        public ViewHolder(View itemView, OnClickListener onClickListener){

            super(itemView);

            coinName=(TextView) itemView.findViewById(R.id.coinname);
            value=(TextView) itemView.findViewById(R.id.valuead);
            change1=(TextView) itemView.findViewById(R.id.changead);
            this.onClickListener=onClickListener;
            itemView.setOnClickListener(this);

        }



        @Override
        public void onClick(View v) {
            onClickListener.OnClick(getAdapterPosition());
        }
    }

    private List<Coin> mCoins;

    public  CoinAdapter(List<Coin> coins, OnClickListener mOnClickListner){
        mCoins=coins;
        this.cOnCklickListner=mOnClickListner;

    }

    @Override
    public CoinAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View coinView = inflater.inflate(R.layout.coin_list_item, parent, false);

        // Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(coinView, cOnCklickListner);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CoinAdapter.ViewHolder viewHolder, int position) {
        // Get the data model based on position
        Coin coin = mCoins.get(position);

        // Set item views based on your views and data model
        TextView textView = viewHolder.coinName;
        textView.setText(coin.getName());

        TextView textView2 = viewHolder.value;
        textView2.setText(Double.toString(coin.getValue()));

        TextView textView3= viewHolder.change1;
        textView3.setText(Double.toString(coin.getChange1h()));
        /*
        Button button = viewHolder.messageButton;
        button.setText(contact.isOnline() ? "Message" : "Offline");
        button.setEnabled(contact.isOnline());

         */
    }


    @Override
    public int getItemCount() {
        return mCoins.size();
    }


}

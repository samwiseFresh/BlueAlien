package com.samwise.bluealien.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.samwise.bluealien.R;

/**
 * Created by Samwise on 2/27/2016.
 */
public class CardAdapter extends RecyclerView.Adapter {

    private String[] cardArray =  {"zero", "one", "two", "three", "four"};
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View cardView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view, parent,false);
        return new CardViewHolder(cardView);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        CardViewHolder cardViewHolder = (CardViewHolder) holder;
        String title = cardArray[position];
        cardViewHolder.titleTextView.setText(title);

    }

    @Override
    public int getItemCount() {
        return cardArray.length;
    }

    public static class CardViewHolder extends RecyclerView.ViewHolder{

        TextView titleTextView;

        public CardViewHolder(View itemView) {
            super(itemView);

            titleTextView = (TextView) itemView.findViewById(R.id.title);
        }
    }
}

package com.example.povio.istra;


import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.InfoViewHolder> {
    Context mContext;
    public static class InfoViewHolder extends RecyclerView.ViewHolder
            implements View.OnClickListener{

        private View.OnClickListener clickListener;
        CardView cv;
        ImageView background;
        TextView price;
        TextView name;
        TextView description;
        TextView rooms;
        TextView beds;
        Button more;

        InfoViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            background = (ImageView) itemView.findViewById(R.id.background);
            price = (TextView) itemView.findViewById(R.id.price);
            name = (TextView) itemView.findViewById(R.id.todo);
            description = (TextView) itemView.findViewById(R.id.type);
            rooms = (TextView) itemView.findViewById(R.id.roomAmount);
            beds = (TextView) itemView.findViewById(R.id.bedAmount);
            more = (Button) itemView.findViewById(R.id.button);
          }

        @Override
        public void onClick(View v) {
            //clickListener.onClick(v);
        }
    }

    List<Data> data;

    public RVAdapter(List<Data> data, Context ctx){
        this.data = data;
        this.mContext = ctx;
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public InfoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view, parent, false);
        return new InfoViewHolder(v);
    }

    @Override
    public void onBindViewHolder(InfoViewHolder holder, int position) {
        /**
        //TODO use getters instead of .back*** etc..
        */
        holder.background.setImageResource(data.get(position).getBackground());
        holder.price.setText(data.get(position).price);
        holder.name.setText(data.get(position).name);
        holder.description.setText(data.get(position).description);
        holder.rooms.setText(data.get(position).rooms);
        holder.beds.setText(data.get(position).beds);
        holder.more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, MoreInfo.class);
                mContext.startActivity(intent);
                Toast.makeText(mContext, "Add new Activity", Toast.LENGTH_SHORT).show();
            }
        });
        /**
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mContext, "Thing has been pressed", Toast.LENGTH_SHORT).show();
            }
        });*/
    }

    @Override
    public int getItemCount() {
        return data.size();
    }



}

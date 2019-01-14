package com.example.ibraheem.recyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView title;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
        }
    }

    private Context context;
    private List<News> newsList;

    public Adapter(Context c , List<News> list){
        this.context = c;
        newsList = list;
    }


    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        //LayoutInflater.from(context).inflate(R.layout.list_item_news,viewGroup,false);
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.list_item_news,viewGroup,false));
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder viewHolder, int i) {
        News n = newsList.get(i);
        viewHolder.title.setText(n.getTitle());
    }

    @Override
    public int getItemCount() {
        return newsList.size();
    }
}

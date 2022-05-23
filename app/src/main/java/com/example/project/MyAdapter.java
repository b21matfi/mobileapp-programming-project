package com.example.project;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<ViewHolder> {
    private List<Items> Itemlist;
    public MyAdapter(List<Items> Itemlist) {
        this.Itemlist = Itemlist;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.Id.setText(Itemlist.get(position).getName());
        holder.Login.setText(Itemlist.get(position).getName());
        holder.Location.setText(Itemlist.get(position).getName());
        holder.Size.setText(Itemlist.get(position).getName());
        holder.AuxData.setText(Itemlist.get(position).getName());
        holder.Name.setText(Itemlist.get(position).getName());
        holder.Company.setText(Itemlist.get(position).getName());
        holder.Cost.setText(Itemlist.get(position).getName());
        holder.Category.setText(Itemlist.get(position).getName());

    }

    @Override
    public int getItemCount() {
        return Itemlist.size();
    }
}

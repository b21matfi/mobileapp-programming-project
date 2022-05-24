package com.example.project;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<ViewHolder> {
    private List<Items> itemsList;
    public MyAdapter(List<Items> itemsList) {
        this.itemsList = itemsList;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.Id.setText(itemsList.get(position).getName());
        holder.Login.setText(itemsList.get(position).getName());
        holder.Location.setText(itemsList.get(position).getName());
        holder.Size.setText(Integer.valueOf(itemsList.get(position).getSize()));
        holder.AuxData.setText(itemsList.get(position).getName());
        holder.Name.setText(itemsList.get(position).getName());
        holder.Company.setText(itemsList.get(position).getName());
        holder.Cost.setText(Integer.valueOf(itemsList.get(position).getSize()));

        holder.Category.setText(itemsList.get(position).getName());

    }

    @Override
    public int getItemCount() {
        return itemsList.size();

    }

    public void setitemslist(List<Items> items) {
        this.itemsList = items;
    }
}

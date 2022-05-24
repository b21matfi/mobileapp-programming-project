package com.example.project;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {
    public TextView id;
    public TextView name;
    public TextView com;
    public TextView category;



    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        id = itemView.findViewById(R.id.id_view);
        name = itemView.findViewById(R.id.name_view);
        com = itemView.findViewById(R.id.company_view);
        category = itemView.findViewById(R.id.category_view);

    }
}

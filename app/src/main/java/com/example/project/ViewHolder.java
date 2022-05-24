package com.example.project;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {
    public TextView Id;
    public TextView Name;
    public TextView Company;
    public TextView Category;



    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        Id = itemView.findViewById(R.id.id_view);
        Name = itemView.findViewById(R.id.name_view);
        Company = itemView.findViewById(R.id.company_view);
        Category = itemView.findViewById(R.id.category_view);

    }
}

package com.example.project;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {
    public TextView Id;
    public TextView Login;
    public TextView Location;
    public TextView Size;
    public TextView AuxData;
    public TextView Name;
    public TextView Company;
    public TextView Category;


    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        Id = itemView.findViewById(R.id.id_view);
        Login = itemView.findViewById(R.id.login_view);
        Location = itemView.findViewById(R.id.location_view);
        Size = itemView.findViewById(R.id.size_view);
        AuxData = itemView.findViewById(R.id.auxdata_view);
        Name = itemView.findViewById(R.id.name_view);
        Company = itemView.findViewById(R.id.company_view);
        Category = itemView.findViewById(R.id.category_view);
    }
}

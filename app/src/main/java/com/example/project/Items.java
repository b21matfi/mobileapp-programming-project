package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Items extends AppCompatActivity {
    public String Id;
    public String Login;
    public String Size;
    public String Location;
    public String AuxData;
    public String Name;
    public String Company;
    public String Cost;
    public String Category;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String login) {
        Login = login;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String size) {
        Size = size;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getAuxData() {
        return AuxData;
    }

    public void setAuxData(String auxData) {
        AuxData = auxData;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCompany() {
        return Company;
    }

    public void setCompany(String company) {
        Company = company;
    }

    public String getCost() {
        return Cost;
    }

    public void setCost(String cost) {
        Cost = cost;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }
}
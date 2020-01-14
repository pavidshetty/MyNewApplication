package com.example.mynewapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Main2ActivityHomepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2_homepage);
    }
    public void addbutton(View view) {
        Intent intent=new Intent(this,Additems.class);
        startActivity(intent);

    }
    public void searchclothing(View view) {
        Intent intent=new Intent(this,Clothing.class);
        startActivity(intent);

    }

    public void addtoys(View view) {
        Intent intent = new Intent(this, Toys.class);
        startActivity(intent);

    }
}

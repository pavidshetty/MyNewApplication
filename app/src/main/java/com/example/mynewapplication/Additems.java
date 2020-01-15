package com.example.mynewapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.os.Bundle;

public class Additems extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_additems);
        this.setTitle("Post Items");
    }

    public void clickpost(View view) {
        Intent intent = new Intent(this, ViewPostItem.class);
        startActivity(intent);

    }
}

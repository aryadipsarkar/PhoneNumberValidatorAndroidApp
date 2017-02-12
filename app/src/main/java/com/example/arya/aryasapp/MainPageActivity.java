package com.example.arya.aryasapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

    }
    public void openPhoneApp(View view){
        Intent explicit=new Intent(this,PhonePageActivity.class);
        startActivity(explicit);
    }

    public void openDocApp(View view){
        String URL="https://developer.android.com/index.html";
        Intent implicit=new Intent(Intent.ACTION_VIEW);
        implicit.setData(Uri.parse(URL));
        startActivity(implicit);
    }
}

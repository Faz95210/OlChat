package com.bedidi.fawzi.olchat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Calling_Video_Screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calling_video_screen);
    }

    public void hangUp()
    {
        Intent ContactPage = new Intent(getApplicationContext(), Contact_page.class);
        startActivity(ContactPage);
    }

    public void hangUp(View view) {
    }
}
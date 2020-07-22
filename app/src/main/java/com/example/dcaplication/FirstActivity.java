package com.example.dcaplication;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;


public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

    }

    public void likeIt(View view)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.hero01_link)));
        startActivity(intent);
    }
}

package com.example.dcaplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void likeIt(View view)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcTjroQr2OgdBrL2chv4nrOnzMDsMG3yYyG_mQ&usqp=CAU"));
        startActivity(intent);
    }
}

package com.example.dcaplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.transition.Slide;
import android.util.Pair;
import android.view.Gravity;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    CardView cardViews[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cardViews=new CardView[4];
        cardViews[0] = (CardView) findViewById(R.id.card_hero01);
        cardViews[1] = (CardView) findViewById(R.id.card_hero02);
        cardViews[2] = (CardView) findViewById(R.id.card_hero03);
        cardViews[3] = (CardView) findViewById(R.id.card_hero04);
        getWindow().setExitTransition(new Slide(Gravity.RIGHT));
        for(int i = 0;i<cardViews.length;i++)
        {
            cardViews[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    cardClick(view.getId());
                }
                });
        }

    }

    public void cardClick(int id)
    {
        int i = 0;
        Intent intent = new Intent();
        switch (id)
        {
            case R.id.card_hero01:
                intent.setClass(this,FirstActivity.class);
                i=0;
                break;
            case R.id.card_hero02:
                intent.setClass(this,SecondActivity.class);
                i=1;
                break;
            case R.id.card_hero03:
                intent.setClass(this,ThirdActivity.class);
                i=2;
                break;
            case R.id.card_hero04:
                intent.setClass(this,FourthActivity.class);
                i=3;
                break;

        }
        LinearLayout container = (LinearLayout)cardViews[i].getChildAt(1);

        ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(this);


        startActivity(intent,options.toBundle());
    }

}

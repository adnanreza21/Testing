package com.small.testing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private CardView Card1,Card2,Card3,Card4,Card5,Card6,Card7,Card8,Card9,Card10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Card1 = (CardView) findViewById(R.id.card1);
        Card2 = (CardView) findViewById(R.id.card2);
        Card3 = (CardView) findViewById(R.id.card3);
        Card4 = (CardView) findViewById(R.id.card4);
        Card5 = (CardView) findViewById(R.id.card5);
        Card6 = (CardView) findViewById(R.id.card6);
        Card7 = (CardView) findViewById(R.id.card7);
        Card8 = (CardView) findViewById(R.id.card8);
        Card9 = (CardView) findViewById(R.id.card9);
        Card10 = (CardView) findViewById(R.id.card10);

        Card1.setOnClickListener(this);
        Card2.setOnClickListener(this);
        Card3.setOnClickListener(this);
        Card4.setOnClickListener(this);
        Card5.setOnClickListener(this);
        Card6.setOnClickListener(this);
        Card7.setOnClickListener(this);
        Card8.setOnClickListener(this);
        Card9.setOnClickListener(this);
        Card10.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i ;

        switch (v.getId()){

            case R.id.card1 : i = new Intent(this,StudyActivity.class);startActivity(i);break;
            case R.id.card2 : i = new Intent(this,StudyActivity.class);startActivity(i);break;
            case R.id.card3 : i = new Intent(this,EatActivity.class);startActivity(i);break;
            case R.id.card4 : i = new Intent(this,EatActivity.class);startActivity(i);break;
            case R.id.card5 : i = new Intent(this,BathActivity.class);startActivity(i);break;
            case R.id.card6 : i = new Intent(this,BathActivity.class);startActivity(i);break;
            case R.id.card7 : i = new Intent(this,SchoolActivity.class);startActivity(i);break;
            case R.id.card8 : i = new Intent(this,SchoolActivity.class);startActivity(i);break;
            case R.id.card9 : i = new Intent(this,ExitActivity.class);startActivity(i);break;
            case R.id.card10 : i = new Intent(this,ExitActivity.class);startActivity(i);break;

            default:break;
        }

    }
}

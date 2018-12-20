package com.example.ritteshpv.DashBoard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView andro, pyth, webscript, cybercell;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        andro = findViewById(R.id.AndroCard);
        pyth = findViewById(R.id.pythCard);
        webscript = findViewById(R.id.webCard);
        cybercell = findViewById(R.id.CyberCard);

        andro.setOnClickListener(this);
        pyth.setOnClickListener(this);
        webscript.setOnClickListener(this);
        cybercell.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        Intent expandCard;
        switch (v.getId())
        {
            case R.id.AndroCard: expandCard=new Intent(MainActivity.this,Andro.class);
                                 startActivity(expandCard);
                                 break;
            case R.id.pythCard: expandCard=new Intent(this,Pyth.class);
                                startActivity(expandCard);
                                break;
            case R.id.webCard: expandCard=new Intent(this,Web.class);
                               startActivity(expandCard);
                               break;
            case R.id.CyberCard: expandCard=new Intent(this,cyber.class);
                                 startActivity(expandCard);
                                 break;
        }
    }
}

package com.yusuf.latihanintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button kamar;
    Button kamarmandi;
    Button gudang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        kamar = (Button)findViewById(R.id.kamar);
        kamar.setOnClickListener(this);
        kamarmandi = (Button)findViewById(R.id.kamarmandi);
        kamarmandi.setOnClickListener(this);
        gudang = (Button)findViewById(R.id.gudang);
        gudang.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.kamar:
                Intent kamar = new Intent (MainActivity.this,Kamar.class);
                startActivity(kamar);
                break;
            case R.id.kamarmandi:
                Intent kamarmandi = new Intent (MainActivity.this,KamarMandi.class);
                startActivity(kamarmandi);
                break;
            case R.id.gudang:
                Intent gudang = new Intent (MainActivity.this,Gudang.class);
                startActivity(gudang);
                break;
            default:
                break;

        }

    }
}
package com.example.unite4_kararvedongu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnUyg1Goster(View view) {
        Intent i = new Intent(MainActivity.this, Uyg1Activity.class);
        startActivity(i);
    }

    public void btnUyg2Goster(View view) {
        Intent i = new Intent(MainActivity.this, Uyg2Activity.class);
        startActivity(i);
    }

    public void btnUyg3Goster(View view) {
        Intent a = new Intent(MainActivity.this, Uyg3Activity.class);
        startActivity(a);
    }

    public void btnUyg4Goster(View view) {
        Intent a = new Intent(MainActivity.this, Uyg4Activity.class);
        startActivity(a);
    }

    public void btnUyg5Goster(View view) {
        Intent a = new Intent(MainActivity.this, Uyg5Activity.class);
        startActivity(a);
    }
    public void GoldSoru1Goster(View view) {
        Intent a = new Intent(MainActivity.this, GoldSoru1Activity.class);
        startActivity(a);
    }
    public void GoldSoru2Goster(View view) {
        Intent a = new Intent(MainActivity.this, GoldSoru2Activity.class);
        startActivity(a);
    }
}
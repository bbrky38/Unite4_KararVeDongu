package com.example.unite4_kararvedongu;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg4Activity extends AppCompatActivity {
    Switch swkonum,swkonumG,swKonumA;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg4_activity);
        swkonum = findViewById(R.id.swKonum);
        swkonumG = findViewById(R.id.swKonumG);
        swKonumA = findViewById(R.id.swKonumA);

        if (swkonum.isChecked())
        {
            swkonumG.setVisibility(View.VISIBLE);
            swKonumA.setVisibility(View.VISIBLE);
        }
        else
        {
            swKonumA.setVisibility(View.GONE);
            swkonumG.setVisibility(View.GONE);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        swkonum.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (swkonum.isChecked()){
                    swkonumG.setVisibility(View.VISIBLE);
                    swKonumA.setVisibility(View.VISIBLE);
                }
                else {
                    swkonumG.setVisibility(View.GONE);
                    swKonumA.setVisibility(View.GONE);
                }


            }
        });
    }
    public void onayla(View view) {
        if (!swkonum.isChecked())
        {
            Toast.makeText(this, "Konum Servisleri Kapalı.", Toast.LENGTH_SHORT).show();
        }else{
            
            if (swKonumA.isChecked()==true && swkonumG.isChecked()==true){
                Toast.makeText(this, "Konumu Al Açık Ve Konum Gönder Açık", Toast.LENGTH_SHORT).show();
        }
            if (swKonumA.isChecked()==true && swkonumG.isChecked()==false){
                Toast.makeText(this, "Konum Al Açık Konum Gönder Kapalı", Toast.LENGTH_SHORT).show();
            }
            if (swKonumA.isChecked()==false && swkonumG.isChecked()==true) {
                Toast.makeText(this, "Konum Al Kapalı Konum Gönder Açık", Toast.LENGTH_SHORT).show();
            }
            if (swKonumA.isChecked()==false && swkonumG.isChecked()==false){
                Toast.makeText(this, "Konum Al Ve Konum Gönder Kapalı", Toast.LENGTH_SHORT).show();

             }
        }
    }
}

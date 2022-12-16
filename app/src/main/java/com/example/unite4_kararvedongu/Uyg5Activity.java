package com.example.unite4_kararvedongu;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg5Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg5_activity);
        EditText txt1= findViewById(R.id.editTxt);
        EditText txt2= findViewById(R.id.editTxt2);
        EditText txt3= findViewById(R.id.editTxt3);
        Button btn= findViewById(R.id.btnOnayla);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int ortalama = (Integer.parseInt(txt1.getText().toString()) + Integer.parseInt(txt2.getText().toString()) + Integer.parseInt(txt3.getText().toString())) / 3;
                if(ortalama < 25)
                {
                    Toast.makeText(Uyg5Activity.this, "Ortalamanız 0 ile kaldınız.", Toast.LENGTH_SHORT).show();
                }
                else if(ortalama < 50)
                {
                    Toast.makeText(Uyg5Activity.this, "Ortalamanız 1 ile Kaldınız", Toast.LENGTH_SHORT).show();
                }
                else if(ortalama < 60)
                {
                    Toast.makeText(Uyg5Activity.this, "Ortalamanız 2 ile Geçtiniz", Toast.LENGTH_SHORT).show();
                }
                else if (ortalama < 70)
                {
                    Toast.makeText(Uyg5Activity.this, "Ortalamanız 3 ile Geçtiniz", Toast.LENGTH_SHORT).show();
                }
                else if (ortalama < 85)
                {
                    Toast.makeText(Uyg5Activity.this, "Ortalamanız 4 ile Geçtiniz", Toast.LENGTH_SHORT).show();
                }
                else if (ortalama <= 100)
                {
                    Toast.makeText(Uyg5Activity.this, "Ortalamanız 5 ile Geçtiniz", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(Uyg5Activity.this, "Adam Akıllı Sayı Gir LAN!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

package com.example.unite4_kararvedongu;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg3Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.uyg3_activity);
        String user = "MehmetÇoban";
        String pass = "12345";

        Button btn = findViewById(R.id.btnOnayla);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText txt1 = findViewById(R.id.editTxt1);
                EditText txt2 = findViewById(R.id.editTxt2);
                if (user.equals(txt1.getText().toString()) && pass.equals(txt2.getText().toString()))
                {
                    Toast.makeText(Uyg3Activity.this, "Giriş Yaptınız.", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(Uyg3Activity.this, "Giriş Yapamadınız.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

package com.example.unite4_kararvedongu;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class GoldSoru2Activity extends AppCompatActivity {
    EditText txtSayi, txtTekSayi, txtCiftSayi;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.goldsoru2_activity);

        txtSayi = findViewById(R.id.txtSayi);
        txtTekSayi = findViewById(R.id.txtTekSayilar);
        txtCiftSayi = findViewById(R.id.txtCiftSayilar);
    }

    public void btnSuccess(View view) {
        int number = Integer.parseInt(txtSayi.getText().toString());
        String tekSayilar = "";
        String ciftSayilar = "";

        txtTekSayi.setText("");
        txtCiftSayi.setText("");

        int tekT = 0;
        int ciftT = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                tekT = tekT + i;
                ciftSayilar += ciftSayilar + "\n";
            } else {
                ciftT = ciftT + i;
                tekSayilar += tekSayilar + "\n";
            }
        }

        txtTekSayi.setText(tekSayilar);
        txtCiftSayi.setText(ciftSayilar);
    }
}

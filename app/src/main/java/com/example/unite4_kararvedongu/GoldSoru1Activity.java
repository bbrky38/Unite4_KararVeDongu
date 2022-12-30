package com.example.unite4_kararvedongu;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class GoldSoru1Activity extends AppCompatActivity {
    TextView txtResult;
    EditText txtNumber;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.goldsoru1_activity);

        txtNumber = findViewById(R.id.txtSayi);
        txtResult = findViewById(R.id.txtResult);
    }
    public void btnHesapla(View view) {
        int number = Integer.parseInt(txtNumber.getText().toString());
        String result = "";
        txtResult.setText("");
        for (int i = 1; i <= 10; i++) result += number + " x " + i + "=" + number * i + "\n";
        txtResult.setText(result);
    }
    //BekoBaba//
}

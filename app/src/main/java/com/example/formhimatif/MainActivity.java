
package com.example.formhimatif;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.app.AlertDialog;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etNama, etNim, etAngkatan, etJabatan, etEmail;
    Button btnSimpan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showPopupColor();

        etNama = findViewById(R.id.etNama);
        etNim = findViewById(R.id.etNim);
        etAngkatan = findViewById(R.id.etAngkatan);
        etJabatan = findViewById(R.id.etJabatan);
        etEmail = findViewById(R.id.etEmail);
        btnSimpan = findViewById(R.id.btnSimpan);

        btnSimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = "Nama: " + etNama.getText().toString() +
                              "\nNIM: " + etNim.getText().toString() +
                              "\nAngkatan: " + etAngkatan.getText().toString() +
                              "\nJabatan: " + etJabatan.getText().toString() +
                              "\nEmail: " + etEmail.getText().toString();

                Toast.makeText(MainActivity.this, "Data Disimpan:\n" + data, Toast.LENGTH_LONG).show();
            }
        });
    }

    private void showPopupColor() {
        new AlertDialog.Builder(this)
            .setTitle("Selamat Datang")
            .setMessage("Aplikasi Input Data Mahasiswa HIMATIF\nUniversitas Tidar")
            .setPositiveButton("OK", null)
            .show();
    }
}

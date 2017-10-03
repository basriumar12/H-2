package com.blogbasbas.bealajardari02;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class IntroActivity extends AppCompatActivity {

    //deklarasi variabel
    EditText edtIntro;
    Button btnIntro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        //inisialisasi id dari layout ada 2 widget
        edtIntro = (EditText) findViewById(R.id.introId);
        btnIntro = (Button) findViewById(R.id.btnIntro);

        //buat button ada event klik
        btnIntro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //buat string untuk mendapatkan data dari editext/ inputan
                String edt = edtIntro.getText().toString();

                //buat kondisi
                if (edt.isEmpty()){
                    edtIntro.setError("Data Tidak Bisa Kosong");
                } else {
                    //implementasi intent, panggil kelas Intent, objek intent
                    Intent kirimData = new Intent(IntroActivity.this,
                            MainActivity.class);
                    //mengirim data dengan key "nama"
                    kirimData.putExtra("nama", edt);
                    //setiap penggunaan intgent harus di pakai satar activity
                    startActivity(kirimData);
                    //finish utk mengakhiri activity
                    finish();

                }
            }
        });

    }
}

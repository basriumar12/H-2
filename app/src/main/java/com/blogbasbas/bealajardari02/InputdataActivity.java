package com.blogbasbas.bealajardari02;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class InputdataActivity extends AppCompatActivity {


    //deklarasi variebel
    EditText edtInputData;

    Button btnInputData;

    TextView txtInputData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inputdata);
        //inisialisasi
        edtInputData = (EditText) findViewById(R.id.edtInputData);
        txtInputData = (TextView)findViewById(R.id.txtInputData);
        btnInputData = (Button) findViewById(R.id.btnInputData);

        //berikan event pada button input data
        btnInputData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //buat string unutk menangkap inputan dan mengubahnya ke data String
                String edtInput = edtInputData.getText().toString();

                //kondisi jika data kosong akan ada pesan errror
                if (edtInput.isEmpty()){
                    edtInputData.setError("Data Harus di Isi");
                } else {
                    //toast untuk menampilkan data berhasil
                    Toast.makeText(InputdataActivity.this, "succses !!", Toast.LENGTH_SHORT).show();
                    //data inputan di set pada text view
                    txtInputData.setText(edtInput);
                }

            }
        });


    }
}

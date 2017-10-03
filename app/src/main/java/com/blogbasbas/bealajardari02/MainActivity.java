package com.blogbasbas.bealajardari02;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //deklarasi variabel untuk setiap widgetnya
    TextView txtNama;

    Button btnToast;

    Button btnInput;

    Button btnalert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       //inisialisasi setiap id yang ada di layout

        txtNama = (TextView) findViewById(R.id.txtNama);
        btnToast = (Button) findViewById(R.id.btnToast);
        btnInput =(Button) findViewById(R.id.btnInput);
        btnalert = (Button) findViewById(R.id.btnalert);
        //buat get intent untuk menangkap kiriman intent dari IntroActivity
        Intent getData = getIntent();
        txtNama.setText(getData.getStringExtra("nama"));

        //buat event klik pada button toast
        btnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Ini Event Toast", Toast.LENGTH_SHORT).show();
            }
        });

        //buat event btnalert
        btnalert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);

                //icon untuk alert
                alert.setIcon(R.mipmap.ic_launcher);
                // judul alert
                alert.setTitle("INI CONTOH ALERT");
                //pesan pada alert
                alert.setMessage("isikan isi pesan alert apa aja ya ?");

                //buat alert button ok
                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        });
                //jangan lupa alert di show
                alert.show();


            }




                });

            //buat evnt pada btn input
        btnInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //berikan intent ke activity lain
                //sebelumnya buat activity baru, namanya InputdataActivity
                startActivity(new Intent(MainActivity.this, InputdataActivity.class));
            }
        });





    }


}

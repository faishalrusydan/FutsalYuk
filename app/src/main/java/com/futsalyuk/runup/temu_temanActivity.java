package com.futsalyuk.runup;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.futsalyuk.runup.futsalyuk.R;

public class temu_temanActivity extends AppCompatActivity {

    private Button mNextnext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temu_teman);

        mNextnext = findViewById(R.id.nextnext);
        mNextnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(temu_temanActivity.this, pilih_tempat.class));
            }
        });
    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setTitle("Really Exit?")
                .setMessage("Apa anda serius akan meninggalkan game?")
                .setNegativeButton(android.R.string.no, null)
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface arg0, int arg1) {
                        temu_temanActivity.super.onBackPressed();
                        startActivity(new Intent(temu_temanActivity.this, embo.class));
                    }
                }).create().show();
    }
}

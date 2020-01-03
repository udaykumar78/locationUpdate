package com.google.android.gms.location.sample.locationupdates;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Main2 extends AppCompatActivity {
    private Button b12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start);
        b12=(Button)findViewById(R.id.button);
    }
    public void clicked(View view){
        System.out.println("sdfkm");
        startActivity(new Intent(Main2.this,Main3.class));
    }

}

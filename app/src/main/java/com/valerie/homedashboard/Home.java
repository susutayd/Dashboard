package com.valerie.homedashboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void bank_activities(View view) {
        Toast.makeText(this, "bank activities", Toast.LENGTH_SHORT).show();
    }

    public void links(View view) {

        Toast.makeText(this, "links linked", Toast.LENGTH_SHORT).show();

    }
}

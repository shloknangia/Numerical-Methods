package com.example.android.numericalmethods;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class infolagrange extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infolagrange);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextView infolagrangetv1 = (TextView)findViewById(R.id.infolagrangetv1);
        TextView infolagrangetv2 = (TextView)findViewById(R.id.infolagrangetv2);
        TextView infolagrangetv3 = (TextView)findViewById(R.id.infolagrangetv3);
        infolagrangetv1.setTextSize(30);
        infolagrangetv1.setText("About the method:\n");
        infolagrangetv2.setTextSize(20);
        infolagrangetv2.setText("In numerical analysis, Lagrange polynomials are used for polynomial interpolation. For a given set of distinct points and numbers , the Lagrange polynomial is the polynomial of the least degree that at each point assumes the corresponding value (i.e. the functions coincide at each point).");
        infolagrangetv3.setTextSize(20);
        infolagrangetv3.setText("\n" +
                "INPUT –\n" +
                "\t\t-data(values of X and Y)\n" +
                "-value of X for which we want Y\n" +
                "OUTPUT – \n" +
                "\t\t-we get the value for Y for X by newton’s interpolation\n");

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setImageResource(R.drawable.ic_action_name2);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(infolagrange.this,help.class);
                startActivity(i);
            }
        });
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();


        if(id == android.R.id.home) {
            this.finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

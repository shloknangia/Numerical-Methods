package com.example.android.numericalmethods;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class infotrapezoidal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infotrapezoidal);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextView infotrapezoidaltv1 = (TextView)findViewById(R.id.infotrapezoidaltv1);
        TextView infotrapezoidaltv2 = (TextView)findViewById(R.id.infotrapezoidaltv2);
        TextView infotrapezoidaltv3 = (TextView)findViewById(R.id.infotrapezoidaltv3);
        infotrapezoidaltv1.setTextSize(30);
        infotrapezoidaltv1.setText("About the method:\n");
        infotrapezoidaltv2.setTextSize(20);
        infotrapezoidaltv2.setText("In mathematics, and more specifically in numerical analysis, the trapezoidal rule (also known as the trapezoid rule or trapezium rule) is a technique for approximating the definite integral.");
        infotrapezoidaltv3.setTextSize(20);
        infotrapezoidaltv3.setText("INPUT –\n" +
                "-a and b are the lower and upper limit \n" +
                "-n is the number if subintervals\n" +
                "OUTPUT – \n" +
                "-we get the value of integration of the function\n");

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setImageResource(R.drawable.ic_action_name2);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(infotrapezoidal.this,help.class);
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

package com.example.android.numericalmethods;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class infosimpson extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infosimpson);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextView infosimpsontv1 = (TextView)findViewById(R.id.infosimpsontv1);
        TextView infosimpsontv2 = (TextView)findViewById(R.id.infosimpsontv2);
        TextView infosimpsontv3 = (TextView)findViewById(R.id.infosimpsontv3);
        infosimpsontv1.setTextSize(30);
        infosimpsontv1.setText("About the method:\n");
        infosimpsontv2.setTextSize(20);
        infosimpsontv2.setText(" In numerical analysis, Simpson's rule is a method for numerical integration, the numerical approximation of definite integrals. Specifically, it is the following approximation:");
        infosimpsontv3.setTextSize(20);
        infosimpsontv3.setText("INPUT –\n" +
                "-a and b are the lower and upper limit \n" +
                "-n is the number if subintervals\n" +
                "OUTPUT – \n" +
                "-we get the value of integration of the function\n");

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setImageResource(R.drawable.ic_action_name2);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(infosimpson.this,help.class);
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

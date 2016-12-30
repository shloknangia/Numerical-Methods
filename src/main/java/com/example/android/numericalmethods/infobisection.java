package com.example.android.numericalmethods;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class infobisection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infobisection);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextView infobisectiontv1 = (TextView)findViewById(R.id.infobisectiontv1);
        TextView infobisectiontv2 = (TextView)findViewById(R.id.infobisectiontv2);
        TextView infobisectiontv3 = (TextView)findViewById(R.id.infobisectiontv3);
        infobisectiontv1.setTextSize(30);
        infobisectiontv1.setText("About the method:\n");
        infobisectiontv2.setTextSize(20);
        infobisectiontv2.setText("The bisection method in mathematics is a root-finding method that repeatedly bisects an interval and then selects a subinterval in which a root must lie for further processing. It is a very simple and robust method, but it is also relatively slow.");
        infobisectiontv3.setTextSize(20);
        infobisectiontv3.setText("INPUT –\n" +
                "- a and b are the left and right endpoints \n" +
                "- error is the error estimate\n" +
                "- maximum number of iterations required\n" +
                "\n" +
                "OUTPUT – \n" +
                "-root of the equation\n" +
                "-number of iterations \n");

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setImageResource(R.drawable.ic_action_name2);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(infobisection.this,help.class);
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

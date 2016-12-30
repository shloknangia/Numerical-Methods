package com.example.android.numericalmethods;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class infosecant extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infosecant);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        TextView infosecanttv1 = (TextView)findViewById(R.id.infosecanttv1);
        TextView infosecanttv2 = (TextView)findViewById(R.id.infosecanttv2);
        TextView infosecanttv3 = (TextView)findViewById(R.id.infosecanttv3);
        infosecanttv1.setTextSize(30);
        infosecanttv1.setText("About the method:\n");
        infosecanttv2.setTextSize(20);
        infosecanttv2.setText("In numerical analysis, the secant  method  is a root-finding algorithm that uses a succession of  roots of secant  lines to better approximate a root of a function f.");
        infosecanttv3.setTextSize(20);
        infosecanttv3.setText("INPUT –\n" +
                "-a and b are the left and right endpoints \n" +
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
                Intent i = new Intent(infosecant.this,help.class);
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

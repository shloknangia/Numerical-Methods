package com.example.android.numericalmethods;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class secant extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secant);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setImageResource(R.drawable.ic_action_name2);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(secant.this,help.class);
                startActivity(i);
            }
        });
    }

    float function(float x){
        EditText pa = (EditText)findViewById(R.id.ps1);
        EditText pb = (EditText)findViewById(R.id.ps2);
        EditText pc = (EditText)findViewById(R.id.ps3);
        float p1=0,p2=0,p3=0;
        p1 = Float.parseFloat(pa.getText().toString());
        p2 = Float.parseFloat(pb.getText().toString());
        p3 = Float.parseFloat(pc.getText().toString());
        float poly = (p1 * x * x) + (p2 * x) + p3;
        return poly;
    }
    float diff(float x){
        EditText pa = (EditText)findViewById(R.id.ps1);
        EditText pb = (EditText)findViewById(R.id.ps2);
        EditText pc = (EditText)findViewById(R.id.ps3);
        float p1=0,p2=0,p3=0;
        p1 = Float.parseFloat(pa.getText().toString());
        p2 = Float.parseFloat(pb.getText().toString());
        p3 = Float.parseFloat(pc.getText().toString());
        float diff;
        diff = (p1 * x * 2) + p2;
        return diff;
    }

    public int calculatesecant(View v){
        float a = 0,b = 0,er = 0,maxitr = 0;
        EditText aa = (EditText)findViewById(R.id.editText5);
        EditText bb = (EditText)findViewById(R.id.editText6);
        EditText err = (EditText)findViewById(R.id.editText7);
        EditText itrr = (EditText)findViewById(R.id.editText8);
        a = Float.parseFloat(aa.getText().toString());
        b = Float.parseFloat(bb.getText().toString());
        er = Float.parseFloat(err.getText().toString());
        maxitr = Float.parseFloat(itrr.getText().toString());
        TextView output = (TextView)findViewById(R.id.printoutput2);
        float c;
        int count = 1;
       do{
           if(function(a) == function(b))
           {
               output.setText("No Solution");
               return 0;
           }
           c = (a * function(b) - b * function(a))/(function(b) - function(a));
           a = b;
           b = c;
           count ++;
           if(count == maxitr)
           {
               break;
           }

       }while(Math.abs(function(c)) > er);
        output.setText("After " + count + "iteration root is " + c);
        return  0;
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

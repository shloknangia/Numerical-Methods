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

public class lagrange extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newton);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setImageResource(R.drawable.ic_action_name2);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(lagrange.this,help.class);
                startActivity(i);
            }
        });
    }

    public int calculatelagrangefunction(View v){
        float ax[] = new float[8];
        float ay[] = new float[8];
        float x,num,den,y=0;
        int i,j,n;
        for(i=0;i<8;i++)
        {
            ax[i] = 0;
            ay[i] = 0;
        }
        EditText nn = (EditText)findViewById(R.id.n);
        n = Integer.parseInt(nn.getText().toString());
        EditText ex[] = new EditText[8];
        EditText ey[] = new EditText[8];
        ex[0] = (EditText)findViewById(R.id.editText9);
        ey[0] = (EditText)findViewById(R.id.editText10);
        ex[1] = (EditText)findViewById(R.id.editText11);
        ey[1] = (EditText)findViewById(R.id.editText12);
        ex[2] = (EditText)findViewById(R.id.editText13);
        ey[2] = (EditText)findViewById(R.id.editText14);
        ex[3] = (EditText)findViewById(R.id.editText15);
        ey[3] = (EditText)findViewById(R.id.editText16);
        ex[4] = (EditText)findViewById(R.id.editText19);
        ey[4] = (EditText)findViewById(R.id.editText20);
        ex[5] = (EditText)findViewById(R.id.editText21);
        ey[5] = (EditText)findViewById(R.id.editText22);
        ex[6] = (EditText)findViewById(R.id.editText23);
        ey[6] = (EditText)findViewById(R.id.editText24);
        ex[7] = (EditText)findViewById(R.id.editText25);
        ey[7] = (EditText)findViewById(R.id.editText26);
        EditText xx = (EditText)findViewById(R.id.x);
        TextView textview = (TextView)findViewById(R.id.printoutput3);
        for(i=0;i<n;i++)
        {
            ax[i]= Float.parseFloat(ex[i].getText().toString());
            ay[i]= Float.parseFloat(ey[i].getText().toString());
        }

        x = Float.parseFloat(xx.getText().toString());

        for(i=0;i<n;i++)
        {
            num = den = 1;
            for(j=0;j<n;j++)
            {
                if(j!=i)
                {
                    num *= x - ax[j];
                    den *= ax[i] - ax[j];
                }
            }
            y += (num/den) * ay[i];
        }


        textview.setText("The value of Y is : " + y);
        return 0;
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

package com.example.android.numericalmethods;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.File;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setImageResource(R.drawable.ic_action_name2);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,help.class);
                startActivity(i);
            }
        });
        Button b1 = (Button)findViewById(R.id.bisection_method);
        Button b2 = (Button)findViewById(R.id.secant_method);
        Button b3 = (Button)findViewById(R.id.lagrange_method);
        Button b4 = (Button)findViewById(R.id.simpson_method);
        Button b5 = (Button)findViewById(R.id.trapezoidal_method);
        b1.setOnLongClickListener(
            new Button.OnLongClickListener(){
                public boolean onLongClick(View v){
                    Intent i = new Intent(MainActivity.this,infobisection.class);
                    startActivity(i);
                    return true;
                }
            }
        );
        b2.setOnLongClickListener(
                new Button.OnLongClickListener(){
                    public boolean onLongClick(View v){
                        Intent i = new Intent(MainActivity.this,infosecant.class);
                        startActivity(i);
                        return true;
                    }
                }
        );
        b3.setOnLongClickListener(
                new Button.OnLongClickListener(){
                    public boolean onLongClick(View v){
                        Intent i = new Intent(MainActivity.this,infolagrange.class);
                        startActivity(i);
                        return true;
                    }
                }
        );
        b4.setOnLongClickListener(
                new Button.OnLongClickListener(){
                    public boolean onLongClick(View v){
                        Intent i = new Intent(MainActivity.this,infosimpson.class);
                        startActivity(i);
                        return true;
                    }
                }
        );
        b5.setOnLongClickListener(
                new Button.OnLongClickListener(){
                    public boolean onLongClick(View v){
                        Intent i = new Intent(MainActivity.this,infotrapezoidal.class);
                        startActivity(i);
                        return true;
                    }
                }
        );
    }

    public void bisection(View v){
        Intent i = new Intent (MainActivity.this,bisection.class);
        startActivity(i);
    }
    public void secant(View v){
        Intent i = new Intent (MainActivity.this,secant.class);
        startActivity(i);

    }
    public void lagrange(View v){
        Intent i = new Intent(MainActivity.this,lagrange.class);
        startActivity(i);
    }
    public void simpson(View v){
        Intent i = new Intent(MainActivity.this,simpson.class);
        startActivity(i);
    }
    public void trapezoidal(View v){
        Intent i = new Intent(MainActivity.this,trapezoidal.class);
        startActivity(i);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.credits) {
            Toast.makeText(this, "Made By : Shlok Nangia \n    MC/2K14/078", Toast.LENGTH_LONG).show();
        }

        else if (id == R.id.share) {

            try{
                ArrayList<Uri> uris = new ArrayList<Uri>();
                Intent sendIntent = new Intent(Intent.ACTION_SEND_MULTIPLE);
                sendIntent.setType("application/vnd.android.package-archive");
                uris.add(Uri.fromFile(new File(getApplicationInfo().publicSourceDir)));
                sendIntent.putParcelableArrayListExtra(Intent.EXTRA_STREAM, uris);
                startActivity(Intent.createChooser(sendIntent, null));


            }catch(Exception e){

                ArrayList<Uri> uris = new ArrayList<Uri>();
                Intent sendIntent = new Intent(Intent.ACTION_SEND_MULTIPLE);
                sendIntent.setType("application/zip");
                uris.add(Uri.fromFile(new File(getApplicationInfo().publicSourceDir)));
                sendIntent.putParcelableArrayListExtra(Intent.EXTRA_STREAM, uris);
                startActivity(Intent.createChooser(sendIntent, null));
            }
        }
        return super.onOptionsItemSelected(item);
    }
}

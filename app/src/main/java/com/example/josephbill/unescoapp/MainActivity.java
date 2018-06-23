package com.example.josephbill.unescoapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //adding toast message
        Toast.makeText(getBaseContext(), "Hello Tap the image above to get started or Tap the top right Icon for more!" , Toast.LENGTH_LONG).show();

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_couns) {
            switch(item.getItemId()){
                case R.id.nav_couns:
//                    Intent intent = new Intent (this, Couns.class);
//                    this.startActivity(intent);
                    goToUrl ("https://m.me/619678998430770");
                    Toast.makeText(getBaseContext(), "Turning bot on!" , Toast.LENGTH_SHORT ).show();
                    break;


                default:
                    return super.onOptionsItemSelected(item);




            }
            return true;
            // Handle the hivart action
        } else if (id == R.id.nav_hivart) {
            switch(item.getItemId()){
                case R.id.nav_hivart:
                    Intent intent = new Intent (this, HivArt.class);
                    this.startActivity(intent);
//                    goToUrl ("http://www.kccb.or.ke/");
                    break;


                default:
                    return super.onOptionsItemSelected(item);




            }
            return true;

        } else if (id == R.id.nav_hivvid) {
            switch(item.getItemId()){
                case R.id.nav_hivvid:
                    Intent intent = new Intent (this, HivVid.class);
                    this.startActivity(intent);
                    break;


                default:
                    return super.onOptionsItemSelected(item);




            }
            return true;

        } else if (id == R.id.nav_hivaud) {
            switch(item.getItemId()){
                case R.id.nav_hivaud:
                    Intent intent = new Intent (this, HivAud.class);
                    this.startActivity(intent);
                    break;


                default:
                    return super.onOptionsItemSelected(item);




            }
            return true;

        } else if (id == R.id.nav_sexart) {
            switch(item.getItemId()){
                case R.id.nav_sexart:
                    Intent intent = new Intent (this, SexArt.class);
                    this.startActivity(intent);
                    break;


                default:
                    return super.onOptionsItemSelected(item);




            }
            return true;
        } else if (id == R.id.nav_sexvid) {
            switch(item.getItemId()){
                case R.id.nav_sexvid:
                    Intent intent = new Intent (this, SexVid.class);
                    this.startActivity(intent);
                    break;


                default:
                    return super.onOptionsItemSelected(item);




            }
            return true;

        }else if (id == R.id.nav_sexaud) {
            switch(item.getItemId()){
                case R.id.nav_sexaud:
                    Intent intent = new Intent (this, SexAud.class);
                    this.startActivity(intent);
                    break;


                default:
                    return super.onOptionsItemSelected(item);




            }
            return true;

        }else if (id == R.id.nav_drugart) {
            switch(item.getItemId()){
                case R.id.nav_drugart:
                    Intent intent = new Intent (this, DrugArt.class);
                    this.startActivity(intent);
                    break;


                default:
                    return super.onOptionsItemSelected(item);




            }
            return true;

        }else if (id == R.id.nav_drugvid) {
            switch(item.getItemId()){
                case R.id.nav_drugvid:
                    Intent intent = new Intent (this, DrugVid.class);
                    this.startActivity(intent);
                    break;


                default:
                    return super.onOptionsItemSelected(item);




            }
            return true;

        }else if (id == R.id.nav_drugaud) {
            switch(item.getItemId()){
                case R.id.nav_drugaud:
                    Intent intent = new Intent (this, DrugAud.class);
                    this.startActivity(intent);
                    break;


                default:
                    return super.onOptionsItemSelected(item);




            }
            return true;

        }else if (id == R.id.nav_eduart) {
            switch(item.getItemId()){
                case R.id.nav_eduart:
                    Intent intent = new Intent (this, EduArt.class);
                    this.startActivity(intent);
                    break;


                default:
                    return super.onOptionsItemSelected(item);




            }
            return true;

        }else if (id == R.id.nav_eduvid) {
            switch(item.getItemId()){
                case R.id.nav_eduvid:
                    Intent intent = new Intent (this, EduVid.class);
                    this.startActivity(intent);
                    break;


                default:
                    return super.onOptionsItemSelected(item);




            }
            return true;

        }else if (id == R.id.nav_eduaud) {
            switch(item.getItemId()){
                case R.id.nav_eduaud:
                    Intent intent = new Intent (this, EduAud.class);
                    this.startActivity(intent);
                    break;


                default:
                    return super.onOptionsItemSelected(item);




            }
            return true;

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    //bot command
    public void botbtn (View v){
        goToUrl ("https://m.me/619678998430770");
        Toast.makeText(getBaseContext(), "Turning bot on!" , Toast.LENGTH_SHORT ).show();

    }

    private void goToUrl(String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
}

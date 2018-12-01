package nq.nq_socialapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class nq_myStudio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nq_my_studio);
    }
    public void directory(View v)
    {
        Intent i=new Intent(this, nq_directory.class);
        startActivity(i);
    }
    public void myStudio(View v)
    {
        Intent i=new Intent(this, nq_myStudio.class);
        startActivity(i);
    }
    public void home(View v)
    {
        Intent i=new Intent(this, NQ_main.class);
        startActivity(i);
    }
}

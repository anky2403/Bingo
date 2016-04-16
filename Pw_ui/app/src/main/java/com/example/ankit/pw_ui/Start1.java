package com.example.ankit.pw_ui;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Start1 extends ActionBarActivity {

    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start1);
        b1=(Button) findViewById(R.id.b1);

        b1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent i1 = new Intent(Start1.this,main_game.class);
                Start1.this.startActivity(i1);
            }
        });

    }
}

package com.example.irmin.userapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;

import org.w3c.dom.Text;

public class openEvent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_open_event2);

        Intent intent = getIntent();

        TextView title = (TextView) findViewById(R.id.title2);
        TextView content = (TextView) findViewById(R.id.content2);

        title.setText(intent.getStringExtra("title2"));
        content.setText(intent.getStringExtra("content2"));
        }
    }

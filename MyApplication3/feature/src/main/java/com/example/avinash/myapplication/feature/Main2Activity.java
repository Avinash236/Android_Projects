package com.example.avinash.myapplication.feature;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.net.Uri;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView tv2 = (TextView) findViewById(R.id.textView2);
        Button s = (Button) findViewById(R.id.button6);


        tv2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(view.getContext(), MainActivity.class);
                startActivityForResult(intent,0);

            }


        });
    }

    public void needhelp(View view) {

        Uri uri = Uri.parse("https://developer.android.com/reference/org/w3c/dom/Document.html");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }


    public void Settings(View view) {
        Intent intent = new Intent(view.getContext(), SettingsActivity.class);
        startActivityForResult(intent,0);


    }



}


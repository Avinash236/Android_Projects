package com.example.avinash.myapplication.feature;
import com.google.android.gms.auth.api.signin.*;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        TextView tv = (TextView) findViewById(R.id.text_view);
        Button bu = (Button) findViewById(R.id.Sign_In2);

        bu.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(v.getContext(), Main2Activity.class);
                startActivityForResult(intent,0);

            }


        });

        tv.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(v.getContext(), Main5Activity.class);
                startActivityForResult(intent,0);

            }


        });







    }

}

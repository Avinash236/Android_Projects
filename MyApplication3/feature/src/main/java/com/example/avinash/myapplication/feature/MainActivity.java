package com.example.avinash.myapplication.feature;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button button  = (Button) findViewById(R.id.Sign_In2);
        Button button2 = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new OnClickListener() {
                                      public void onClick(View v) {

                                          Intent intent = new Intent(v.getContext(), Main3Activity.class);
                                          startActivityForResult(intent, 0);

                                      }


                                  });

         button2.setOnClickListener(new OnClickListener()
         {
                                    @Override
                                     public void onClick(View view) {

                                        Intent intent = new Intent(view.getContext(), Main4Activity.class);
                                        startActivityForResult(intent,0);

                                         }


                                    });





    }

}
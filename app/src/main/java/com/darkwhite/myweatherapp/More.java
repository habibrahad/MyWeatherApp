package com.darkwhite.myweatherapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class More extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_more);


        TextView mail = (TextView) findViewById(R.id.contact);        //mail link of shakawath and habib
        mail.setMovementMethod(LinkMovementMethod.getInstance());

        TextView sourcecode = (TextView) findViewById(R.id.sourcecode);        //sourcecode of the git
        sourcecode.setMovementMethod(LinkMovementMethod.getInstance());

        TextView facebook = (TextView) findViewById(R.id.facebook);        //Facebook link of shakawath and habib
        facebook.setMovementMethod(LinkMovementMethod.getInstance());

        TextView faq = (TextView) findViewById(R.id.faq);        //mail tha developer
        faq.setMovementMethod(LinkMovementMethod.getInstance());

        TextView rate = (TextView) findViewById(R.id.rate);        //link of app store
        rate.setMovementMethod(LinkMovementMethod.getInstance());

    }
}

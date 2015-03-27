package com.symphonyteleca.loginportal;

import
        android.app.Activity;
import android.graphics.LinearGradient;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.Toast;
import android.graphics.Color;


import android.widget.TextView;

public class Profile extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        //Intent i = new Intent(getApplicationContext(), RegistrationHelper.class);
        //Bundle extras=i.getExtras();
        TextView name = (TextView) findViewById(R.id.p_name);
        //TextView uname = (TextView) findViewById(R.id.p_uname);
        Bundle extras =getIntent().getExtras();
        //if(getParentActivityIntent().equals(Registration.class)) {
            String uname = extras.getString("UName");
        String fname = extras.getString("FName");

        if(uname==null) {
            name.setText(fname);
        }
        else
        {
            name.setText(uname);
        }

        /*}
        else
        {
            String pname = extras.getString("UName");
            name.setText(pname);
        }
*/
        //Toast.makeText(getApplicationContext(),"Welcome, "+name,Toast.LENGTH_LONG).show();

    }
}

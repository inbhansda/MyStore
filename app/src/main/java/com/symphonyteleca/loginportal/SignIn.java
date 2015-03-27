package com.symphonyteleca.loginportal;

import android.app.Activity;
import android.os.Bundle;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.content.Intent;
import android.widget.EditText;
import android.widget.Toast;

public class SignIn extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        Toast.makeText(getApplicationContext(), "SignIn from onCreate", Toast.LENGTH_SHORT).show();

        final EditText et_UName=(EditText)findViewById(R.id.et_uname);
        final EditText et_Pwd=(EditText)findViewById(R.id.et_pwd);
        Button button3=(Button)findViewById(R.id.button3);
        Button button2=(Button)findViewById(R.id.button2);
        Button button1=(Button)findViewById(R.id.button1);

        button3.setOnClickListener(new OnClickListener(){
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Registration.class);
               // i.putExtra("Value1", "Android By Javatpoint");
                //i.putExtra("Value2", "Simple Tutorial");
                // Set the request code to any code you like, you can identify the
                // callback via this code
                startActivity(i);
            }
        });

        button2.setOnClickListener(new OnClickListener(){
            public void onClick(View view) {


                        et_UName.setText("");
                        et_Pwd.setText("");



            }
        });

        button1.setOnClickListener(new OnClickListener(){
            public void onClick(View view) {

                if (et_UName.getText().toString().length() == 0)
                    et_UName.setError("Username is required!");

                if (et_Pwd.getText().toString().length() == 0)
                    et_Pwd.setError("Password is required!");


                else {
                    Intent i = new Intent(getApplicationContext(), Profile.class);
                    i.putExtra("UName", et_UName.getText().toString());
                    startActivity(i);
                }

                // Set the request code to any code you like, you can identify the
                // callback via this code

            }
        });
    }



    @Override
    protected void onStart() {
        super.onStop();
        Toast.makeText(getApplicationContext(), "SignIn from onStart", Toast.LENGTH_SHORT).show();

    }


    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(), "SignIn from onPause", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(), "SignIn from onResume", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(), "SignIn from onStop", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(), "SignIn from onDestroy", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Toast.makeText(getApplicationContext(), "SignIn from onRestore", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Toast.makeText(getApplicationContext(), "SignIn from onSaveInstanceState", Toast.LENGTH_SHORT).show();

    }


}




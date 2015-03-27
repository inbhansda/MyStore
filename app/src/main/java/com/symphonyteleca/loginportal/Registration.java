package com.symphonyteleca.loginportal;



        import
                android.app.Activity;
        import android.os.Bundle;

        import android.view.View;
        import android.view.View.OnClickListener;
        import android.widget.Button;
        import android.widget.EditText;
        import android.content.Intent;
        import android.widget.Toast;

public class Registration extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        //String fname = ParseUser.getCurrentUser().getString("fname");
        final EditText et_FName=(EditText)findViewById(R.id.et_fname);
       // EditText firstName = (EditText)findViewById(R.id.first_name);


        Button button1=(Button)findViewById(R.id.button1);

        button1.setOnClickListener(new OnClickListener(){
            public void onClick(View view) {


                if( et_FName.getText().toString().length() == 0 )
                    et_FName.setError( "First name is required!" );





                else {
                    Intent i = new Intent(getApplicationContext(), Profile.class);
                    i.putExtra("FName", et_FName.getText().toString());
                    startActivity(i);
                }
            }
        });
    }



    @Override
    protected void onStart() {
        super.onStop();
        Toast.makeText(getApplicationContext(), "Registration from onStart", Toast.LENGTH_SHORT).show();

    }


    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(), "Registration from onPause", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(), "Registration from onResume", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(), "Registration from onStop", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(), "Registration from onDestroy", Toast.LENGTH_SHORT).show();

    }



    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Toast.makeText(getApplicationContext(), "Registration from onRestore", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Toast.makeText(getApplicationContext(), "Registration from onSaveInstanceState", Toast.LENGTH_SHORT).show();

    }


}











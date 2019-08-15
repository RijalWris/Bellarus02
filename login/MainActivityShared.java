package com.rijalw.bellarus.login;

/*
    Nama       : Rijal Wrisaba
    NIM        : 10116367
    Kelas      : AKB - 08
    Pengerjaan : 1 Agustus


 */

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.rijalw.bellarus.R;

public class MainActivityShared extends AppCompatActivity {

    EditText edit1, edit2;
    Button button1;

    public static final String MyPREFERENCES = "MyPrefs";
    public static final String Name = "nameKey";
    public static final String Password = "passKey";

    SharedPreferences sharedPreferences ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_shared);

        edit1 = (EditText) findViewById(R.id.editText);
        edit2 = (EditText) findViewById(R.id.editText2);

        button1 = (Button) findViewById(R.id.btnMasuk);
        sharedPreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n = edit1.getText().toString();
                String p = edit2.getText().toString();

                SharedPreferences.Editor editor = sharedPreferences.edit();

                editor.putString(Name, n);
                editor.putString(Password, p);
                editor.commit();
                Toast.makeText(MainActivityShared.this, "Thanks", Toast.LENGTH_LONG).show();
            }
        });
         button1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 String tempName = sharedPreferences.getString("nameKey", "Name");
                 String tempPassword = sharedPreferences.getString("passKey", "Password");

                 edit1.setText(tempName);
                 edit2.setText(tempPassword);
             }
         });

    }
}

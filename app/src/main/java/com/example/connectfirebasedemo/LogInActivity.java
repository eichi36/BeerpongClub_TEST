package com.example.connectfirebasedemo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class LogInActivity extends AppCompatActivity {
    EditText Email, username;
    Button bt_login;
    DatabaseReference reff;
    Member member;
    FirebaseDatabase database = FirebaseDatabase.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(LogInActivity.this, "Firebase connection Success", Toast.LENGTH_SHORT).show();
        Email = (EditText) findViewById(R.id.editText_ENTER_EMAIL_LogInActivity);
        username = (EditText) findViewById(R.id.editText_ENTER_USERNAME_LogInActivity);
        bt_login = (Button) findViewById(R.id.button_login_LoginActivity);

        member = new Member();
        reff = database.getReference("User").child("Member").child("Participant");

        bt_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String EMail_ad = Email.getText().toString();
                String Username = username.getText().toString();

                member.setEMail(EMail_ad);
                member.setUsername(Username);
                member.setGames(1);
                reff.push().setValue(member);
                //reff.setValue("Hello, World");
                Toast.makeText(LogInActivity.this, "Successfully updatet the database", Toast.LENGTH_SHORT).show();
            }
        });
        
        /* Test master*/
    }


}

package com.example.login_register;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        TextView userName =(TextView) findViewById(R.id.username);
//        TextView password =(TextView) findViewById(R.id.password);
//
//        Button loginbtn =(Button) findViewById(R.id.loginbtn);
        Button createAcc = (Button) findViewById(R.id.add);
        createAcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity2();
            }
        });

            //admin and admin
//        loginbtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                    if(userName.getText().toString().equals("admin") && password.getText().toString().equals("admin")) {
//                        Toast.makeText(MainActivity.this, "Login successful",Toast.LENGTH_SHORT).show();
//                    }
//                    else if (userName.getText().toString().equals("") || password.getText().toString().equals("")) {
//                    Toast.makeText(MainActivity.this, "pls put your text!!!!",Toast.LENGTH_SHORT).show();
//                    }
//                    else {
//                        Toast.makeText(MainActivity.this, "Login failed!!!", Toast.LENGTH_SHORT).show();
//                    }
//            }
//        });
    }
    public void openActivity2(){
        Intent intent = new Intent(this,Activity2.class);
        startActivity(intent);
    }

}







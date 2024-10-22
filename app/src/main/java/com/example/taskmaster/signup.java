package com.example.taskmaster;

import android.content.Intent;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class signup extends AppCompatActivity {

   EditText etname,etphone,etpassword,etconfirmpassword;
           Button btnsignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_signup);
        etname=(EditText)findViewById(R.id.etname);
        etphone=(EditText)findViewById(R.id.etphone);
        etpassword=(EditText)findViewById(R.id.etpassword);
        etconfirmpassword=(EditText)findViewById(R.id.etconfirmpassword);
        btnsignup=(Button) findViewById(R.id.btnsignup);
        btnsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(etname.getText().toString().isEmpty()||etphone.getText().toString().isEmpty()||etpassword.getText().toString().isEmpty()||etconfirmpassword.getText().toString().isEmpty())
                {
                    Toast.makeText(signup.this,"Please fill all the fields",Toast.LENGTH_SHORT).show();
                }
                else{
                    if(etpassword.getText().toString().length()==5||etconfirmpassword.getText().toString().length()==5)
                    {
                        Toast.makeText(signup.this,"Account created successfuly",Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(signup.this,"password must be 5 letters",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        TextView btn = findViewById(R.id.tvgologin);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(signup.this,LoginActivity.class));
            }
        });
    }
}



   

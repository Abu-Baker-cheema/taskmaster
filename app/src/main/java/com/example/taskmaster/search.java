package com.example.taskmaster;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class search extends AppCompatActivity {
    EditText title,description,date,time,event;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_search);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        init();
        String r=getIntent().getStringExtra("keyTitle")+"\n"+
                getIntent().getStringExtra("keydesc")+"\n"+
                getIntent().getStringExtra("keydate")+"\n"+
                getIntent().getStringExtra("keyTime")+"\n"+
                getIntent().getStringExtra("keyevent");
        tv.setText(r);
    }
    private void init(){
        title=findViewById(R.id.addTaskTitle);
        description=(EditText)findViewById(R.id.addTaskDescription);
        date=(EditText)findViewById(R.id.taskDate);
        time=(EditText)findViewById(R.id.taskTime);
        event=(EditText)findViewById(R.id.taskEvent);
    }
}
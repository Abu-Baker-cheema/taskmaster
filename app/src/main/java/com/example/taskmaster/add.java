package com.example.taskmaster;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class add extends AppCompatActivity {
Button addtask;
EditText addtitle,adddescription,adddate,addtime,addevent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        addtitle=(EditText)findViewById(R.id.addTaskTitle);
        adddescription=(EditText)findViewById(R.id.addTaskDescription);
        adddate=(EditText)findViewById(R.id.taskDate);
        addtime=(EditText)findViewById(R.id.taskTime);
        addevent=(EditText)findViewById(R.id.taskEvent);
        addtask=(Button) findViewById(R.id.addTask);
        addtask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String title=addtitle.getText().toString();
                String description=adddescription.getText().toString();
                String date=adddate.getText().toString();
                String time=addtime.getText().toString();
                String event=addevent.getText().toString();
                if(title.isEmpty()||description.isEmpty()||date.isEmpty()||time.isEmpty()||event.isEmpty())
                {
                    Toast.makeText(add.this,"Please fill all the fields",Toast.LENGTH_SHORT).show();
                }
                else {

                    Intent intent=new Intent(add.this, search.class);
                    intent.putExtra("keyTitle",title);
                    intent.putExtra("keydesc",description);
                    intent.putExtra("keydate",date);
                    intent.putExtra("keyTime",time);
                    intent.putExtra("keyevent",event);
                    startActivity(intent);


                }
            }
        });

    }


}
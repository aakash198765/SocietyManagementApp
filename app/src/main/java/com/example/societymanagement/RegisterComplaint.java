package com.example.societymanagement;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegisterComplaint extends AppCompatActivity {



    public Button submit1;

    public void init(){
        submit1 =(Button) findViewById(R.id.submit1);
        submit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy=new Intent(RegisterComplaint.this,ComplaintSubmitted .class);
                startActivity(toy);
            }
        });

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_complaint);

        init();

    }
}

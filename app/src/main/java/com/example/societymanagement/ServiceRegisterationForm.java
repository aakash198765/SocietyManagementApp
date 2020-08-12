package com.example.societymanagement;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ServiceRegisterationForm extends AppCompatActivity {


    public ImageView registerNow;

    public void init1(){
        registerNow=(ImageView) findViewById(R.id.registerNow);
        registerNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy=new Intent(ServiceRegisterationForm.this,RegistrationFormSubmitted.class);
                startActivity(toy);
            }
        });

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_registeration_form);

        init1();
    }
}

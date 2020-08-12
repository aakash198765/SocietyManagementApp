package com.example.societymanagement;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LocalServices extends AppCompatActivity {

    public TextView electricity;

    public void init1() {
        electricity = (TextView) findViewById(R.id.electricity);
        electricity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(LocalServices.this, ServiceRegisterationForm.class);
                startActivity(toy);
            }
        });
    }

    public TextView waterSupply;

    public void init2() {
        waterSupply = (TextView) findViewById(R.id.waterSupply);
        waterSupply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(LocalServices.this, ServiceRegisterationForm.class);
                startActivity(toy);
            }
        });
    }

    public TextView wifiConnectivity;

    public void init3() {
        wifiConnectivity = (TextView) findViewById(R.id.wifiConnectivity);
        wifiConnectivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(LocalServices.this, ServiceRegisterationForm.class);
                startActivity(toy);
            }
        });
    }

    public TextView wasteManagement;

    public void init4() {
        wasteManagement = (TextView) findViewById(R.id.wasteManagement);
        wasteManagement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(LocalServices.this, ServiceRegisterationForm.class);
                startActivity(toy);
            }
        });
    }

    public TextView otherServices;

    public void init5() {
        otherServices= (TextView) findViewById(R.id.otherServices);
        otherServices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(LocalServices.this, ServiceRegisterationForm.class);
                startActivity(toy);
            }
        });
    }






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_local_services);

        init1();
        init2();
        init3();
        init4();
        init5();

    }
}

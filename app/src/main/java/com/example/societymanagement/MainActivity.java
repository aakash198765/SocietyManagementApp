package com.example.societymanagement;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

public class MainActivity  extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void service_local(View view){
        Intent toy1=new Intent(MainActivity.this,LocalServices.class);
        startActivity(toy1);
    }
    public void book_rule(View view){
        Intent toy2=new Intent(MainActivity.this,RuleBook.class);
        startActivity(toy2);
    }
    public void register_comp(View view){
        Intent toy2=new Intent(MainActivity.this,ServiceRegisterationForm.class);
        startActivity(toy2);
    }
    public void status(View view){
        Intent toy3=new Intent(MainActivity.this,ViewStatus.class);
        startActivity(toy3);
    }
    public void events(View view){
        Intent toy4=new Intent(MainActivity.this,EventsNotices.class);
        startActivity(toy4);
    }
    public void helpDesk(View view){
        Intent toy5=new Intent(MainActivity.this,HelpDesk.class);
        startActivity(toy5);
    }
}

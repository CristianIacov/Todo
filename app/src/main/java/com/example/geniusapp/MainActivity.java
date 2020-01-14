package com.example.geniusapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


   public  EditText task1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        task1 =(EditText)findViewById(R.id.task);
    }

    public MainActivity() {
        super();
    }


    public void AddTask(View view){
try{
    task1.setVisibility(View.VISIBLE);}
catch(Exception e){}
}
    public void scheduleDay(View view){

        setContentView(R.layout.scheduleday);


    }

}

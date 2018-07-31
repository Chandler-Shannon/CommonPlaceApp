package com.example.crshannon.commonplaceapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

        public void goToCategories(View view){
        Intent cat = new Intent(this, Category.class);
        startActivity(cat);
    }

    public void openNewPassage(View view){
        Intent newp = new Intent(this, NewPassage.class);
        startActivity(newp);
    }

    public void openPassage(View view){
        Intent pass = new Intent(this, Passage.class);
        startActivity(pass);
    }

}

//Button btn = (Button)findViewById(R.id.open_activity_button);
//
//btn.setOnClickListener(new View.OnClickListener() {
//    @Override
//    public void onClick(View v) {
//        startActivity(new Intent(MainActivity.this, MyOtherActivity.class));
//    }
//});
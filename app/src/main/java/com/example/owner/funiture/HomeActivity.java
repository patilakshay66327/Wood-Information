package com.example.owner.funiture;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import static android.R.attr.onClick;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ImageButton teakbutton = (ImageButton)findViewById(R.id.teak);
        ImageButton sisoobutton = (ImageButton)findViewById(R.id.sisoo);
        ImageButton rosebtn = (ImageButton)findViewById(R.id.rosewood);
        ImageButton mulberrybtn = (ImageButton)findViewById(R.id.Mulberry);
        ImageButton jackbtn = (ImageButton)findViewById(R.id.Jack);
        ImageButton bamboobtn = (ImageButton)findViewById(R.id.Bamboo);



        teakbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent teakwood = new Intent(HomeActivity.this,Teak.class);
                startActivity(teakwood);

            }
        });

        sisoobutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sisoowood = new Intent(HomeActivity.this,Sisoo.class);
                startActivity(sisoowood);
            }
        });

        rosebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rose = new Intent(HomeActivity.this,Rose.class);
                startActivity(rose);
            }
        });

        mulberrybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mulberry = new Intent(HomeActivity.this,Mulberry.class);
                startActivity(mulberry);
            }
        });

        jackbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jack = new Intent(HomeActivity.this,Jack.class);
                startActivity(jack);
            }
        });

        bamboobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bamboo = new Intent(HomeActivity.this,Bamboo.class);
                startActivity(bamboo);
            }
        });

    }
}

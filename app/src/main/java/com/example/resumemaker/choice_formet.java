package com.example.resumemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class choice_formet extends AppCompatActivity {

    private ImageView choice_1, choice_2, choice_3, choice_4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice_formet);
        buiding();
        choice_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(choice_formet.this, page_1.class);
                startActivity(intent);
            }

        });
        choice_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(choice_formet.this, page_2.class);
                startActivity(intent);
            }

        });
        choice_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(choice_formet.this, page_1.class);
                startActivity(intent);
            }

        });
        choice_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(choice_formet.this, page_1.class);
                startActivity(intent);
            }

        });


    }

    void buiding() {

        choice_1 = findViewById(R.id.choice_1);
        choice_2 = findViewById(R.id.choice_2);
        choice_3 = findViewById(R.id.choice_3);
        choice_4 = findViewById(R.id.choice_4);
    }

}

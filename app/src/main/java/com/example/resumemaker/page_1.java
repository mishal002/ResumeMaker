package com.example.resumemaker;

import static com.example.resumemaker.getdata.name1;
import static com.example.resumemaker.getdata.professional1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;


public class page_1 extends AppCompatActivity {

    public TextView name1_txt,professional1_txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_1);
        bliding();
        name1_txt.setText(name1);
        professional1_txt.setText(professional1);


    }
    void bliding()
    {
        name1_txt=findViewById(R.id.name1_txt);
        professional1_txt=findViewById(R.id.professional1_txt);
    }
}
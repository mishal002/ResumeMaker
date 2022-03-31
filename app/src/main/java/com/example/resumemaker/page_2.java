package com.example.resumemaker;

import static com.example.resumemaker.getdata.name1;
import static com.example.resumemaker.getdata.professional1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class page_2 extends AppCompatActivity {
    TextView name1_txt,professional1_txt;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        name1_txt.setText(name1);
        professional1_txt.setText(professional1);

    }
    void binding()
    {
        name1_txt=findViewById(R.id.name1_txt);

    }
}
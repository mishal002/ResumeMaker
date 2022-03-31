package com.example.resumemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.wifi.p2p.WifiP2pManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;


public class getdata extends AppCompatActivity {
    public Button submit_btn;
    public EditText name_edt,professional_edt;

    public static String name1,professional1;

    RadioButton male_rd_btn,female_rd_btn;
    RadioGroup rd_gruop;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_getdata);
        binding();


        submit_btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                name1=name_edt.getText().toString();
                professional1=professional_edt.getText().toString();

                Intent intent = new Intent(getdata.this, choice_formet.class);
                startActivity(intent);
            }
        });
        void binding()
    {

        submit_btn = findViewById(R.id.submit_btn);
        name_edt = findViewById(R.id.name_edt);
        professional_edt = findViewById(R.id.professional_edt);
        male_rd_btn= (RadioButton) findViewById(male_rd_btn);
        female_rd_btn= (RadioButton) findViewById(female_rd_btn);
        rd_gruop= (RadioGroup) findViewById(rd_gruop);

    }
}

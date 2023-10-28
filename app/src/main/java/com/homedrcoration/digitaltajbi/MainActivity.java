package com.homedrcoration.digitaltajbi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {





    TextView textView,textView1,textView2;
    Button buttonadd,buttonsub,buttonreset;


    int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView =findViewById(R.id.textView);
        textView1 =findViewById(R.id.textView1);
        textView2 =findViewById(R.id.textView2);
        buttonadd=findViewById(R.id.buttonadd);
        buttonsub=findViewById(R.id.buttonsub);
        buttonreset=findViewById(R.id.buttonreset);




        //............................................
        buttonadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count=count+1;
                textView1.setText(""+count);



            }
        });


        buttonsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                count=count-1;
                textView1.setText(""+count);


            }
        });

        buttonreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                count=0;
                textView1.setText(""+count);


            }
        });







    }
}
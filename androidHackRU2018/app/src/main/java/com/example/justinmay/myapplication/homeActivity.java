package com.example.justinmay.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class homeActivity extends AppCompatActivity {

    public int albert = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        final TextView mainText = (TextView) findViewById(R.id.lmao);

        Button clickButton = (Button) findViewById(R.id.button);


        clickButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                albert++;
                if(albert%2==0){
                    mainText.setText("lmao");
                } else {
                    mainText.setText("ayyy");
                }
                //mainText.setTextSize(mainText.getTextSize()+(float)0.01);



            }
        });
    }

}

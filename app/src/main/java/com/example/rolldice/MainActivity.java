package com.example.rolldice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView img1,img2;
    int[]array=new int[]{R.drawable.number1,R.drawable.number2,R.drawable.number3,
    R.drawable.number4,R.drawable.number5,R.drawable.number6};
    Button click;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img1=findViewById(R.id.dice1);
        img2=findViewById(R.id.dice2);
        click=findViewById(R.id.click_me);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rand=new Random();
                int number=rand.nextInt(6);
                int number1=rand.nextInt(6);
                img1.setImageResource(array[number]);
                img2.setImageResource(array[number1]);

            }
        });

    }
}
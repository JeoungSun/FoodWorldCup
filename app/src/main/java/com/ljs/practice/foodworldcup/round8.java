package com.ljs.practice.foodworldcup;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;
import android.os.Bundle;
import android.widget.ImageView;
import android.content.Intent;
public class round8 extends AppCompatActivity {

    private static final String TAG = "round8";
    ImageView image1;
    ImageView image2;
    int[] imgs = {R.drawable.food1, R.drawable.food2,R.drawable.food3,R.drawable.food4,R.drawable.food5,R.drawable.food6,
            R.drawable.food7,R.drawable.food8,R.drawable.food9,R.drawable.food10,R.drawable.food11,R.drawable.food12,R.drawable.food13,
            R.drawable.food14,R.drawable.food15,R.drawable.food16};
    final static MainActivity mainActivity = new MainActivity();
    public static int[] r8 = mainActivity.r8;
    public static int count2=2;
    public static int[] r4 = new int[4];
    public static int b=0;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.round8);

        image1 = findViewById(R.id.image1);
        image2 = findViewById(R.id.image2);

        image1.setImageResource(imgs[r8[0]]);
        image2.setImageResource(imgs[r8[1]]);

        image1.setOnClickListener(new View.OnClickListener() {
            Intent intent2 = new Intent(getApplicationContext(), round4.class);
            @Override
            public void onClick(View view) {
                if(count2>7){
                    r4[b]=r8[count2-2];
                    count2=0;
                    startActivity(intent2);
                }
                image1.setImageResource(imgs[r8[count2]]);
                image2.setImageResource(imgs[r8[count2+1]]);
                r4[b]=r8[count2-2];
                count2 +=2;
                b++;
            }
        });

        image2.setOnClickListener(new View.OnClickListener() {
            Intent intent2 = new Intent(getApplicationContext(), round4.class);
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: " + count2);
                if(count2>7){
                    r4[b]=r8[count2-1];
                    count2=0;

                    startActivity(intent2);
                }
                image1.setImageResource(imgs[r8[count2]]);
                image2.setImageResource(imgs[r8[count2+1]]);
                r4[b]=r8[count2-1];
                count2 +=2;
                b++;
            }
        });
    }
}

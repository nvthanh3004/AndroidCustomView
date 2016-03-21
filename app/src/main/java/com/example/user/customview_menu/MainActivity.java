package com.example.user.customview_menu;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get image source -> pass to constructor of CustomView
        Bitmap[] a = new Bitmap[] {
                BitmapFactory.decodeResource(getResources(), R.drawable.appear_1),
                BitmapFactory.decodeResource(getResources(), R.drawable.appear_2),
                BitmapFactory.decodeResource(getResources(), R.drawable.appear_3),
                BitmapFactory.decodeResource(getResources(), R.drawable.appear_4),
                BitmapFactory.decodeResource(getResources(), R.drawable.appear_5),
                BitmapFactory.decodeResource(getResources(), R.drawable.appear_6),
                BitmapFactory.decodeResource(getResources(), R.drawable.appear_7),
                BitmapFactory.decodeResource(getResources(), R.drawable.appear_8),
                BitmapFactory.decodeResource(getResources(), R.drawable.appear_9),
                BitmapFactory.decodeResource(getResources(), R.drawable.appear_10),
                BitmapFactory.decodeResource(getResources(), R.drawable.appear_11)
        };

        LinearLayout ll = (LinearLayout) findViewById(R.id.MyLinearLayout);

        //MyView myView = new MyView(this,a); // Pass bitmap array to create
        MyView myView = (MyView) findViewById(R.id.view);
        myView.setImageSource(a);
        //ll.addView(myView);
        myView.Start();

        // The two button (from class MyButtonView just created)
        MyButtonView myButtonView = (MyButtonView) findViewById(R.id.view2);
        myButtonView.Start();

        MyButtonView myButtonView_1 = (MyButtonView) findViewById(R.id.view3);
        myButtonView_1.Start();
    }
}

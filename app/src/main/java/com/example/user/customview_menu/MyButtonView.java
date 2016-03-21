package com.example.user.customview_menu;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.CountDownTimer;
import android.util.AttributeSet;
import android.widget.Button;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by USER on 3/20/2016.
 */
public class MyButtonView extends Button {
    public MyButtonView(Context context, AttributeSet attributeSet){
        super(context,attributeSet);
    }

    public MyButtonView(Context context){
        super(context);
    }

    String text = "ClickMe"; // Text displayed on button
    int text_color; // Set text color , update onDraw
    int canvas_color ; // Set canvas (background, view color)

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawColor(Color.WHITE);
        Paint paint = new Paint();
        paint.setTextSize(20);
        paint.setColor(text_color);
        canvas.drawColor(canvas_color);
        canvas.drawText(text, 30, 30, paint);

    }

    private void update()
    {
        if(canvas_color == 0xFFFFFFFF)
        {
            canvas_color = 0xFF000000;
            text_color = 0xFFFFFFFF;
        }
        else
        {
            canvas_color = 0xFFFFFFFF;
            text_color = 0xFF000000;
        }

        ////////////////////
        invalidate();
    }

    CountDownTimer countDownTimer = new CountDownTimer(20000, 300) {
        @Override
        public void onTick(long millisUntilFinished)
        {
            update(); // next state
        }

        @Override
        public void onFinish() {

        }
    };

    public void Start()
    {
        countDownTimer.start();
    }




}

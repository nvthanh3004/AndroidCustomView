package com.example.user.customview_menu;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.CountDownTimer;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by USER on 3/20/2016.
 */
public class MyView extends View {
    public MyView(Context context, AttributeSet attributeSet){
        super(context,attributeSet);
    }

    public MyView(Context context){
        super(context);
    }

    public MyView(Context context, Bitmap[] imageSource){
        super(context);
        images = imageSource;
        nImages = imageSource.length;
    }

    public void setImageSource(Bitmap[] imageSource){
        images = imageSource;
        nImages = imageSource.length;
    }

    Bitmap[] images;
    int idx = 0; // To switch between images
    int nImages;

    @Override
    protected void onDraw(Canvas canvas) {
        int left=30, top=50;
        canvas.drawBitmap(images[idx],left,top,null);
        //Paint paint = new Paint();
        //paint.setColor(Color.WHITE);
        //paint.setTextSize(30);
        //canvas.drawText("ClickMe", 30, 30, paint);

    }

    CountDownTimer countDownTimer = new CountDownTimer(20000, 200) {
        @Override
        public void onTick(long millisUntilFinished)
        {
            update(); // next image
        }

        @Override
        public void onFinish() {

        }
    };

    private void update()
    {
        idx = (idx+1)%nImages;

        // invalidate() = re-draw???????
        invalidate(); //->>>>>>>>>>>>>> recall onDraw !!!!!!!!!!!!!!!!!!
    }

    public void Start()
    {
        countDownTimer.start();
    }

    public void Stop()
    {
        countDownTimer.cancel();
    }
}

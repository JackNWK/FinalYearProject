package com.example.finalyearproject;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class DIsplay extends View {

    Rect srcRect = new Rect(0,0,480,640);
    Rect disRect;
    Bitmap b;

    public DIsplay(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public void getBitmap(Bitmap bitmap){
        this.b = bitmap;
    }

    @Override
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);
        invalidate();
        disRect = new Rect(0,0,getRight(),getBottom());
        if (b != null) {
            canvas.drawBitmap(b, srcRect, disRect, null);
        }

    }
}

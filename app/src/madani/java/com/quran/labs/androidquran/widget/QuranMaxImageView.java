package com.quran.labs.androidquran.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatImageView;

/**
 * Added by KQA
 */
public class QuranMaxImageView extends AppCompatImageView {
  private int mMaxHeight = -1;

  public QuranMaxImageView(Context context) {
    super(context);
  }

  public QuranMaxImageView(Context context, AttributeSet attrs) {
    super(context, attrs);
  }

  public QuranMaxImageView(Context context, AttributeSet attrs, int defStyle) {
    super(context, attrs, defStyle);
  }

  @Override
  protected void onDraw(Canvas canvas) {
    mMaxHeight = canvas.getMaximumBitmapHeight();
    super.onDraw(canvas);
  }

}

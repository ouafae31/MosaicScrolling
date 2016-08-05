package com.app.scrollingmosaic;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by ouafaebenelkadi on 8/5/16.
 */
public class AutoSizedImage extends ImageView {
        public AutoSizedImage(Context context)
        {
            super(context);
        }

        public AutoSizedImage(Context context, AttributeSet attrs)
        {
            super(context, attrs);
        }

        public AutoSizedImage(Context context, AttributeSet attrs, int defStyle)
        {
            super(context, attrs, defStyle);
        }

        @Override
        protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec)
        {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            setMeasuredDimension(getMeasuredWidth(), getMeasuredWidth()); //Snap to width
        }


}

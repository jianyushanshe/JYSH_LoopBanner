package com.jianyushanshe.loopbannerlib.view;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;



/**
 * Author:wangjianming
 * Time:2019/7/9
 * Description:
 */
public class LBLoopViewPager extends RecyclerView {

    private static final float FLING_SCALE_DOWN_FACTOR = 0.5f; // 减速因子
    private static final int FLING_MAX_VELOCITY = 3000; // 最大顺时滑动速度
    private static boolean mEnableLimitVelocity = true; // 最大顺时滑动速度

    public LBLoopViewPager(Context context) {
        super(context);
    }

    public LBLoopViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public LBLoopViewPager(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }


    @Override
    public boolean fling(int velocityX, int velocityY) {
        if (mEnableLimitVelocity) {
            velocityX = solveVelocity(velocityX);
            velocityY = solveVelocity(velocityY);
        }
        return super.fling(velocityX, velocityY);
    }

    private int solveVelocity(int velocity) {
        if (velocity > 0) {
            return Math.min(velocity, FLING_MAX_VELOCITY);
        } else {
            return Math.max(velocity, -FLING_MAX_VELOCITY);
        }
    }


}

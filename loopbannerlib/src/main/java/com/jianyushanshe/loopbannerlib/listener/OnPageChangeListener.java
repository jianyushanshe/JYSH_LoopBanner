package com.jianyushanshe.loopbannerlib.listener;


import android.support.v7.widget.RecyclerView;

/**
 * Author:wangjianming
 * Time:2019/7/9
 * Description:
 */
public interface OnPageChangeListener {
    void onScrollStateChanged(RecyclerView recyclerView, int newState);
    void onScrolled(RecyclerView recyclerView, int dx, int dy);
    void onPageSelected(int index);
}

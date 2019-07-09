package com.jianyushanshe.loopbannerlib.holder;
/**
 * Author:wangjianming
 * Time:2019/7/9
 * Description:
 */
import android.support.v7.widget.RecyclerView;
import android.view.View;


public abstract class Holder<T> extends RecyclerView.ViewHolder {
    public Holder(View itemView) {
        super(itemView);
        initView(itemView);
    }

    protected abstract void initView(View itemView);

    public abstract void updateUI(T data);
}

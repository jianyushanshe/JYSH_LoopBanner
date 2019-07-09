package com.jianyushanshe.loopbanner;

import android.view.View;
import android.widget.ImageView;


import com.jianyushanshe.loopbannerlib.holder.Holder;

/**
 * Author:wangjianming
 * Time:2019/7/9 16:34
 * Description:NetWorkImageViewHolder
 */
public class ImageViewHolder extends Holder<String> {
    private ImageView imageView;

    public ImageViewHolder(View itemView) {
        super(itemView);
    }


    @Override
    protected void initView(View itemView) {
        imageView = itemView.findViewById(R.id.ivPost);
    }

    @Override
    public void updateUI(String data) {
        GlideApp.with(MyApplication.application).load(data).into(imageView);
    }
}

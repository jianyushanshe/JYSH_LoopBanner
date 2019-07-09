package com.jianyushanshe.loopbannerlib.holder;

import android.view.View;

/**
 * Author:wangjianming
 * Time:2019/7/9
 * Description:
 */
public interface LBViewHolderCreator {
	Holder createHolder(View itemView);
	int getLayoutId();
}

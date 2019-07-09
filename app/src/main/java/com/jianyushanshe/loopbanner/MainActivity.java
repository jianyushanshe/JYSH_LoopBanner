package com.jianyushanshe.loopbanner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.jianyushanshe.loopbannerlib.ConvenientBanner;
import com.jianyushanshe.loopbannerlib.holder.Holder;
import com.jianyushanshe.loopbannerlib.holder.LBViewHolderCreator;
import com.jianyushanshe.loopbannerlib.listener.OnItemClickListener;
import com.jianyushanshe.loopbannerlib.listener.OnPageChangeListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<String> mActionImages;
    private ConvenientBanner viewPagerAction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPagerAction = findViewById(R.id.viewpager_action);
        if (mActionImages == null) {
            mActionImages = new ArrayList<>();
        }
        mActionImages.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1562674638684&di=b42114723079f9f56d02732e3dac1d93&imgtype=0&src=http%3A%2F%2Fimage.res.meizu.com%2Fget%2Fflymebbs%2Fforum%2F201801%2F13%2F150011emc4hiil444kfiil.jpg");
        mActionImages.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1562674638684&di=dd9da0bf3193a4ca9daf2fa650e050ba&imgtype=0&src=http%3A%2F%2Fattach.bbs.miui.com%2Fforum%2F201805%2F24%2F124724br2vn8h9v2y2n4qd.jpg");
        mActionImages.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1562674638685&di=ac85da23b5b522e9a8800d1aafce766d&imgtype=0&src=http%3A%2F%2Fattach.bbs.miui.com%2Fforum%2F201805%2F24%2F124734zlo8ionkzrow0i3e.jpg");
        mActionImages.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1562674638683&di=644f6486dd2384a83de0c4183e24ee36&imgtype=0&src=http%3A%2F%2Fi5.bbs.fd.zol-img.com.cn%2Ft_s1200x5000%2Fg5%2FM00%2F07%2F0F%2FChMkJleExXKIffo5AA7LvxIC1JAAATc-gH5iH0ADsvX605.jpg");
        mActionImages.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1562674772890&di=a06bff442ac18dbaa5ccc797b370bbce&imgtype=jpg&src=http%3A%2F%2F5b0988e595225.cdn.sohucs.com%2Fimages%2F20181223%2F4af9f4960b194385aee56dbdfb997db6.jpeg");
        mActionImages.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1562674638683&di=f1db926b4404261526e6987dd3b7adc1&imgtype=0&src=http%3A%2F%2Fattach.bbs.miui.com%2Fforum%2F201805%2F24%2F124726rke3bk0800rj38cs.jpg");
        //设置图片
        viewPagerAction.setPages(new LBViewHolderCreator() {
            @Override
            public Holder createHolder(View itemView) {
                //自定义的ImageViewHolder
                return new ImageViewHolder(itemView);
            }

            @Override
            public int getLayoutId() {
                //加载图片的布局文件
                return R.layout.item_localimage;
            }
            //设置数据源
        }, mActionImages)
                //设置指示器图标
                .setPageIndicator(new int[]{R.mipmap.ic_page_indicator, R.mipmap.ic_page_indicator_focused});

        //点击监听
        viewPagerAction.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                Toast.makeText(getApplicationContext(), "点击了" + position, Toast.LENGTH_SHORT).show();
            }
        });

        //页面改变监听
        viewPagerAction.setOnPageChangeListener(new OnPageChangeListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {

            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {

            }

            @Override
            public void onPageSelected(int index) {

            }
        });
    }

}

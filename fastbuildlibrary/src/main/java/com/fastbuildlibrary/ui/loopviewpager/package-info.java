
/*
###########################################
轮播图Viewpager

自动循环，并对事件进行处理，按下停止播放，抬起开始播放
###########################################
使用说明：

<com.fastbuildlibrary.ui.loopviewpager.AutoLoopViewPager
                android:id="@+id/pager"
                android:layout_width="fill_parent"
                android:layout_height="fill_parent" />

AutoLoopViewPager pager = (AutoLoopViewPager)findViewById(R.id.pager);
GalleryPagerAdapter galleryAdapter = new GalleryPagerAdapter();
pager.setAdapter(galleryAdapter);


轮播图适配器

public class GalleryPagerAdapter extends PagerAdapter {

    @Override
    public int getCount() {
        return imageViewIds.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        ImageView item = new ImageView(HouseDetailActivity.this);
        item.setImageResource(imageViewIds[position]);
        ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(-1, -1);
        item.setLayoutParams(params);
        item.setScaleType(ImageView.ScaleType.FIT_XY);
        container.addView(item);

        final int pos = position;
        item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HouseDetailActivity.this, ImageGalleryActivity.class);
                intent.putStringArrayListExtra("images", (ArrayList<String>) imageList);
                intent.putExtra("position", pos);
                startActivity(intent);
            }
        });

        return item;
    }

    @Override
    public void destroyItem(ViewGroup collection, int position, Object view) {
        collection.removeView((View) view);
    }
}

*/
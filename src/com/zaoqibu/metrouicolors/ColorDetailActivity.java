package com.zaoqibu.metrouicolors;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class ColorDetailActivity extends FragmentActivity
{
	public static final String ARG_COLORS = "colors";
	public static final String ARG_POSITION = "position";
	
	private MetroUIColors colors;
	private int position;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_color_detail_view);
		
//		getActionBar().setDisplayHomeAsUpEnabled(true);

		colors = (MetroUIColors)getIntent().getExtras().get(ARG_COLORS);
		position = getIntent().getExtras().getInt(ARG_POSITION);

		ViewPager colorDetailPager = (ViewPager)findViewById(R.id.colorDetailPager);
		colorDetailPager.setAdapter(new ColorDetailPagerAdapter(getSupportFragmentManager(), colors));
		
		colorDetailPager.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
            @Override
            public void onPageSelected(int position) {
                getActionBar().setTitle(colors.get(position).getName());
            }
		});
		
		getActionBar().setTitle(colors.get(position).getName());
		colorDetailPager.setCurrentItem(position);
	}
	
	public class ColorDetailPagerAdapter extends FragmentPagerAdapter
	{
		MetroUIColors colors;
		
		public ColorDetailPagerAdapter(FragmentManager fm, MetroUIColors colors) {
			super(fm);
			this.colors = colors;
		}

		@Override
		public Fragment getItem(int i) {
			MetroUIColor color = colors.get(i);
			
			Bundle bundle = new Bundle();
			bundle.putSerializable(ColorDetailFragment.ARG_METRO_UI_COLOR, color);
			
			Fragment fragment = new ColorDetailFragment();
			fragment.setArguments(bundle);
			
			return fragment;
		}

		@Override
		public int getCount() {
			return colors.count();
		}
		
	}
	
	public static class ColorDetailFragment extends Fragment
	{
		public static final String ARG_METRO_UI_COLOR = "color";
		
		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
		{
			MetroUIColor color = (MetroUIColor)getArguments().getSerializable(ARG_METRO_UI_COLOR);
			
			View rootView = inflater.inflate(R.layout.activity_color_detail, container, false);
			
			ImageView imageView = (ImageView)rootView.findViewById(R.id.colorDetailImageView);
			imageView.setBackgroundColor(Color.parseColor(color.getHexColorCode()));
			
			List<Integer> colorDetailKeys = color.getColorDetailKeys();
			List<Map<String, String>> datas = new ArrayList<Map<String,String>>();
			for (int key : colorDetailKeys)
			{
				Map<String, String> data = new HashMap<String, String>();
				data.put("title", getResources().getString(key));
				data.put("subtitle", color.getValues(key));
				
				datas.add(data);
			}
			
			ListView listView = (ListView)rootView.findViewById(R.id.colorDetailListView);
			listView.setAdapter(new SimpleAdapter(rootView.getContext(), datas, R.layout.color_detail_listview_item,
					new String[] {"title", "subtitle"}, 
					new int[] {R.id.colorDetailListViewItemTitle, R.id.colorDetailListViewItemSubtitle}));
			
			return rootView;
		}
	}
	
//	@Override
//	public boolean onOptionsItemSelected(MenuItem item)
//	{
//		switch(item.getItemId())
//		{
//		case android.R.id.home:
//			onBackPressed();
//			return true;
//		default:
//			return super.onOptionsItemSelected(item);
//		}
//	}

}

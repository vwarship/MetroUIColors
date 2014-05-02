package com.zaoqibu.metrouicolors;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class ColorDetailActivity extends Activity
{
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_color_detail);

//		getActionBar().setDisplayHomeAsUpEnabled(true);
		
		MetroUIColor color = (MetroUIColor)getIntent().getExtras().get("color");
		getActionBar().setTitle(color.getName());
		
		ImageView imageView = (ImageView)this.findViewById(R.id.colorDetailImageView);
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
		
		ListView listView = (ListView)this.findViewById(R.id.colorDetailListView);
		listView.setAdapter(new SimpleAdapter(this, datas, R.layout.color_detail_listview_item,
				new String[] {"title", "subtitle"}, 
				new int[] {R.id.colorDetailListViewItemTitle, R.id.colorDetailListViewItemSubtitle}));
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

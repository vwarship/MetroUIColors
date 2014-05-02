package com.zaoqibu.metrouicolors;

import android.app.Activity;
import android.os.Bundle;

public class ColorDetailActivity extends Activity
{
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_color_detail);

//		getActionBar().setDisplayHomeAsUpEnabled(true);
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

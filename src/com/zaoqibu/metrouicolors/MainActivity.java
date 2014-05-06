package com.zaoqibu.metrouicolors;

import com.zaoqibu.metrouicolors.domain.MetroUIColors;
import com.zaoqibu.metrouicolors.util.GridViewUtil;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;

public class MainActivity extends Activity
{
	private MetroUIColors colors;
	
	public MainActivity()
	{
		colors = new MetroUIColors();
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		final int calcGridItemWidth = GridViewUtil.calcItemWidth(this);
		
		GridView gridView = (GridView)findViewById(R.id.gridView);
		gridView.setAdapter(new ColorAdapter(this, calcGridItemWidth, colors));
		gridView.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
				Intent intent = new Intent(MainActivity.this, ColorDetailActivity.class);
				intent.putExtra(ColorDetailActivity.ARG_COLORS, colors);
				intent.putExtra(ColorDetailActivity.ARG_POSITION, position);
				startActivity(intent);
			}
		});
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId())
		{
		case R.id.action_about:
			Intent intent = new Intent(MainActivity.this, AboutActivity.class);
			startActivity(intent);
			return true;
		default:
			return super.onOptionsItemSelected(item);
		}
	}

}

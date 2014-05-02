package com.zaoqibu.metrouicolors;

import java.util.ArrayList;
import java.util.List;

import com.zaoqibu.metrouicolors.util.GridViewUtil;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;

public class MainActivity extends Activity {

	private List<MetroUIColor> colors = new ArrayList<MetroUIColor>();
	
	public MainActivity()
	{
		initMetroUIColors();
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
				startActivity(intent);
			}
		});
	}

	private void initMetroUIColors()
	{
		colors.add(new MetroUIColor("Light Green", "#99b433"));
		colors.add(new MetroUIColor("Green", "#00a300"));
		colors.add(new MetroUIColor("Dark Green", "#1e7145"));
		colors.add(new MetroUIColor("Magenta", "#ff0097"));
		colors.add(new MetroUIColor("Light Purple", "#9f00a7"));
		colors.add(new MetroUIColor("Purple", "#7e3878"));
		colors.add(new MetroUIColor("Dark Purple", "#603cba"));
		colors.add(new MetroUIColor("Darken", "#1d1d1d"));
		colors.add(new MetroUIColor("Teal", "#00aba9"));
		colors.add(new MetroUIColor("Light Blue", "#eff4ff"));
		colors.add(new MetroUIColor("Blue", "#2d89ef"));
		colors.add(new MetroUIColor("Dark Blue", "#2b5797"));
		colors.add(new MetroUIColor("Yellow", "#ffc40d"));
		colors.add(new MetroUIColor("Orange", "#e3a21a"));
		colors.add(new MetroUIColor("Dark Orange", "#da532c"));
		colors.add(new MetroUIColor("Red", "#ee1111"));
		colors.add(new MetroUIColor("Dark Red", "#b91d47"));
		colors.add(new MetroUIColor("White", "#ffffff"));
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}

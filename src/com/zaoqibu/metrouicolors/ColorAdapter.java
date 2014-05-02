package com.zaoqibu.metrouicolors;

import java.util.List;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class ColorAdapter extends BaseAdapter
{
	private Context context;
	private int calcGridItemWidth;
	
	private List<MetroUIColor> colors;
	
	public ColorAdapter(Context context, int calcGridItemWidth, List<MetroUIColor> colors)
	{
		this.context = context;
		this.calcGridItemWidth = calcGridItemWidth;
		this.colors = colors;
	}

	@Override
	public int getCount() {
		return colors.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater layoutInflater = LayoutInflater.from(context);
		
		View item = null;
		
		if (convertView == null)
		{
			item = layoutInflater.inflate(R.layout.gridview_item, parent, false);
			item.setLayoutParams(new GridView.LayoutParams(calcGridItemWidth, calcGridItemWidth));
		}
		else
		{
			item = convertView;
		}
		
		ImageView imageView = (ImageView)item.findViewById(R.id.itemImage);
		imageView.setBackgroundColor(Color.parseColor(colors.get(position).getHexColorCode()));
		
		TextView textView = (TextView)item.findViewById(R.id.itemText);
		textView.setText(colors.get(position).getName());
		
		return item;
	}

}

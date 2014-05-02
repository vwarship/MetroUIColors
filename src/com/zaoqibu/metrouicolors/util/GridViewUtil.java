package com.zaoqibu.metrouicolors.util;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.TypedValue;

public class GridViewUtil
{
	static public int calcItemWidth(Activity activity)
	{
		int colNum = 3;
		boolean isLand = isScreenOrientationLandscape(activity);
		if (isLand)
			colNum = 5;
		
		Resources r = activity.getResources();
		float padding = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 
				16*2 + (colNum-1)*8, 
				r.getDisplayMetrics());
		
		final int screenWidth = SystemMetadata.getScreenWidth(activity);
		return (int) ( (screenWidth-padding) / colNum);
	}
	
	static private boolean isScreenOrientationLandscape(Activity activity)
	{
		Configuration conf = activity.getResources().getConfiguration();
		if (conf.orientation == Configuration.ORIENTATION_LANDSCAPE)
			return true;
		
		return false;
	}
	
}

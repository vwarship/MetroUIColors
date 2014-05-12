package com.zaoqibu.metrouicolors.util;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.TypedValue;

public class GridViewUtil
{
	private static int PORTRAIT_GRIDVIEW_COLUMN_NUMBER = 3;
	private static int LANDSCAPE_GRIDVIEW_COLUMN_NUMBER = 5;
	
	static public int calcItemWidth(Activity activity)
	{
		int colNum = PORTRAIT_GRIDVIEW_COLUMN_NUMBER;
		boolean isLand = isScreenOrientationLandscape(activity);
		if (isLand)
			colNum = LANDSCAPE_GRIDVIEW_COLUMN_NUMBER;
		
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

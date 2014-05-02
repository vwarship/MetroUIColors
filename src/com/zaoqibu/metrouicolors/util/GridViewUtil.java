package com.zaoqibu.metrouicolors.util;

import android.app.Activity;
import android.content.res.Resources;
import android.util.TypedValue;

public class GridViewUtil
{
	static public int calcItemWidth(Activity activity)
	{
      Resources r = activity.getResources();
      float padding = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 48, r.getDisplayMetrics());

      final int screenWidth = SystemMetadata.getScreenWidth(activity);
      return (int) ( (screenWidth-padding) / 3);
	}
}

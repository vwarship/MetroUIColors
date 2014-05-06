package com.zaoqibu.metrouicolors.domain;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.zaoqibu.metrouicolors.R;

public class MetroUIColor implements Serializable
{
	private static final long serialVersionUID = -4563846068390436749L;
	
	private Integer nameId;
	private List<Integer> colorDetailKeys;
	private Map<Integer, String> kvs;
	
	public MetroUIColor(Integer nameId, List<Integer> colorDetailKeys, Map<Integer, String> kvs)
	{
		this.nameId = nameId;
		this.colorDetailKeys = colorDetailKeys;
		this.kvs = kvs;
	}
	
	public List<Integer> getColorDetailKeys()
	{
		return colorDetailKeys;
	}
	
	public Integer getName() {
		return nameId;
	}
	
	public String getHexColorCode() {
		return kvs.get(R.string.color_detail_hex_color_code);
	}

	public String getValues(Integer key)
	{
		return kvs.get(key);
	}
}

package com.zaoqibu.metrouicolors.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.zaoqibu.metrouicolors.R;

import android.annotation.SuppressLint;

public class MetroUIColors implements Serializable
{
	private static final long serialVersionUID = 2602185984704762235L;
	
	private List<Integer> colorDetailKeys = new ArrayList<Integer>();
	private List<MetroUIColor> colors = new ArrayList<MetroUIColor>();
	
	public MetroUIColors()
	{
		initMetroUIColorKeys();
		initMetroUIColors();
	}

	private void initMetroUIColorKeys()
	{
		colorDetailKeys.add(R.string.color_detail_hex_color_code);
		colorDetailKeys.add(R.string.color_detail_rgb_decimal);
		colorDetailKeys.add(R.string.color_detail_rgb_percent);
		colorDetailKeys.add(R.string.color_detail_cmyk);
		colorDetailKeys.add(R.string.color_detail_hsl);
		colorDetailKeys.add(R.string.color_detail_hsv_or_hsb);
		colorDetailKeys.add(R.string.color_detail_web_safe);
		colorDetailKeys.add(R.string.color_detail_cie_lab);
		colorDetailKeys.add(R.string.color_detail_xyz);
		colorDetailKeys.add(R.string.color_detail_xyy);
		colorDetailKeys.add(R.string.color_detail_cie_lch);
		colorDetailKeys.add(R.string.color_detail_cie_luv);
		colorDetailKeys.add(R.string.color_detail_hunter_lab);
		colorDetailKeys.add(R.string.color_detail_rgb_binary);
	}
	
	private void initMetroUIColors()
	{
		colors.add(createMetroUIColor(R.string.color_light_green, new String[] {
				"#99b433", "rgb(153,180,51)", "rgb(60%,70.6%,20%)", "15, 0, 72, 29", 
				"hsl(72.6,55.8%,45.3%)", "72.6°, 71.7, 70.6", "#99cc33", 
				"69.222, -26.695, 59.165", "30.055, 39.654, 9.202", "0.381, 0.503, 39.654", "69.222, 64.909, 114.285", 
				"69.222, -12.223, 70.765", "62.971, -25.004, 35.415", "10011001, 10110100, 00110011"}));

		colors.add(createMetroUIColor(R.string.color_green, new String[] {
				"#00a300", "rgb(0,163,0)", "rgb(0%,63.9%,0%)", "100, 0, 100, 36", 
				"hsl(120,100%,32%)", "120°, 100, 63.9", "#009900", 
				"58.22, -61.662, 59.513", "13.096, 26.193, 4.365", "0.3, 0.6, 26.193", "58.22, 85.697, 136.016", 
				"58.22, -55.129, 71.268", "51.179, -43.886, 30.768", "00000000, 10100011, 00000000"}));

		colors.add(createMetroUIColor(R.string.color_dark_green, new String[] {
				"#1e7145", "rgb(30,113,69)", "rgb(11.8%,44.3%,27.1%)", "73, 0, 39, 56", 
				"hsl(148.2,58%,28%)", "148.2°, 73.5, 44.3", "#336633", 
				"42.024, -35.507, 17.515", "7.514, 12.515, 7.65", "0.271, 0.452, 12.515", "42.024, 39.592, 153.744", 
				"42.024, -32.825, 26.165", "35.377, -23.995, 11.943", "00011110, 01110001, 01000101"}));
		
		colors.add(createMetroUIColor(R.string.color_magenta, new String[] {
				"#ff0097", "rgb(255,0,151)", "rgb(100%,0%,59.2%)", "0, 100, 41, 0", 
				"hsl(324.5,100%,50%)", "324.5°, 100, 100", "#ff0099", 
				"55.583, 86.354, -8.641", "46.827, 23.5, 31.347", "0.461, 0.231, 23.5", "55.583, 86.786, 354.286", 
				"55.583, 131.38, -28.652", "48.476, 87.594, -4.406", "11111111, 00000000, 10010111"}));

		colors.add(createMetroUIColor(R.string.color_light_purple, new String[] {
				"#9f00a7", "rgb(159,0,167)", "rgb(62.4%,0%,65.5%)", "5, 100, 0, 35", 
				"hsl(297.1,100%,32.7%)", "297.1°, 100, 65.5", "#990099", 
				"38.132, 70.245, -46.733", "21.273, 10.162, 37.398", "0.309, 0.148, 10.162", "38.132, 84.37, 326.365", 
				"38.132, 49.463, -73.581", "31.878, 63.326, -47.241", "10011111, 00000000, 10100111"}));

		colors.add(createMetroUIColor(R.string.color_purple, new String[] {
				"#7e3878", "rgb(126,56,120)", "rgb(49.4%,22%,47.1%)", "0, 56, 5, 51", 
				"hsl(305.1,38.5%,35.7%)", "305.1°, 55.6, 49.4", "#663366", 
				"35.244, 39.407, -22.871", "13.408, 8.621, 18.726", "0.329, 0.212, 8.621", "35.244, 45.563, 329.87", 
				"35.244, 32.902, -35.853", "29.361, 30.133, -17.261", "01111110, 00111000, 01111000"}));

		colors.add(createMetroUIColor(R.string.color_dark_purple, new String[] {
				"#603cba", "rgb(96,60,186)", "rgb(37.6%,23.5%,72.9%)", "48, 68, 0, 27", 
				"hsl(257.1,51.2%,48.2%)", "257.1°, 67.7, 72.9", "#6633cc", 
				"36.487, 45.762, -61.119", "15.301, 9.263, 47.434", "0.213, 0.129, 9.263", "36.487, 76.353, 306.823", 
				"36.487, 4.053, -88.795", "30.436, 36.475, -71.097", "01100000, 00111100, 10111010"}));

		colors.add(createMetroUIColor(R.string.color_darken, new String[] {
				"#1d1d1d", "rgb(29,29,29)", "rgb(11.4%,11.4%,11.4%)", "0, 0, 0, 89", 
				"hsl(0,0%,11.4%)", "0°, 0, 11.4", "#333333", 
				"10.767, -0, -0.002", "1.168, 1.229, 1.338", "0.313, 0.329, 1.229", "10.767, 0.002, 266.929", 
				"10.767, -0.001, -0.001", "11.084, -0.592, 0.602", "00011101, 00011101, 00011101"}));

		colors.add(createMetroUIColor(R.string.color_teal, new String[] {
				"#00aba9", "rgb(0,171,169)", "rgb(0%,67.1%,66.3%)", "100, 0, 1, 33", 
				"hsl(179.3,100%,33.5%)", "179.3°, 100, 67.1", "#009999", 
				"63.333, -36.256, -9.455", "21.722, 31.988, 42.563", "0.226, 0.332, 31.988", "63.333, 37.469, 194.617", 
				"63.333, -49.197, -8.898", "56.558, -30.421, -5.029", "00000000, 10101011, 10101001"}));

		colors.add(createMetroUIColor(R.string.color_light_blue, new String[] {
				"#eff4ff", "rgb(239,244,255)", "rgb(93.7%,95.7%,100%)", "6, 4, 0, 0", 
				"hsl(221.3,100%,96.9%)", "221.3°, 6.3, 100", "#ffffff", 
				"96.109, 0.363, -5.855", "85.994, 90.272, 107.496", "0.303, 0.318, 90.272", "96.109, 5.866, 273.544", 
				"96.109, -3.352, -9.233", "95.011, -4.711, -0.573", "11101111, 11110100, 11111111"}));

		colors.add(createMetroUIColor(R.string.color_blue, new String[] {
				"#2d89ef", "rgb(45,137,239)", "rgb(17.6%,53.7%,93.7%)", "81, 43, 0, 6", 
				"hsl(211.5,85.8%,55.7%)", "211.5°, 81.2, 93.7", "#3399ff", 
				"56.761, 9.293, -58.755", "25.604, 24.679, 85.071", "0.189, 0.182, 24.679", "56.761, 59.486, 278.988", 
				"56.761, -29.898, -93.825", "49.678, 5.063, -66.756", "00101101, 10001001, 11101111"}));

		colors.add(createMetroUIColor(R.string.color_dark_blue, new String[] {
				"#2b5797", "rgb(43,87,151)", "rgb(16.9%,34.1%,59.2%)", "72, 42, 0, 41", 
				"hsl(215.6,55.7%,38%)", "215.6°, 71.5, 59.2", "#336699", 
				"37.048, 7.304, -39.537", "9.989, 9.564, 30.596", "0.199, 0.191, 9.564", "37.048, 40.206, 280.466", 
				"37.048, -16.812, -56.518", "30.925, 3.538, -37.011", "00101011, 01010111, 10010111"}));

		colors.add(createMetroUIColor(R.string.color_yellow, new String[] {
				"#ffc40d", "rgb(255,196,13)", "rgb(100%,76.9%,5.1%)", "0, 23, 95, 0", 
				"hsl(45.4,100%,52.5%)", "45.4°, 94.9, 100", "#ffcc00", 
				"82.256, 7.897, 82.625", "61.054, 60.772, 8.895", "0.467, 0.465, 60.772", "82.256, 83.001, 84.541", 
				"82.256, 49.768, 84.46", "77.957, 3.373, 47.804", "11111111, 11000100, 00001101"}));

		colors.add(createMetroUIColor(R.string.color_orange, new String[] {
				"#e3a21a", "rgb(227,162,26)", "rgb(89%,63.5%,10.2%)", "0, 29, 89, 11", 
				"hsl(40.6,79.4%,49.6%)", "40.6°, 88.5, 89", "#cc9933", 
				"71.042, 13.898, 70.827", "44.786, 42.249, 6.773", "0.477, 0.45, 42.249", "71.042, 72.177, 78.898", 
				"71.042, 54.034, 69.973", "64.999, 9.243, 39.321", "11100011, 10100010, 00011010"}));

		colors.add(createMetroUIColor(R.string.color_dark_orange, new String[] {
				"#da532c", "rgb(218,83,44)", "rgb(85.5%,32.5%,17.3%)", "0, 62, 80, 15", 
				"hsl(13.4,70.2%,51.4%)", "13.4°, 79.8, 85.5", "#cc6633", 
				"53.252, 51.005, 48.844", "32.463, 21.277, 4.78", "0.555, 0.364, 21.277", "53.252, 70.621, 43.76", 
				"53.252, 108.673, 38.026", "46.127, 44.899, 26.145", "11011010, 01010011, 00101100"}));

		colors.add(createMetroUIColor(R.string.color_red, new String[] {
				"#ee1111", "rgb(238,17,17)", "rgb(93.3%,6.7%,6.7%)", "0, 93, 93, 7", 
				"hsl(0,86.7%,50%)", "0°, 92.9, 93.3", "#ff0000", 
				"50.244, 74.763, 59.31", "35.564, 18.623, 2.252", "0.63, 0.33, 18.623", "50.244, 95.432, 38.425", 
				"50.244, 159.631, 34.437", "43.155, 71.58, 27.114", "11101110, 00010001, 00010001"}));

		colors.add(createMetroUIColor(R.string.color_dark_red, new String[] {
				"#b91d47", "rgb(185,29,71)", "rgb(72.5%,11.4%,27.8%)", "0, 84, 62, 27", 
				"hsl(343.8,72.9%,42%)", "343.8°, 84.3, 72.5", "#cc3333", 
				"40.655, 60.85, 17.283", "21.585, 11.651, 7.073", "0.535, 0.289, 11.651", "40.655, 63.257, 15.856", 
				"40.655, 105.183, 7.196", "34.133, 53.149, 11.607", "10111001, 00011101, 01000111"}));

		colors.add(createMetroUIColor(R.string.color_white, new String[] {
				"#ffffff", "rgb(255,255,255)", "rgb(100%,100%,100%)", "0, 0, 0, 0", 
				"hsl(0,0%,100%)", "0°, 0, 100", "#ffffff", 
				"100, -0, -0.009", "95.047, 100, 108.897", "0.313, 0.329, 100", "100, 0.009, 266.929", 
				"100, -0.006, -0.013", "100, -5.342, 5.435", "11111111, 11111111, 11111111"}));
	}
	
	@SuppressLint("UseSparseArrays")
	private MetroUIColor createMetroUIColor(Integer colorNameId, String[] values)
	{
		Map<Integer, String> kvs = new HashMap<Integer, String>();
		for (int i=0; i<colorDetailKeys.size(); ++i)
		{
			kvs.put(colorDetailKeys.get(i), values[i]);
		}
	
		return new MetroUIColor(colorNameId, colorDetailKeys, kvs);
	}
	
	public MetroUIColor get(int position)
	{
		return colors.get(position);
	}
	
	public int count()
	{
		return colors.size();
	}
	
}

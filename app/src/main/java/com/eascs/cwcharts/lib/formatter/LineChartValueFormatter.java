package com.eascs.cwcharts.lib.formatter;


import com.eascs.cwcharts.lib.model.PointValue;

public interface LineChartValueFormatter {

    public int formatChartValue(char[] formattedValue, PointValue value);
}

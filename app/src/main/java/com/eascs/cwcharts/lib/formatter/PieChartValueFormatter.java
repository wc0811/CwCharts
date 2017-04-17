package com.eascs.cwcharts.lib.formatter;


import com.eascs.cwcharts.lib.model.SliceValue;

public interface PieChartValueFormatter {

    public int formatChartValue(char[] formattedValue, SliceValue value);
}

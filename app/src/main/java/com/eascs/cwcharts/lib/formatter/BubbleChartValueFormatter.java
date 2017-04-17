package com.eascs.cwcharts.lib.formatter;


import com.eascs.cwcharts.lib.model.BubbleValue;

public interface BubbleChartValueFormatter {

    public int formatChartValue(char[] formattedValue, BubbleValue value);
}

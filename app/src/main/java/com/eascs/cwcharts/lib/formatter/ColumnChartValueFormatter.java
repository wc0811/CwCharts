package com.eascs.cwcharts.lib.formatter;


import com.eascs.cwcharts.lib.model.SubcolumnValue;

public interface ColumnChartValueFormatter {

    public int formatChartValue(char[] formattedValue, SubcolumnValue value);

}

package com.eascs.cwcharts.lib.listener;


import com.eascs.cwcharts.lib.model.PointValue;
import com.eascs.cwcharts.lib.model.SubcolumnValue;

public interface ComboLineColumnChartOnValueSelectListener extends OnValueDeselectListener {

    public void onColumnValueSelected(int columnIndex, int subcolumnIndex, SubcolumnValue value);

    public void onPointValueSelected(int lineIndex, int pointIndex, PointValue value);

}

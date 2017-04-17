package com.eascs.cwcharts.lib.listener;


import com.eascs.cwcharts.lib.model.PointValue;

public interface LineChartOnValueSelectListener extends OnValueDeselectListener {

    public void onValueSelected(int lineIndex, int pointIndex, PointValue value);

}

package com.eascs.cwcharts.lib.listener;


import com.eascs.cwcharts.lib.model.SliceValue;

public interface PieChartOnValueSelectListener extends OnValueDeselectListener {

    public void onValueSelected(int arcIndex, SliceValue value);

}

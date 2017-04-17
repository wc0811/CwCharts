package com.eascs.cwcharts.lib.listener;


import com.eascs.cwcharts.lib.model.BubbleValue;

public interface BubbleChartOnValueSelectListener extends OnValueDeselectListener {

    public void onValueSelected(int bubbleIndex, BubbleValue value);

}

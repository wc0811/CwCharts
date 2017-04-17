package com.eascs.cwcharts.lib.listener;


import com.eascs.cwcharts.lib.model.PointValue;
import com.eascs.cwcharts.lib.model.SubcolumnValue;

public class DummyCompoLineColumnChartOnValueSelectListener implements ComboLineColumnChartOnValueSelectListener {

    @Override
    public void onColumnValueSelected(int columnIndex, int subcolumnIndex, SubcolumnValue value) {

    }

    @Override
    public void onPointValueSelected(int lineIndex, int pointIndex, PointValue value) {

    }

    @Override
    public void onValueDeselected() {

    }
}

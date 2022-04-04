package com.example.piechart;

import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private PieChart chart;
    PieChart.Data data1 = new PieChart.Data("component 1", 300);
    PieChart.Data data2 = new PieChart.Data("component 2"  , 64);
    PieChart.Data data3 = new PieChart.Data("component 3" , 190);





    @FXML
    protected void onHelloButtonClick() {
        chart.getData().add(data1);
        chart.getData().add(data2);
        chart.getData().add(data3);
    }
}
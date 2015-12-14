/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hatma.ehealthkediri;

/**
 *
 * @author Adi Satria
 */
import javax.annotation.PostConstruct;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.LineChartModel;
import org.primefaces.model.chart.ChartSeries;
import org.primefaces.model.chart.LineChartSeries;
 
@ManagedBean
public class Historytotalpasien implements Serializable {
 
    private LineChartModel lineModel1;
     
    @PostConstruct
    public void init() {
        createLineModels();
    }
 
    public LineChartModel getLineModel1() {
        return lineModel1;
    }
      
    private void createLineModels() {
        lineModel1 = initLinearModel();
        lineModel1.setTitle("Histori Total Pasien Selama 1 Tahun");
        lineModel1.setLegendPosition("e");
        Axis yAxis = lineModel1.getAxis(AxisType.Y);
        yAxis.setMin(0);
        yAxis.setMax(15);
         
    }
     
    private LineChartModel initLinearModel() {
        LineChartModel model = new LineChartModel();
 
        LineChartSeries series1 = new LineChartSeries();
        series1.setLabel("Pasien");
 
        series1.set(1, 4);
        series1.set(2, 5);
        series1.set(3, 1);
        series1.set(4, 6);
        series1.set(5, 8);
        series1.set(6, 10);
        series1.set(7, 12);
        series1.set(8, 4);
        series1.set(9, 7);
        series1.set(10, 8);
        series1.set(11, 2);
        series1.set(12, 6);
 
       
 
        model.addSeries(series1);
         
        return model;
    }
     
}


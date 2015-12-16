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
import java.util.Map;
import java.util.Set;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import org.primefaces.event.ItemSelectEvent;
import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.BarChartModel;
import org.primefaces.model.chart.CategoryAxis;
import org.primefaces.model.chart.LineChartModel;
import org.primefaces.model.chart.ChartSeries;
import org.primefaces.model.chart.LineChartSeries;
 
@ManagedBean
public class Historytotalpasien implements Serializable {
 
    private LineChartModel lineModel1;
    private String tahun;
    private String puskesmas;

    public String getTahun() {
        return tahun;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }

    public String getPuskesmas() {
        return puskesmas;
    }

    public void setPuskesmas(String puskesmas) {
        this.puskesmas = puskesmas;
    }
    
    public void refreshLineChart1() {
        createLineModels();
    }
    
    @PostConstruct
    public void init() {
        createLineModels();
    }
 
    public LineChartModel getLineModel1() {
        return lineModel1;
    }
      
    private void createLineModels() {
        lineModel1 = initLinearModel();
        lineModel1.setAnimate(true);
        lineModel1.setTitle("Histori Total Pasien Selama 1 Tahun");
        lineModel1.setLegendPosition("ne");
        lineModel1.getAxes().put(AxisType.X, new CategoryAxis("Bulan"));
        Axis yAxis = lineModel1.getAxis(AxisType.Y);
        yAxis.setLabel("Jumlah");
        yAxis.setMin(0);
        yAxis.setMax(20);
    }
     
    private LineChartModel initLinearModel() {
        LineChartModel model = new LineChartModel();
        
        LineChartSeries series1 = new LineChartSeries();
        series1.setLabel("Pasien");
 
        series1.set("Januari", (int) (Math.random() * 19));
        series1.set("Februari", (int) (Math.random() * 19));
        series1.set("Maret", (int) (Math.random() * 19));
        series1.set("April", (int) (Math.random() * 19));
        series1.set("Mei", (int) (Math.random() * 19));
        series1.set("Juni", (int) (Math.random() * 19));
        series1.set("Juli", (int) (Math.random() * 19));
        series1.set("Agustus", (int) (Math.random() * 19));
        series1.set("September", (int) (Math.random() * 19));
        series1.set("Oktober", (int) (Math.random() * 19));
        series1.set("November", (int) (Math.random() * 19));
        series1.set("Desember", (int) (Math.random() * 19));
 
        model.addSeries(series1);     
        
        return model;
    }
    
    public void itemLineSelect(ItemSelectEvent event) {
        
        LineChartModel cModel = (LineChartModel) ((org.primefaces.component.chart.Chart) event.getSource()).getModel();
        ChartSeries mySeries = cModel.getSeries().get(event.getSeriesIndex());
        Set<Map.Entry<Object, Number>> mapValues = mySeries.getData().entrySet();
        Map.Entry<Object, Number>[] test = new Map.Entry[mapValues.size()];
        mapValues.toArray(test);
        
        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Item selected",
                mySeries.getLabel() + " di bulan " + test[event.getItemIndex()].getKey() + " = " + test[event.getItemIndex()].getValue() + " orang");

        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
}


package com.hatma.ehealthkediri;

import javax.annotation.PostConstruct;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import org.primefaces.event.ItemSelectEvent;

import org.primefaces.model.chart.*;

@ManagedBean
public class PenyakitView implements Serializable {

    private BarChartModel barModel;
    private HorizontalBarChartModel horizontalBarModel;
    private ChartSeries sukorame, mrican, ngampel, januari, februari, maret;
    private String bulan = "Oktober";
    private String tahun = "2015";
    private String puskesmas = "Mrican";
    
    public String getPuskesmas() {
        return puskesmas;
    }

    public void setPuskesmas(String puskesmas) {
        this.puskesmas = puskesmas;
    }
    
    public String getTahun() {
        return tahun;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }

    public String getBulan() {
        return bulan;
    }

    public void setBulan(String bulan) {
        this.bulan = bulan;
    }

    public BarChartModel getBarModel() {
        return barModel;
    }

    public HorizontalBarChartModel getHorizontalBarModel() {
        return horizontalBarModel;
    }
    
    public void refreshChart1() {
        createHorizontalBarModel();
    }
    
    public void refreshChart2() {
        createBarModel();
    }

    @PostConstruct
    public void init() {
        createBarModels();
    }

    private void createBarModels() {
        createHorizontalBarModel();
        createBarModel();
    }

    private void createHorizontalBarModel() {
        horizontalBarModel = new HorizontalBarChartModel();

        horizontalBarModel.setTitle("10 Penderita Berdasarkan Puskesmas, " + bulan + " " + tahun);
        horizontalBarModel.setAnimate(true);
        horizontalBarModel.setLegendPosition("e");
        horizontalBarModel.setStacked(true);

        sukorame = new ChartSeries();
        sukorame.setLabel("Sukorame");
        sukorame.set("batuk", (int) (Math.random() * 65));
        sukorame.set("pilek", (int) (Math.random() * 65));
        sukorame.set("flu", (int) (Math.random() * 65));
        sukorame.set("panas", (int) (Math.random() * 65));
        sukorame.set("panu", (int) (Math.random() * 65));
        sukorame.set("demam berdarah", (int) (Math.random() * 65));
        sukorame.set("malaria", (int) (Math.random() * 65));
        sukorame.set("sakit gigi", (int) (Math.random() * 65));
        sukorame.set("cangkrang", (int) (Math.random() * 65));
        sukorame.set("ambeien", (int) (Math.random() * 65));

        mrican = new ChartSeries();
        mrican.setLabel("Mrican");
        mrican.set("batuk", (int) (Math.random() * 65));
        mrican.set("pilek", (int) (Math.random() * 65));
        mrican.set("flu", (int) (Math.random() * 65));
        mrican.set("panas", (int) (Math.random() * 65));
        mrican.set("panu", (int) (Math.random() * 65));
        mrican.set("demam berdarah", (int) (Math.random() * 65));
        mrican.set("malaria", (int) (Math.random() * 65));
        mrican.set("sakit gigi", (int) (Math.random() * 65));
        mrican.set("cangkrang", (int) (Math.random() * 65));
        mrican.set("ambeien", (int) (Math.random() * 65));

        ngampel = new ChartSeries();
        ngampel.setLabel("Ngampel");
        ngampel.set("batuk", (int) (Math.random() * 65));
        ngampel.set("pilek", (int) (Math.random() * 65));
        ngampel.set("flu", (int) (Math.random() * 65));
        ngampel.set("panas", (int) (Math.random() * 65));
        ngampel.set("panu", (int) (Math.random() * 65));
        ngampel.set("demam berdarah", (int) (Math.random() * 65));
        ngampel.set("malaria", (int) (Math.random() * 65));
        ngampel.set("sakit gigi", (int) (Math.random() * 65));
        ngampel.set("cangkrang", (int) (Math.random() * 65));
        ngampel.set("ambeien", (int) (Math.random() * 65));

        horizontalBarModel.addSeries(sukorame);
        horizontalBarModel.addSeries(mrican);
        horizontalBarModel.addSeries(ngampel);

        Axis xAxis = horizontalBarModel.getAxis(AxisType.X);
        xAxis.setLabel("Jumlah");
        xAxis.setMin(0);
        xAxis.setMax(200);

        Axis yAxis = horizontalBarModel.getAxis(AxisType.Y);
        yAxis.setLabel("Jenis Penyakit");
    }

    private void createBarModel() {
        barModel = new BarChartModel();

        barModel.setTitle("Perkembangan 3 Bulan Terakhir 10 Penyakit " + puskesmas + " (3 bulan terakhir)");
        barModel.setAnimate(true);
        barModel.setLegendPosition("ne");

        januari = new ChartSeries();
        januari.setLabel("Januari 2015");
        januari.set("batuk", (int) (Math.random() * 200));
        januari.set("pilek", (int) (Math.random() * 200));
        januari.set("flu", (int) (Math.random() * 200));
        januari.set("panas", (int) (Math.random() * 200));
        januari.set("panu", (int) (Math.random() * 200));
        januari.set("demam berdarah", (int) (Math.random() * 200));
        januari.set("malaria", (int) (Math.random() * 200));
        januari.set("sakit gigi", (int) (Math.random() * 200));
        januari.set("cangkrang", (int) (Math.random() * 200));
        januari.set("ambeien", (int) (Math.random() * 200));

        februari = new ChartSeries();
        februari.setLabel("Februari 2015");
        februari.set("batuk", (int) (Math.random() * 200));
        februari.set("pilek", (int) (Math.random() * 200));
        februari.set("flu", (int) (Math.random() * 200));
        februari.set("panas", (int) (Math.random() * 200));
        februari.set("panu", (int) (Math.random() * 200));
        februari.set("demam berdarah", (int) (Math.random() * 200));
        februari.set("malaria", (int) (Math.random() * 200));
        februari.set("sakit gigi", (int) (Math.random() * 200));
        februari.set("cangkrang", (int) (Math.random() * 200));
        februari.set("ambeien", (int) (Math.random() * 200));

        maret = new ChartSeries();
        maret.setLabel("Maret 2015");
        maret.set("batuk", (int) (Math.random() * 200));
        maret.set("pilek", (int) (Math.random() * 200));
        maret.set("flu", (int) (Math.random() * 200));
        maret.set("panas", (int) (Math.random() * 200));
        maret.set("panu", (int) (Math.random() * 200));
        maret.set("demam berdarah", (int) (Math.random() * 200));
        maret.set("malaria", (int) (Math.random() * 200));
        maret.set("sakit gigi", (int) (Math.random() * 200));
        maret.set("cangkrang", (int) (Math.random() * 200));
        maret.set("ambeien", (int) (Math.random() * 200));

        barModel.addSeries(januari);
        barModel.addSeries(februari);
        barModel.addSeries(maret);

        Axis xAxis = barModel.getAxis(AxisType.X);
        xAxis.setLabel("Penyakit");

        Axis yAxis = barModel.getAxis(AxisType.Y);
        yAxis.setLabel("Jumlah");
        yAxis.setMin(0);
        yAxis.setMax(200);
    }

    public void itemSelectBarModel(ItemSelectEvent event) {
        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Item selected",
                "Item Index: " + event.getItemIndex() + ", Series Index:" + event.getSeriesIndex());

        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public void itemSelect(ItemSelectEvent event) {
        
        BarChartModel cModel = (BarChartModel) ((org.primefaces.component.chart.Chart) event.getSource()).getModel();
        ChartSeries mySeries = cModel.getSeries().get(event.getSeriesIndex());
        Set<Entry<Object, Number>> mapValues = mySeries.getData().entrySet();
        Entry<Object, Number>[] test = new Entry[mapValues.size()];
        mapValues.toArray(test);
        
        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Item selected",
                mySeries.getLabel() + ", " + test[event.getItemIndex()].getKey() + " = " + test[event.getItemIndex()].getValue() );

        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

}

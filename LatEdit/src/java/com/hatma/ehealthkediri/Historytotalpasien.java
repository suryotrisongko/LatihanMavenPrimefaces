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
import com.hatma.ehealthkediri.entity.HistoriTotalPasienTahunan;
import com.hatma.ehealthkediri.sessionbean.HistoriTotalPasienTahunanFacade;
import javax.annotation.PostConstruct;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.ejb.EJB;
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

    @EJB
    private HistoriTotalPasienTahunanFacade historiTotalPasienTahunanFacade;

    private LineChartModel lineModel1;
    private int tahun_id = 2015;
    private int puskesmas_id = 1;

    public HistoriTotalPasienTahunanFacade getHistoriTotalPasienTahunanFacade() {
        return historiTotalPasienTahunanFacade;
    }

    public int getTahun_id() {
        return tahun_id;
    }

    public void setTahun_id(int tahun_id) {
        this.tahun_id = tahun_id;
    }

    public int getPuskesmas_id() {
        return puskesmas_id;
    }

    public void setPuskesmas_id(int puskesmas_id) {
        this.puskesmas_id = puskesmas_id;
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
        yAxis.setMax(300);
    }

    private LineChartModel initLinearModel() {
        LineChartModel model = new LineChartModel();

        LineChartSeries series1 = new LineChartSeries();
        series1.setLabel("Pasien");

        List<HistoriTotalPasienTahunan> dataku = 
                getHistoriTotalPasienTahunanFacade().findByTahunIdPuskesmasId(getTahun_id(), getPuskesmas_id());
        
        for (HistoriTotalPasienTahunan H : dataku) {
            series1.set( "bulan " + H.getBulanId() , (int) H.getJumlah());
        }

        /*
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
        */

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

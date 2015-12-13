package com.hatma.ehealthkediri;
 
import javax.annotation.PostConstruct;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
 
import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.BarChartModel;
import org.primefaces.model.chart.HorizontalBarChartModel;
import org.primefaces.model.chart.ChartSeries;
 
@ManagedBean
public class ChartView implements Serializable {
 
    private BarChartModel barModel;
     
    @PostConstruct
    public void init() {
        createBarModels();
    }
 
    public BarChartModel getBarModel() {
        return barModel;
    }
     
   
 
    private BarChartModel initBarModel() {
        BarChartModel model = new BarChartModel();
 
        ChartSeries bayi = new ChartSeries();
        bayi.setLabel("bayi");
        bayi.set("pilek", 64);
        bayi.set("flu", 61);
        bayi.set("batuk", 53);
        bayi.set("berdahak", 65);
        bayi.set("meriang", 43);
        bayi.set("masuk angin", 60);
        bayi.set("panas dalam", 46);
        bayi.set("kejang", 62);
        bayi.set("katarak", 53);
        bayi.set("panu", 69);
 
        ChartSeries balita = new ChartSeries();
        balita.setLabel("bayi");
        balita.set("pilek", 64);
        balita.set("flu", 61);
        balita.set("batuk", 53);
        balita.set("berdahak", 65);
        balita.set("meriang", 43);
        balita.set("masuk angin", 60);
        balita.set("panas dalam", 46);
        balita.set("kejang", 62);
        balita.set("katarak", 53);
        balita.set("panu", 69);
        
        ChartSeries anak = new ChartSeries();
        anak.setLabel("anak");
        anak.set("pilek", 38);
        anak.set("flu", 52);
        anak.set("batuk", 39);
        anak.set("berdahak", 33);
        anak.set("meriang", 27);
        anak.set("masuk angin", 46);
        anak.set("panas dalam", 35);
        anak.set("kejang", 24);
        anak.set("katarak", 41);
        anak.set("panu", 42);
        
        ChartSeries rema = new ChartSeries();
        rema.setLabel("remaja");
        rema.set("pilek", 26);
        rema.set("flu", 30);
        rema.set("batuk", 30);
        rema.set("berdahak", 21);
        rema.set("meriang", 28);
        rema.set("masuk angin", 37);
        rema.set("panas dalam", 23);
        rema.set("kejang", 14);
        rema.set("katarak", 37);
        rema.set("panu", 23);
        
        ChartSeries dws = new ChartSeries();
        dws.setLabel("dewasa");
        dws.set("pilek", 14);
        dws.set("flu", 22);
        dws.set("batuk", 23);
        dws.set("berdahak", 17);
        dws.set("meriang", 21);
        dws.set("masuk angin", 27);
        dws.set("panas dalam", 11);
        dws.set("kejang", 14);
        dws.set("katarak", 25);
        dws.set("panu", 12);
        
        ChartSeries  tua= new ChartSeries();
        tua.setLabel("55");
        tua.set("pilek", 16);
        tua.set("flu", 19);
        tua.set("batuk", 26);
        tua.set("berdahak", 12);
        tua.set("meriang", 25);
        tua.set("masuk angin", 26);
        tua.set("panas dalam", 13);
        tua.set("kejang", 22);
        tua.set("katarak", 31);
        tua.set("panu", 13);
        
        
        model.addSeries(bayi);
        model.addSeries(balita);
        model.addSeries(anak);
        model.addSeries(rema);
        model.addSeries(dws);
        model.addSeries(tua);
         
        return model;
    }
     
    private void createBarModels() {
        createBarModel();
        
    }
     
    private void createBarModel() {
        barModel = initBarModel();
         
        barModel.setTitle("10 Penderita Berdasarkan Usia");
        barModel.setLegendPosition("ne");
         
        Axis xAxis = barModel.getAxis(AxisType.X);
        xAxis.setLabel("Penyakit");
         
        Axis yAxis = barModel.getAxis(AxisType.Y);
        yAxis.setLabel("Usia");
        yAxis.setMin(0);
        yAxis.setMax(300);
    }
     
    
 
}
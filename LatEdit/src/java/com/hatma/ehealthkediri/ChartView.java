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
    private HorizontalBarChartModel horizontalBarModel;
    private String puskesmas, bulan, tahun;

    public String getPuskesmas() {
        return puskesmas;
    }

    public void setPuskesmas(String puskesmas) {
        this.puskesmas = puskesmas;
    }

    public String getBulan() {
        return bulan;
    }

    public void setBulan(String bulan) {
        this.bulan = bulan;
    }

    public String getTahun() {
        return tahun;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }
    
    public void refreshBarChart2() {
        createBarModels();
    }
    
    @PostConstruct
    public void init() {
        createBarModels();
    }
 
    private void createBarModels() {
        createHorizontalBarModel();
        createBarModel();
    }
     
    public HorizontalBarChartModel getHorizontalBarModel() {
        return horizontalBarModel;
    }
   
    public BarChartModel getBarModel() {
        return barModel;
    }
    
    private HorizontalBarChartModel createHorizontalBarModel() {
        horizontalBarModel = new HorizontalBarChartModel();
 
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
        balita.setLabel("balita");
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
        tua.setLabel("tua");
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
        
        
        horizontalBarModel.addSeries(bayi);
        horizontalBarModel.addSeries(balita);
        horizontalBarModel.addSeries(anak);
        horizontalBarModel.addSeries(rema);
        horizontalBarModel.addSeries(dws);
        horizontalBarModel.addSeries(tua);
         
        horizontalBarModel.setTitle("10 Penderita Berdasarkan Usia");
        horizontalBarModel.setLegendPosition("e");
        horizontalBarModel.setStacked(true);
         
        Axis xAxis = horizontalBarModel.getAxis(AxisType.X);
        xAxis.setLabel("Usia");
        xAxis.setMin(0);
        xAxis.setMax(500);
         
        Axis yAxis = horizontalBarModel.getAxis(AxisType.Y);
        yAxis.setLabel("Penyakit");
         
        return horizontalBarModel;
    }
     
    private void createBarModel() {
        barModel = new BarChartModel();

        barModel.setTitle("10 Penderita Berdasarkan Usia");
        barModel.setLegendPosition("ne");
        barModel.setStacked(true);
        barModel.setAnimate(true);
        
        ChartSeries bayi = new ChartSeries();
        bayi.setLabel("bayi");
        bayi.set("pilek", (int) (Math.random() * 100));
        bayi.set("flu", (int) (Math.random() * 100));
        bayi.set("batuk", (int) (Math.random() * 100));
        bayi.set("berdahak", (int) (Math.random() * 100));
        bayi.set("meriang", (int) (Math.random() * 100));
        bayi.set("masuk angin", (int) (Math.random() * 100));
        bayi.set("panas dalam", (int) (Math.random() * 100));
        bayi.set("kejang", (int) (Math.random() * 100));
        bayi.set("katarak", (int) (Math.random() * 100));
        bayi.set("panu", (int) (Math.random() * 100));
 
        ChartSeries balita = new ChartSeries();
        balita.setLabel("balita");
        balita.set("pilek", (int) (Math.random() * 100));
        balita.set("flu", (int) (Math.random() * 100));
        balita.set("batuk", (int) (Math.random() * 100));
        balita.set("berdahak", (int) (Math.random() * 100));
        balita.set("meriang", (int) (Math.random() * 100));
        balita.set("masuk angin", (int) (Math.random() * 100));
        balita.set("panas dalam", (int) (Math.random() * 100));
        balita.set("kejang", (int) (Math.random() * 100));
        balita.set("katarak", (int) (Math.random() * 100));
        balita.set("panu", (int) (Math.random() * 100));
        
        ChartSeries anak = new ChartSeries();
        anak.setLabel("anak");
        anak.set("pilek", (int) (Math.random() * 100));
        anak.set("flu", (int) (Math.random() * 100));
        anak.set("batuk", (int) (Math.random() * 100));
        anak.set("berdahak", (int) (Math.random() * 100));
        anak.set("meriang", (int) (Math.random() * 100));
        anak.set("masuk angin", (int) (Math.random() * 100));
        anak.set("panas dalam", (int) (Math.random() * 100));
        anak.set("kejang", (int) (Math.random() * 100));
        anak.set("katarak", (int) (Math.random() * 100));
        anak.set("panu", (int) (Math.random() * 100));
        
        ChartSeries rema = new ChartSeries();
        rema.setLabel("remaja");
        rema.set("pilek", (int) (Math.random() * 100));
        rema.set("flu", (int) (Math.random() * 100));
        rema.set("batuk", (int) (Math.random() * 100));
        rema.set("berdahak", (int) (Math.random() * 100));
        rema.set("meriang", (int) (Math.random() * 100));
        rema.set("masuk angin", (int) (Math.random() * 100));
        rema.set("panas dalam", (int) (Math.random() * 100));
        rema.set("kejang", (int) (Math.random() * 100));
        rema.set("katarak", (int) (Math.random() * 100));
        rema.set("panu", (int) (Math.random() * 100));
        
        ChartSeries dws = new ChartSeries();
        dws.setLabel("dewasa");
        dws.set("pilek", (int) (Math.random() * 100));
        dws.set("flu", (int) (Math.random() * 100));
        dws.set("batuk", (int) (Math.random() * 100));
        dws.set("berdahak", (int) (Math.random() * 100));
        dws.set("meriang", (int) (Math.random() * 100));
        dws.set("masuk angin", (int) (Math.random() * 100));
        dws.set("panas dalam", (int) (Math.random() * 100));
        dws.set("kejang", (int) (Math.random() * 100));
        dws.set("katarak", (int) (Math.random() * 100));
        dws.set("panu", (int) (Math.random() * 100));
        
        ChartSeries  tua= new ChartSeries();
        tua.setLabel("tua");
        tua.set("pilek", (int) (Math.random() * 100));
        tua.set("flu", (int) (Math.random() * 100));
        tua.set("batuk", (int) (Math.random() * 100));
        tua.set("berdahak", (int) (Math.random() * 100));
        tua.set("meriang", (int) (Math.random() * 100));
        tua.set("masuk angin", (int) (Math.random() * 100));
        tua.set("panas dalam", (int) (Math.random() * 100));
        tua.set("kejang", (int) (Math.random() * 100));
        tua.set("katarak", (int) (Math.random() * 100));
        tua.set("panu", (int) (Math.random() * 100));
        
        barModel.addSeries(bayi);
        barModel.addSeries(balita);
        barModel.addSeries(anak);
        barModel.addSeries(rema);
        barModel.addSeries(dws);
        barModel.addSeries(tua);
        
        
        Axis xAxis = barModel.getAxis(AxisType.X);
        xAxis.setLabel("Penyakit");
        
        Axis yAxis = barModel.getAxis(AxisType.Y);
        yAxis.setLabel("Usia");
        yAxis.setMin(0);
        yAxis.setMax(500);
    }
     
  
}
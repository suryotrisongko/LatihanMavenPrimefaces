package com.hatma.ehealthkediri;
 
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
import org.primefaces.model.chart.HorizontalBarChartModel;
import org.primefaces.model.chart.ChartSeries;
 
@ManagedBean
public class Chart implements Serializable {
 
    private BarChartModel barModel;
    private HorizontalBarChartModel horizontalBarModel;
    private ChartSeries laki, prm;
    private String jeniskelamin = "Perempuan";
 
    public String getjeniskelamin() {
        return jeniskelamin;
    }

    public void setjeniskelamin(String jeniskelamin) {
        this.jeniskelamin = jeniskelamin;
    }
    @PostConstruct
    public void init() {
        createHorizontalBarModels();
    }
    
    public HorizontalBarChartModel getHorizontalBarModel() {
        return horizontalBarModel;
    }
    
    public BarChartModel getBarModel() {
        return barModel;
    }
    
    public void refreshChart3() {
        createHorizontalBarModel();
    }
    
    public void refreshChart2() {
        createHorizontalBarModel();
    }
 
    private void createHorizontalBarModels() {
        createHorizontalBarModel();
        createBarModel();
    }
    
    private HorizontalBarChartModel createHorizontalBarModel() {
        horizontalBarModel = new HorizontalBarChartModel();
 
        horizontalBarModel.setTitle("10 Penderita Berdasarkan Jenis Kelamin");
        horizontalBarModel.setLegendPosition("e");
        horizontalBarModel.setStacked(true);
        
        ChartSeries laki = new ChartSeries();
        laki.setLabel("Laki - laki");
        laki.set("pilek", 79);
        laki.set("flu", 101);
        laki.set("batuk", 81);
        laki.set("berdahak", 89);
        laki.set("meriang", 74);
        laki.set("masuk angin", 102);
        laki.set("panas dalam", 78);
        laki.set("kejang", 89);
        laki.set("katarak", 88);
        laki.set("panu", 91);
 
        ChartSeries prm = new ChartSeries();
        prm.setLabel("perempuan");
        prm.set("pilek", 113);
        prm.set("flu", 99);
        prm.set("batuk", 106);
        prm.set("berdahak", 83);
        prm.set("meriang", 86);
        prm.set("masuk angin", 87);
        prm.set("panas dalam", 94);
        prm.set("kejang", 75);
        prm.set("katarak", 99);
        prm.set("panu", 84);
       
        horizontalBarModel.addSeries(laki);
        horizontalBarModel.addSeries(prm);
         
        Axis xAxis = horizontalBarModel.getAxis(AxisType.X);
        xAxis.setLabel("Jenis Kelamin");
        xAxis.setMin(0);
        xAxis.setMax(500);
         
        Axis yAxis = horizontalBarModel.getAxis(AxisType.Y);
        yAxis.setLabel("Penyakit");
         
        return horizontalBarModel;
    }
     
    private void createBarModel() {
        barModel = new BarChartModel();

        barModel.setTitle("10 Penderita Berdasarkan Jenis Kelamin");
        barModel.setLegendPosition("ne");
        barModel.setStacked(true);
        barModel.setAnimate(true);
        
        ChartSeries laki = new ChartSeries();
        laki.setLabel("Laki - laki");
        laki.set("Pilek", 79);
        laki.set("Flu", 101);
        laki.set("Batuk", 81);
        laki.set("Berdahak", 89);
        laki.set("Meriang", 74);
        laki.set("Masuk angin", 102);
        laki.set("Panas dalam", 78);
        laki.set("Kejang", 89);
        laki.set("Katarak", 88);
        laki.set("Panu", 91);
 
        ChartSeries prm = new ChartSeries();
        prm.setLabel("Perempuan");
        prm.set("Pilek", 113);
        prm.set("Flu", 99);
        prm.set("Batuk", 106);
        prm.set("Berdahak", 83);
        prm.set("Meriang", 86);
        prm.set("Masuk angin", 87);
        prm.set("Panas dalam", 94);
        prm.set("Kejang", 75);
        prm.set("Katarak", 99);
        prm.set("Panu", 84);
       
        barModel.addSeries(laki);
        barModel.addSeries(prm);
        
        Axis xAxis = barModel.getAxis(AxisType.X);
        xAxis.setLabel("Penyakit");
                 
        Axis yAxis = barModel.getAxis(AxisType.Y);
        yAxis.setLabel("Jenis Kelamin");
        yAxis.setMin(0);
        yAxis.setMax(300);
    }
    
     public void itemSelectHorizontalBarModel(ItemSelectEvent event) {
        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Item selected",
                "Item Index: " + event.getItemIndex() + ", Series Index:" + event.getSeriesIndex());

        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public void itemSelect(ItemSelectEvent event) {
        
        HorizontalBarChartModel cModel = (HorizontalBarChartModel) ((org.primefaces.component.chart.Chart) event.getSource()).getModel();
        ChartSeries mySeries = cModel.getSeries().get(event.getSeriesIndex());
        Set<Map.Entry<Object, Number>> mapValues = mySeries.getData().entrySet();
        Map.Entry<Object, Number>[] test = new Map.Entry[mapValues.size()];
        mapValues.toArray(test);
        
        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Item selected",
                mySeries.getLabel() + ", " + test[event.getItemIndex()].getKey() + " = " + test[event.getItemIndex()].getValue() );

        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
  
}
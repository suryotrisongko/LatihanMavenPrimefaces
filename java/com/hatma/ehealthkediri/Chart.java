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
import org.primefaces.model.chart.HorizontalBarChartModel;
import org.primefaces.model.chart.ChartSeries;
 
@ManagedBean
public class Chart implements Serializable {
 
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
   public void refreshChart3() {
        createHorizontalBarModel();
    }
 
    private HorizontalBarChartModel createHorizontalBarModel() {
        horizontalBarModel = new HorizontalBarChartModel();
 
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
        
         
        horizontalBarModel.setTitle("10 Penderita Berdasarkan Jenis Kelamin");
        horizontalBarModel.setLegendPosition("e");
        horizontalBarModel.setStacked(true);
         
        Axis xAxis = horizontalBarModel.getAxis(AxisType.X);
        xAxis.setLabel("Jenis Kelamin");
        xAxis.setMin(0);
        xAxis.setMax(500);
         
        Axis yAxis = horizontalBarModel.getAxis(AxisType.Y);
        yAxis.setLabel("Penyakit");
         
        return horizontalBarModel;
    }
     
    private void createHorizontalBarModels() {
        createHorizontalBarModel();
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
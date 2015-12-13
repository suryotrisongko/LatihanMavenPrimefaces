package com.hatma.ehealthkediri;
 
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
  
import org.primefaces.event.map.OverlaySelectEvent;
import org.primefaces.model.map.DefaultMapModel;
import org.primefaces.model.map.LatLng;
import org.primefaces.model.map.MapModel;
import org.primefaces.model.map.Marker;
import org.primefaces.model.map.Polygon;
  
@ManagedBean
@ViewScoped
public class MapPuskesmasView implements Serializable {
      
    private MapModel advancedModel;  
    private Marker marker;
    private String penyakit = "Semua Penyakit";
    private String bulan = "Oktober";
    private String tahun = "2015";

    public String getPenyakit() {
        return penyakit;
    }

    public void setPenyakit(String penyakit) {
        this.penyakit = penyakit;
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
  
    @PostConstruct
    public void init() {
        createMapModel();
    }
  
    public MapModel getAdvancedModel() {
        return advancedModel;
    }
      
    public void onMarkerSelect(OverlaySelectEvent event) {
        marker = (Marker) event.getOverlay();
    }
      
    public Marker getMarker() {
        return marker;
    }
    
    public void refreshMap1() {
        createMapModel();
    }
    
    private void createMapModel() {
        
        advancedModel = new DefaultMapModel();
        
            //Shared coordinates
        LatLng coordA = new LatLng(-7.7809395, 112.0000759);
        LatLng coordB = new LatLng(-7.8174168, 112.0029492);
        LatLng coordC = new LatLng(-7.8111547, 111.9929893);
          
        //Icons and Data
        double tmpRandom = Math.random() * 3;
        if(tmpRandom <= 1) {
            advancedModel.addOverlay(new Marker(coordA, "puskesmas 1", "puskesmas1.png", "http://maps.google.com/mapfiles/ms/micons/green-dot.png"));
            advancedModel.addOverlay(new Marker(coordB, "puskesmas 2", "puskesmas2.png", "http://maps.google.com/mapfiles/ms/micons/red-dot.png"));
            advancedModel.addOverlay(new Marker(coordC, "puskesmas 3", "puskesmas3.png", "http://maps.google.com/mapfiles/ms/micons/yellow-dot.png"));
        } else if(tmpRandom <= 2) {
            advancedModel.addOverlay(new Marker(coordA, "puskesmas 1", "puskesmas1.png", "http://maps.google.com/mapfiles/ms/micons/red-dot.png"));
            advancedModel.addOverlay(new Marker(coordB, "puskesmas 2", "puskesmas2.png", "http://maps.google.com/mapfiles/ms/micons/green-dot.png"));
            advancedModel.addOverlay(new Marker(coordC, "puskesmas 3", "puskesmas3.png", "http://maps.google.com/mapfiles/ms/micons/yellow-dot.png"));
        } else {
            advancedModel.addOverlay(new Marker(coordA, "puskesmas 1", "puskesmas1.png", "http://maps.google.com/mapfiles/ms/micons/yellow-dot.png"));
            advancedModel.addOverlay(new Marker(coordB, "puskesmas 2", "puskesmas2.png", "http://maps.google.com/mapfiles/ms/micons/red-dot.png"));
            advancedModel.addOverlay(new Marker(coordC, "puskesmas 3", "puskesmas3.png", "http://maps.google.com/mapfiles/ms/micons/green-dot.png"));
        }
        
          
        String warna1 = "#FF0000";  //merah
        String warna2 = "#FFFF00";  //kuning
        String warna3 = "#008000";  //hijau
        
        if(tmpRandom <= 1) {            
            warna1 = "#FFFF00";  //kuning
            warna2 = "#FF0000";  //merah
            warna3 = "#008000";  //hijau            
        } else if(tmpRandom <= 2) {
            warna1 = "#008000";  //hijau
            warna2 = "#FF0000";  //merah
            warna3 = "#FFFF00";  //kuning            
        } 
            
        //kecamatan A = 
        LatLng coord1 = new LatLng( -7.827670,112.010422);
        LatLng coord2 = new LatLng( -7.830902,112.030849 );
        LatLng coord3 = new LatLng( -7.846037,112.029819 );
        LatLng coord4 = new LatLng( -7.870014,112.028961 );
        LatLng coord5 = new LatLng( -7.862191,112.002525 );
        LatLng coord6 = new LatLng( -7.841615,112.008705 );
        
        //Polygon Kecamatan A=
        Polygon polygonKecamatanA = new Polygon();
        polygonKecamatanA.getPaths().add(coord1);
        polygonKecamatanA.getPaths().add(coord2);
        polygonKecamatanA.getPaths().add(coord3);
        polygonKecamatanA.getPaths().add(coord4);
        polygonKecamatanA.getPaths().add(coord5);
        polygonKecamatanA.getPaths().add(coord6);
  
        polygonKecamatanA.setStrokeColor(warna1);
        polygonKecamatanA.setFillColor(warna1);
        polygonKecamatanA.setStrokeOpacity(0.7);
        polygonKecamatanA.setFillOpacity(0.7);
          
        advancedModel.addOverlay(polygonKecamatanA);       
        
        
        //kecamatanB =
        LatLng coord7 = new LatLng(-7.829881,112.031193);
        LatLng coord8 = new LatLng(-7.827160,112.010593);
        LatLng coord9 = new LatLng(-7.827330,111.996002);
        LatLng coord10 = new LatLng(-7.827840,111.985016);
        LatLng coord11 = new LatLng(-7.805392,111.992741);
        LatLng coord12 = new LatLng(-7.802500,111.997375);
        LatLng coord13 = new LatLng(-7.793146,112.006645);
        LatLng coord14 = new LatLng(-7.799779,112.035484 );
        LatLng coord15 = new LatLng(-7.824099,112.027245);
        LatLng coord16 = new LatLng(-7.826990,112.032566 ); 
        
        //Polygon Kecamatan B=
        Polygon polygonKecamatanB = new Polygon();
        polygonKecamatanB.getPaths().add(coord7);
        polygonKecamatanB.getPaths().add(coord8);
        polygonKecamatanB.getPaths().add(coord9);
        polygonKecamatanB.getPaths().add(coord10);
        polygonKecamatanB.getPaths().add(coord11);
        polygonKecamatanB.getPaths().add(coord12);
        polygonKecamatanB.getPaths().add(coord13);
        polygonKecamatanB.getPaths().add(coord14);
        polygonKecamatanB.getPaths().add(coord15);
        polygonKecamatanB.getPaths().add(coord16);
  
        polygonKecamatanB.setStrokeColor(warna2);
        polygonKecamatanB.setFillColor(warna2);
        polygonKecamatanB.setStrokeOpacity(0.7);
        polygonKecamatanB.setFillOpacity(0.7);
          
        advancedModel.addOverlay(polygonKecamatanB);
        
        
        //kecamatanC =
        LatLng coord17 = new LatLng(-7.806072,112.034283 );
        LatLng coord18 = new LatLng(-7.823929,112.027760 );
        LatLng coord19 = new LatLng(-7.826480,112.032394 );
        LatLng coord20 = new LatLng(-7.869503,112.030163 );
        LatLng coord21 = new LatLng(-7.877666,112.052650 );
        LatLng coord22 = new LatLng(-7.857940,112.060204 );
        LatLng coord23 = new LatLng(-7.839915,112.063980 );
        LatLng coord24 = new LatLng(-7.815766,112.063293 );
        
        //Polygon Kecamatan C=
        Polygon polygonKecamatanC = new Polygon();
        polygonKecamatanC.getPaths().add(coord17);
        polygonKecamatanC.getPaths().add(coord18);
        polygonKecamatanC.getPaths().add(coord19);
        polygonKecamatanC.getPaths().add(coord20);
        polygonKecamatanC.getPaths().add(coord21);
        polygonKecamatanC.getPaths().add(coord22);
        polygonKecamatanC.getPaths().add(coord23);
        polygonKecamatanC.getPaths().add(coord24);
  
        polygonKecamatanC.setStrokeColor(warna3);
        polygonKecamatanC.setFillColor(warna3);
        polygonKecamatanC.setStrokeOpacity(0.7);
        polygonKecamatanC.setFillOpacity(0.7);
          
        advancedModel.addOverlay(polygonKecamatanC);
        
    }
    
}
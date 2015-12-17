/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hatma.ehealthkediri.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author oracle
 */
@Entity
@Table(name = "histori_total_pasien_tahunan")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "HistoriTotalPasienTahunan.findAll", query = "SELECT h FROM HistoriTotalPasienTahunan h"),
    @NamedQuery(name = "HistoriTotalPasienTahunan.findById", query = "SELECT h FROM HistoriTotalPasienTahunan h WHERE h.id = :id"),
    @NamedQuery(name = "HistoriTotalPasienTahunan.findByTahunId", query = "SELECT h FROM HistoriTotalPasienTahunan h WHERE h.tahunId = :tahunId"),
    @NamedQuery(name = "HistoriTotalPasienTahunan.findByPuskesmasId", query = "SELECT h FROM HistoriTotalPasienTahunan h WHERE h.puskesmasId = :puskesmasId"),
    @NamedQuery(name = "HistoriTotalPasienTahunan.findByBulanId", query = "SELECT h FROM HistoriTotalPasienTahunan h WHERE h.bulanId = :bulanId"),
    @NamedQuery(name = "HistoriTotalPasienTahunan.findByJumlah", query = "SELECT h FROM HistoriTotalPasienTahunan h WHERE h.jumlah = :jumlah")})
public class HistoriTotalPasienTahunan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tahun_id")
    private int tahunId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "puskesmas_id")
    private int puskesmasId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "bulan_id")
    private int bulanId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "jumlah")
    private int jumlah;

    public HistoriTotalPasienTahunan() {
    }

    public HistoriTotalPasienTahunan(Integer id) {
        this.id = id;
    }

    public HistoriTotalPasienTahunan(Integer id, int tahunId, int puskesmasId, int bulanId, int jumlah) {
        this.id = id;
        this.tahunId = tahunId;
        this.puskesmasId = puskesmasId;
        this.bulanId = bulanId;
        this.jumlah = jumlah;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getTahunId() {
        return tahunId;
    }

    public void setTahunId(int tahunId) {
        this.tahunId = tahunId;
    }

    public int getPuskesmasId() {
        return puskesmasId;
    }

    public void setPuskesmasId(int puskesmasId) {
        this.puskesmasId = puskesmasId;
    }

    public int getBulanId() {
        return bulanId;
    }

    public void setBulanId(int bulanId) {
        this.bulanId = bulanId;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HistoriTotalPasienTahunan)) {
            return false;
        }
        HistoriTotalPasienTahunan other = (HistoriTotalPasienTahunan) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hatma.ehealthkediri.entity.HistoriTotalPasienTahunan[ id=" + id + " ]";
    }
    
}

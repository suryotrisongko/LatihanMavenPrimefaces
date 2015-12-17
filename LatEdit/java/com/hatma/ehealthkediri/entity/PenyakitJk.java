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
 * @author Jodie
 */
@Entity
@Table(name = "penyakit_jk")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PenyakitJk.findAll", query = "SELECT p FROM PenyakitJk p"),
    @NamedQuery(name = "PenyakitJk.findByIdp", query = "SELECT p FROM PenyakitJk p WHERE p.idp = :idp"),
    @NamedQuery(name = "PenyakitJk.findByPenyakitId", query = "SELECT p FROM PenyakitJk p WHERE p.penyakitId = :penyakitId"),
    @NamedQuery(name = "PenyakitJk.findByPuskesmasId", query = "SELECT p FROM PenyakitJk p WHERE p.puskesmasId = :puskesmasId"),
    @NamedQuery(name = "PenyakitJk.findByTahunId", query = "SELECT p FROM PenyakitJk p WHERE p.tahunId = :tahunId"),
    @NamedQuery(name = "PenyakitJk.findByBulanId", query = "SELECT p FROM PenyakitJk p WHERE p.bulanId = :bulanId"),
    @NamedQuery(name = "PenyakitJk.findByLaki", query = "SELECT p FROM PenyakitJk p WHERE p.laki = :laki"),
    @NamedQuery(name = "PenyakitJk.findByPrm", query = "SELECT p FROM PenyakitJk p WHERE p.prm = :prm")})
public class PenyakitJk implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idp")
    private Integer idp;
    @Basic(optional = false)
    @NotNull
    @Column(name = "penyakit_id")
    private int penyakitId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "puskesmas_id")
    private int puskesmasId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tahun_id")
    private int tahunId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "bulan_id")
    private int bulanId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "laki")
    private int laki;
    @Basic(optional = false)
    @NotNull
    @Column(name = "prm")
    private int prm;

    public PenyakitJk() {
    }

    public PenyakitJk(Integer idp) {
        this.idp = idp;
    }

    public PenyakitJk(Integer idp, int penyakitId, int puskesmasId, int tahunId, int bulanId, int laki, int prm) {
        this.idp = idp;
        this.penyakitId = penyakitId;
        this.puskesmasId = puskesmasId;
        this.tahunId = tahunId;
        this.bulanId = bulanId;
        this.laki = laki;
        this.prm = prm;
    }

    public Integer getIdp() {
        return idp;
    }

    public void setIdp(Integer idp) {
        this.idp = idp;
    }

    public int getPenyakitId() {
        return penyakitId;
    }

    public void setPenyakitId(int penyakitId) {
        this.penyakitId = penyakitId;
    }

    public int getPuskesmasId() {
        return puskesmasId;
    }

    public void setPuskesmasId(int puskesmasId) {
        this.puskesmasId = puskesmasId;
    }

    public int getTahunId() {
        return tahunId;
    }

    public void setTahunId(int tahunId) {
        this.tahunId = tahunId;
    }

    public int getBulanId() {
        return bulanId;
    }

    public void setBulanId(int bulanId) {
        this.bulanId = bulanId;
    }

    public int getLaki() {
        return laki;
    }

    public void setLaki(int laki) {
        this.laki = laki;
    }

    public int getPrm() {
        return prm;
    }

    public void setPrm(int prm) {
        this.prm = prm;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idp != null ? idp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PenyakitJk)) {
            return false;
        }
        PenyakitJk other = (PenyakitJk) object;
        if ((this.idp == null && other.idp != null) || (this.idp != null && !this.idp.equals(other.idp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hatma.ehealthkediri.entity.PenyakitJk[ idp=" + idp + " ]";
    }
    
}

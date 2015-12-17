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
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author oracle
 */
@Entity
@Table(name = "bulan")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bulan.findAll", query = "SELECT b FROM Bulan b"),
    @NamedQuery(name = "Bulan.findByBulanId", query = "SELECT b FROM Bulan b WHERE b.bulanId = :bulanId"),
    @NamedQuery(name = "Bulan.findByBulanName", query = "SELECT b FROM Bulan b WHERE b.bulanName = :bulanName")})
public class Bulan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "bulan_id")
    private Integer bulanId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "bulan_name")
    private String bulanName;

    public Bulan() {
    }

    public Bulan(Integer bulanId) {
        this.bulanId = bulanId;
    }

    public Bulan(Integer bulanId, String bulanName) {
        this.bulanId = bulanId;
        this.bulanName = bulanName;
    }

    public Integer getBulanId() {
        return bulanId;
    }

    public void setBulanId(Integer bulanId) {
        this.bulanId = bulanId;
    }

    public String getBulanName() {
        return bulanName;
    }

    public void setBulanName(String bulanName) {
        this.bulanName = bulanName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bulanId != null ? bulanId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bulan)) {
            return false;
        }
        Bulan other = (Bulan) object;
        if ((this.bulanId == null && other.bulanId != null) || (this.bulanId != null && !this.bulanId.equals(other.bulanId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hatma.ehealthkediri.entity.Bulan[ bulanId=" + bulanId + " ]";
    }
    
}

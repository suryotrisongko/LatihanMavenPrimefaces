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
@Table(name = "tahun")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tahun.findAll", query = "SELECT t FROM Tahun t"),
    @NamedQuery(name = "Tahun.findByTahunId", query = "SELECT t FROM Tahun t WHERE t.tahunId = :tahunId"),
    @NamedQuery(name = "Tahun.findByTahunName", query = "SELECT t FROM Tahun t WHERE t.tahunName = :tahunName")})
public class Tahun implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "tahun_id")
    private Integer tahunId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "tahun_name")
    private String tahunName;

    public Tahun() {
    }

    public Tahun(Integer tahunId) {
        this.tahunId = tahunId;
    }

    public Tahun(Integer tahunId, String tahunName) {
        this.tahunId = tahunId;
        this.tahunName = tahunName;
    }

    public Integer getTahunId() {
        return tahunId;
    }

    public void setTahunId(Integer tahunId) {
        this.tahunId = tahunId;
    }

    public String getTahunName() {
        return tahunName;
    }

    public void setTahunName(String tahunName) {
        this.tahunName = tahunName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tahunId != null ? tahunId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tahun)) {
            return false;
        }
        Tahun other = (Tahun) object;
        if ((this.tahunId == null && other.tahunId != null) || (this.tahunId != null && !this.tahunId.equals(other.tahunId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hatma.ehealthkediri.entity.Tahun[ tahunId=" + tahunId + " ]";
    }
    
}

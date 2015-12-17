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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author oracle
 */
@Entity
@Table(name = "penyakit")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Penyakit.findAll", query = "SELECT p FROM Penyakit p"),
    @NamedQuery(name = "Penyakit.findByPenyakitId", query = "SELECT p FROM Penyakit p WHERE p.penyakitId = :penyakitId"),
    @NamedQuery(name = "Penyakit.findByPenyakitName", query = "SELECT p FROM Penyakit p WHERE p.penyakitName = :penyakitName")})
public class Penyakit implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "penyakit_id")
    private Integer penyakitId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "penyakit_name")
    private String penyakitName;

    public Penyakit() {
    }

    public Penyakit(Integer penyakitId) {
        this.penyakitId = penyakitId;
    }

    public Penyakit(Integer penyakitId, String penyakitName) {
        this.penyakitId = penyakitId;
        this.penyakitName = penyakitName;
    }

    public Integer getPenyakitId() {
        return penyakitId;
    }

    public void setPenyakitId(Integer penyakitId) {
        this.penyakitId = penyakitId;
    }

    public String getPenyakitName() {
        return penyakitName;
    }

    public void setPenyakitName(String penyakitName) {
        this.penyakitName = penyakitName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (penyakitId != null ? penyakitId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Penyakit)) {
            return false;
        }
        Penyakit other = (Penyakit) object;
        if ((this.penyakitId == null && other.penyakitId != null) || (this.penyakitId != null && !this.penyakitId.equals(other.penyakitId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hatma.ehealthkediri.entity.Penyakit[ penyakitId=" + penyakitId + " ]";
    }
    
}

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
@Table(name = "puskesmas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Puskesmas.findAll", query = "SELECT p FROM Puskesmas p"),
    @NamedQuery(name = "Puskesmas.findByPuskesmasId", query = "SELECT p FROM Puskesmas p WHERE p.puskesmasId = :puskesmasId"),
    @NamedQuery(name = "Puskesmas.findByPuskesmasName", query = "SELECT p FROM Puskesmas p WHERE p.puskesmasName = :puskesmasName")})
public class Puskesmas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "puskesmas_id")
    private Integer puskesmasId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "puskesmas_name")
    private String puskesmasName;

    public Puskesmas() {
    }

    public Puskesmas(Integer puskesmasId) {
        this.puskesmasId = puskesmasId;
    }

    public Puskesmas(Integer puskesmasId, String puskesmasName) {
        this.puskesmasId = puskesmasId;
        this.puskesmasName = puskesmasName;
    }

    public Integer getPuskesmasId() {
        return puskesmasId;
    }

    public void setPuskesmasId(Integer puskesmasId) {
        this.puskesmasId = puskesmasId;
    }

    public String getPuskesmasName() {
        return puskesmasName;
    }

    public void setPuskesmasName(String puskesmasName) {
        this.puskesmasName = puskesmasName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (puskesmasId != null ? puskesmasId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Puskesmas)) {
            return false;
        }
        Puskesmas other = (Puskesmas) object;
        if ((this.puskesmasId == null && other.puskesmasId != null) || (this.puskesmasId != null && !this.puskesmasId.equals(other.puskesmasId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hatma.ehealthkediri.entity.Puskesmas[ puskesmasId=" + puskesmasId + " ]";
    }
    
}

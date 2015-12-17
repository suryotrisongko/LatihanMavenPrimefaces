/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hatma.ehealthkediri;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "10_penderita_berdasarkan_usia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PenderitaBerdasarkanUsia.findAll", query = "SELECT p FROM PenderitaBerdasarkanUsia p"),
    @NamedQuery(name = "PenderitaBerdasarkanUsia.findById", query = "SELECT p FROM PenderitaBerdasarkanUsia p WHERE p.id = :id"),
    @NamedQuery(name = "PenderitaBerdasarkanUsia.findByPilek", query = "SELECT p FROM PenderitaBerdasarkanUsia p WHERE p.pilek = :pilek"),
    @NamedQuery(name = "PenderitaBerdasarkanUsia.findByFlu", query = "SELECT p FROM PenderitaBerdasarkanUsia p WHERE p.flu = :flu"),
    @NamedQuery(name = "PenderitaBerdasarkanUsia.findByBatuk", query = "SELECT p FROM PenderitaBerdasarkanUsia p WHERE p.batuk = :batuk"),
    @NamedQuery(name = "PenderitaBerdasarkanUsia.findByBerdahak", query = "SELECT p FROM PenderitaBerdasarkanUsia p WHERE p.berdahak = :berdahak"),
    @NamedQuery(name = "PenderitaBerdasarkanUsia.findByMeriang", query = "SELECT p FROM PenderitaBerdasarkanUsia p WHERE p.meriang = :meriang"),
    @NamedQuery(name = "PenderitaBerdasarkanUsia.findByMasukAngin", query = "SELECT p FROM PenderitaBerdasarkanUsia p WHERE p.masukAngin = :masukAngin"),
    @NamedQuery(name = "PenderitaBerdasarkanUsia.findByPanasDalam", query = "SELECT p FROM PenderitaBerdasarkanUsia p WHERE p.panasDalam = :panasDalam"),
    @NamedQuery(name = "PenderitaBerdasarkanUsia.findByKejang", query = "SELECT p FROM PenderitaBerdasarkanUsia p WHERE p.kejang = :kejang"),
    @NamedQuery(name = "PenderitaBerdasarkanUsia.findByKatarak", query = "SELECT p FROM PenderitaBerdasarkanUsia p WHERE p.katarak = :katarak"),
    @NamedQuery(name = "PenderitaBerdasarkanUsia.findByPanu", query = "SELECT p FROM PenderitaBerdasarkanUsia p WHERE p.panu = :panu")})
public class PenderitaBerdasarkanUsia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pilek")
    private int pilek;
    @Basic(optional = false)
    @NotNull
    @Column(name = "flu")
    private int flu;
    @Basic(optional = false)
    @NotNull
    @Column(name = "batuk")
    private int batuk;
    @Basic(optional = false)
    @NotNull
    @Column(name = "berdahak")
    private int berdahak;
    @Basic(optional = false)
    @NotNull
    @Column(name = "meriang")
    private int meriang;
    @Basic(optional = false)
    @NotNull
    @Column(name = "masuk_angin")
    private int masukAngin;
    @Basic(optional = false)
    @NotNull
    @Column(name = "panas_dalam")
    private int panasDalam;
    @Basic(optional = false)
    @NotNull
    @Column(name = "kejang")
    private int kejang;
    @Basic(optional = false)
    @NotNull
    @Column(name = "katarak")
    private int katarak;
    @Basic(optional = false)
    @NotNull
    @Column(name = "panu")
    private int panu;

    public PenderitaBerdasarkanUsia() {
    }

    public PenderitaBerdasarkanUsia(Integer id) {
        this.id = id;
    }

    public PenderitaBerdasarkanUsia(Integer id, int pilek, int flu, int batuk, int berdahak, int meriang, int masukAngin, int panasDalam, int kejang, int katarak, int panu) {
        this.id = id;
        this.pilek = pilek;
        this.flu = flu;
        this.batuk = batuk;
        this.berdahak = berdahak;
        this.meriang = meriang;
        this.masukAngin = masukAngin;
        this.panasDalam = panasDalam;
        this.kejang = kejang;
        this.katarak = katarak;
        this.panu = panu;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getPilek() {
        return pilek;
    }

    public void setPilek(int pilek) {
        this.pilek = pilek;
    }

    public int getFlu() {
        return flu;
    }

    public void setFlu(int flu) {
        this.flu = flu;
    }

    public int getBatuk() {
        return batuk;
    }

    public void setBatuk(int batuk) {
        this.batuk = batuk;
    }

    public int getBerdahak() {
        return berdahak;
    }

    public void setBerdahak(int berdahak) {
        this.berdahak = berdahak;
    }

    public int getMeriang() {
        return meriang;
    }

    public void setMeriang(int meriang) {
        this.meriang = meriang;
    }

    public int getMasukAngin() {
        return masukAngin;
    }

    public void setMasukAngin(int masukAngin) {
        this.masukAngin = masukAngin;
    }

    public int getPanasDalam() {
        return panasDalam;
    }

    public void setPanasDalam(int panasDalam) {
        this.panasDalam = panasDalam;
    }

    public int getKejang() {
        return kejang;
    }

    public void setKejang(int kejang) {
        this.kejang = kejang;
    }

    public int getKatarak() {
        return katarak;
    }

    public void setKatarak(int katarak) {
        this.katarak = katarak;
    }

    public int getPanu() {
        return panu;
    }

    public void setPanu(int panu) {
        this.panu = panu;
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
        if (!(object instanceof PenderitaBerdasarkanUsia)) {
            return false;
        }
        PenderitaBerdasarkanUsia other = (PenderitaBerdasarkanUsia) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hatma.ehealthkediri.PenderitaBerdasarkanUsia[ id=" + id + " ]";
    }
    
}

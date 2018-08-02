/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prolab2proje4;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
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
import javax.persistence.Transient;

/**
 *
 * @author ous
 */
@Entity
@Table(name = "tbl_ilan", catalog = "otomobil_yonetim", schema = "")
@NamedQueries({
    @NamedQuery(name = "TblIlan.findAll", query = "SELECT t FROM TblIlan t")
    , @NamedQuery(name = "TblIlan.findByIlanID", query = "SELECT t FROM TblIlan t WHERE t.ilanID = :ilanID")
    , @NamedQuery(name = "TblIlan.findByIlanAdi", query = "SELECT t FROM TblIlan t WHERE t.ilanAdi = :ilanAdi")
    , @NamedQuery(name = "TblIlan.findByIlanFiyat", query = "SELECT t FROM TblIlan t WHERE t.ilanFiyat = :ilanFiyat")
    , @NamedQuery(name = "TblIlan.findByIlanKm", query = "SELECT t FROM TblIlan t WHERE t.ilanKm = :ilanKm")
    , @NamedQuery(name = "TblIlan.findByIlanTarih", query = "SELECT t FROM TblIlan t WHERE t.ilanTarih = :ilanTarih")
    , @NamedQuery(name = "TblIlan.findByIlanArabaID", query = "SELECT t FROM TblIlan t WHERE t.ilanArabaID = :ilanArabaID")
    , @NamedQuery(name = "TblIlan.findByIlanSehirID", query = "SELECT t FROM TblIlan t WHERE t.ilanSehirID = :ilanSehirID")})
public class TblIlan implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IlanID")
    private Integer ilanID;
    @Basic(optional = false)
    @Column(name = "Ilan_Adi")
    private String ilanAdi;
    @Basic(optional = false)
    @Column(name = "Ilan_Fiyat")
    private String ilanFiyat;
    @Basic(optional = false)
    @Column(name = "Ilan_Km")
    private String ilanKm;
    @Basic(optional = false)
    @Column(name = "Ilan_Tarih")
    private String ilanTarih;
    @Basic(optional = false)
    @Column(name = "Ilan_ArabaID")
    private int ilanArabaID;
    @Basic(optional = false)
    @Column(name = "Ilan_SehirID")
    private int ilanSehirID;

    public TblIlan() {
    }

    public TblIlan(Integer ilanID) {
        this.ilanID = ilanID;
    }

    public TblIlan(Integer ilanID, String ilanAdi, String ilanFiyat, String ilanKm, String ilanTarih, int ilanArabaID, int ilanSehirID) {
        this.ilanID = ilanID;
        this.ilanAdi = ilanAdi;
        this.ilanFiyat = ilanFiyat;
        this.ilanKm = ilanKm;
        this.ilanTarih = ilanTarih;
        this.ilanArabaID = ilanArabaID;
        this.ilanSehirID = ilanSehirID;
    }

    public Integer getIlanID() {
        return ilanID;
    }

    public void setIlanID(Integer ilanID) {
        Integer oldIlanID = this.ilanID;
        this.ilanID = ilanID;
        changeSupport.firePropertyChange("ilanID", oldIlanID, ilanID);
    }

    public String getIlanAdi() {
        return ilanAdi;
    }

    public void setIlanAdi(String ilanAdi) {
        String oldIlanAdi = this.ilanAdi;
        this.ilanAdi = ilanAdi;
        changeSupport.firePropertyChange("ilanAdi", oldIlanAdi, ilanAdi);
    }

    public String getIlanFiyat() {
        return ilanFiyat;
    }

    public void setIlanFiyat(String ilanFiyat) {
        String oldIlanFiyat = this.ilanFiyat;
        this.ilanFiyat = ilanFiyat;
        changeSupport.firePropertyChange("ilanFiyat", oldIlanFiyat, ilanFiyat);
    }

    public String getIlanKm() {
        return ilanKm;
    }

    public void setIlanKm(String ilanKm) {
        String oldIlanKm = this.ilanKm;
        this.ilanKm = ilanKm;
        changeSupport.firePropertyChange("ilanKm", oldIlanKm, ilanKm);
    }

    public String getIlanTarih() {
        return ilanTarih;
    }

    public void setIlanTarih(String ilanTarih) {
        String oldIlanTarih = this.ilanTarih;
        this.ilanTarih = ilanTarih;
        changeSupport.firePropertyChange("ilanTarih", oldIlanTarih, ilanTarih);
    }

    public int getIlanArabaID() {
        return ilanArabaID;
    }

    public void setIlanArabaID(int ilanArabaID) {
        int oldIlanArabaID = this.ilanArabaID;
        this.ilanArabaID = ilanArabaID;
        changeSupport.firePropertyChange("ilanArabaID", oldIlanArabaID, ilanArabaID);
    }

    public int getIlanSehirID() {
        return ilanSehirID;
    }

    public void setIlanSehirID(int ilanSehirID) {
        int oldIlanSehirID = this.ilanSehirID;
        this.ilanSehirID = ilanSehirID;
        changeSupport.firePropertyChange("ilanSehirID", oldIlanSehirID, ilanSehirID);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ilanID != null ? ilanID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblIlan)) {
            return false;
        }
        TblIlan other = (TblIlan) object;
        if ((this.ilanID == null && other.ilanID != null) || (this.ilanID != null && !this.ilanID.equals(other.ilanID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "prolab2proje4.TblIlan[ ilanID=" + ilanID + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}

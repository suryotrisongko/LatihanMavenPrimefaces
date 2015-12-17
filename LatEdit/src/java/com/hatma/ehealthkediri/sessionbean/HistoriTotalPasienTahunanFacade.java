/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hatma.ehealthkediri.sessionbean;

import com.hatma.ehealthkediri.entity.HistoriTotalPasienTahunan;
import com.hatma.ehealthkediri.entity.HistoriTotalPasienTahunan_;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;


/**
 *
 * @author oracle
 */
@Stateless
public class HistoriTotalPasienTahunanFacade extends AbstractFacade<HistoriTotalPasienTahunan> {

    @PersistenceContext(unitName = "LatEditPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public HistoriTotalPasienTahunanFacade() {
        super(HistoriTotalPasienTahunan.class);
    }

    // Hatma 17 Dec 2015
    public List<HistoriTotalPasienTahunan> findByTahunIdPuskesmasId(int tahun_id, int puskesmas_id) {

        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<HistoriTotalPasienTahunan> cq = cb.createQuery(HistoriTotalPasienTahunan.class);    // ini output mau apa?
        Root<HistoriTotalPasienTahunan> history = cq.from(HistoriTotalPasienTahunan.class);

        //cq.select(tabel.get(tabel_.namakolom));    // select salah satu kolom saja
        cq.select(history);     // select * (semua kolom)
        //cq.where(cb.equal(history.get(HistoriTotalPasienTahunan_.tahunId), tahun_id)); // WHERE 1 kondisi

        //where 2 kondisi
        Predicate condition = cb.equal(history.get(HistoriTotalPasienTahunan_.tahunId), tahun_id);
        Predicate condition2 = cb.equal(history.get(HistoriTotalPasienTahunan_.puskesmasId), puskesmas_id);
        Predicate condition3 = cb.and(condition, condition2);
        cq.where(condition3);

        TypedQuery<HistoriTotalPasienTahunan> q = em.createQuery(cq);
        List<HistoriTotalPasienTahunan> allHistory = q.getResultList();
        return allHistory;

    }

}

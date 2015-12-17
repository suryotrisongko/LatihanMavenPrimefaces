/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hatma.ehealthkediri.sessionbean;

import com.hatma.ehealthkediri.entity.PenyakitJk;
import com.hatma.ehealthkediri.entity.PenyakitJk_;
import com.hatma.ehealthkediri.entity.PenyakitJk;
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
 * @author Jodie
 */
@Stateless
public class PenyakitJkFacade extends AbstractFacade<PenyakitJk> {

    @PersistenceContext(unitName = "LatEditPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PenyakitJkFacade() {
        super(PenyakitJk.class);
    }
    
    public List<PenyakitJk> findByTahunIdPuskesmasIdBulanId(int tahun_id, int puskesmas_id, int bulan_id) {

        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<PenyakitJk> cq = cb.createQuery(PenyakitJk.class);    // ini output mau apa?
        Root<PenyakitJk> jenisk = cq.from(PenyakitJk.class);

        //cq.select(tabel.get(tabel_.namakolom));    // select salah satu kolom saja
        cq.select(jenisk);     // select * (semua kolom)
        //cq.where(cb.equal(history.get(HistoriTotalPasienTahunan_.tahunId), tahun_id)); // WHERE 1 kondisi

        //where 2 kondisi
        Predicate condition4 = cb.equal(jenisk.get(PenyakitJk_.tahunId), tahun_id);
        Predicate condition5 = cb.equal(jenisk.get(PenyakitJk_.bulanId), bulan_id);
        Predicate condition6 = cb.equal(jenisk.get(PenyakitJk_.puskesmasId), puskesmas_id);
        Predicate condition7 = cb.and(condition4, condition5, condition6);
        cq.where(condition7);

        TypedQuery<PenyakitJk> q = em.createQuery(cq);
        List<PenyakitJk> allHistory = q.getResultList();
        return allHistory;

    }
}

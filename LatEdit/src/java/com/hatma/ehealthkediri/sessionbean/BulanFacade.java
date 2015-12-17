/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hatma.ehealthkediri.sessionbean;

import com.hatma.ehealthkediri.entity.Bulan;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author oracle
 */
@Stateless
public class BulanFacade extends AbstractFacade<Bulan> {

    @PersistenceContext(unitName = "LatEditPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BulanFacade() {
        super(Bulan.class);
    }
    
}

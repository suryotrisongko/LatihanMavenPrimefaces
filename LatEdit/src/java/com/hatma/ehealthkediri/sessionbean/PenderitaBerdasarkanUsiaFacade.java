/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hatma.ehealthkediri.sessionbean;

import com.hatma.ehealthkediri.PenderitaBerdasarkanUsia;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Jodie
 */
@Stateless
public class PenderitaBerdasarkanUsiaFacade extends AbstractFacade<PenderitaBerdasarkanUsia> {

    @PersistenceContext(unitName = "LatEditPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PenderitaBerdasarkanUsiaFacade() {
        super(PenderitaBerdasarkanUsia.class);
    }
    
}

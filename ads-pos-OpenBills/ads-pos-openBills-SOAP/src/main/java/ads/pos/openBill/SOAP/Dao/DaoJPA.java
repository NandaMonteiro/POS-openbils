/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ads.pos.openBill.SOAP.Dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Luciana
 */
public class DaoJPA implements Dao {

    @PersistenceContext(name = "openbills")
    private EntityManager em;

    public DaoJPA() {
    }

    @Override
    public void salvar(Object o) {
        em.persist(o);
    }

    @Override
    public void remover(Object o) {
        em.remove(o);
    }

    @Override
    public void atualizar(Object o) {
        em.merge(o);
    }

    @Override
    public Object buscar(Class classe, Object object) {
        return em.find(classe, object);
    }

}

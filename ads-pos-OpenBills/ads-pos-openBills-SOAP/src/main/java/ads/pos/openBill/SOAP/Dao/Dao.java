/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ads.pos.openBill.SOAP.Dao;

/**
 *
 * @author Luciana
 */
public interface Dao {

    public void salvar(Object o);

    public void remover(Object o);

    public void atualizar(Object o);

    public Object buscar(Class classe, Object object);

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.cibertec.gchhibernate.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import pe.edu.cibertec.gchhibernate.modelo.Estado;
import pe.edu.cibertec.gchhibernate.util.PersistenceUtil;

/**
 *
 * @author Lucas
 */
public class EstadoDaoImpl implements EstadoDao{
    
    private static EstadoDaoImpl instance =null;

    @Override
    public List<Estado> listarTodo() {
        EntityManager em=PersistenceUtil.getEmf().createEntityManager();

        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Estado> cq = cb.createQuery(Estado.class);
        Root<Estado> estadoRoot = cq.from(Estado.class);
        cq.select(estadoRoot);

        TypedQuery<Estado> typedQuery = em.createQuery(cq);

        List<Estado> estados = typedQuery.getResultList();
        em.close();
        
        return estados;
    }

    @Override
    public Estado obtenerSegun(Integer codigo) {
        EntityManager em=PersistenceUtil.getEmf().createEntityManager();

        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Estado> cq = cb.createQuery(Estado.class);
        Root<Estado> estadoRoot = cq.from(Estado.class);
        cq.where(cb.equal(estadoRoot.get("codigo"), codigo));
        cq.select(estadoRoot);

        TypedQuery<Estado> typedQuery = em.createQuery(cq);
        
        Estado estado = typedQuery.getSingleResult();
        
        em.close();
        
        return estado;
    }
    
    protected EstadoDaoImpl() {
      // Exists only to defeat instantiation.
       
   }
   
   //initiate using singleton 
   public static EstadoDaoImpl getInstance() {
      if(instance == null) {
         instance = new EstadoDaoImpl();
      }
      return instance;
   }
    
}

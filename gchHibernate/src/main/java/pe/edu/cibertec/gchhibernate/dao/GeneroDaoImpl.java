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
import pe.edu.cibertec.gchhibernate.modelo.Genero;
import pe.edu.cibertec.gchhibernate.util.PersistenceUtil;

/**
 *
 * @author Lucas
 */
public class GeneroDaoImpl implements GeneroDao{
    
    private static GeneroDaoImpl instance =null;

    @Override
    public List<Genero> listarTodo() {
        EntityManager em=PersistenceUtil.getEmf().createEntityManager();

        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Genero> cq = cb.createQuery(Genero.class);
        Root<Genero> generoRoot = cq.from(Genero.class);
        cq.select(generoRoot);

        TypedQuery<Genero> typedQuery = em.createQuery(cq);

        List<Genero> genero = typedQuery.getResultList();
        em.close();
        
        return genero;
    }

    @Override
    public Genero obtenerSegun(Integer codigo) {
        EntityManager em=PersistenceUtil.getEmf().createEntityManager();

        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Genero> cq = cb.createQuery(Genero.class);
        Root<Genero> generoRoot = cq.from(Genero.class);
        cq.where(cb.equal(generoRoot.get("codigo"), codigo));
        cq.select(generoRoot);

        TypedQuery<Genero> typedQuery = em.createQuery(cq);
        
        Genero genero = typedQuery.getSingleResult();
        
        em.close();
        
        return genero;
    }
    
   protected GeneroDaoImpl() {
      // Exists only to defeat instantiation.
       
   }
   
   //initiate using singleton 
   public static GeneroDaoImpl getInstance() {
      if(instance == null) {
         instance = new GeneroDaoImpl();
      }
      return instance;
   }
    
}

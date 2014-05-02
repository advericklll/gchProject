package pe.edu.cibertec.gchhibernate.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Root;
import pe.edu.cibertec.gchhibernate.modelo.Profesor;
import pe.edu.cibertec.gchhibernate.util.PersistenceUtil;

public class ProfesorDaoImpl implements ProfesorDao {
    
    private static ProfesorDaoImpl instance =null;

    @Override
    public void registrar(Profesor profesor) {
        EntityManager em=PersistenceUtil.getEmf().createEntityManager();
        em.getTransaction().begin();
        
        em.persist(profesor);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void actualizar(Profesor profesor) {
        EntityManager em=PersistenceUtil.getEmf().createEntityManager();
        em.getTransaction().begin();
        
        em.merge(profesor);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void eliminarSegun(Integer codigo) {
        EntityManager em=PersistenceUtil.getEmf().createEntityManager();
        em.getTransaction().begin();
        
        Profesor profesor = (Profesor) em.find(Profesor.class, codigo);
        em.remove(profesor);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public List<Profesor> listarTodo() {
        EntityManager em=PersistenceUtil.getEmf().createEntityManager();

        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Profesor> cq = cb.createQuery(Profesor.class);
        Root<Profesor> profesorRoot = cq.from(Profesor.class);
        cq.select(profesorRoot);

        TypedQuery<Profesor> typedQuery = em.createQuery(cq);

        List<Profesor> profesores = typedQuery.getResultList();
        em.close();
        
        return profesores;
    }

    @Override
    public List<Profesor> listarSegun(String nombres, String apellidoPaterno, String apellidoMaterno) {
        EntityManager em=PersistenceUtil.getEmf().createEntityManager();

        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Profesor> cq = cb.createQuery(Profesor.class);
        Root<Profesor> profesorRoot = cq.from(Profesor.class);
        
        ParameterExpression<String> p1 = cb.parameter(String.class);
        ParameterExpression<String> p2 = cb.parameter(String.class);
        ParameterExpression<String> p3 = cb.parameter(String.class);
        
        Expression<String> nombres1 = profesorRoot.get("nombres");
        Expression<String> apellidoPat = profesorRoot.get("apellidoPat");
        Expression<String> apellidoMat = profesorRoot.get("apellidoMaterno");

        cq.where(                
                cb.like(nombres1, p1),
                cb.and(cb.like(apellidoPat, p2)),
                cb.and(cb.like(apellidoMat, p3))                
        );        
        
        cq.select(profesorRoot);

        TypedQuery<Profesor> typedQuery = em.createQuery(cq);
        
        typedQuery.setParameter(p1, nombres+"%");
        typedQuery.setParameter(p2, apellidoPaterno+"%");
        typedQuery.setParameter(p3, apellidoMaterno+"%");

        List<Profesor> profesores = typedQuery.getResultList();
        em.close();
        
        return profesores;
    }

    @Override
    public Profesor obtenerSegun(Integer codigo) {
        EntityManager em=PersistenceUtil.getEmf().createEntityManager();

        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Profesor> cq = cb.createQuery(Profesor.class);
        Root<Profesor> profesorRoot = cq.from(Profesor.class);
        cq.where(cb.equal(profesorRoot.get("codigo"), codigo));
        cq.select(profesorRoot);

        TypedQuery<Profesor> typedQuery = em.createQuery(cq);
        
        Profesor profesor = typedQuery.getSingleResult();
        
        em.close();
        
        return profesor;
    }   
        
   protected ProfesorDaoImpl() {
      // Exists only to defeat instantiation.
       
   }
   
   //initiate using singleton 
   public static ProfesorDaoImpl getInstance() {
      if(instance == null) {
         instance = new ProfesorDaoImpl();
      }
      return instance;
   }
}

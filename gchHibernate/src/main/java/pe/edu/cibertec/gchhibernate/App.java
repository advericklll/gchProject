package pe.edu.cibertec.gchhibernate;

import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import pe.edu.cibertec.gchhibernate.modelo.Profesor;
import pe.edu.cibertec.gchhibernate.util.PersistenceUtil;

/**
 * Hello world!
 *
 */
public class App 
{   
    
    private static final Logger logger = Logger.getLogger(App.class.getName());
    public static void main( String[] args )
    {
        EntityManager em=PersistenceUtil.getEmf().createEntityManager();

        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Profesor> cq = cb.createQuery(Profesor.class);
        Root<Profesor> profesorRoot = cq.from(Profesor.class);
        cq.select(profesorRoot);

        TypedQuery<Profesor> typedQuery = em.createQuery(cq);

        List<Profesor> profesores = typedQuery.getResultList();
        
        
        Iterator it = profesores.iterator();
        while (it.hasNext()) {
            logger.log(Level.INFO, it.next().toString());
        }

        em.close();
        
        
    }
}

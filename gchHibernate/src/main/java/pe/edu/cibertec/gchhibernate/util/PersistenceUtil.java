/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.cibertec.gchhibernate.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Lucas
 */
public class PersistenceUtil {
    private static EntityManagerFactory emf;
    
    static {
        emf=Persistence.createEntityManagerFactory("PU_GCH");
    }
    
    public static EntityManagerFactory getEmf(){
        return emf;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.cibertec.gchhibernate.factory;

import pe.edu.cibertec.gchhibernate.enums.ServiceTypes;
import static pe.edu.cibertec.gchhibernate.enums.ServiceTypes.REMOTO;
import static pe.edu.cibertec.gchhibernate.enums.ServiceTypes.SERVERBD;
import pe.edu.cibertec.gchhibernate.service.ProfesorService;
import pe.edu.cibertec.gchhibernate.service.ServiceBD;
import pe.edu.cibertec.gchhibernate.service.ServiceRemoto;
/**
 *
 * @author JavaADV
 */
public class ProfesorFactory {
    public static ProfesorService create (ServiceTypes serviceType){
        
        switch(serviceType){
            case REMOTO:
                return new ServiceRemoto();
            case SERVERBD:
                return new ServiceBD();
            
        }
        return null;
               
    }
}

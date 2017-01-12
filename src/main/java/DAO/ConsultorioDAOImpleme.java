/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import una.model.Consultorio;
import una.model.Pacientes;

/**
 *
 * @author Josue
 */
public class ConsultorioDAOImpleme implements ConsultorioDAO {

    private final Session session = HibernateUtil.getSessionFactory().openSession();
  
    @Override
    public Consultorio Guardar(Pacientes paciente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Consultorio borrarPorId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Consultorio modificarPorId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Consultorio ConsultarPorId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Consultorio> getListaConsultorio(String text) {
        
        Query query = session.createQuery("from Consultorio");
        List results = query.list();

        return results;
    }

}

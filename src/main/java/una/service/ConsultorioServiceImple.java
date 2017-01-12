/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package una.service;

import java.util.ArrayList;
import java.util.Date;
import una.model.Consultorio;

/**
 *
 * @author Josue
 */
public class ConsultorioServiceImple implements ConsultorioService{
   // private final ConsultorioDAO consultorioDAO;

    public ConsultorioServiceImple() {
       //consultorioDAO = mock(ConsultorioDAOImpleme.class);
    }

    @Override
    public Object[][] loadStudentsObjWrapper()  {
        ArrayList<Consultorio> consultorios = new ArrayList<Consultorio>();
        consultorios.add(new Consultorio(1,"Hospital Pavas",new Date(),2514));
        consultorios.add(new Consultorio(1,"Hospital Carrizal",new Date(),2514));
        consultorios.add(new Consultorio(1,"Hospital San Jose",new Date(),2514));
        Object[][] data = null;

        if (consultorios != null && consultorios.size() > 0) {
            data = new Object[consultorios.size()][4]; // filas y columnas
            int i = 0;
            for (Consultorio consultorio : consultorios) {
                data[i][0] = checkIfNull(consultorio.getId());
                data[i][1] = checkIfNull(consultorio.getNombre());
                data[i][2] = checkIfNull(consultorio.getFechaHora());
                data[i][3] = checkIfNull(consultorio.getTefefono());
                i++;
            }
        }
        return data;
    }



    private String checkIfNull(Object obj) {
        String text;
        if (obj == null) {
            text = "";
        } else {
            text = obj.toString();
        }
        return text;
    }

    @Override
    public Consultorio Guardar(Consultorio consultorio) {
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


    
}

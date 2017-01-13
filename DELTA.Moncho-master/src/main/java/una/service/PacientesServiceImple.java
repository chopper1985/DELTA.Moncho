/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package una.service;

import java.util.ArrayList;
import una.model.Pacientes;

/**
 *
 * @author Josue
 */
public class PacientesServiceImple implements PacienteService {

    @Override
    public Pacientes borrarPorId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pacientes modificarPorId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pacientes ConsultarPorId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object[][] loadStudentsObjWrapper() {
        ArrayList<Pacientes> paciente = new ArrayList<Pacientes>();

        paciente.add(new Pacientes(1, "Juan Castro", 25465566, "fdawdawda", "sadawdawd", "dwadwadawd"));
        paciente.add(new Pacientes(2, "Juan Mono", 312, "fdawdawda", "sadawdawd", "dwadwadawd"));
        paciente.add(new Pacientes(3, "Kuko Ganster", 2547566, "fdawdawda", "sadawdawd", "dwadwadawd"));

        Object[][] data = null;

        if (paciente != null && paciente.size() > 0) {
            data = new Object[paciente.size()][6]; // filas y columnas
            int i = 0;
            for (Pacientes pacientes : paciente) {
                data[i][0] = checkIfNull(pacientes.getId());
                data[i][1] = checkIfNull(pacientes.getNombre());
                data[i][2] = checkIfNull(pacientes.getTelefono());
                data[i][3] = checkIfNull(pacientes.getDireccion());
                data[i][4] = checkIfNull(pacientes.getEnfermedades());
                data[i][5] = checkIfNull(pacientes.getObservacion());
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
}

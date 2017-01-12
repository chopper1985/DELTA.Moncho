/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.ArrayList;
import java.util.List;
import una.model.Consultorio;
import una.model.Pacientes;

/**
 *
 * @author Josue
 */
public interface ConsultorioDAO {

   // public Consultorio buscarPorId(int id);

    public Consultorio Guardar(Pacientes paciente);

    public Consultorio borrarPorId(int id);

    public Consultorio modificarPorId(int id);

    public Consultorio ConsultarPorId(int id);
    
    public List<Consultorio> getListaConsultorio(String text);
    
}

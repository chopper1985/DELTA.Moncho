/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import una.model.Pacientes;

/**
 *
 * @author Josue
 */
public interface PacienteDAO {

    public Pacientes buscarPorId(int id);

    public Pacientes Guardar(Pacientes paciente);

    public Pacientes borrarPorId(int id);

    public Pacientes modificarPorId(int id);

    public Pacientes ConsultarPorId(int id);
    

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package una.service;

import una.model.Consultorio;

/**
 *
 * @author Josue
 */
public interface ConsultorioService {


    public Consultorio Guardar(Consultorio consultorio);

    public Consultorio borrarPorId(int id);

    public Consultorio modificarPorId(int id);

    public Consultorio ConsultarPorId(int id);
    
    public Object[][] loadStudentsObjWrapper();
    


}

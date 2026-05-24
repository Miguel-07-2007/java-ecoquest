package com.miguelmontoya.service;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import com.miguelmontoya.enums.EstadoMision;
import com.miguelmontoya.model.Mision;
import com.miguelmontoya.model.Voluntario;


public class GestorMisiones {
    private LinkedHashMap<String, Mision> misiones = new LinkedHashMap<>();

    public GestorMisiones(LinkedHashMap<String, Mision> misiones) {
        this.misiones = misiones;
    }
    
    /**
     * Agregar una mision a misiones
     * @param mision
     * @Returnfalse ya estaba agregada la mision
     * @returntrue se agregó correcatamente
     */
    public boolean registrarMision(Mision mision) {
        if (misiones.containsKey(mision.getId())) {
            return false;
        }
        misiones.put(mision.getId(), mision);
        return true;
    }

    /**
     * Busca una mision de la lista misiones con un id
     * @param id
     * @return mision
     * @throws MisionNoEncontradaException cuando no fue encontrada la mision buscada
     */
    public Mision buscarMisionPorId(String id) {
        return misiones.get(id);
    }

    /**
     * Cambia el estado de una mision
     * @param id
     * @returntrue cuando se cambia el estado
     * 
     */
    public boolean completarMision(String id) {
        Mision mision = misiones.get(id);

        if (mision == null) {
            return false;
        }
        mision.setEstado(EstadoMision.COMPLETADA);
        return true;
    }

    public List<Mision> listarMisiones() {
        return new ArrayList<>(misiones.values());
    }

    public boolean asignarVoluntario(String id, Voluntario voluntario) {
        Mision mision = misiones.get(id);
        if (mision == null) {
            return false;
        }
        voluntario.getMisionesCompletadas().add(id);
        return true;
    }
}

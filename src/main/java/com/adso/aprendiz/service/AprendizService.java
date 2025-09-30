package com.adso.aprendiz.service;

import com.adso.aprendiz.entity.AprendizEntity;
import com.adso.aprendiz.repository.AprendizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AprendizService {

    @Autowired // Inyección de dependencias
    private AprendizRepository aprendizRepository;

    public void crearAprendiz(AprendizEntity aprendiz) {
        aprendizRepository.save(aprendiz);
    }

    public List<AprendizEntity> obtenerAprendizes() {
        return aprendizRepository.findAll();
    }

    public AprendizEntity buscarPorId(Long id) {
        return aprendizRepository.findById(id).orElse(null);
    }

    public AprendizEntity eliminarAprendiz(Long id) {
        aprendizRepository.deleteById(id);
        return null;
    }

    public AprendizEntity actualizarAprendiz(Long id, AprendizEntity aprendiz) {
        aprendiz.setId(id);
        return aprendizRepository.save(aprendiz);
    }
}

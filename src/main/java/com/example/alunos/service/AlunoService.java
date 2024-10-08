package com.example.alunos.service;

import com.example.alunos.model.Aluno;
import com.example.alunos.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    public List<Aluno> findAll() {
        return alunoRepository.findAll();
    }

    public Optional<Aluno> findById(Long id) {
        return alunoRepository.findById(id);
    }

    public Aluno save(Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    public void deleteById(Long id) {
        alunoRepository.deleteById(id);
    }

    public Aluno update(Long id, Aluno alunoDetails) {
        Aluno aluno = alunoRepository.findById(id).orElseThrow();
        aluno.setNome(alunoDetails.getNome());
        aluno.setIdade(alunoDetails.getIdade());
        aluno.setNotaPrimeiroSemestre(alunoDetails.getNotaPrimeiroSemestre());
        aluno.setNotaSegundoSemestre(alunoDetails.getNotaSegundoSemestre());
        aluno.setNomeProfessor(alunoDetails.getNomeProfessor());
        aluno.setNumeroSala(alunoDetails.getNumeroSala());
        return alunoRepository.save(aluno);
    }
}

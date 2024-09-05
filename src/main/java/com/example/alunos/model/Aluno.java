package com.example.alunos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private int idade;
    private double notaPrimeiroSemestre;
    private double notaSegundoSemestre;
    private String nomeProfessor;
    private int numeroSala; 

    // Getters e Setters
    // Construtor padrão
    public Aluno() {
    }

    // Construtor com parâmetros
    public Aluno(Long id, String nome, int idade, double notaPrimeiroSemestre, double notaSegundoSemestre, String nomeProfessor, int numeroSala) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.notaPrimeiroSemestre = notaPrimeiroSemestre;
        this.notaSegundoSemestre = notaSegundoSemestre;
        this.nomeProfessor = nomeProfessor;
        this.numeroSala = numeroSala;
    }
}

package br.com.meuTutorial.listavip.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.meuTutorial.listavip.Entities.Convidados;

public interface ConvidadoRepository extends JpaRepository<Convidados, Long> {
    
}

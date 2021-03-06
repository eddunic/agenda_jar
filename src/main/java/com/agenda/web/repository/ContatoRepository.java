package com.agenda.web.repository;

import com.agenda.web.model.Contato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author eddunic
 */
@Repository 
public interface ContatoRepository extends JpaRepository<Contato, Integer> {}

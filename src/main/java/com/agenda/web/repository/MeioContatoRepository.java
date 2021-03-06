package com.agenda.web.repository;

import com.agenda.web.model.MeioContato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author eddunic
 */
@Repository 
public interface MeioContatoRepository extends JpaRepository<MeioContato, Integer> {}

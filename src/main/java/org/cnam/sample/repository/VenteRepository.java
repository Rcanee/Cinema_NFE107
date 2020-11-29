package org.cnam.sample.repository;

import org.cnam.sample.repository.model.Vente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VenteRepository extends JpaRepository<Vente, Long> {
}

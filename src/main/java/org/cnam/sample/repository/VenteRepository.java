package org.cnam.sample.repository;

import org.cnam.sample.repository.model.ClientModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VenteRepository extends JpaRepository<ClientModel, Long> {
}

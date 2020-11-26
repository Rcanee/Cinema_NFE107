package org.cnam.sample.repository;

import org.cnam.sample.repository.model.ClientModel;
import org.cnam.sample.repository.model.SampleModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<ClientModel, Long> {
}

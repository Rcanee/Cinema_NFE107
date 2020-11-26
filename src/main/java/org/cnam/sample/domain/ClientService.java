package org.cnam.sample.domain;

import org.cnam.sample.domain.entity.PointFideleteACrediter;
import org.cnam.sample.domain.entity.PointFideleteCredite;
import org.cnam.sample.repository.ClientRepository;
import org.cnam.sample.repository.model.ClientModel;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public void deleteCustomer(long customerId){
    }

    public PointFideleteCredite crediterPointFidelete(PointFideleteACrediter pointFideleteACrediter) {

        Optional<ClientModel> clientModelOpt = clientRepository.findById(pointFideleteACrediter.idClient);

        if (!clientModelOpt.isPresent()) {
            return null;
        }

        ClientModel clientModel = clientModelOpt.get();

        clientModel.setPointFidelite(clientModel.getPointFidelite() + pointFideleteACrediter.nbPointACrediter);

        clientRepository.save(clientModel);

        return new PointFideleteCredite(clientModel.getId(), clientModel.getPointFidelite());
    }
}

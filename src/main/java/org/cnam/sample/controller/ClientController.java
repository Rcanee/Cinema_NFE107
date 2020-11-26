package org.cnam.sample.controller;

import org.cnam.sample.controller.dto.CrediterPointFideliteRequest;
import org.cnam.sample.controller.dto.CrediterPointFideliteResponse;
import org.cnam.sample.domain.ClientService;
import org.cnam.sample.domain.entity.PointFideleteACrediter;
import org.cnam.sample.domain.entity.PointFideleteCredite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    ClientService clientService;

    @PostMapping("/crediterpointfidelite")
    @ResponseBody
    public ResponseEntity<CrediterPointFideliteResponse> crediterPointFidelite(@RequestBody CrediterPointFideliteRequest crediterPointFideliteRequest) {
        PointFideleteACrediter pointFideleteACrediter = new PointFideleteACrediter(crediterPointFideliteRequest.idClient, crediterPointFideliteRequest.nbPointACrediter);

        PointFideleteCredite pointFideleteCredite = clientService.crediterPointFidelete(pointFideleteACrediter);

        CrediterPointFideliteResponse crediterPointFideliteResponse = new CrediterPointFideliteResponse(pointFideleteCredite.idClient, pointFideleteCredite.soldePoint);

        return new ResponseEntity<>(crediterPointFideliteResponse, HttpStatus.OK);
    }
        

}

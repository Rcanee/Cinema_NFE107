package org.cnam.sample.controller;

import org.cnam.sample.controller.dto.AcheterTicketRequest;
import org.cnam.sample.controller.dto.AcheterTicketResponse;
import org.cnam.sample.domain.entity.TicketAAcheter;
import org.cnam.sample.domain.entity.TicketAcheter;
import org.cnam.sample.domain.service.business.VenteServiceBsns;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vente")
public class VenteController {

    @Autowired
    VenteServiceBsns venteServiceBsns;

    @PostMapping("/realiserVente")
    @ResponseBody
    public ResponseEntity<AcheterTicketResponse> realiserVente(@RequestBody AcheterTicketRequest acheterTicketRequest) {

        TicketAAcheter ticketAAcheter = new TicketAAcheter(acheterTicketRequest.idTicket, acheterTicketRequest.price, acheterTicketRequest.movie);

        TicketAcheter ticketAcheter = venteServiceBsns.realiserVente(...);

        AcheterTicketResponse acheterTicketResponse = new AcheterTicketResponse(ticketAcheter.idTicket, ticketAcheter.numreservation);

        return new ResponseEntity<>(acheterTicketResponse, HttpStatus.OK);
    }
        

}

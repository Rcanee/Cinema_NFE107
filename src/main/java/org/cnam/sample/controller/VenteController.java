package org.cnam.sample.controller;

import org.cnam.sample.controller.dto.AcheterTicketRequest;
import org.cnam.sample.controller.dto.AcheterTicketResponse;
import org.cnam.sample.controller.dto.SampleResponse;
import org.cnam.sample.domain.VenteService;
import org.cnam.sample.domain.entity.Sample;
import org.cnam.sample.domain.entity.TicketAAcheter;
import org.cnam.sample.domain.entity.TicketAcheter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vente")
public class VenteController {

    @Autowired
    VenteService venteService;

    @PostMapping("/acheterticket")
    @ResponseBody
    public ResponseEntity<AcheterTicketResponse> acheterTicket(@RequestBody AcheterTicketRequest acheterTicketRequest) {

        TicketAAcheter ticketAAcheter = new TicketAAcheter(acheterTicketRequest.idTicket, acheterTicketRequest.price, acheterTicketRequest.movie);

        TicketAcheter ticketAcheter = venteService.acheterTicket(ticketAAcheter);

        AcheterTicketResponse acheterTicketResponse = new AcheterTicketResponse(ticketAcheter.idTicket, ticketAcheter.numreservation);

        return new ResponseEntity<>(acheterTicketResponse, HttpStatus.OK);
    }
        

}

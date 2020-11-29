package org.cnam.sample.domain;

import org.cnam.sample.domain.entity.*;
import org.cnam.sample.repository.VenteRepository;
import org.cnam.sample.repository.model.Film;
import org.cnam.sample.repository.model.SampleModel;
import org.cnam.sample.repository.model.Vente;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class VenteService {

    @Autowired
    private VenteRepository venteRepository;

    public TicketAcheter createTicket(TicketAAcheter ticketCreer){
        Vente creationVente = new Vente(ticketCreer.idTicket,ticketCreer.price, ticketCreer.film);

        Vente venteCreer = venteRepository.save(creationVente);

        return new TicketAcheter(creationVente.getId(), creationVente.getNumreservation(),creationVente.getFilm());
    }

    public List<Vente> getAllTickets(){
        List<Vente> venteList = new ArrayList<Vente>();
        return venteList;
    }

    public void updateTicket(Long id, Film film, int numreservation, float prix){
    }

    public void deleteTicket(Long id){
    }

    public TicketAcheter acheterTicket(TicketAAcheter ticketAAcheter){

        Optional<Vente> venteOpt = venteRepository.findById(TicketAAcheter.idTicket);

        if(!venteOpt.isPresent()){
            return null;
        }

        Vente vente = venteOpt.get();

        vente.setPrix(vente.getPrix() + ticketAAcheter.price);

        venteRepository.save(vente);

        return new TicketAcheter(vente.getId(),vente.getNumreservation(),vente.getFilm());
    }

}

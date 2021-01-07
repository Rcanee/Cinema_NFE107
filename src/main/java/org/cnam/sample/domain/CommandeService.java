package org.cnam.sample.domain;

import org.cnam.sample.domain.entity.*;
import org.cnam.sample.repository.VenteRepository;
import org.cnam.sample.repository.model.Film;
import org.cnam.sample.repository.model.Commande;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CommandeService {

    @Autowired
    private VenteRepository venteRepository;

    public TicketAcheter createTicket(TicketAAcheter ticketCreer){
        Commande creationVente = new Commande(ticketCreer.idTicket,ticketCreer.price, ticketCreer.film);

        Commande venteCreer = venteRepository.save(creationVente);

        return new TicketAcheter(creationVente.getId(), creationVente.getNumreservation(),creationVente.getFilm());
    }

    public List<Commande> getAllTickets(){
        List<Commande> venteList = new ArrayList<Commande>();
        return venteList;
    }

    public void updateTicket(Long id, Film film, int numreservation, float prix){
    }

    public void deleteTicket(Long id){
    }

    public TicketAcheter acheterTicket(TicketAAcheter ticketAAcheter){

        Optional<Commande> venteOpt = venteRepository.findById(TicketAAcheter.idTicket);

        if(!venteOpt.isPresent()){
            return null;
        }

        Commande vente = venteOpt.get();

        vente.setPrix(vente.getPrix() + ticketAAcheter.price);

        venteRepository.save(vente);

        return new TicketAcheter(vente.getId(),vente.getNumreservation(),vente.getFilm());
    }

}

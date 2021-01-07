package org.cnam.sample.domain.service.business;

import org.cnam.sample.domain.ClientService;
import org.cnam.sample.domain.CommandeService;
import org.cnam.sample.domain.entity.TicketAAcheter;
import org.cnam.sample.domain.entity.TicketAcheter;
import org.cnam.sample.domain.entity.VenteARealiser;
import org.cnam.sample.repository.model.Film;
import org.cnam.sample.repository.model.Commande;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

// Orchestration
public class VenteServiceBsns {

    @Autowired
    private ClientService clientService;
    private CommandeService commandeService;


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

    public VenteRealisee realiserVente(VenteARealiser venteARealiser){

        //  1. StockService.controllerStock(idFilm)
        //  2. Prix?Service.calculerPrix(idFIlm, idClient ?, date ?)
        //  3. CommandeService.creerCommande(prix, idFilm, idClient, date?...)
        //  4. ClientServiceBsns.crediterPointFidelite(prix, idClient) -> Metier qui clacule le nb de point à créditer -> Règle Mtier
        //    4.1 ClientService.updatePointFidelite(idClient, nbPointFidelite) -> Technique -> Route vers le Repository
        //  5. StockService.DecrementerNbPlaceDisponnible.
        ...

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

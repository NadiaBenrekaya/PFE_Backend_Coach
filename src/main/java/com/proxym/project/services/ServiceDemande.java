package com.proxym.project.services;

import com.proxym.project.entities.Demande;
import com.proxym.project.enumeration.StatusEnum;
import com.proxym.project.repositories.DemandeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class ServiceDemande{
    private final DemandeRepository demandeRepository;



    public Demande addDemand(Demande demande) {
        return demandeRepository.save(demande);
    }

    public Demande editDemand(Integer id, Demande demande) {
        return demandeRepository.saveAndFlush(demande);
    }

    public void deleteDemand(Integer demandeId) {
        demandeRepository.deleteById(demandeId);
    }

    public Demande getDemand(Integer id) {
        return demandeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Demande not found with id: " + id));
    }

    public List<Demande> getAllDemands() {
        return this.demandeRepository.findAll();
    }

    public Demande acceptDemand(Integer demandeId) {
        Demande demande = demandeRepository.findById(demandeId).orElse(null);
        if (demande == null) {
            throw new RuntimeException("Demande not found with id: " + demandeId);
        }
        demande.setStatus(StatusEnum.PASSEE);
        return demandeRepository.save(demande);
    }

    public Demande rejectDemand(Integer demandeId) {
        Demande demande = demandeRepository.findById(demandeId).orElse(null);
        if (demande == null) {
            throw new RuntimeException("Demande not found with id: " + demandeId);
        }
        demande.setStatus(StatusEnum.ANNULEE);
        return demandeRepository.save(demande);
    }


}

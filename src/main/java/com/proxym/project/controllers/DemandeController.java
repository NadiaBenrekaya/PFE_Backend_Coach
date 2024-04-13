package com.proxym.project.controllers;

import com.proxym.project.entities.Demande;
import com.proxym.project.services.ServiceDemande;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
//@AllArgsConstructor
@RequiredArgsConstructor
@RequestMapping("/api/v1/demande")
public class DemandeController {
    @Autowired
    private ServiceDemande serviceDemande;
    @PostMapping("/add")
    public ResponseEntity<Demande> addDemand(@RequestBody Demande demande) {
        System.out.println(serviceDemande);
        Demande savedDemande = serviceDemande.addDemand(demande);

        return new ResponseEntity<>(savedDemande, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Demande> editDemand(@PathVariable Integer id, @RequestBody Demande demande) {
        Demande editedDemande = serviceDemande.editDemand(id, demande);
        return new ResponseEntity<>(editedDemande, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteDemand(@PathVariable Integer id) {
        serviceDemande.deleteDemand(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Demande> getDemand(@PathVariable Integer id) {
        Demande demande = serviceDemande.getDemand(id);
        if (demande == null) {
            return new ResponseEntity<Demande>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Demande>(demande, HttpStatus.OK);
    }
    @GetMapping("/getall")
    public ResponseEntity<List<Demande>> getAllDemands() {
        List<Demande> demandes = serviceDemande.getAllDemands();
        return new ResponseEntity<>(demandes, HttpStatus.OK);
    }

    @PatchMapping("/{id}/accept")
    public ResponseEntity<Demande> acceptDemand(@PathVariable Integer id) {
        Demande acceptedDemande = serviceDemande.acceptDemand(id);
        return new ResponseEntity<>(acceptedDemande, HttpStatus.OK);
    }

    @PatchMapping("/{id}/reject")
    public ResponseEntity<Demande> rejectDemand(@PathVariable Integer id) {
        Demande rejectedDemande = serviceDemande.rejectDemand(id);
        return new ResponseEntity<>(rejectedDemande, HttpStatus.OK);
    }
}

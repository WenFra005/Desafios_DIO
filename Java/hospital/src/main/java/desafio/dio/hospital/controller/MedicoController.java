package desafio.dio.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import desafio.dio.hospital.model.Medico;
import desafio.dio.hospital.service.MedicoService;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private MedicoService medicoService;

    @GetMapping
    public List<Medico> getAllMedicos() {
        return medicoService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Medico> getMedicoById(@PathVariable Long id) {
        Medico medico = medicoService.findById(id);
            if (medico != null) {
                return ResponseEntity.ok(medico);
            }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public Medico createUsuario(@RequestBody Medico medico) {
        return medicoService.save(medico);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Medico> updateUsuario(@PathVariable Long id, @RequestBody Medico medico) {
        if (medicoService.findById(id) != null) {
            medicoService.delete(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(medicoService.save(medico));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUsuario(@PathVariable Long id) {
        if (medicoService.findById(id) != null) {
            medicoService.delete(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}

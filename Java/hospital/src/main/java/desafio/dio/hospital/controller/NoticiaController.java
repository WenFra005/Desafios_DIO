package desafio.dio.hospital.controller;

import desafio.dio.hospital.model.Noticia;
import desafio.dio.hospital.service.NoticiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/noticias")
public class NoticiaController {

    @Autowired
    private NoticiaService noticiaService;

    @GetMapping
    public List<Noticia> getAllNoticias() {
        return noticiaService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Noticia> getNoticiaById(@PathVariable Long id) {
        Noticia noticia = noticiaService.findById(id);
        if (noticia != null) {
            return ResponseEntity.ok(noticia);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public Noticia createNoticia(@RequestBody Noticia noticia) {
        return noticiaService.save(noticia);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Noticia> updateNoticia(@PathVariable Long id, @RequestBody Noticia noticia) {
        if (noticiaService.findById(id) != null) {
            noticia.setId(id);
            return ResponseEntity.ok(noticiaService.save(noticia));
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteNoticia(@PathVariable Long id) {
        if (noticiaService.findById(id) != null) {
            noticiaService.delete(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}

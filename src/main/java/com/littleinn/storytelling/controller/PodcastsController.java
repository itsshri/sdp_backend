package com.littleinn.storytelling.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.littleinn.storytelling.model.Podcasts;
import com.littleinn.storytelling.service.PodcastsService;

import java.util.List;

@RestController
@RequestMapping("/podcasts")
public class PodcastsController {

    @Autowired
    private PodcastsService classService;

    @GetMapping("/all")
    public List<Podcasts> getAllPodcasts() {
        return classService.getAllPodcasts();
    }

    @GetMapping("/getpodcast/{id}")
    public ResponseEntity<Podcasts> getPodcastById(@PathVariable long id) {
        return classService.getPodcastById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/addpodcast")
    public Podcasts createPodacst(@RequestBody Podcasts cls) {
        return classService.createPodcast(cls);
    }

    @PutMapping("edit/{id}")
    public ResponseEntity<Podcasts> updateClass(@PathVariable long id, @RequestBody Podcasts cls) {
        try {
            return ResponseEntity.ok(classService.updatePodcast(id, cls));
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<Void> deleteClass(@PathVariable long id) {
        classService.deletePodcast(id);
        return ResponseEntity.noContent().build();
    }
}

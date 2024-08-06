package com.littleinn.storytelling.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.littleinn.storytelling.model.Stories;
import com.littleinn.storytelling.service.StoriesService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/stories")
public class StoriesController {

    @Autowired
    private StoriesService sservice;

    @GetMapping("/getall")
    public List<Stories> getAllSubjects() {
        return sservice.getAllStories();
    }

    @GetMapping("getstory/{id}")
    public ResponseEntity<Stories> getSubjectById(@PathVariable long id) {
        Optional<Stories> subject = sservice.getStoryById(id);
        if (subject.isPresent()) {
            return ResponseEntity.ok(subject.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/addstory")
    public Stories createSubject(@RequestBody Stories story) {
        return sservice.createStory(story);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<Void> deleteSubject(@PathVariable long id) {
        sservice.deleteStory(id);
        return ResponseEntity.noContent().build();
    }
}

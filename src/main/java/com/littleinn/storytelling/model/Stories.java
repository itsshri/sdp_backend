package com.littleinn.storytelling.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Stories {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long storyId;
    private String name;
    private String author;
    private String description;
    private String storyJournal;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user;

    public long getStoryId() {
        return storyId;
    }

    public void setStoryId(long storyId) {
        this.storyId = storyId;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getdescription() {
        return description;
    }

    public void setdescription(String description) {
        this.description = description;
    }

    public String getStoryJournal() {
        return storyJournal;
    }

    public void setStoryJournal(String storyJournal) {
        this.storyJournal = storyJournal;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

}

    

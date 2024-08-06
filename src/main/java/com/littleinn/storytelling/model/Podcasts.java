package com.littleinn.storytelling.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Podcasts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long podcastId;
    private String name;
    private String podcaster;
    private String duration;
    private String podcastjournal;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user;

    public long getPodcastId() {
        return podcastId;
    }

    public void setPodcastId(long podcastId) {
        this.podcastId = podcastId;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getPodcaster() {
        return podcaster;
    }

    public void setPodcaster(String podcaster) {
        this.podcaster = podcaster;
    }

    public String getduration() {
        return duration;
    }

    public void setduration(String duration) {
        this.duration = duration;
    }

    public String getpodcastjournal() {
        return podcastjournal;
    }

    public void setpodcastjournal(String podcastjournal) {
        this.podcastjournal = podcastjournal;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
     
    

}

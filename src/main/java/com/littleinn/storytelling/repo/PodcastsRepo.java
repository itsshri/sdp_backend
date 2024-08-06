package com.littleinn.storytelling.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.littleinn.storytelling.model.Podcasts;
import java.util.List;


public interface PodcastsRepo extends JpaRepository<Podcasts, Long> {
     List<Podcasts> findByPodcastId(long podcastId);
}


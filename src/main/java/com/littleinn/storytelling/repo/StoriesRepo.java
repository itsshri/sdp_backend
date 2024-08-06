package com.littleinn.storytelling.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.littleinn.storytelling.model.Stories;

public interface StoriesRepo extends JpaRepository<Stories, Long> {

}

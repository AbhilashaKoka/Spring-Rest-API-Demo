package com.example.Spring_Rest_API_Demo.Repository;

import com.example.Spring_Rest_API_Demo.Entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}

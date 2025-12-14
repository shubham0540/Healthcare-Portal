package com.example.backend.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.backend.Entity.DocumentMetadata;

public interface DocumentRepository extends JpaRepository<DocumentMetadata, Long> {

	Optional<DocumentMetadata> findByFilename(String filename);

}

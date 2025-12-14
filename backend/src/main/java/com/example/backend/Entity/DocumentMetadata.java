package com.example.backend.Entity;

import java.time.Instant;

import org.hibernate.annotations.Collate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.experimental.NonFinal;

@Entity
@Table(name = "DocumentMetadata")
public class DocumentMetadata {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@Column(nullable = false)
	private String filename;

	@Column(nullable = false)
	private String filepath;
	

	@Column(nullable = false)
	private long filesize;
	
	
	@Column(name ="created_at", nullable = false)
	private Instant createdAt;
	
	public DocumentMetadata(String filename, String filepath, long filesize, Instant createdAt) {
	    this.filename = filename;
	    this.filepath = filepath;
	    this.filesize = filesize;
	    this.createdAt = createdAt;
	}
	
	public DocumentMetadata() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getFilepath() {
		return filepath;
	}

	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}

	public long getFilesize() {
		return filesize;
	}

	public void setFilesize(long filesize) {
		this.filesize = filesize;
	}

	public Instant getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Instant createdAt) {
		this.createdAt = createdAt;
	}
	
	


}

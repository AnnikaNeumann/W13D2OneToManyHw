package com.codeclan.example.Folders.repositories;

import com.codeclan.example.Folders.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}

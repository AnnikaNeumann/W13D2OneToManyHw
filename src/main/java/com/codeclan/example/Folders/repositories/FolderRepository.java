package com.codeclan.example.Folders.repositories;

import com.codeclan.example.Folders.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}

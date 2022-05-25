package com.codeclan.example.Folders.components;

import com.codeclan.example.Folders.models.File;
import com.codeclan.example.Folders.models.Folder;
import com.codeclan.example.Folders.models.User;
import com.codeclan.example.Folders.repositories.FileRepository;
import com.codeclan.example.Folders.repositories.FolderRepository;
import com.codeclan.example.Folders.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader(){
    }

    @Override
    public void run(ApplicationArguments arg){
        User bruce = new User("Bruce Wayne");
        userRepository.save(bruce);

        User buzz = new User("Buzz Lightyear");
        userRepository.save(buzz);

        Folder action = new Folder("Awesome Action", bruce);
        folderRepository.save(action);

        Folder animation = new Folder("Animated Awesomeness", buzz);
        folderRepository.save(animation);

        File dvd = new File("The Dark Knight", "mp4", 12, action);
        fileRepository.save(dvd);

        File soundtrack = new File("Tangled", "mp3", 3, animation);
        fileRepository.save(soundtrack);
    }
}

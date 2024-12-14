package org.example.islamprojectrk.services;

import org.example.islamprojectrk.models.UserEntity;
import org.example.islamprojectrk.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository repo;
    public UserService(UserRepository r){this.repo=r;}

    public List<UserEntity> searchByTitle(String query) {
        return repo.findByTitleContainingIgnoreCase(query);
    }

    public UserEntity createUser(String title, String email, String photoLink) {
        UserEntity u = new UserEntity();
        u.setTitle(title);
        u.setEmail(email);
        u.setPhotoLink(photoLink);
        return repo.save(u);
    }

    public List<UserEntity> findAll(){
        return repo.findAll();
    }
}

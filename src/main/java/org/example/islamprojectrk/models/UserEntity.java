package org.example.islamprojectrk.models;

import jakarta.persistence.*;

@Entity
@Table(name="users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false)
    private String title;
    private String email;
    private String photoLink;

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}

    public String getTitle() {return title;}
    public void setTitle(String title) {this.title = title;}

    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}

    public String getPhotoLink() {return photoLink;}
    public void setPhotoLink(String photoLink) {this.photoLink = photoLink;}
}

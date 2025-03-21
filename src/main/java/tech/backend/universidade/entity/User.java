package tech.backend.universidade.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Faculty  faculty;

    @Column(nullable = false)
    private LocalDate travelDate;

    private Boolean readyToReturn;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    public User() {
    }

    public User(Long id, String name, Faculty faculty, LocalDate travelDate, Boolean readyToReturn, LocalDateTime createdAt) {
        this.id = id;
        this.name = name;
        this.faculty = faculty;
        this.travelDate = travelDate;
        this.readyToReturn = readyToReturn;
        this.createdAt = createdAt;
    }

    public User(String name, Faculty faculty, LocalDate travelDate) {
        this.name = name;
        this.faculty = faculty;
        this.travelDate = travelDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public LocalDate getTravelDate() {
        return travelDate;
    }

    public void setTravelDate(LocalDate travelDate) {
        this.travelDate = travelDate;
    }

    public Boolean getReadyToReturn() {
        return readyToReturn;
    }

    public void setReadyToReturn(Boolean readyToReturn) {
        this.readyToReturn = readyToReturn;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @PrePersist
    public void prePersist() {
        createdAt = LocalDateTime.now();
    }
}

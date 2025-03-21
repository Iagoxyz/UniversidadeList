package tech.backend.universidade.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_daily_lists")
public class DailyList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private LocalDate date;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    public DailyList() {
    }

    public DailyList(Long id, LocalDate date, LocalDateTime createdAt) {
        this.id = id;
        this.date = date;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
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

    public DailyList(LocalDate date) {
        this.date = date;
    }
}

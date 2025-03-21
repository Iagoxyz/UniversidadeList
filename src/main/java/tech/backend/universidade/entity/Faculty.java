package tech.backend.universidade.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_faculty")
public class Faculty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false)
    private Integer displayOrder;

    private boolean isPassengerSection = false;

    public Faculty() {
    }

    public Faculty(Long id, String name, Integer displayOrder, boolean isPassengerSection) {
        this.id = id;
        this.name = name;
        this.displayOrder = displayOrder;
        this.isPassengerSection = isPassengerSection;
    }

    public Faculty(String name, Integer displayOrder, boolean isPassengerSection) {
        this.name = name;
        this.displayOrder = displayOrder;
        this.isPassengerSection = isPassengerSection;
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

    public Integer getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(Integer displayOrder) {
        this.displayOrder = displayOrder;
    }

    public boolean isPassengerSection() {
        return isPassengerSection;
    }

    public void setPassengerSection(boolean passengerSection) {
        isPassengerSection = passengerSection;
    }
}

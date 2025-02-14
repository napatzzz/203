package org.example.int203.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "branchs")
public class Branch {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Column(name = "info", length = 50)
    private String info;

    @OneToMany(mappedBy = "branch")
    private Set<Channel> channels = new LinkedHashSet<>();

}
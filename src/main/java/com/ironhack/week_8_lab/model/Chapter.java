package com.ironhack.week_8_lab.model;




import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "chapters")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Chapter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String district;

    @OneToOne
    @JoinColumn(name = "president_id")
    private Member president;

    @OneToMany(mappedBy = "chapter", cascade = CascadeType.ALL)
    private List<Member> members = new ArrayList<>();
}


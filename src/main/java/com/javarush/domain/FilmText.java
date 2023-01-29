package com.javarush.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Type;

@Entity
@Table(schema = "project_hibernate_2", name = "film_text")
@Getter
@Setter
public class FilmText {

    @Id
    @Column(name = "film_id")
    private Short id;


    @Column(name = "title")
    private String title;

    @Column(name = "description", columnDefinition = "text")
    @Type(type = "text")
    private String description;

    @OneToOne
    @JoinColumn(name = "film_id")
    private Film film;

}

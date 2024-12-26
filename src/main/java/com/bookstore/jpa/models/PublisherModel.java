package com.bookstore.jpa.models;

import com.fasterxml.jackson.annotation.*;
import jakarta.persistence.*;
import lombok.*;

import java.io.*;
import java.util.*;

@Getter
@Setter
@Entity
@Table(name = "TB_PUBLISHER")
public class PublisherModel implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false, unique = true)
    private String name;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @OneToMany(mappedBy = "publisher", fetch = FetchType.LAZY)
    private Set<BookModel> books = new HashSet<>();

}

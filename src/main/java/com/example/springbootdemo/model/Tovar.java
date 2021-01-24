package com.example.springbootdemo.model;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tovar")
public class Tovar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name_tovar")
    private String nameTovar;
    @Column(name = "name_prodavec")
    private String nameProdavec;
}

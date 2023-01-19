package com.nexsys.nexsys.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Categoria")
public class Categoria implements Serializable {

    private static final Integer SerialVersionUID = 432;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //Se define la PK llave Primaria
    private Integer cid;

    @Column(name = "titulo")
    private String title;
}

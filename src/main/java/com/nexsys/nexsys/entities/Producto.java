package com.nexsys.nexsys.entities;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "producto")
public class Producto implements  Serializable{

    private static final Integer SerialVersionUID = 432;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //Se define la PK llave Primaria
    private Integer pid;

    @Column(name = "nombre")
    private String name;

    @Column(name = "precio_final")
    private Double priceFinal;

    @Column(name = "descripcion")
    private String description;

    @Column(name = "iamgen")
    private String imageUrl;

    @OneToOne
    private Categoria categoryId;

    public Producto() {
    }

    public Producto(Integer pid, String name, Double priceFinal, String description, String imageUrl, Categoria categoryId) {
        this.pid = pid;
        this.name = name;
        this.priceFinal = priceFinal;
        this.description = description;
        this.imageUrl = imageUrl;
        this.categoryId = categoryId;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPriceFinal() {
        return priceFinal;
    }

    public void setPriceFinal(Double priceFinal) {
        this.priceFinal = priceFinal;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Categoria getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Categoria categoryId) {
        this.categoryId = categoryId;
    }
}

package com.platzi.market.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "categorias")
public class Categoria {
    @Id //sirve para indicar que es un id
    //Sirve para indicarle que se genera automaticamente y que le da identidad a la tabla
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //Siempre que la variable sea diferente a la columna se especifica
    @Column(name = "id_categoria")
    private Integer idCatergoria;


    private String descripcion;
    private Boolean estado;

    /**
     * Necesitamos crear una anotacion de OneToMany
     * porque aqui es donde tenemos la realacion 1 to N en el diagrama
     * y se crea una lista porque asi es como se liga en codigo con el orm
     * los productos
     * ademas se tiene que poner un mappedBy para casarlo con categorias
     */
    @OneToMany(mappedBy = "categoria")
    private List<Producto> productos;

    public Integer getIdCatergoria() {
        return idCatergoria;
    }

    public void setIdCatergoria(Integer idCatergoria) {
        this.idCatergoria = idCatergoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}

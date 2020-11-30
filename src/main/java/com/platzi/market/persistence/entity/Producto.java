package com.platzi.market.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "productos")
public class Producto {

    @Id //sirve para indicar que es un id
    //Sirve para indicarle que se genera automaticamente y que le da identidad a la tabla
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //Siempre que la variable sea diferente a la columna se especifica
    @Column(name = "id_ṕroducto")
    private Integer idProducto;

    //Aqui no se cambia el column porque es igual en la tabla y aca
    private String nombre;

    @Column( name = "id_categoria")
    private Integer idCategoria;

    @Column(name = "codigo_barras")
    private String codigoBarras;

    @Column(name = "precio_venta")
    private Double precioVenta;

    @Column(name = "cantidad_stock")
    private Integer cantidadStock;

    private Boolean estado;

    /**
     * Se hace la anotacion N to 1, porque en el diagrama asi esta la
     * relacion
     * tambien tiene una anotacion joincolumn para unir categoria con
     * el id_categoria y ademas para que desde aca no se pueda actualizar,
     * insertar, eliminar o editar una categoria. Para eso se tiene su propia
     * clase
     */
    @ManyToOne
    @JoinColumn(name = "id_categoria", insertable = false,updatable = false)
    private Categoria categoria;

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Integer getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(Integer cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    public Boolean isEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}

package com.platzi.market.persistence.crud;

import com.platzi.market.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

/**
 * Esta es una interfaz para poder trabajar con el crudRepository
 * este recibe la clase con que trabajaremos (Producto) y el tipo de dato del ID
 * siempre hay que utilizar el wrapper (Integer)
 */
public interface ProductoCrudRepository extends CrudRepository<Producto,Integer> {
    // Insertando SQL nativamente
    //@Query(value = "SELECT * FROM productos WHERE id_categoria = ?" ,nativeQuery = true)

    // retorna una lista de productos filtrados por idCategoria
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);

    /**
     * Programacion funcional
     * me retorna una lista de productos dentro de un optional
     * filtra con base a < cantidadStock y estado = true
     *
     */
    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);
}

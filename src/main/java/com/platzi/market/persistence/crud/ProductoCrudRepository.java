package com.platzi.market.persistence.crud;

import com.platzi.market.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

/**
 * Esta es una interfaz para poder trabajar con el crudRepository
 * este recibe la clase con que trabajaremos (Producto) y el tipo de dato del ID
 * siempre hay que utilizar el wrapper (Integer)
 */
public interface ProductoCrudRepository extends CrudRepository<Producto,Integer> {

}

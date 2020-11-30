package com.platzi.market.persistence.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import com.platzi.market.domain.Category;
import com.platzi.market.persistence.entity.Categoria;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    /**
     * esto lo que hace es convertir de idCategoria a categoryId
     * primero usamos mappings porque tenemos n sources que convertir
     *
     */
    @Mappings({
            @Mapping(source = "idCategoria", target = "categoryId"),
            @Mapping(source = "descripcion", target = "category"),
            @Mapping(source = "estado", target = "active")
    } )
    Category toCategory(Categoria categoria);

    /**
     * Mapeo inverso de lo de arriba con InheritInverseConfiguration
     *
     */
    @InheritInverseConfiguration
    @Mapping(target = "productos",ignore = true)
    Categoria toCategoria(Category category);
}

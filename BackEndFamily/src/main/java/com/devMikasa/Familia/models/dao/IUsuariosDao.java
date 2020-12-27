package com.devMikasa.Familia.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.devMikasa.Familia.models.entity.Usuarios;

public interface IUsuariosDao extends CrudRepository<Usuarios, Long> {

}

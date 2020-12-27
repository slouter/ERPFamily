package com.devMikasa.Familia.services;

import java.util.List;

import com.devMikasa.Familia.models.entity.Usuarios;

public interface IUsuariosServices {
	
	public List<Usuarios> findAll();
	
	public Usuarios findById(Long id);
	
	public Usuarios save(Usuarios usuarios);
	
	public void delete(Long id);

}

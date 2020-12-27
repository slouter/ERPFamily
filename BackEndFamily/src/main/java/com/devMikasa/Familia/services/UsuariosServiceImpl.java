package com.devMikasa.Familia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devMikasa.Familia.models.dao.IUsuariosDao;
import com.devMikasa.Familia.models.entity.Usuarios;

@Service
public class UsuariosServiceImpl implements IUsuariosServices {

	@Autowired
	private IUsuariosDao usuariosDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Usuarios> findAll() {	
		return (List<Usuarios>) usuariosDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Usuarios findById(Long id) {
		return usuariosDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Usuarios save(Usuarios usuarios) {
		return usuariosDao.save(usuarios);
	}

	@Override
	public void delete(Long id) {
		usuariosDao.deleteById(id);
	}

}

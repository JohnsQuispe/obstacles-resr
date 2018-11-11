package br.com.johnsquispe.obstaclerest.dao;

import java.util.List;

import br.com.johnsquispe.obstaclerest.domain.EntityDomain;

public interface IDAO {

	public List<EntityDomain> retrieve(EntityDomain entityDomain);
	public void save (EntityDomain entityDomain);
	public void update (EntityDomain entityDomain);
	public void delete (EntityDomain entityDomain);
		
}

package br.com.johnsquispe.obstaclerest.domain;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class EntityDomain {

	@Id
	private int id;
	
}

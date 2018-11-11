package br.com.johnsquispe.obstaclerest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.johnsquispe.obstaclerest.domain.Obstacle;

public interface ObstacleRepository extends JpaRepository<Obstacle, Long> {
	
}

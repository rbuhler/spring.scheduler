package br.com.rbuhler.scheduler.persistence.repository;

import br.com.rbuhler.scheduler.persistence.entity.LogEntity;
import org.springframework.data.repository.CrudRepository;

public interface LogEntityRepository extends CrudRepository<LogEntity, Long> {

}
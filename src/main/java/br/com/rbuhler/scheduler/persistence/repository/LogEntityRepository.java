package br.com.rbuhler.scheduler.persistence.repository;

import br.com.rbuhler.scheduler.persistence.entity.LogEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LogEntityRepository extends JpaRepository<LogEntity, Long> {

    List<LogEntity> findByDateTime(String dateTime);
}
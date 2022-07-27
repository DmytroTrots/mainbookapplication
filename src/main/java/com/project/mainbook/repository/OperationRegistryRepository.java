package com.project.mainbook.repository;

import com.project.mainbook.enity.OperationsRegistryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface OperationRegistryRepository extends JpaRepository<OperationsRegistryEntity, Integer> {

    List<OperationsRegistryEntity> findRecordsBetweenDate(Date firstDate, Date secondDate);
}

package com.project.mainbook.repository;

import com.project.mainbook.enity.OperationsRegistryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface OperationRegistryRepository extends JpaRepository<OperationsRegistryEntity, Integer> {

    @Query(nativeQuery = true, value = "SELECT string_agg( public.analytics.credit_analytics, ',') as credit_analytics, string_agg( public.analytics.debit_analytics, ',') as debit_analytics, public.operation_registry.id, public.operation_registry.amount_of_money, public.operation_registry.create_time, public.operation_registry.credit, public.operation_registry.debit, public.operation_registry.name\n" +
            "from public.analytics inner join public.operation_registry on public.operation_registry.id = public.analytics.operation_registry_id\n" +
            "GROUP BY public.operation_registry.id;")
    List<OperationsRegistryEntity> findAllWithAnalytics();

    //List<OperationsRegistryEntity> findRecordsBetweenDate(Date firstDate, Date secondDate);
}

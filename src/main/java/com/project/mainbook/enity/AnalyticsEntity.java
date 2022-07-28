package com.project.mainbook.enity;

import javax.persistence.*;

@Table(name = "analytics")
@Entity
public class AnalyticsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "operation_registry_id", nullable = false)
    private OperationsRegistryEntity operationsRegistry;

    @Column(name = "debit_analytics")
    private String debitAnalytics;

    @Column(name = "credit_analytics")
    private String creditAnalytics;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public OperationsRegistryEntity getOperationsRegistry() {
        return operationsRegistry;
    }

    public void setOperationsRegistry(OperationsRegistryEntity operationsRegistry) {
        this.operationsRegistry = operationsRegistry;
    }

    public String getDebitAnalytics() {
        return debitAnalytics;
    }

    public void setDebitAnalytics(String debitAnalytics) {
        this.debitAnalytics = debitAnalytics;
    }

    public String getCreditAnalytics() {
        return creditAnalytics;
    }

    public void setCreditAnalytics(String creditAnalytics) {
        this.creditAnalytics = creditAnalytics;
    }
}

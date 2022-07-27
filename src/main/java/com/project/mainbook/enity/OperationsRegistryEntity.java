package com.project.mainbook.enity;

import javax.persistence.*;

@Table(name = "operation_registry")
@Entity
public class OperationsRegistryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String operationName;

    @Column(name = "debit", nullable = false)
    private Integer debit;

    @Column(name = "credit", nullable = false)
    private Integer credit;

    @Column(name = "amount_of_money", nullable = false)
    private Integer amountOfMoney;

    @Column(name = "debit_analytics", nullable = false)
    private String debit_analytics;

    @Column(name = "credit_analytics", nullable = false)
    private String creditAnalytics;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOperationName() {
        return operationName;
    }

    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    public Integer getDebit() {
        return debit;
    }

    public void setDebit(Integer debit) {
        this.debit = debit;
    }

    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    public Integer getAmountOfMoney() {
        return amountOfMoney;
    }

    public void setAmountOfMoney(Integer amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }

    public String getDebit_analytics() {
        return debit_analytics;
    }

    public void setDebit_analytics(String debit_analytics) {
        this.debit_analytics = debit_analytics;
    }

    public String getCreditAnalytics() {
        return creditAnalytics;
    }

    public void setCreditAnalytics(String creditAnalytics) {
        this.creditAnalytics = creditAnalytics;
    }
}

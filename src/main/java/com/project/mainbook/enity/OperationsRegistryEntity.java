package com.project.mainbook.enity;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

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
    private BigDecimal amountOfMoney;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "create_time")
    private Date createTime;

    @Transient
    private List<String> listOfDebitAnalytics;

    @Transient
    private List<String> listOfCreditAnalytics;

    public List<String> getListOfDebitAnalytics() {
        return listOfDebitAnalytics;
    }

    public void setListOfDebitAnalytics(List<String> listOfDebitAnalytics) {
        this.listOfDebitAnalytics = listOfDebitAnalytics;
    }

    public List<String> getListOfCreditAnalytics() {
        return listOfCreditAnalytics;
    }

    public void setListOfCreditAnalytics(List<String> listOfCreditAnalytics) {
        this.listOfCreditAnalytics = listOfCreditAnalytics;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

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

    public BigDecimal getAmountOfMoney() {
        return amountOfMoney;
    }

    public void setAmountOfMoney(BigDecimal amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }
}

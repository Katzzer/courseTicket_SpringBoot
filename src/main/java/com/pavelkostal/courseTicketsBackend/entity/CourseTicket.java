package com.pavelkostal.courseTicketsBackend.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "CourseTicket")
@Table(name = "course-ticket")
@Getter
@Setter
public class CourseTicket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "short-name")
    private String shortName;

    @Column(name = "valid-from")
    private String validFrom;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "country")
    private String country;
    
    @Column(name = "move")
    private double move; 
    
    @Column(name = "amount")
    private double amount;
    
    @Column(name = "valBuy")
    private double valBuy;
    
    @Column(name = "valSell")
    private double valSell;
    
    @Column(name = "valMid")
    private double valMid;
    
    @Column(name = "currBuy")
    private double currBuy;
    
    @Column(name = "currSell")
    private double currSell;
    
    @Column(name = "currMid")
    private double currMid;
    
    @Column(name = "version")
    private double version;
    
    @Column(name = "cnbMid")
    private double cnbMid; 
    
    @Column(name = "ecbMid")
    private double ecbMid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(String validFrom) {
        this.validFrom = validFrom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getMove() {
        return move;
    }

    public void setMove(double move) {
        this.move = move;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getValBuy() {
        return valBuy;
    }

    public void setValBuy(double valBuy) {
        this.valBuy = valBuy;
    }

    public double getValSell() {
        return valSell;
    }

    public void setValSell(double valSell) {
        this.valSell = valSell;
    }

    public double getValMid() {
        return valMid;
    }

    public void setValMid(double valMid) {
        this.valMid = valMid;
    }

    public double getCurrBuy() {
        return currBuy;
    }

    public void setCurrBuy(double currBuy) {
        this.currBuy = currBuy;
    }

    public double getCurrSell() {
        return currSell;
    }

    public void setCurrSell(double currSell) {
        this.currSell = currSell;
    }

    public double getCurrMid() {
        return currMid;
    }

    public void setCurrMid(double currMid) {
        this.currMid = currMid;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }

    public double getCnbMid() {
        return cnbMid;
    }

    public void setCnbMid(double cnbMid) {
        this.cnbMid = cnbMid;
    }

    public double getEcbMid() {
        return ecbMid;
    }

    public void setEcbMid(double ecbMid) {
        this.ecbMid = ecbMid;
    }
}

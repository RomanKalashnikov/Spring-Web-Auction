package ru.kalashnikov.example.auction.entity;


import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "ITEM")
public class Item {
    @Id
    @GeneratedValue(generator = "GENERATOR_ID")
    private Long id;
    private String name;
    @ManyToOne
    private User seller;

    @Column(nullable = false)
    private BigDecimal initPrice;

    private LocalDateTime biddingStartTime;

    private Integer biddingPeriod;

    private LocalDateTime completionTime;
    @OneToOne
    private Bet currentBet;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getSeller() {
        return seller;
    }

    public void setSeller(User seller) {
        this.seller = seller;
    }

    public BigDecimal getInitPrice() {
        return initPrice;
    }

    public void setInitPrice(BigDecimal initPrice) {
        this.initPrice = initPrice;
    }

    public LocalDateTime getBiddingStartTime() {
        return biddingStartTime;
    }

    public void setBiddingStartTime(LocalDateTime biddingStartTime) {
        this.biddingStartTime = biddingStartTime;
    }

    public Integer getBiddingPeriod() {
        return biddingPeriod;
    }

    public void setBiddingPeriod(Integer biddingPeriod) {
        this.biddingPeriod = biddingPeriod;
    }

    public LocalDateTime getCompletionTime() {
        return completionTime;
    }

    public void setCompletionTime(LocalDateTime completionTime) {
        this.completionTime = completionTime;
    }

    public Bet getCurrentBet() {
        return currentBet;
    }

    public void setCurrentBet(Bet currentBet) {
        this.currentBet = currentBet;
    }
}

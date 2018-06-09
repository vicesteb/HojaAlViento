package com.hojaalviento.store.data.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class PriceRow
{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private Date from;

    private Date to;

    private Double amount;

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public Date getFrom()
    {
        return from;
    }

    public void setFrom(Date from)
    {
        this.from = from;
    }

    public Date getTo()
    {
        return to;
    }

    public void setTo(Date to)
    {
        this.to = to;
    }

    public Double getAmount()
    {
        return amount;
    }

    public void setAmount(Double amount)
    {
        this.amount = amount;
    }
}

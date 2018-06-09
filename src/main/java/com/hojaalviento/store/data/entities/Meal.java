package com.hojaalviento.store.data.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Meal
{
    @Id
    private String code;

    private String name;

    private PriceRow priceRow;

    public String getCode()
    {
        return code;
    }

    public void setCode(String code)
    {
        this.code = code;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public PriceRow getPriceRow()
    {
        return priceRow;
    }

    public void setPriceRow(PriceRow priceRow)
    {
        this.priceRow = priceRow;
    }
}

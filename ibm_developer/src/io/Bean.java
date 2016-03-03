package io;

import java.io.Serializable;

/**
 * Created by Yang on 2016/1/23.
 */
public class Bean implements Serializable {
    private Boolean isUsed;
    private Double rate;
    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public Boolean getIsUsed() {
        return isUsed;
    }

    public void setIsUsed(Boolean isUsed) {
        this.isUsed = isUsed;
    }



    public Bean(Boolean isUsed, Double rate, String name) {
        this.isUsed = isUsed;
        this.rate = rate;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bean{" +
                "isUsed=" + isUsed +
                ", rate=" + rate +
                ", name='" + name + '\'' +
                '}';
    }
}

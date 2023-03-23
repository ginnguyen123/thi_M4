package com.codegym.model;

import javax.persistence.*;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
@Table(name = "provinces")
public class Province extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "Tên thành phố không được trống")
    @Column(name = "name", nullable = false)
    private String name;

    @NotNull(message = "Diện tích không được trống")
    @Column(nullable = false)
    @DecimalMin(value = "1", message = "Diện tích không được âm" )
    private BigDecimal area;

    @NotNull(message = "Dân số không được trống")
    @Column(nullable = false)
    @DecimalMin(value = "1", message = "Dân số không được âm" )
    private BigDecimal population;

    @NotNull(message = "GDP không được trống")
    @DecimalMin(value = "1", message = "GDP không được âm" )
    private BigDecimal GDP;

    @NotEmpty(message = "Phần giới thiệu không được trống")
    private String description;

    @OneToOne
    @JoinColumn(name = "country_id", referencedColumnName = "id", nullable = false)
    private Country country;

    public Province() {
    }

    public Province(Long id, String name, BigDecimal area, BigDecimal population, BigDecimal GDP, String description, Country country) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.population = population;
        this.GDP = GDP;
        this.description = description;
        this.country = country;
    }

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

    public BigDecimal getArea() {
        return area;
    }

    public void setArea(BigDecimal area) {
        this.area = area;
    }

    public BigDecimal getPopulation() {
        return population;
    }

    public void setPopulation(BigDecimal population) {
        this.population = population;
    }

    public BigDecimal getGDP() {
        return GDP;
    }

    public void setGDP(BigDecimal GDP) {
        this.GDP = GDP;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}

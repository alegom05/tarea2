package com.example.holamundo.entity;

import com.example.holamundo.repository.ShipperRepository;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.engine.transaction.jta.platform.internal.SunOneJtaPlatform;
import org.hibernate.event.spi.SaveOrUpdateEventListener;

@Getter
@Setter
@Entity (name="products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="productid", nullable = false)
    private int id;

    private String productname;

    @ManyToOne
    @JoinColumn(name="SupplierID")
    private Supplier supplier;

    @ManyToOne
    @JoinColumn(name = "categoryid")
    private Category category;

    private String quantityperunit;
    private Double unitprice;
    private Integer unitsinstock;
    private Integer unitsonorder;
    private Integer reorderlevel;

    @Column (nullable = false)
    private Boolean discontinued;


    public Product(int id, String productname) {
        this.id = id;
        this.productname = productname;
    }

    public Product() {

    }
}

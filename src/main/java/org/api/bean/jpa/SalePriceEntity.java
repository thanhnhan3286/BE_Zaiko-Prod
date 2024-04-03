package org.api.bean.jpa;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "m_sale_price")
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Getter
@Setter
public class SalePriceEntity extends CommonEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sale_price_id")
    @JsonProperty("salePrice_id")
    private Integer sale_price_id;

    //companyId
    @Column(name = "company_id", nullable = false)
    @JsonProperty("companyId")
    private Integer company_id;

    //customerId
    @Id
    @Column(name = "customer_id", nullable = false)
    @JsonProperty("customerId")
    private Integer customer_id;

    //productId
    @Column(name = "product_id", nullable = false)
    @JsonProperty("productId")
    private Integer product_id;

    //number_mng
    @Column(name = "number_mng")
    @JsonProperty("number_mng")
    private String number_mng;

    //datetime_mng_from
    @Column(name = "datetime_mng_from")
    @JsonProperty("datetime_mng_from")
    private String datetime_mng_from;

    //datetime_mng_to
    @Column(name = "datetime_mng_to")
    @JsonProperty("datetime_mng_to")
    private String datetime_mng_to;

    //pack_cs_price
    @Column(name = "pack_cs_price", precision = 8, scale = 2)
    @JsonProperty("pack_cs_price")
    private Double pack_cs_price;

    //pack_bl_price
    @Column(name = "pack_bl_price", precision = 8, scale = 2)
    @JsonProperty("pack_bl_price")
    private Double pack_bl_price;

    //piecePrice
    @Column(name = "piece_price", precision = 8, scale = 2)
    @JsonProperty("piecePrice")
    private Double piece_price;

    //free_item1
    @Column(name = "free_item1")
    @JsonProperty("freeItem1")
    private String free_item1;

    //free_item2
    @Column(name = "free_item2")
    @JsonProperty("freeItem2")
    private String free_item2;

    //free_item3
    @Column(name = "free_item3")
    @JsonProperty("freeItem3")
    private String free_item3;
}

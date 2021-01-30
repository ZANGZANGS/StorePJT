package study.store.StorePJ.domain;


import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Product {


    @Id
    @GeneratedValue
    @Column(name ="PRODUCT_CODE")
    @NotNull
    private Long id;

    @Column(name="PRODUCT_NAME")
    @NotNull
    private String productName;

    @Column(name="PRODUCT_WRITER")
    @NotNull
    private String productWriter;

    @Column(name="PRODUCT_PRICE")
    @NotNull
    private BigDecimal productPrice;

    @Column(name="PRODUCT_CNT")
    @NotNull
    private Long productCnt;

    @Column(name="DISCOUNT_RATE")
    private Long discountRate;

    @ColumnDefault("Y")
    @Column(name="USE_PNT_YN")
    private String usePointYN;

    @Column(name="FILE_PATH")
    private String filePath;

    @Column(name="FILE_NAME1")
    private String fileName1;

    @Column(name="FILE_NAME2")
    private String fileName2;

    @Column(name="FILE_NAME3")
    private String fileName3;

    @Column(name="FILE_NAME4")
    private String fileName4;

    @Column(name="FILE_NAME5")
    private String fileName5;

    @Column(name="HIT_CNT")
    private Long hitCnt;

    @Column(name="DEL_YN")
    private String delYN;

    @Column(name ="PRODUCT_FRST_PROC_DTTM")
    private LocalDateTime firstProcTime;

    @Column(name= "PRODUCT_LAST_PROC_DTTM")
    private LocalDateTime lastProcTime;


    @OneToMany(mappedBy = "product")
    private List<MyCart> cartList = new ArrayList<>();
}

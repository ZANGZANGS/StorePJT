package study.store.StorePJ.domain;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class MyCart {

    @Id
    @GeneratedValue
    @Column(name="MY_CART_ID")
    private Long cartNo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="PRODUCT_CODE")
    private Product product;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="MEMBER_NO")
    private Member member;

    @ColumnDefault("0")
    @NotNull
    @Column(name="CNT")
    private Long cnt;


    @Column(name ="MEMBER_FRST_PROC_DTTM")
    private LocalDateTime firstProcTime;

    @Column(name= "MEMBER_LAST_PROC_DTTM")
    private LocalDateTime lastProcTime;

}

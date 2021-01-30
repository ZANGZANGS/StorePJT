package study.store.StorePJ.domain;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Member {

    @Id
    @GeneratedValue
    @Column(name ="MEMBER_NO")
    private String memberNo;

    @NotNull
    @Column(name="USER_ID")
    private String userId;

    @NotNull
    @Column(name="USER_PASSOWRD")
    private String userPassword;

    @NotNull
    @Column(name="USER_LEVEL")
    private String userLevel;

    @NotNull
    @Column(name="USER_BRDD")
    private String userBirthday;

    @NotNull
    @Column(name="USER_EMAIL")
    private String userEmail;

    @NotNull
    @Column(name="ZIPCODE")
    private String zipcode;

    @NotNull
    @Column(name="ADDRESS")
    private String address;

    @NotNull
    @Column(name="PHONE")
    private String phone;

    @Column(name="AVAIL_PNT")
    private String availPoint;

    @NotNull
    @ColumnDefault("Y")
    @Column(name="USE_YN")
    private String useYN;

    @Column(name="LOGIN_ERR_CNT")
    private Long loginErrCnt;

    @Column(name ="MEMBER_FRST_PROC_DTTM")
    private LocalDateTime firstProcTime;

    @Column(name= "MEMBER_LAST_PROC_DTTM")
    private LocalDateTime lastProcTime;

    @OneToMany(mappedBy = "member")
    private List<MyCart> myCarts = new ArrayList<>();


}

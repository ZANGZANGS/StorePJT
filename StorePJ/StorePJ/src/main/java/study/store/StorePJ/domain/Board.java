package study.store.StorePJ.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Board {

    @Id
    @GeneratedValue
    @Column(name="BOARD_ID")
    private Long id;

    @Column(name = "TITLE")
    private String title;

    private String content;

    private String writerId;

    private String delYN;

    @Column(name ="BORD_FRST_PROC_DTTM")
    private LocalDateTime firstProcTime;

    @Column(name= "BORD_LAST_PROC_DTTM")
    private LocalDateTime lastProcTime;

    @OneToMany(mappedBy = "board")
    private List<Comment> comments = new ArrayList<>();


}

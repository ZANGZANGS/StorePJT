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
public class Comment {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BOARD_ID")
    private Board board;

    private String content;

    private String delYN;

    @Column(name ="COMMENT_FRST_PROC_DTTM")
    private LocalDateTime firstProcTime;

    @Column(name= "COMMENT_LAST_PROC_DTTM")
    private LocalDateTime lastProcTime;
}

package aily.server.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Setter
public class MyPage {
    @Id
    private String nickname;
    @Column(name = "point")
    @ColumnDefault("0")
    private int point;
    @Column(name = "profile")
    private String profile;

    @ColumnDefault("0")
    private int PET;

    @ColumnDefault("0")
    private int GEN;

    @ColumnDefault("0")
    private int CAN;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "phonenumber", referencedColumnName = "phone_number")
    private User user;
}
package back.Backspring.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity//데이터 베이스 테이블과 1대1 매핑되는 객체를 뜻함
@Table(name = "`user`")// 이름 설정
@Getter
@Setter
@Builder
@AllArgsConstructor//생성자
@NoArgsConstructor
public class User {

    @Id//pk
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(name = "username", length = 50, unique = true)
    private String username;

    @Column(name = "password", length = 100)
    private String password;

    @Column(name = "nickname", length = 50)
    private String nickname;

    @Column(name = "activated")
    private boolean activated;

    @ManyToMany
    @JoinTable(//유저 권한 다대다
            name = "user_authority",
            joinColumns = {@JoinColumn(name = "user_id", referencedColumnName = "user_id")},
            inverseJoinColumns = {@JoinColumn(name = "authority_name", referencedColumnName = "authority_name")})
    private Set<Authority> authorities;//권한
}
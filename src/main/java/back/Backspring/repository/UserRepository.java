package back.Backspring.repository;

import back.Backspring.entity.User;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;


//https://guccin.tistory.com/144
//인터페이스 사용하는 이유 ->  클래스를 작성하기 위한 밑그림만 그려진 기본 설계도 정도로 이해하기
import java.util.Optional;


//jpaRepository를 상속
public interface UserRepository extends JpaRepository<User, Long> {

    //eager조회로 가져온다.
    @EntityGraph(attributePaths = "authorities")
    Optional<User> findOneWithAuthoritiesByUsername(String username);
    //user네임을 기준으로 권한을 같이 가죠옴
}
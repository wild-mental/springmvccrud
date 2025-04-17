package ac.su.kdt.springmvccrud.repository;// ID 컬럼 지정
// JpaRepository 영속성 관련 메서드 확인
// ListCrudRepository, CrudRepository 데이터 관련 메서드 확인
// @NoRepositoryBean 용도 확인

import ac.su.kdt.springmvccrud.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // 구체적인 CRUD 액션 중 표준적인 것들은 전부 미리 구현되어 있음!
}
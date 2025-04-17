package ac.su.kdt.springmvccrud.service;// Application 에서 원하는 CRUD 동작을 반영해 Repository 접근 상세 로직 구현

import ac.su.kdt.springmvccrud.domain.User;
import ac.su.kdt.springmvccrud.exception.UserNotFoundException;
import ac.su.kdt.springmvccrud.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // ===============================================================
    // Service 로직을 본격적으로 구현 (아래 함수들을 활용해서 데이터 CRUD 동작 호출)
    // < Code Here >

    // ===============================================================
    // 리포지토리 호출 메서드가 아래에 분리되어 있는 형태로 Service 코드 작성
    public List<User> getAllUsers() {
        // 구체적인 조건, 처리 세부사항 등의 로직을
        // Service Layer 에서 처리한다.
        return userRepository.findAll();
    }

    public User getUserByID(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new UserNotFoundException(id));
        // 1. throw case 에러 catch
        // 2. dummy 객체 리턴
        // 3. custom error 페이지로 이동
    }
}
package ac.su.kdt.springmvccrud.service;

import ac.su.kdt.springmvccrud.repository.ExampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExampleService {

    private final ExampleRepository exampleRepository;

    @Autowired
    public ExampleService(ExampleRepository exampleRepository) {
        this.exampleRepository = exampleRepository;
    }

    public String getMessage() {
	      // 비즈니스 로직에 해당하는 모든 코드를 여기에 구현합니다.
        // <코드 구현>
        String message = exampleRepository.getMessage();
		    // 비즈니스 로직 처리 완료 시 Controller 로 Model 데이터를 전달합니다. 
		    // (Model = Entity 를 가공해서, User Client 가 관심을 가지는 데이터로 정리한 결과)
        return "Hello " + message + "!";
    }
}
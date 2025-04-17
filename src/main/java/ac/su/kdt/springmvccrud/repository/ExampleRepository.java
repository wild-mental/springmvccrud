package ac.su.kdt.springmvccrud.repository;

import org.springframework.stereotype.Repository;

@Repository
public class ExampleRepository {
    public String getMessage() {
        return "World";
    }
}

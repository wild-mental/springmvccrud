package ac.su.kdt.springmvccrud.domain;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginForm {  // DTO 역할을 하는 클래스! (Data Transfer Object)
    private String email;
    private String password;
}
package ac.su.kdt.springmvccrud.controller;

import ac.su.kdt.springmvccrud.domain.User;
import ac.su.kdt.springmvccrud.repository.UserRepository;
import ac.su.kdt.springmvccrud.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController  // RESTful API 개발
@RequestMapping("/api/users")
public class UserRestController {

    private final UserService userService;

    public UserRestController(UserService userService) {
        this.userService = userService;
    }

//    @PostMapping

    @GetMapping
    private ResponseEntity<List<User>> getAllUsers() {
        List<User> allUsers = userService.getAllUsers();
        return ResponseEntity.ok(allUsers);
    }

//    @GetMapping

//    @PutMapping
//
//    @PatchMapping
//
//    @DeleteMapping

}

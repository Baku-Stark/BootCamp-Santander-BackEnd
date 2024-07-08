package dio.first_web_api.controller;
import dio.first_web_api.model.Usuario;
import dio.first_web_api.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserRepository repository;

    @GetMapping
    public List<Usuario> list(){
        return repository.findAll();
    }

    @PostMapping
    public void save(@RequestBody Usuario user){
        repository.save(user);
    }

    @PutMapping
    public void update(@RequestBody Usuario user){
        repository.save(user);
    }

    @GetMapping("/{username}")
    public Usuario find(@PathVariable("username") String username){
        System.out.println("GET BY ID - PARAMS: " + username);
        return repository.findByUsername(username);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        System.out.println("Delete BY ID - PARAMS: " + id);
        repository.deleteById(id);
    }
}

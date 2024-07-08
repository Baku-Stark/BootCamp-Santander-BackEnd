package dio.first_web_api.repository;

import java.util.List;
import java.util.ArrayList;

import dio.first_web_api.model.Usuario;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    public void save(Usuario usuario){
        if(usuario.getId() == null)
            System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        else
            System.out.println("UPDATE - Recebendo o usuário na camada de repositório");

        System.out.println(usuario);
    }

    public void deleteById(Integer id){
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário", id));
        System.out.println(id);
    }

    public List<Usuario> findAll(){
        System.out.println("LIST - Listando os usários do sistema");

        List<Usuario> usuarios = new ArrayList<Usuario>();

        usuarios.add(new Usuario("gleyson","password"));
        usuarios.add(new Usuario("frank","masterpass"));
        usuarios.add(new Usuario("wallace","student"));
        return usuarios;
    }

    public Usuario findById(Integer id){
        System.out.println(String.format("FIND/id - Recebendo o id: %d para localizar um usuário", id));
        return new Usuario("gleyson","password");
    }

    public Usuario findByUsername(String username){
        System.out.println(String.format("FIND/username - Recebendo o usernama: %s para localizar um usuário", username));
        return new Usuario("wallace","student");
    }
}
package pe.edu.tecsup.sugarormapp.repositories;

import com.orm.SugarRecord;

import java.util.List;

import pe.edu.tecsup.sugarormapp.models.User;

/**
 * Created by Alumno on 19/04/2018.
 */

public class UserRepository {

    public static List<User> list(){
        List<User>users = SugarRecord.listAll(User.class);
        return users;
    }

    public static User read(Long id){
        User user= SugarRecord.findById(User.class, id);
        return user;
    }

    public static void create(String username, String fullnames, String email, String password ){
        User user=new User(username, fullnames , email , password);
        SugarRecord.save(user);
    }

    public static void update(String username, String fullnames, String email, String password, Long id){
        User user=SugarRecord.findById(User.class, id);
        user.setUsername(username);
        user.setFullnames(fullnames);
        user.setEmail(email);
        user.setPassword(password);
        SugarRecord.save(user);
    }

    public static void delete(Long id){
        User user=SugarRecord.findById(User.class, id);
        SugarRecord.delete(user);
    }
}

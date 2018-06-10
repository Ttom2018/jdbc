package dao;


import confing.Database;
import model.User;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class UserDao {
    //save
    //update
    //delete
    //findById
    //findAll
    private Database database= new Database();

    public User user (User user) throws SQLException {
        // insert
        //1.pobierz polaczenia
        Connection connection = database.getConnection();
        //2.napisz zapytanie
        String sql ="INSERT INTO user(first_name, last_name, email) " +"Values()";

    }

    public void update (User user){

    }
    public User findById(int id){


    }
    public List<User>
}

package dao;


import confing.Database;
import model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
          // String sql ="INSERT INTO user(first_name, last_name, email) " +
         //        "Values(" + user.getFirstName()+ "," +
        //              user.getLastName()+ "," +
       //               user.getEmaill()+ ")";
      //firstName = " Drop datbase"
        // potencjalnie sql injection
        String sql ="INSERT INTO user(first_name, last_name, email) " +
                 "Values (?,?,?,)";
        //3.Utwórz obiekt PreparedStatement

        PreparedStatement statement = connection.prepareStatement(sql);
        // Uzupełnij parametry zapytania
        statement.setString(1,user.getFirstName());
        statement.setString(2, user.getLastName());
        statement.setString(3, user.getEmaill());

        //5.wykonaj zapytanie w bazie
        statement.executeUpdate();
        return user;
    }

    public void update (User user){

    }
    public User findById(int id){
        return null;

    }
    public List<User> findAll(){
           return null;
    }

    public void save(User user) {
    }
}

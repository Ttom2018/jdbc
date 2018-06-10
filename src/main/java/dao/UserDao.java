package dao;


import confing.Database;
import model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UserDao {
    //save
    //update
    //delete
    //findById
    //findAll
    private Database database= new Database();
     public User save (User user) throws SQLException {
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
                "Values (?,?,?)";
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
    public void update (User user)throws SQLException{
            Connection connection = database.getConnection();
            String sql ="UPDATE user(first_name, last_name, email) " +
                    "Values (?,?,?)";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1,user.getFirstName());
            statement.setString(2, user.getLastName());
            statement.setString(3, user.getEmaill());

            statement.executeQuery();
            return user;

    }
    public User delete()throws SQLException{
         Connection connection = database.getConnection();
         String sql= "DELETE FROM "

    }
    public User findById(int id) throws SQLException{
        Connection connection =database.getConnection();
        String sql ="SELECT id, first_name, last_name, emaill" +
                "FROM user WHERE id=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1,id);
        ResultSet result = statement.executeQuery();
        User user= null;
        while (result.next()){
            id = result.getInt("id");
            String firstName = result.getString("first_name");
            String lastName = result.getString("last_name");
            String email = result.getString("email");
            user = new User(id, firstName, lastName, email);
        }
        return user;
    }
    public List<User> findAll(){
           return null;
    }


}

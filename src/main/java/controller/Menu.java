package controller;

import dao.UserDao;
import model.User;

public class Menu {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.wyswietlMenu();
    }

    public void wyswietlMenu(){
        UserDao userDao= new UserDao();
        userDao.save(new User("Wojciech", "Musial", "wojciechmusial.com"));
    }
}

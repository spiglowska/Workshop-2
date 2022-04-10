package pl.coderslab.entity;

public class MainDao {
    public static void main(String[] args) {

        //CREATE
//
        UserDao userDao = new UserDao();
//        User user2 = new User();
//        user2.setUserName("Basia");
//        user2.setEmail("abc@cod.pl");
//        user2.setPassword("missss");
//        userDao.create(user2);

//UserDao userDao = new UserDao();
//        User user2 = new User();
//        user2.setUserName("Basia");
//        user2.setEmail("abcde@op.pl");
//        user2.setPassword("missss");
//        userDao.create(user2);
//        System.out.println("id numer 1:" + user2.getId());

        //UPDATE AND READ
//        User userToUpdate = userDao.read(5);
//
//        userToUpdate.setUserName("Ola");
//        userToUpdate.setEmail("ola@coderslab.pl");
//        userToUpdate.setPassword("superPassss");
//        userDao.update(userToUpdate);
//    DELETE
        //userDao.delete(1);


        System.out.println("========Tablica Tabeli users==============");
        User[] users = userDao.findAll();
        for (User userEntity : users) {
            System.out.println(userEntity);
        }


    }
}

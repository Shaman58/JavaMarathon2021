package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("user1");
        User user2 = new User("user2");
        User user3 = new User("user3");

        user1.sendMessage(user2, "Hello");
        user1.sendMessage(user2, "user2");
        user2.sendMessage(user1, "Hi");
        user2.sendMessage(user1, "user1");
        user2.sendMessage(user1, "How are you?");
        user3.sendMessage(user1, "Hi, user1!");
        user3.sendMessage(user1, "Lats learn JAVA");
        user3.sendMessage(user1, "I'm already started");
        user1.sendMessage(user3, "Hello");
        user1.sendMessage(user3, "user3");
        user1.sendMessage(user3, "I learn Python");
        user3.sendMessage(user1, "OK");

        MessageDatabase.showDialog(user1, user3);
    }
}

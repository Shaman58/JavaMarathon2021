package day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    private static List<Message> messages = new ArrayList<>();

    public static void addNewMessage(User u1, User u2, String text) {
        messages.add(new Message(u1, u2, text));
    }

    public static List<Message> getMessages() {
        return messages;
    }

    public static void showDialog(User u1, User u2) {
        for (Message message : messages) {
            if ((message.sender == u1 && message.receiver == u2) || (message.sender == u2 && message.receiver == u1))
                System.out.printf("%s: %s%n", message.sender.toString(), message.text);
        }
    }
}

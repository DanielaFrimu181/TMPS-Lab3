package ComportamentalPatterns.Mediator;

public class BasicChatRunner {
    public static void main(String[] args) {
        BasicChat chat = new BasicChat();

        User admin = new Admin(chat,"Admin");
        User user1 = new SimpleUser(chat, "User 1");
        User user2 = new SimpleUser(chat, "User 2");

        chat.setAdmin(admin);
        chat.addUserToChat(user1);
        chat.addUserToChat(user2);

        user1.sendMessage("Hello Vasile!");
        admin.sendMessage("Vasile merge bine!");

        

    }
}

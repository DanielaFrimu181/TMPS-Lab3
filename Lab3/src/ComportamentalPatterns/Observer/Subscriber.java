package ComportamentalPatterns.Observer;

import java.util.List;

public class Subscriber implements Observer {
    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> videos) {
        System.out.println("Dear " + name + "\nWe have some changes in your watching list:\n" + videos);
        System.out.println("==================================================================");
    }
}

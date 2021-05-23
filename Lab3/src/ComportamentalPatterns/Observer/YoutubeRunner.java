package ComportamentalPatterns.Observer;

public class YoutubeRunner {
    public static void main(String[] args) {
        YoutubeChannel youtubeChannel = new YoutubeChannel();

        youtubeChannel.addVideo("Design patterns #1 [Singleton]");
        youtubeChannel.addVideo("Clean Code");

        Observer vasile = new Subscriber("Vasile");
        Observer andrei = new Subscriber("Andrei");

        youtubeChannel.addObserver(vasile);
        youtubeChannel.addObserver(andrei);

        youtubeChannel.addVideo("How to learn java in an hour???");
        youtubeChannel.removeVideo("Clean Code");
    }
}

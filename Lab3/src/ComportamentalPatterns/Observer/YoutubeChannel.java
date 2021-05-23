package ComportamentalPatterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Observed{
    List<String> videos = new ArrayList<>();
    List<Observer> subscribers = new ArrayList<>();

    public void addVideo(String video){
        System.out.println("New video was added: " + video);
        this.videos.add(video);
        notifyObservers();
    }

    public void removeVideo(String video){
        System.out.println("Video was removed: " + video);
        this.videos.remove(video);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        this.subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: subscribers) {
            observer.handleEvent(this.videos);
        }
    }

}

package Observer;

import java.util.ArrayList;
import java.util.List;

public class PostOffice implements Subject, Publisher {
    private final List<Observer> observers = new ArrayList<>();
    private String data;
    private final String subjectDetails;

    public PostOffice(String subjectDetails) {
        this.subjectDetails = subjectDetails;
    }

    @Override
    public void subscribeObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unSubscribeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        System.out.println();
        for (Observer observer : observers) {
            observer.update(data);
        }

    }

    @Override
    public void newData(String data) {
        this.data = data;
        notifyObservers();
    }

    @Override
    public String subjectDetails() {
        return subjectDetails;
    }
}

package Observer;

import java.util.ArrayList;
import java.util.List;

class User implements Observer {

    private final List<Subject> subjects = new ArrayList<>();
    private String data;
    private final String userInfo;

    public User(String userInfo) {
        this.userInfo = userInfo;
    }

    @Override
    public void update(String data) {
        this.data = data;
        display();
    }

    private void display() {
        System.out.println("[" + userInfo + "]: " + data);
    }

    @Override
    public void subscribe(Subject subject) {
        subjects.add(subject);
        System.out.println("Subscribing " + userInfo + " to " + subject.subjectDetails() + " ...");
        subject.subscribeObserver(this);
        System.out.println("Subscribed successfully.");
    }

    @Override
    public void unSubscribe(Subject subject) {
        System.out.println("Unsubscribing " + userInfo + " to " + subject.subjectDetails() + " ...");
        subject.unSubscribeObserver(this);
        System.out.println("Unsubscribed successfully.");
    }

    @Override
    public void unSubscribeFromAllSubjects() {
        for(Subject subject: subjects){
            unSubscribe(subject);
        }
    }

}
package Observer;

public interface Observer {
    void update(String desc);

    void subscribe(Subject subject);

    void unSubscribe(Subject subject);

    void unSubscribeFromAllSubjects();

}

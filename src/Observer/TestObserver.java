package Observer;

public class TestObserver {
    public static void main(String[] args) {

        Subject postOffice1 = new PostOffice("POST OFFICE 224");
        Publisher pObject1 = (Publisher) postOffice1;

        Subject postOffice2 = new PostOffice("POST OFFICE 666");
        Publisher pObject2 =  (Publisher) postOffice2;

        Observer observer1_1 = new User("Cris Patterson");
        observer1_1.subscribe(postOffice1);
        System.out.println();

        Observer observer1_2 = new User("Tim Raible");
        observer1_2.subscribe(postOffice1);
        observer1_2.subscribe(postOffice2);

        pObject1.newData("Harry Potter and the Philosopher's Stone is available");
        pObject2.newData("Forbs magazines are available now !");

        System.out.println();

        observer1_1.unSubscribe(postOffice1);
        pObject1.newData("Harry Potter and The Order of the Phoenix");

        observer1_2.unSubscribeFromAllSubjects();

    }
}

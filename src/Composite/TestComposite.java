package Composite;

public class TestComposite {


    public static void main(String[] args) {
        Catalog localDriveC = new Catalog("C:");
        Catalog userData = new Catalog("UserData");
        Catalog windows = new Catalog("Windows");

        Catalog music = new Catalog("Music");
        Catalog rock = new Catalog("Rock");
        Catalog classical = new Catalog("Classical");
        Catalog pictures = new Catalog("Pictures");

        File track1 = new File("Schumann: Sonata No.2");
        File track2 = new File("Rachmaninoff: Op.33 No.4");
        File track3 = new File("AC/DC: Highway to Hell");
        File picture1 = new File("Walls.png");
        File picture2 = new File("People.png");

        localDriveC.add(userData);
        localDriveC.add(windows);

        userData.add(music);
        userData.add(pictures);

        music.add(classical);
        music.add(rock);

        pictures.add(picture1);
        pictures.add(picture2);

        classical.add(track1);
        classical.add(track2);
        rock.add(track3);

//        pictures.remove(picture1);
//        windows.rename("Program Data");
//        music.display();
        localDriveC.display();
    }
}

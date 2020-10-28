package Composite;

public class File implements Operations {
    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void add(Object obj) {
        throw new UnsupportedOperationException("Unsupported operation");
    }

    @Override
    public void remove(Object obj) {
        throw new UnsupportedOperationException("Unsupported operation");
    }

    @Override
    public void rename(String newName) {
        this.name = newName;
    }

    @Override
    public void display() {
        System.out.println(Catalog.number_spaces + name);
    }
}

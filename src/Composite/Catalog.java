package Composite;

import java.util.ArrayList;

class Catalog implements Operations {
    private String name;
    private final ArrayList<Object> includedItems = new ArrayList<>();
    static String number_spaces = "";
    Catalog(String name) {
        this.name = name;
    }

    @Override
    public void add(Object obj) {
        includedItems.add(obj);
    }

    @Override
    public void remove(Object obj) {
        if (!includedItems.remove(obj)) { //return True if obj to delete was found
            throw new UnsupportedOperationException("There is no such file");
        }
    }

    @Override
    public void rename(String newName) {
        this.name = newName;
    }


    @Override
    public void display() { //Pre Order traversal
        System.out.println(Catalog.number_spaces + name + "\\");
        Catalog.number_spaces += "    ";
        for (Object includedItem : includedItems) {
            Operations obj = (Operations) includedItem;
            obj.display();
        }
        Catalog.number_spaces = Catalog.number_spaces.substring(0, Catalog.number_spaces.length() - 4); //Delete four last elements
    }
}

package com.personal.starterWeb.Bean;

public class Librarian extends Person{
    public Librarian(String name, int id) {
        super(name, id);
    }

    @Override
    public String toString() {
        return "Librarian{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}

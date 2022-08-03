package phoneBook.repository;

import phoneBook.Person;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDao implements PhoneBookDao<Person> {

    private final ArrayList<Person> repo;

    public ArrayListDao(ArrayList<Person> repo) {
        this.repo = repo;
    }

    @Override
    public List<Person> getAllList() {
        return repo;
    }

    @Override
    public Person findByName(String name) {
        return null;
    }

    @Override
    public void saveOne(Person person) {
        repo.add(person);
    }

    @Override
    public void modifyOne(Person person) {

    }
}

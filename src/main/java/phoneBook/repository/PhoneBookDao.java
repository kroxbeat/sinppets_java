package phoneBook.repository;

import java.util.List;

public interface PhoneBookDao <T>{
    List<T> getAllList();
    T findByName(String name);
    void saveOne(T t);
    void modifyOne(T t);
}

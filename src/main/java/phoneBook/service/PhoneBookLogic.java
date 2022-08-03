package phoneBook.service;

public interface PhoneBookLogic {
    void add();
    void list();
    void edit();
    void delete();
    void deleteAll();

    void search();

    String loop();
}

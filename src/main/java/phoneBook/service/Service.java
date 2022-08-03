package phoneBook.service;

import phoneBook.Person;
import phoneBook.repository.PhoneBookDao;

import java.util.Scanner;

public class Service implements PhoneBookLogic {

    private final Scanner scan;
    final private PhoneBookDao<Person> dao;

    public Service(Scanner scan, PhoneBookDao<Person> dao) {
        this.scan = scan;
        this.dao = dao;
    }

    private String getInputMsg(String str) {
        System.out.print(str);
        return scan.nextLine();
    }

    @Override
    public String loop() {
        System.out.print("> ");
        return scan.nextLine();
    }

    @Override
    public void add() {
        System.out.println("전화번호부 등록");
        String name = getInputMsg("이름 : ");
        String number = getInputMsg("전화번호 : ");
        String addr = getInputMsg("주소 : ");

        dao.saveOne(new Person(name,number,addr));
    }

    @Override
    public void list() {
        System.out.println(dao.getAllList());
    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void search() {

    }

}

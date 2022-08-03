package phoneBook;

import phoneBook.repository.ArrayListDao;
import phoneBook.repository.PhoneBookDao;
import phoneBook.service.PhoneBookLogic;
import phoneBook.service.Service;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PhoneBookDao<Person> dao = new ArrayListDao(new ArrayList<>());

        Scanner scan = new Scanner(System.in);
        PhoneBookLogic service = new Service(scan, dao);

        new Controller(service).start();
    }
}

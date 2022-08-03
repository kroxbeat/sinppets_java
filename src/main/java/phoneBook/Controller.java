package phoneBook;

import phoneBook.service.PhoneBookLogic;

public class Controller {


    private final PhoneBookLogic logic;

    public Controller(PhoneBookLogic logic) {
        this.logic = logic;
    }

    public void start() {
        System.out.println("환영 합니다.");
        while (true) {
            String command = logic.loop();
            controller(command);
        }
    }

    private void controller(String next) {
        if (next == null || next.trim().length() == 0 )
            return;
        switch (next) {
            case "add":
                logic.add();
                break;
            case "list":
                logic.list();
                break;
            case "search":
                logic.search();
                break;
        }
    }
}

package phoneBook;

public class Person {

    public Person(String name, String number, String addr) {
        this.name = name;
        this.number = number;
        this.addr = addr;
    }

    private String name;
    private String number;
    private String addr;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "{" +
                "이름='" + name + '\'' +
                ", 전화번호='" + number + '\'' +
                ", 주소='" + addr + '\'' +
                '}';
    }
}

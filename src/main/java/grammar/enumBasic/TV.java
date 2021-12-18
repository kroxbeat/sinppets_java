package grammar.enumBasic;

public enum TV {
    SangSung("tv01","samsung"),Lg("tv02","lg"),Sony("tv03","sony");

    private String code;
    private String name;

    TV(String code, String name) {
        this.code = code;
        this.name = name;
    }


    public static void main(String[] args) {
        for (TV value : TV.values()) {
            System.out.println(value.code);
            System.out.println(value.name);
            System.out.println(value);
        }
    }
}

package grammar.jni;

public class HelloJNI {
    // Declare native method
    native String my_encrypt(String str);
    native String my_decrypt(String str);
    // Loading library
    static {
        System.loadLibrary("./Hello"); // libHello.so
    }

    public static void main(String args[]){
        HelloJNI jni = new HelloJNI();

        String encData = jni.my_encrypt("Hello World from printString fun");
        System.out.println("encData");
        System.out.println(encData);
        String decData = jni.my_decrypt(encData);
        System.out.println("decData");
        System.out.println(decData);

    }

}
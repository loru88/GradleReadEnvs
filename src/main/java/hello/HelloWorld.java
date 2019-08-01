package hello;

public class HelloWorld {
    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        String s = greeter.sayHello(System.getenv("VAR_NAME"));

        if (args.length > 0) {
            s = args[0] + " " + s;
        }
        System.out.println(s);
    }
}

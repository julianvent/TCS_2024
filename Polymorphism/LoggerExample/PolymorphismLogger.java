class Logger {
    public void log(String... messages) {
        System.out.println("Normal");

        for (String message : messages)
            System.out.println(message);
    }

    public <T> void log(T message) {
        System.out.println("Paramétrico\n" + message);
    }

    public void log(int level, String... messages) {
        System.out.println("Sobrecarga");

        for (String message: messages)
            System.out.println(message);
    }
}

public class PolymorphismLogger {
    public static void main(String[] args) {
        Logger log = new Logger();

        log.log("Hola", "aaa");
        log.log(1);
        log.log(1, "Hola", "Hola");
    }
}

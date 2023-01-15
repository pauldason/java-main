package com.dason.lambda;

public class Java8PrintMain {

    final static String salutation = "Hello! ";

    public static void main(String[] args) {

        GreetingService greetService1 = (message, messageExtends) -> {
            System.out.println(salutation + " " + message + " " + messageExtends);
        };

        greetService1.sayMessage("Runoob", "dason");
    }

    interface GreetingService {
        // void sayMessage(String message);

        void sayMessage(String message, String messageExtends);
    }
}

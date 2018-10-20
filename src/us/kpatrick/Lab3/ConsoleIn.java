package us.kpatrick.Lab3;

import java.util.Scanner;

public class ConsoleIn implements InputMessage {
    private String message;
    private Scanner in = new Scanner(System.in);

    public ConsoleIn() {

    }

    public void InputMessage(){
        System.out.println("What Message do you want in: ");
        this.message = in.nextLine();
        in.nextLine();
    }

    public String GetMessage() {
        return this.message;
    }
}

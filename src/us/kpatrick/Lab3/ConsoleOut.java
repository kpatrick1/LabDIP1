package us.kpatrick.Lab3;

public class ConsoleOut implements OutputMessage {
    private String message;

    public ConsoleOut() {

    }


    public void OutputMessage() {
        System.out.println(this.message);

    }

    public void SetMessage(String msg) {
        this.message = msg;
    }
}

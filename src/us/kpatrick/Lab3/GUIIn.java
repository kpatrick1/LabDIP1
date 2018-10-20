package us.kpatrick.Lab3;

import javax.swing.*;

public class GUIIn implements InputMessage{
    private String message;

    @Override
    public void InputMessage() {
        this.message = JOptionPane.showInputDialog("Enter Message Text");
    }

    @Override
    public String GetMessage() {
        return message;
    }
}

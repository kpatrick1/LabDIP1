package us.kpatrick.Lab3;

import javax.swing.*;

public class GUIOut implements OutputMessage {
    private String message;

    @Override
    public void OutputMessage() {
        JOptionPane.showMessageDialog(null, this.message);
    }

    @Override
    public void SetMessage(String msg) {
        this.message = msg;
    }
}

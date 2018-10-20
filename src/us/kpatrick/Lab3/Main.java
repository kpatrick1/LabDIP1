package us.kpatrick.Lab3;

import javax.swing.*;

public class Main {

    public static void main(String[] args){

        InputMessage message = new ConsoleIn();
        OutputMessage msg = new GUIOut();


        message.InputMessage();
        msg.SetMessage(message.GetMessage());
        msg.OutputMessage();




    }
}

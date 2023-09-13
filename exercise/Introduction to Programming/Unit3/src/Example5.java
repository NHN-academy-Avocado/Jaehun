import javax.swing.JOptionPane;
public class Example5 {         // Exercise 03.5
    public static void main(String[] args) {
        input();
    }

    public static void input() {
        String sender = "010-000-0000";
        String code = JOptionPane.showInputDialog("Insert a code");
        String text = JOptionPane.showInputDialog("Insert a text");
        String receiver = JOptionPane.showInputDialog("Insert a receiver");
        MessageText messageText = new MessageText(code, text);
        Message message = new Message(messageText, receiver, sender);
        message.printMessage();
    }
}

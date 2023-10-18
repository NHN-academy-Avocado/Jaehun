import javax.swing.JOptionPane;

public class MessageText {          // Exercise 03.3, 6
    private String code;
    private String text;

    public MessageText(String code, String text) {
        this.code = code;
        this.text = text;
    }
    public static MessageText keyboardInput(){
        String code = JOptionPane.showInputDialog("Insert a code");
        String text = JOptionPane.showInputDialog("Insert a text");
        return new MessageText(code, text);
    }

    public String getCode(){
        return this.code;
    }
    public String getText(){
        return this.text;
    }

    @Override
    public String toString() {
        return "code : " + getCode() +", " + "text : " + getText();
    }
}


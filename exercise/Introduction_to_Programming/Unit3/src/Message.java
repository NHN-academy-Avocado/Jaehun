public class Message{       // Exercose 03.4,
    private String call;
    private String sender;
    private MessageText messageText;
    public Message(MessageText messageText, String call, String sender){
        this.messageText = messageText;
        this.call = call;
        this.sender=sender;
    }
    public Message(MessageText messageText, String sender){
        this.messageText = messageText;
        this.call = null;
        this.sender = sender;
    }
    public Message(MessageText messageText){
        this.messageText = messageText;
        this.call = null;
        this.sender = null;
    }
    public void setCall(String call) {
        this.call = call;
    }
    public void printMessage(){
        System.out.println(messageText.toString());
    }

}

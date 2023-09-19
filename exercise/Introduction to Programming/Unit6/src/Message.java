public class Message {
    private String sender;
    private String receiver;
    private String text;

    public Message(String sender, String receiver, String text) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    public void swap(){
        String temp = sender;
        sender = receiver;
        receiver = temp;
    }
    public void eliminationBlank(){
        StringBuilder sb = new StringBuilder(this.getText());
        while(sb.length() >0 && Character.isWhitespace(sb.charAt(0))){
            sb.deleteCharAt(0);
        }
        while(sb.length()>0 && Character.isWhitespace(sb.charAt(sb.length()-1))){
            sb.deleteCharAt(sb.length()-1);
        }
        for(int i=1; i<sb.length(); i++){
            if(Character.isWhitespace(sb.charAt(i-1)) && Character.isWhitespace(sb.charAt(i))){
                sb.deleteCharAt(i);
                i--;
            }
        }
    }
    public void eliminationVowels(){
        setText(getText().replaceAll("[aeiou]", ""));
    }
    public void elimination(){
        eliminationBlank();
        eliminationVowels();
    }
}

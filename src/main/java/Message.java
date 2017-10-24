public class Message implements MessageInterface{
    private String messagecontent;
    private String sender;
    private String receiver;

    public Message(String messagecontent, String sender, String receiver) {
        this.messagecontent = messagecontent;
        this.sender = sender;
        this.receiver = receiver;
    }

    public String getMessagecontent() {
        return messagecontent;
    }

    public String getSender() {
        return sender;
    }

    public String getReceiver() {
        return receiver;
    }

    @Override
    public void sendMessageToEmployee() {
        System.out.println("the message has been sent");
    }
}

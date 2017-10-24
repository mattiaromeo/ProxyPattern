public class MessageProxy implements MessageInterface {
    private Message originalmessage;
    private String messagecontent;
    private String sender;
    private String receiver;

    public MessageProxy(Message originalmessage) {
        this.messagecontent = originalmessage.getMessagecontent();
        this.sender = originalmessage.getSender();
        this.receiver = originalmessage.getReceiver();
    }

    public void setMessagecontent(String messagecontent) {
        this.messagecontent = messagecontent;
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
//        if (getMessagecontent().length()<5){
//            setMessagecontent();
//        }
        originalmessage.sendMessageToEmployee();
        System.out.println(getMessagecontent());

    }
}

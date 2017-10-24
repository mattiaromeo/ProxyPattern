public class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }
    Employee[] employees=new Employee[]{};
    public void printReceivedMessage(MessageProxy themessage){
        System.out.println("sender : "+themessage.getSender());
        System.out.println("receiver : "+themessage.getReceiver());
        System.out.println("message : "+themessage.getMessagecontent());
    }
}

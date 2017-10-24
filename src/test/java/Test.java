import org.assertj.core.api.Assertions;
import org.junit.Before;

public class Test {
    @Before
    public void setUp() throws Exception {

    }



    @org.junit.Test
    public void sendMessageUsingTheProxy() throws Exception {
        Message originalmessage= new Message("test message","a","b");
        MessageInterface theMessage=new MessageProxy(originalmessage);
        theMessage.sendMessageToEmployee();
    }
}

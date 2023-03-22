package com.demo.service;
import com.demo.domain.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import static org.junit.Assert.*;
//@RunWith(MockitoJUnitRunner.class)
public class EmailServiceTest {

    @Test(expected = RuntimeException.class)
    public void testSendEmailWith_1_Parameter_ThrowRuntime(){
        Order obj = new Order();
        EmailService.getInstance().sendEmail(obj);
        assertEquals(2,2) ;
//        assertThrows(RuntimeException.class, ()->{
//           EmailService.getInstance().sendEmail(obj);
//        });
    }
    @Test
    public void testSendEmailWith_1_parameter_BooleanFalse(){
        Order obj = new Order();
        EmailService.getInstance().sendEmail(obj);
        assertFalse(obj.isCustomerNotified());
    }

    @Test
    public void testSendEmailWith_2_parameter_BooleanTrue(){
//        Order obj = new Order();
//        EmailService.getInstance().sendEmail(obj);
//        assertTrue(obj.setCustomerNotified(True));
        assertTrue(EmailService.getInstance().sendEmail(new Order(1,"123" ,12F), "ab.com"));
    }
}
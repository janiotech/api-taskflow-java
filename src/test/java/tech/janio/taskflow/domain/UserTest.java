package tech.janio.taskflow.domain;

import com.janiotech.taskflow.domain.entities.User;
import com.janiotech.taskflow.domain.valueobjects.BirthDate;
import com.janiotech.taskflow.domain.valueobjects.Phone;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Domain Entity User Test")
public class UserTest {
    @Test
    public void BirthDateUserTest(){
        User user = new User();
        BirthDate dateTest = new BirthDate(LocalDate.of(2012,2,3));
        user.setBirth(dateTest);
        assertEquals(2012, user.getBirth().getYear());
        assertEquals(2, user.getBirth().getMonthValue());
        assertEquals(3, user.getBirth().getDayOfMonth());
        assertEquals(13, user.getBirth().getAge());
        assertEquals("03/02/2012", user.getBirth().toString());
        assertThrows(IllegalArgumentException.class, () -> user.setBirth(new BirthDate(null)));
        assertThrows(IllegalArgumentException.class, () -> user.setBirth(new BirthDate(LocalDate.of(2013,2,3))));
    }

    @Test
    public void PhoneUserTest(){
        User user = new User();
        Phone phoneUser = new Phone("+55 (79) 9 9817 - 5138");
        user.setPhone(phoneUser);
        assertNotNull(phoneUser);
        assertEquals("+5579998175138", user.getPhone().toString());
    }
}

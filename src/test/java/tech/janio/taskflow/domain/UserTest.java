package tech.janio.taskflow.domain;

import com.janiotech.taskflow.domain.entities.User;
import com.janiotech.taskflow.domain.valueobjects.BirthDate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@DisplayName("Domain Entity User Test")
public class UserTest {
    @Test
    public void BirthDateUserTest(){
        User user = new User();
        LocalDate dateTest = LocalDate.of(2012,2,2);
        user.setBirth(new BirthDate(dateTest));
        assertNotNull(dateTest);
        assertEquals(13, user.getBirth().getAge());
    }
}

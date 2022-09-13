package login.g;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Login_Test {
    private  Login login;
    @BeforeEach
    public void setup(){ login = new Login();}
    @ParameterizedTest
    @CsvSource (value = {"anna,losen,true","berit,123456,true","kalle,password,true"})
    public void login(String a, String b, boolean expected) {
        //Give

        //When
        boolean result = login.validate(a,b);
        // Then
        assertEquals(expected, result);
    }




}

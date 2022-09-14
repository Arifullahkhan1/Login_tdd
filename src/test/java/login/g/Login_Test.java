package login.g;

import org.junit.jupiter.api.BeforeEach;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class Login_Test {
    private Login login;

    @BeforeEach
    public void setup() {
        login = new Login();
    }

    @ParameterizedTest
    @CsvSource(value = {"anna,losen,YW5uYQ==", "berit,123456,YmVyaXQ=", "kalle,password,a2FsbGU="})
    public void login(String a, String b, String  expected) {
        //Give

        //When
        String result = login.validate(a, b);
        // Then
        assertEquals(expected, result);
    }
    @ParameterizedTest
    @CsvSource (value = {"Wrong Name, Wrong Password"})
    public void validate_withWrongPassword_shouldThrow(String a, String b){
        //given
        //When
        //Then
        UserCredentialException err=  assertThrows(UserCredentialException.class,
                () -> login.validate(a, b));
        assertEquals("Wrong Name, Wrong Password",err.getMessage());

    }

    @ParameterizedTest
    @CsvSource(value = {"anna,true", "berit,true", "kalle,true"})
    public void verify_base24(String a,  boolean  expected) {
        //Give

        //When
        boolean result = login.verify(a);
        // Then
        assertEquals(expected, result);
    }
    





}

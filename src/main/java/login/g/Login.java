package login.g;


import java.lang.invoke.SwitchPoint;
import java.util.Base64;

public class Login {
    public String  validate(String a, String b) {

        String[] Username = {"anna", "berit", "kalle"};
        String[] Password = {"losen", "123456", "password"};

        for (String i : Username) {
            for (String t : Password) {
                if (i.equals(a) && t.equals(b)) {

                        byte[] orginalAsBytes = i.getBytes();
                        byte[] orginalAsBase64 = Base64.getEncoder().encode(orginalAsBytes);
                        String byte64String = new String(orginalAsBase64);

                        return byte64String;




                }

               }
        }

         {throw new UserCredentialException("Wrong Name, Wrong Password")  ;
    }

}      }




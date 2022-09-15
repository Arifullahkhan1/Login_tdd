package login.g;


import java.util.Base64;

public class Login {
    public String validate(String a, String b) {

        String[] Username = {"anna", "berit", "kalle"};
        String[] Password = {"losen", "123456", "password"};

        for (String i : Username) {
            for (String t : Password) {
                if (i.equals(a) && t.equals(b)) {

                    byte[] orginalAsBytes = i.getBytes();
                    byte[] orginalAsBase64 = Base64.getEncoder().encode(orginalAsBytes);
                       String base24 = new String(orginalAsBase64);
                     //  System.out.print(base24 + " bas 24");
                    return  base24; // base24 toke


                }


            }
        }

        {
            throw new UserCredentialException("Wrong Name, Wrong Password");

        }

    }

    public boolean verify(String a) {
        String[] b24String = {"YW5uYQ==", "YmVyaXQ=", "a2FsbGU"};
        for (String b24 : b24String) {
            byte[] backAsBase64Bytes = b24.getBytes();
            byte[] backAsBytes = Base64.getDecoder().decode(backAsBase64Bytes);
            String backAsOriginal = new String(backAsBytes);
            //System.out.print(backAsOriginal + "-> ");
            if (backAsOriginal.equals(a)) {
                return true;
            }
        }

        throw new Base24CredentialException("Base_24 Token is not Valid");
    }
}




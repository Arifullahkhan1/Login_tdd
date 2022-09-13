package login.g;



public class Login {
    public boolean validate(String a, String b) {

        String [] Username = {"anna", "berit" ,"kalle"};
        String []  Password = {"losen","123456","password"};
        for (String i: Username) {
            for (String t: Password) {
                if(i.equals(a) && t.equals(b))
                {
                return true;// change the  code
            }

        }
    }
        return false;
}
}





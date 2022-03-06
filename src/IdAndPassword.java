import java.util.HashMap;

public class IdAndPassword {

    HashMap<String, String> loginInfo = new HashMap<String, String>();

    IdAndPassword() {
        loginInfo.put("Jake", "pizza");
        loginInfo.put("Rico", "apple");
        loginInfo.put("Just", "orange");
        loginInfo.put("Arr", "sushi");
    }

    protected HashMap getLoginInfo(){
        return loginInfo;
    }
}

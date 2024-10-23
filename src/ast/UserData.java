package ast;

import java.util.HashMap;

public class UserData {
    private HashMap<String, String> attributes;

    public UserData() {
        attributes = new HashMap<>();
    }

    public void setAttribute(String key, String value) {
        attributes.put(key, value);
    }

    public String getAttribute(String key) {
        return attributes.get(key);
    }
}

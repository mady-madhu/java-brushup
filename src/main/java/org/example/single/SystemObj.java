package org.example.single;

import java.util.Map;
import java.util.Properties;

/**
 * @author Madhu
 */
public class SystemObj {


    private static SystemObj systemObj= null;

    public static SystemObj getSystemObj() {
        if(systemObj==null){
            systemObj = new SystemObj();
        }
        return systemObj;
    }

    public Properties getProperties(){
        return System.getProperties();
    }

    public Map<String, String> getEnv(){
        return System.getenv();
    }
}

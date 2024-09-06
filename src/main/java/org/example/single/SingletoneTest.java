package org.example.single;

import org.example.single.SystemObj;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class SingletoneTest {
    public static void main(String[] args) {
        SystemObj systemObj1 = SystemObj.getSystemObj();
        System.out.println(systemObj1);

        SystemObj systemObj2 = SystemObj.getSystemObj();
        System.out.println(systemObj2);


        //Under Environment variables like env1=env1;env2=env2 separated by ;
        Map<String,String> envMap = systemObj1.getEnv();
        System.out.println(envMap.get("env1"));
        System.out.println(envMap.get("env2"));


        //Under JVM Options like -Denv1=env1 -Denv2=env2 separated by space
        Properties p = systemObj1.getProperties();
        System.out.println(p.getProperty("vm1"));
        System.out.println(p.getProperty("vm2"));


    }
}

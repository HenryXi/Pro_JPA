package c303slsbRemoteExample.model.stateless;

import javax.ejb.Stateless;

@Stateless
/**
 * I change this class name , because another HelloServiceBean in c301slsbExample.
 */
public class HelloServiceBean03 implements HelloServiceRemote {
    public String sayHello(String name) {
        return "Hello, "  + name;
    }
}

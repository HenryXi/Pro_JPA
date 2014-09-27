package c303slsbRemoteExample.model.stateless;

import javax.ejb.Remote;

@Remote
public interface HelloServiceRemote {
    public String sayHello(String name);
}

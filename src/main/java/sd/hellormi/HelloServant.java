/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sd.hellormi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author valtensir
 */
public class HelloServant  extends UnicastRemoteObject implements HelloService {

    public HelloServant() throws RemoteException {
        super();
    }
    @Override
    public String sayHello() throws RemoteException {
        return "Hello World!";
    }
    
}

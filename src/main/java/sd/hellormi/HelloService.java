/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sd.hellormi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author valtensir
 */
public interface HelloService extends Remote {
    public String sayHello() throws RemoteException;
    
}

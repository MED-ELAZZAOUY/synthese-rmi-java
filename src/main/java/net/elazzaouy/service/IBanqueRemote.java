package net.elazzaouy.service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date;

/**
 * L'interface Remote d'un service RMI doit respecter les conditiond suivantes :
 * doit hériter de l'interface Remote
 * Toutes les methodes doivent lever l'exception ReemoteException
 */

public interface IBanqueRemote extends Remote {
    public double conversion(double mt) throws RemoteException;
    public Date getServerDate() throws RemoteException;
}

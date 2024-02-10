package net.elazzaouy.service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;

public class BanqueServiceImp extends UnicastRemoteObject implements IBanqueRemote {
    protected BanqueServiceImp() throws RemoteException {
        super();
    }

    @Override
    public double conversion(double mt) throws RemoteException {
        return 11 * mt;
    }

    @Override
    public Date getServerDate() throws RemoteException {
        return new Date();
    }
}

package net.elazzaouy.service;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class ServeurRMI {
    public static void main(String[] args) {
        try {

            // instancier l'objet distant
            IBanqueRemote objetDistant = new BanqueServiceImp();
            System.out.println(objetDistant.toString());
            // Exporter l'object distant en tant service RMI de type UnicastRemoteObject
            Remote skeleton = UnicastRemoteObject.exportObject(objetDistant);
            // Afficher la référence de l'object distant
            System.out.println(skeleton);
            // Démarre l'anniaire RMI sur le port 1099
            LocateRegistry.createRegistry(1099);
            // Publier la reference de l'objet distant dans l'annuaire avec le nom "BK"
            Naming.rebind("rmi://localhost:1099/BK", objetDistant);

        } catch (RemoteException | MalformedURLException e) {
            e.printStackTrace();
        }
    }
}

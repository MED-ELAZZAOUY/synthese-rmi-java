package net.elazzaouy.service;


import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * Le client RMI a besoin, dans son classpathde l'interface Remote
 * du service distant RMI
 */
public class ClientRMI {
    public static void main(String[] args) {
        try {

            //faire appel à l'annuaire RMI pour récupérer la référence de l'objet distant
            // cette opération se fait en utilisant Naming.lookup()
            //cette opération permet de créer un proxy RMI (STUB)
            IBanqueRemote stub = (IBanqueRemote) Naming.lookup("rmi://localhost:1099/BK");
            // Invocation des methodes de l'objet distant
            System.out.println(stub.conversion(1000));
            System.out.println(stub.getServerDate());

        } catch (Exception e) {
           e.printStackTrace();
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dao.IDao;
import entities.Machine;
import entities.Salle;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import services.MachineService;
import services.SalleService;

/**
 *
 * @author ACER
 */
public class Test {
    public static void main(String[] args) throws RemoteException {
       
        IDao<Machine> dao = new MachineService();
        IDao<Salle> dao2 = (IDao<Salle>) new SalleService();
        dao2.create(new Salle("A1"));
        dao2.create(new Salle("A2"));
        dao2.create(new Salle("A3"));
        
        dao.create(new Machine("Aspire", "Acer", 6500 , dao2.findById(1)));
        dao.create(new Machine("Thinkpad", "Lenovo", 3500 , dao2.findById(2)));
        dao.create(new Machine("Rogue", "Asus",7000,dao2.findById(3)));
        dao.create(new Machine("Latitude", "Dell",8000,dao2.findById(3)));
        
        //for(Machine m : dao.findAll())
            //System.out.println(m.toString());
    }
    }



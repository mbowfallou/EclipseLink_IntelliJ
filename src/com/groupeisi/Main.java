package com.groupeisi;

import com.groupeisi.entities.Role;
import com.groupeisi.entities.User;
import com.groupeisi.repository.IRole;
import com.groupeisi.repository.IUser;
import com.groupeisi.repository.RoleImpl;
import com.groupeisi.repository.UserImpl;
//import com.groupeisi.repository.IUser;


public class Main {

    public static void main(String[] args) {

        IRole iRole = new RoleImpl();
        IUser iUser = new UserImpl();

        Role role = new Role();
        role.setNom("ADMIN");

        int result0 = iRole.saisie(role);
        iRole.terminate();

        if(result0 == 1)
            System.out.println("Insertion Role avec succes.");
        else
            System.out.println("Insertion Role echouee !!!");

        User user = new User();
        user.setPrenom("Mor");
        user.setNom("DIOP");
        user.setEmail("mor@gmail.com");
        user.setPassword("passer");
        user.setEtat(1);

        int result1 = iUser.saisie(user);
        iUser.terminate();

        if(result1 == 1)
            System.out.println("Insertion User avec succes.");
        else
            System.out.println("Insertion User echouee !!!");
    }

}

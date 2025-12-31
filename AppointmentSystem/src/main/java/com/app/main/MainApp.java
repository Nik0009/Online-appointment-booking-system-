package com.app.main;

import com.app.entity.*;
import com.app.dao.*;

public class MainApp {

    public static void main(String[] args) {

        Admin admin = new Admin();
        admin.setUsername("admin");
        admin.setPassword("admin123");

        AdminDAO adminDAO = new AdminDAO();
        adminDAO.save(admin);
        System.out.println("Admin added");

        UserDAO userDAO = new UserDAO();

        User user1 = new User();
        user1.setName("Nikhil");
        user1.setEmail("nikhil@gmail.com");
        user1.setPassword("1234");
        userDAO.save(user1);

        User user2 = new User();
        user2.setName("Rahul");
        user2.setEmail("rahul@gmail.com");
        user2.setPassword("1234");
        userDAO.save(user2);

        User user3 = new User();
        user3.setName("Sneha");
        user3.setEmail("sneha@gmail.com");
        user3.setPassword("1234");
        userDAO.save(user3);

        System.out.println("Multiple users added by Admin");

        ProviderDAO providerDAO = new ProviderDAO();

        Provider provider1 = new Provider();
        provider1.setName("Dr. Sharma");
        provider1.setSpecialization("Cardiologist");
        providerDAO.save(provider1);

        Provider provider2 = new Provider();
        provider2.setName("Dr. Patil");
        provider2.setSpecialization("Dermatologist");
        providerDAO.save(provider2);

        Provider provider3 = new Provider();
        provider3.setName("Dr. Mehta");
        provider3.setSpecialization("Orthopedic");
        providerDAO.save(provider3);

        System.out.println("Multiple providers added by Admin");

        AppointmentDAO appointmentDAO = new AppointmentDAO();

        Appointment a1 = new Appointment();
        a1.setUser(user1);
        a1.setProvider(provider1);
        a1.setDate("2025-01-05");
        a1.setTime("10:00 AM");
        a1.setStatus("Booked");
        appointmentDAO.save(a1);

        Appointment a2 = new Appointment();
        a2.setUser(user2);
        a2.setProvider(provider2);
        a2.setDate("2025-01-06");
        a2.setTime("11:30 AM");
        a2.setStatus("Booked");
        appointmentDAO.save(a2);

        Appointment a3 = new Appointment();
        a3.setUser(user3);
        a3.setProvider(provider3);
        a3.setDate("2025-01-07");
        a3.setTime("02:00 PM");
        a3.setStatus("Booked");
        appointmentDAO.save(a3);

        System.out.println("Multiple appointments booked");

        System.out.println("===== ALL DATA INSERTED SUCCESSFULLY =====");
    }
}

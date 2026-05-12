package com.xwork.practiceInterface.task;

import com.xwork.practiceInterface.task.Usage.*;

public class Runner
{
    public static void main(String[] args) {

        Supermarket supermarket = new DmartSupermarket();
        Producer producer = new Producer(supermarket);
        producer.sell();

        OperatingSystem operatingSystem=new WindowsOperatingSystem();
        Dell dell = new Dell(operatingSystem);
        dell.run();

        Hospital hospital=new ApolloHospital();
        Doctor doctor=new Doctor(hospital);
        doctor.Prescribe();

        Bluetooth  bluetooth=new RealMeBluetooth();
        Device device=new Device(bluetooth);
        device.shareFiles();

        Remote remote=new TataSkyRemote();
        User user=new User(remote);
        user.changeChannel("Colors Kannada");

        MenuCard  menuCard=new BindedMenuCard();
        Kitchen kitchen=new Kitchen(menuCard);
        kitchen.serve();

    }
}

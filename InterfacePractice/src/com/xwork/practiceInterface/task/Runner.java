package com.xwork.practiceInterface.task;

import com.xwork.practiceInterface.task.Usage.*;

public class Runner
{
    public static void main(String[] args) {

        Supermarket supermarket = new MoreSupermarket();
        Producer producer = new Producer(supermarket);
        producer.sell();

        OperatingSystem operatingSystem=new LinuxOperatingSystem();
        Dell dell = new Dell(operatingSystem);
        dell.run();

        Hospital hospital=new ManipalHospital();
        Doctor doctor=new Doctor(hospital);
        doctor.prescribe();

        Bluetooth  bluetooth= new WearableBluetooth();
        Device device=new Device(bluetooth);
        device.shareFiles();

        Remote remote=new HathwayRemote();
        User user=new User(remote);
        user.changeChannel("Colors Kannada");

        MenuCard  menuCard=new DigitalMenuCard();
        Kitchen kitchen=new Kitchen(menuCard);
        kitchen.serve();

    }
}

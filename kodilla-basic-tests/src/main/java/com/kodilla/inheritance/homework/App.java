package com.kodilla.inheritance.homework;

import java.time.Year;

public class App {
    public static void main(String[] args) {
        OperatingSystem genericOS = new OperatingSystem(2000);
        genericOS.turnOn();
        genericOS.turnOff();

        Windows windowsOS = new Windows(1985);
        windowsOS.turnOn();
        windowsOS.turnOff();

        Linux linuxOS = new Linux(1991);
        linuxOS.turnOn();
        linuxOS.turnOff();
    }
}
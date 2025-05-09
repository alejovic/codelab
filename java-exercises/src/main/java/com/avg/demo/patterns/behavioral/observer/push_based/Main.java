package com.avg.demo.patterns.behavioral.observer.push_based;

public class Main {

    public static void main(String[] args) {
        Database database = new Database();
        Observer disk = new DiskDispatcher();
        Observer email = new EmailDispatcher();
        Observer sms = new SMSDispatcher();

        database.attach(disk);
        database.attach(email);
        database.attach(sms);

        database.updateObserver("new record!");
        System.out.println("---\n");
        database.detach(email);
        database.updateObserver("new record!");
    }
}

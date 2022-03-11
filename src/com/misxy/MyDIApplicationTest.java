package com.misxy;

public class MyDIApplicationTest {
    public static void main(String[] args) {
        String msg = "Hi, Supakorn";
        String email = "supakorn.chupraphawan@outlook.com";
        String phone = "0885726762";
        MessageServiceInjector injector;
        Consumer app;

        injector = new EmailServiceInjector();
        app = injector.getConsumer();
        app.processMessage(msg,email);

        injector = new SMSServiceInjector();
        app = injector.getConsumer();
        app.processMessage(msg,phone);
    }
}

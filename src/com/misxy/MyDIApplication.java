package com.misxy;

public class MyDIApplication implements Consumer{
    private MessageService messageService;

    public MyDIApplication(MessageService messageService) {
        this.messageService = messageService;
    }

    @Override
    public void processMessage(String message, String receiver) {
        this.messageService.sendMessage(message,receiver);
    }
}

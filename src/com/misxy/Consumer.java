package com.misxy;

public interface Consumer {
    void processMessage(String message, String receiver);
}

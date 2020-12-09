package com.learn.patterns.behavioral.command.receiver;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Light {

    private boolean isOn;

    public void switchOn(){
        log.info("Switching ON");
        this.isOn = true;
    }

    public void switchOff(){
        log.info("Switching OFF");
        this.isOn = false;
    }
}

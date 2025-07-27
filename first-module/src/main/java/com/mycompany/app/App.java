package com.mycompany.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 */
public final class App {
    private static final Logger log = LoggerFactory.getLogger(App.class);

    /**
     * Use loger.
     * @param args Argument command line.
     */
    public static void main(final String[] args) {
        System.out.println("Hello from first module!");
        
        log.info("Starting doSomething()...");
        log.debug("Some debug details here");
        log.warn("A warning message");
        log.error("An error occurred");
    }
}

package com.youko;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

public class App {

    private static final Logger logger = LoggerFactory.getLogger(App.class);
    private static final Random random = new Random();

    private static final String[] MESSAGES = {
            "User logged in successfully.",
            "Failed to connect to the database.",
            "Unexpected error occurred.",
            "File not found: /tmp/test.txt",
            "Cache cleared successfully.",
            "Invalid input received.",
            "Connection timeout.",
            "Permission denied.",
            "User logged out.",
            "Configuration updated."
    };

    private static final String[] LEVELS = { "DEBUG", "INFO", "WARN", "ERROR" };

    public static void main(String[] args) throws InterruptedException {
        while (true) {
            generateRandomLog();
            Thread.sleep(1000); // Wait 1 second between logs
        }
    }

    private static void generateRandomLog() {
        String level = LEVELS[random.nextInt(LEVELS.length)];
        String message = MESSAGES[random.nextInt(MESSAGES.length)];

        switch (level) {
            case "DEBUG":
                logger.debug(message);
                break;
            case "INFO":
                logger.info(message);
                break;
            case "WARN":
                logger.warn(message);
                break;
            case "ERROR":
                logger.error(message);
                break;
        }
    }
}

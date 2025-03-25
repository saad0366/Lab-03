package EventManager;

import java.io.File;

public class SMSSupportListener implements EventListener {
    private String phoneNumber;
    private static final int MAX_SMS_LENGTH = 160;

    public SMSSupportListener(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void update(String eventType, File file) {
        String message = "Someone has performed " + eventType + " operation with the following file: " + file.getName();
        
        if (message.length() > MAX_SMS_LENGTH) {
            System.out.println("Warning: Default SMS length exceeds 160 characters. Please define a valid default SMS.");
        } else {
            System.out.println("SMS to " + phoneNumber + ": " + message);
        }
    }
}
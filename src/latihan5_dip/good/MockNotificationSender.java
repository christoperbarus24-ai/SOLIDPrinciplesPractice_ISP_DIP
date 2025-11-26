package latihan5_dip.good;

import latihan5_dip.good.NotificationSender;


public class MockNotificationSender implements NotificationSender {
    @Override
    public void sendNotification(String recipient, String message) {
        System.out.println("[MockNotificationSender] Notification skipped (mock)");
    }
}
package com.ecmart.notificationservice.service;

import com.ecmart.notificationservice.model.Notification;
import com.ecmart.notificationservice.repository.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class NotificationServiceImpl implements NotificationService {

    private final NotificationRepository notificationRepository;

    @Autowired
    public NotificationServiceImpl(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    @Override
    public Notification sendNotification(Notification notification) {
        // Set mock status and timestamp
        notification.setStatus("SENT");
        notification.setTimestamp(LocalDateTime.now());

        // Simulate notification delivery (just print to console)
        System.out.println("📢 Sent " + notification.getType() + " to " + notification.getToUser() + ": " + notification.getMessage());

        return notificationRepository.save(notification);
    }

    @Override
    public List<Notification> getAllNotifications() {
        return notificationRepository.findAll();
    }

    @Override
    public Notification getNotificationById(Long id) {
        Optional<Notification> notification = notificationRepository.findById(id);
        return notification.orElse(null);
    }

    @Override
    public List<Notification> getNotificationsByUser(String toUser) {
        return notificationRepository.findByToUser(toUser);
    }
}

package com.ecmart.notificationservice.service;

import com.ecmart.notificationservice.model.Notification;

import java.util.List;

public interface NotificationService {

    Notification sendNotification(Notification notification);

    List<Notification> getAllNotifications();

    Notification getNotificationById(Long id);

    List<Notification> getNotificationsByUser(String toUser);
}

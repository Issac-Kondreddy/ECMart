package com.ecmart.notificationservice.repository;

import com.ecmart.notificationservice.model.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NotificationRepository extends JpaRepository<Notification, Long> {

    List<Notification> findByToUser(String toUser);

    List<Notification> findByType(String type);

    List<Notification> findByStatus(String status);
}

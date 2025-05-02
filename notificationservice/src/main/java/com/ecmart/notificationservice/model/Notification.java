package com.ecmart.notificationservice.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "notifications")
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String toUser;

    @Column(nullable = false)
    private String message;

    @Column(nullable = false)
    private String type;  // EMAIL, SMS, etc.

    @Column(nullable = false)
    private String status; // SENT, FAILED

    @Column(nullable = false)
    private LocalDateTime timestamp;

    public Notification() {}

    public Notification(Long id, String toUser, String message, String type, String status, LocalDateTime timestamp) {
        this.id = id;
        this.toUser = toUser;
        this.message = message;
        this.type = type;
        this.status = status;
        this.timestamp = timestamp;
    }

    // Getters and Setters

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getToUser() { return toUser; }
    public void setToUser(String toUser) { this.toUser = toUser; }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public LocalDateTime getTimestamp() { return timestamp; }
    public void setTimestamp(LocalDateTime timestamp) { this.timestamp = timestamp; }
}

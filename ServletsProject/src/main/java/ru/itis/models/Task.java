package ru.itis.models;

import lombok.*;

import java.sql.Timestamp;
import java.sql.Date;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Task {
    private String title;
    private String description;
    private Date dueDate;
    private int projectId;
    private Integer fileId;
    private Timestamp createdAt;
    private int statusId;
    private int userId;
    private int id;
}


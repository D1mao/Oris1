package ru.itis.models;

import lombok.*;

import java.sql.Timestamp;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Comment {
    private String content;
    private int userId;
    private int taskId;
    private Integer fileId;
    private int id;
    private Timestamp createdAt;
}


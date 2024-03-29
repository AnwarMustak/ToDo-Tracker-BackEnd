package com.niit.TodoList.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Document
public class User {
    @Id
    private String email;
    private String firstName;
    private String lastName;
    private String password;
    private int otp;
    private String profileImage;

    private List<ToDoTask> toDoTask;
    private List<ToDoTask> archievedTask;
    private List<ToDoTask> completedTask;





}

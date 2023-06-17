package com.g3.person_api.CommentTest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comment {
    private int id;
    private String text;
    private int userId;
    private String mention;
}

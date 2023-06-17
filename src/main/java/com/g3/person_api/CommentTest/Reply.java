package com.g3.person_api.CommentTest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reply {
    public int id;
    public String text;
    public int userId;
}

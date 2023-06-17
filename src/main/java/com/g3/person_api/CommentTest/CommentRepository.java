package com.g3.person_api.CommentTest;

import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CommentRepository {

    @Select("""
            SELECT user_name from user_tb where id=#{userId}
                        
                        """)
    String getUserNameMention(Integer userId);

    @Select("""
            Select * from comment_tb 
            """)
    @Result(property = "mention", column = "parent_id", one = @One(
            select = "getUserNameMention"
    ))
    @Result(property = "userId", column = "user_id")
    @Result(property = "id", column = "id")
    List<Comment> get();

//    @Select("""
//             Select * from comment_tb where parent_id=#{id}
//            """)
//    @Result(property = "userId", column = "user_id")
//    @Result(property = "id", column = "id")
//    Reply getCommentByParentId(Integer id);
}

package com.g3.person_api.model.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Respon<T> {
    @JsonInclude(JsonInclude.Include.NON_NULL)
   private T payload;
    private String message;
    private int stauts;
}

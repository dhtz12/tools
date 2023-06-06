package com.song.mapstruct;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class User {
    private Integer id;
    private String name;
    private Integer age;
    private String addr;
}

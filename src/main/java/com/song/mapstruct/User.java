package com.song.mapstruct;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class User {
    private Integer id;
    private String name;
    private Integer age;
    private String address;
    private Job job;

}
@Data
class Job{
    private String jobName;
    private String jobDesc;
}

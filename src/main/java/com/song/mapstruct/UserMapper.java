package com.song.mapstruct;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
    //attr same.
    UserDTO domain2dto(User user);
    // attr different.
    @Mapping(source = "address", target = "addr")
    UserDTO user2dto(User user);

    // attr different.
    @Mapping(source = "job.jobName", target = "jobName")
    @Mapping(source = "job.jobDesc", target = "jobDesc")
    UserDTO userAttr2dto(User user);
}

package com.song.mapstruct;

public class MapstructTest {
    public static void main(String[] args) {
        User user = new User();
        user.setId(1);
        user.setName("song");
        user.setAge(18);
        user.setAddr("shanghai");

        UserDTO userDTO = UserMapper.INSTANCE.domain2dto(user);
        System.out.println(userDTO);
    }
}

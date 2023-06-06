package com.song.mapstruct;

public class MapstructTest {
    public static void main(String[] args) {
        User user = new User();
        user.setId(1);
        user.setName("song");
        user.setAge(18);
        user.setAddress("shanghai");
        Job job = new Job();
        job.setJobDesc("java");
        job.setJobName("developer");
        user.setJob(job);

        UserDTO userDTO = UserMapper.INSTANCE.userAttr2dto(user);
        System.out.println(userDTO);
    }
}

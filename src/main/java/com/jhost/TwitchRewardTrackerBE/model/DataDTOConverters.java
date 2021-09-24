package com.jhost.TwitchRewardTrackerBE.model;

import com.jhost.TwitchRewardTrackerBE.model.dto.UserDTO;

public abstract class DataDTOConverters {


    public static UserDTO userToUserDTO(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setUserToken(user.getUserToken());
        return userDTO;
    }

    public static User userDTOtoUser(UserDTO userDTO){
        User user = new User();
        user.setId(userDTO.getId());
        user.setUserToken(userDTO.getUserToken());
        return user;
    }
}

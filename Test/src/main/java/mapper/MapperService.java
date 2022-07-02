package mapper;

import dto.UserDto;
import model.User;

public class MapperService {

    public UserDto toDto (User user) {
        return new UserDto(user.getName(), user.getID(), user.getRoomList());
    }

    public int getIdFromDto (UserDto userDto) {
        return userDto.getID();
    }


}

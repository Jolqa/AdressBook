package service;  //logike umieszczamy w servisach

import dto.UserDto;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.UserRepository;

@Service
public class UserService {

    @Autowired //??
    private UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public void addUser(UserDto userDto) {
        User entity = new User();
        entity.setId(userDto.getId()); //czy nie generuje sie automatycznia?
        entity.setFirstName(userDto.getFirstName());
        entity.setLastName(userDto.getLastName());
        entity.setPosition(userDto.getPosition());
        userRepository.save(entity);
    }
}

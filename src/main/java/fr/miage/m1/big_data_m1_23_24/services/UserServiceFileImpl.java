package fr.miage.m1.big_data_m1_23_24.services;

import fr.miage.m1.big_data_m1_23_24.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceFileImpl implements UserService {

    private final FileRepository fileRepository;

    public UserServiceFileImpl(FileRepository fileRepository) {
        this.fileRepository = fileRepository;
    }

    @Override
    public User get(Long id) {
        User user = (User) fileRepository.load(User.class);
        return user;
    }

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public User create(User author) {
        fileRepository.save(author);
        return author;
    }

    @Override
    public User edit(User author) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}

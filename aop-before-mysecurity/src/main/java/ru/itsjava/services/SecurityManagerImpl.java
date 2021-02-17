package ru.itsjava.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.itsjava.dao.UserDao;
import ru.itsjava.domain.UserInfo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@Service
@RequiredArgsConstructor
public class SecurityManagerImpl implements SecurityManager{

    private final UserDao userDao;

    @Override
    public void login() {
        userDao.writeSecureMessage();
    }

    public static UserInfo getLoginAndPassword() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String userName = reader.readLine();
        String password = reader.readLine();
        reader.close();
        return new UserInfo(userName, password);
    }
}

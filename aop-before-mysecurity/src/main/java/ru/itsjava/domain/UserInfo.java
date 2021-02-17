package ru.itsjava.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@Getter
public class UserInfo {
    private final String userName;
    private final String password;
}

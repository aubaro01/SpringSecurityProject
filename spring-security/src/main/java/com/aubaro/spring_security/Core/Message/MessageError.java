package com.aubaro.spring_security.Core.Message;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum MessageError {

    AU0001("AU0001","Invalid credentials"),
    AU0002("AU0002","User not found"),
    AU0003("AU0003","Access denied"),
    AU0004("AU0004","User not found."),
    AU0005("AU0005","O username not been null"),
    AU0006("AU0006","Password not been null"),
    AU0007("AU0007","Error try found user"),
    AU0008("AU0008","Error try autheticantion the user"),
    AU0009("AU0009","Error try process user data")
    ;
    

    private final String code;
    private final String message;
}
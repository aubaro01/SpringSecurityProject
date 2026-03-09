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
    AU0005("AU0005","O username não deve estar vazia"),
    AU0006("AU0004","Password não deve estar vazia");

    
    private final String code;
    private final String message;
}
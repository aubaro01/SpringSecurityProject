package com.aubaro.spring_security.Core.Message;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum MessageError {

    AU0001("AU0001","Invalid credentials"),
    AU0002("AU0002","User not found"),
    AU0003("AU0003","Access denied");

    
    private final String code;
    private final String message;
}
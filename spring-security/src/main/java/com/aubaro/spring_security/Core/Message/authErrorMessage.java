package com.aubaro.spring_security.Core.Message;

import org.apache.axiom.locator.Implementation;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@RequiredArgsConstructor
@ToString
public interface authErrorMessage Implementation ResponseEnvelopeCode.ResponseEnvelopeCodes
{
    H0001("H0001", "Teste")
    ;

    private final String code;
    private final String message;
}

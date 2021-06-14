package com.example.firm.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorType {

    GLOBAL_EXCEPTION("500", "внутренняя ошибка сервера"),
    BAD_REQUEST("400", "неправильный, некорректный запрос"),
    NOT_FOUND_EXCEPTION("404", "не найдено");

    private final String code;
    private final String msg;

}

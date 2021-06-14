package com.example.firm.exception;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class ResponseMessage {

    private String status;
    private String msg;
    private String path;
    private String method;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss")
    private Date time;

    @Override
    public String toString() {
        return "ResponseMessage{" +
                "status='" + status + '\'' +
                ", msg='" + msg + '\'' +
                ", path='" + path + '\'' +
                ", method='" + method + '\'' +
                ", time=" + time +
                '}';
    }
}

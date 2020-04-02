package org.ling.config;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.SERVICE_UNAVAILABLE, reason = "内部服务器错误")
public class MyErrorPage extends Exception{
}

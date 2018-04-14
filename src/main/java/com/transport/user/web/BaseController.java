package com.transport.user.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequestMapping(BaseController.BASE_MAPPING)
public abstract class BaseController {
    public static final String BASE_MAPPING = "/transport";
}

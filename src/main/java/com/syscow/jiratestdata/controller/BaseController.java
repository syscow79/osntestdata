package com.syscow.jiratestdata.controller;

import com.syscow.jiratestdata.container.VoucherCode;
import com.syscow.jiratestdata.service.VoucherCodeService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Size;

@RestController
@RequestMapping
public class BaseController {

    @GetMapping(path = "/")
    public String get() {
        return "OK";
    }

}

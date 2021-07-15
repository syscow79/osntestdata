package com.syscow.jiratestdata.controller;

import com.syscow.jiratestdata.container.VoucherCode;
import com.syscow.jiratestdata.service.VoucherCodeService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Size;

@RestController
@RequestMapping(path = "/")
public class BaseController {

    @PostMapping(path = "")
    public String createVoucher(@Valid @RequestBody VoucherCode voucherCode) {
        return "OK";
    }

}

package com.syscow.jiratestdata.controller;

import com.syscow.jiratestdata.container.VoucherCode;
import com.syscow.jiratestdata.service.VoucherCodeService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Size;

@RestController
@RequestMapping(path = "/v1/testdata")
@Validated
public class TestDataController {

    private final VoucherCodeService voucherCodeService;

    public TestDataController(VoucherCodeService voucherCodeService) {
        this.voucherCodeService = voucherCodeService;
    }

    @PostMapping(path = "/voucher")
    public VoucherCode createVoucher(@Valid @RequestBody VoucherCode voucherCode) {
        return voucherCodeService.save(voucherCode);
    }

    @GetMapping(path = "/voucher/{id}")
    @ResponseBody
    public VoucherCode find(@PathVariable String id) {
        return voucherCodeService.findById(id);
    }

    @GetMapping(path = "/voucher")
    @ResponseBody
    public VoucherCode findByName(@RequestParam("name") @Size(min = 5, max = 50) String name) {
        return voucherCodeService.findByName(name);
    }


}

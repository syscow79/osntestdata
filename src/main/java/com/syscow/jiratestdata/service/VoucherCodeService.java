package com.syscow.jiratestdata.service;

import com.syscow.jiratestdata.container.VoucherCode;
import com.syscow.jiratestdata.repository.VoucherCodeRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

@Service
public class VoucherCodeService {

    private final VoucherCodeRepository voucherCodeRepository;

    public VoucherCodeService(VoucherCodeRepository voucherCodeRepository) {
        this.voucherCodeRepository = voucherCodeRepository;
    }

    public VoucherCode findById(String id) {
        return voucherCodeRepository.findById(id).get();
    }

    public VoucherCode save(VoucherCode voucherCode) {
        final VoucherCode voucherCodeToSave = VoucherCode.builder()
                .id(UUID.randomUUID().toString())
                .name(voucherCode.getName())
                .code(voucherCode.getCode())
                .date(new Date())
                .build();
        return voucherCodeRepository.save(voucherCodeToSave);
    }

    public VoucherCode findByName(String name) {
        return voucherCodeRepository.findByName(name);
    }
}
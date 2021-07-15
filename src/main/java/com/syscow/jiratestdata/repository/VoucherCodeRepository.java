package com.syscow.jiratestdata.repository;

import com.azure.spring.data.cosmos.repository.CosmosRepository;
import com.syscow.jiratestdata.container.VoucherCode;
import org.springframework.stereotype.Repository;

@Repository
public interface VoucherCodeRepository extends CosmosRepository<VoucherCode, String> {
    VoucherCode findByName(String name);
}
package com.syscow.jiratestdata.container;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Container(containerName = "osncollection")
public class VoucherCode {
    @Id
    private String id;
    @PartitionKey
    private String name;
    private String code;
    private Date date;
}

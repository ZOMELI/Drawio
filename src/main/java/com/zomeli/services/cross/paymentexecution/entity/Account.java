package com.zomeli.services.cross.paymentexecution.entity;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Account {

    private String accountId;
    private String accountType;
}

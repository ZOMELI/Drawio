package com.zomeli.services.cross.paymentexecution.entity;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ChargeInformation {

    private Currency currency;
    private Account account;
    private String description;
}

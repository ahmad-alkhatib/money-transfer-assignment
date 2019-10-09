package com.revolut.demo.dto;

import java.io.Serializable;

/**
 * Represents the data which should be sent to the money-transfer API.
 *
 * @author ahmad.alkhatib
 * @version 1.0
 */
public class TransferDto implements Serializable {

    private long acc_from;

    private long acc_to;

    private Integer amount;

    /**
     * This will be used to ensure the acc_from is related to user_id
     */
    private Integer user_id;

    public TransferDto() {
    }

    public TransferDto(long acc_from, long acc_to, Integer amount, Integer user_id) {
        this.acc_from = acc_from;
        this.acc_to = acc_to;
        this.amount = amount;
        this.user_id = user_id;
    }

    public long getAcc_from() {
        return acc_from;
    }

    public long getAcc_to() {
        return acc_to;
    }

    public Integer getAmount() {
        return amount;
    }

    public Integer getUser_id() {
        return user_id;
    }


}
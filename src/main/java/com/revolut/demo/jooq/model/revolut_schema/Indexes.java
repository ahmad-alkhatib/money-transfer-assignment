/*
 * This file is generated by jOOQ.
 */
package com.revolut.demo.jooq.model.revolut_schema;


import com.revolut.demo.jooq.model.revolut_schema.tables.Account;
import com.revolut.demo.jooq.model.revolut_schema.tables.AccountTransactions;
import com.revolut.demo.jooq.model.revolut_schema.tables.User;
import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;

import javax.annotation.processing.Generated;


/**
 * A class modelling indexes of tables of the <code>REVOLUT_SCHEMA</code> 
 * schema.
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.12.1"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index ACC_USER_ID_FK_INDEX_E = Indexes0.ACC_USER_ID_FK_INDEX_E;
    public static final Index PRIMARY_KEY_E = Indexes0.PRIMARY_KEY_E;
    public static final Index AT_ACC_FROM_INDEX_D = Indexes0.AT_ACC_FROM_INDEX_D;
    public static final Index AT_ACC_TO_INDEX_D = Indexes0.AT_ACC_TO_INDEX_D;
    public static final Index PRIMARY_KEY_D = Indexes0.PRIMARY_KEY_D;
    public static final Index PRIMARY_KEY_2 = Indexes0.PRIMARY_KEY_2;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index ACC_USER_ID_FK_INDEX_E = Internal.createIndex("ACC_USER_ID_FK_INDEX_E", Account.ACCOUNT, new OrderField[]{Account.ACCOUNT.USER_ID}, false);
        public static Index PRIMARY_KEY_E = Internal.createIndex("PRIMARY_KEY_E", Account.ACCOUNT, new OrderField[]{Account.ACCOUNT.ACC_NO}, true);
        public static Index AT_ACC_FROM_INDEX_D = Internal.createIndex("AT_ACC_FROM_INDEX_D", AccountTransactions.ACCOUNT_TRANSACTIONS, new OrderField[]{AccountTransactions.ACCOUNT_TRANSACTIONS.AT_FROM}, false);
        public static Index AT_ACC_TO_INDEX_D = Internal.createIndex("AT_ACC_TO_INDEX_D", AccountTransactions.ACCOUNT_TRANSACTIONS, new OrderField[]{AccountTransactions.ACCOUNT_TRANSACTIONS.AT_TO}, false);
        public static Index PRIMARY_KEY_D = Internal.createIndex("PRIMARY_KEY_D", AccountTransactions.ACCOUNT_TRANSACTIONS, new OrderField[]{AccountTransactions.ACCOUNT_TRANSACTIONS.AT_ID}, true);
        public static Index PRIMARY_KEY_2 = Internal.createIndex("PRIMARY_KEY_2", User.USER, new OrderField[]{User.USER.ID}, true);
    }
}

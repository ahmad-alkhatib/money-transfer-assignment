/*
 * This file is generated by jOOQ.
 */
package com.revolut.demo.jooq.model.revolut_schema.tables;


import com.revolut.demo.jooq.model.revolut_schema.Indexes;
import com.revolut.demo.jooq.model.revolut_schema.Keys;
import com.revolut.demo.jooq.model.revolut_schema.RevolutSchema;
import com.revolut.demo.jooq.model.revolut_schema.tables.records.AccountTransactionsRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.processing.Generated;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;


/**
 * This class is generated by jOOQ.
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.12.1"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class AccountTransactions extends TableImpl<AccountTransactionsRecord> {

    private static final long serialVersionUID = 1908374303;

    /**
     * The reference instance of <code>REVOLUT_SCHEMA.ACCOUNT_TRANSACTIONS</code>
     */
    public static final AccountTransactions ACCOUNT_TRANSACTIONS = new AccountTransactions();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AccountTransactionsRecord> getRecordType() {
        return AccountTransactionsRecord.class;
    }

    /**
     * The column <code>REVOLUT_SCHEMA.ACCOUNT_TRANSACTIONS.AT_ID</code>.
     */
    public final TableField<AccountTransactionsRecord, String> AT_ID = createField(DSL.name("AT_ID"), org.jooq.impl.SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>REVOLUT_SCHEMA.ACCOUNT_TRANSACTIONS.AT_FROM</code>.
     */
    public final TableField<AccountTransactionsRecord, Long> AT_FROM = createField(DSL.name("AT_FROM"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>REVOLUT_SCHEMA.ACCOUNT_TRANSACTIONS.AT_TO</code>.
     */
    public final TableField<AccountTransactionsRecord, Long> AT_TO = createField(DSL.name("AT_TO"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>REVOLUT_SCHEMA.ACCOUNT_TRANSACTIONS.AT_AMOUNT</code>.
     */
    public final TableField<AccountTransactionsRecord, BigDecimal> AT_AMOUNT = createField(DSL.name("AT_AMOUNT"), org.jooq.impl.SQLDataType.DECIMAL(20, 3), this, "");

    /**
     * The column <code>REVOLUT_SCHEMA.ACCOUNT_TRANSACTIONS.AT_STATUS</code>.
     */
    public final TableField<AccountTransactionsRecord, String> AT_STATUS = createField(DSL.name("AT_STATUS"), org.jooq.impl.SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>REVOLUT_SCHEMA.ACCOUNT_TRANSACTIONS.AT_DATE</code>.
     */
    public final TableField<AccountTransactionsRecord, Timestamp> AT_DATE = createField(DSL.name("AT_DATE"), org.jooq.impl.SQLDataType.TIMESTAMP.precision(6).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>REVOLUT_SCHEMA.ACCOUNT_TRANSACTIONS.AT_REMARKS</code>.
     */
    public final TableField<AccountTransactionsRecord, String> AT_REMARKS = createField(DSL.name("AT_REMARKS"), org.jooq.impl.SQLDataType.VARCHAR(45), this, "");

    /**
     * Create a <code>REVOLUT_SCHEMA.ACCOUNT_TRANSACTIONS</code> table reference
     */
    public AccountTransactions() {
        this(DSL.name("ACCOUNT_TRANSACTIONS"), null);
    }

    /**
     * Create an aliased <code>REVOLUT_SCHEMA.ACCOUNT_TRANSACTIONS</code> table reference
     */
    public AccountTransactions(String alias) {
        this(DSL.name(alias), ACCOUNT_TRANSACTIONS);
    }

    /**
     * Create an aliased <code>REVOLUT_SCHEMA.ACCOUNT_TRANSACTIONS</code> table reference
     */
    public AccountTransactions(Name alias) {
        this(alias, ACCOUNT_TRANSACTIONS);
    }

    private AccountTransactions(Name alias, Table<AccountTransactionsRecord> aliased) {
        this(alias, aliased, null);
    }

    private AccountTransactions(Name alias, Table<AccountTransactionsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> AccountTransactions(Table<O> child, ForeignKey<O, AccountTransactionsRecord> key) {
        super(child, key, ACCOUNT_TRANSACTIONS);
    }

    @Override
    public Schema getSchema() {
        return RevolutSchema.REVOLUT_SCHEMA;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.AT_ACC_FROM_INDEX_D, Indexes.AT_ACC_TO_INDEX_D, Indexes.PRIMARY_KEY_D);
    }

    @Override
    public UniqueKey<AccountTransactionsRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_D;
    }

    @Override
    public List<UniqueKey<AccountTransactionsRecord>> getKeys() {
        return Arrays.<UniqueKey<AccountTransactionsRecord>>asList(Keys.CONSTRAINT_D);
    }

    @Override
    public List<ForeignKey<AccountTransactionsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<AccountTransactionsRecord, ?>>asList(Keys.AT_ACC_FROM, Keys.AT_ACC_TO);
    }

    public Account atAccFrom() {
        return new Account(this, Keys.AT_ACC_FROM);
    }

    public Account atAccTo() {
        return new Account(this, Keys.AT_ACC_TO);
    }

    @Override
    public AccountTransactions as(String alias) {
        return new AccountTransactions(DSL.name(alias), this);
    }

    @Override
    public AccountTransactions as(Name alias) {
        return new AccountTransactions(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AccountTransactions rename(String name) {
        return new AccountTransactions(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AccountTransactions rename(Name name) {
        return new AccountTransactions(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<Integer, Long, Long, BigDecimal, String, Timestamp, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}

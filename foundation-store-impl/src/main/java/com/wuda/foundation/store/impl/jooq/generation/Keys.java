/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.store.impl.jooq.generation;


import com.wuda.foundation.store.impl.jooq.generation.tables.Store;
import com.wuda.foundation.store.impl.jooq.generation.tables.StoreGeneral;
import com.wuda.foundation.store.impl.jooq.generation.tables.records.StoreGeneralRecord;
import com.wuda.foundation.store.impl.jooq.generation.tables.records.StoreRecord;

import org.jooq.Identity;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;
import org.jooq.types.ULong;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>store</code> schema.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<StoreRecord, ULong> IDENTITY_STORE_ = Identities0.IDENTITY_STORE_;
    public static final Identity<StoreGeneralRecord, ULong> IDENTITY_STORE_GENERAL = Identities0.IDENTITY_STORE_GENERAL;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<StoreRecord> KEY_STORE_PRIMARY = UniqueKeys0.KEY_STORE_PRIMARY;
    public static final UniqueKey<StoreGeneralRecord> KEY_STORE_GENERAL_PRIMARY = UniqueKeys0.KEY_STORE_GENERAL_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<StoreRecord, ULong> IDENTITY_STORE_ = Internal.createIdentity(Store.STORE_, Store.STORE_.STORE_ID);
        public static Identity<StoreGeneralRecord, ULong> IDENTITY_STORE_GENERAL = Internal.createIdentity(StoreGeneral.STORE_GENERAL, StoreGeneral.STORE_GENERAL.STORE_GENERAL_ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<StoreRecord> KEY_STORE_PRIMARY = Internal.createUniqueKey(Store.STORE_, "KEY_store_PRIMARY", new TableField[] { Store.STORE_.STORE_ID }, true);
        public static final UniqueKey<StoreGeneralRecord> KEY_STORE_GENERAL_PRIMARY = Internal.createUniqueKey(StoreGeneral.STORE_GENERAL, "KEY_store_general_PRIMARY", new TableField[] { StoreGeneral.STORE_GENERAL.STORE_GENERAL_ID }, true);
    }
}
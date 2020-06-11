/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.commons.impl.jooq.generation;


import com.wuda.foundation.commons.impl.jooq.generation.tables.Email;
import com.wuda.foundation.commons.impl.jooq.generation.tables.Phone;

import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Commons extends SchemaImpl {

    private static final long serialVersionUID = -908789330;

    /**
     * The reference instance of <code>commons</code>
     */
    public static final Commons COMMONS = new Commons();

    /**
     * email信息
     */
    public final Email EMAIL = Email.EMAIL;

    /**
     * 电话信息。
     */
    public final Phone PHONE = Phone.PHONE;

    /**
     * No further instances allowed
     */
    private Commons() {
        super("commons", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.<Table<?>>asList(
            Email.EMAIL,
            Phone.PHONE);
    }
}
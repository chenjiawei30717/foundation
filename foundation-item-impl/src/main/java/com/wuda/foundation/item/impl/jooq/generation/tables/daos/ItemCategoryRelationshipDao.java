/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.item.impl.jooq.generation.tables.daos;


import com.wuda.foundation.item.impl.jooq.generation.tables.ItemCategoryRelationship;
import com.wuda.foundation.item.impl.jooq.generation.tables.records.ItemCategoryRelationshipRecord;

import java.time.LocalDateTime;
import java.util.List;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.jooq.types.ULong;


/**
 * 物品与分类的关系表，有很多设计是在物品表中放分类一，分类二，分类三这样的字段，这样设计的扩展性很弱
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ItemCategoryRelationshipDao extends DAOImpl<ItemCategoryRelationshipRecord, com.wuda.foundation.item.impl.jooq.generation.tables.pojos.ItemCategoryRelationship, ULong> {

    /**
     * Create a new ItemCategoryRelationshipDao without any configuration
     */
    public ItemCategoryRelationshipDao() {
        super(ItemCategoryRelationship.ITEM_CATEGORY_RELATIONSHIP, com.wuda.foundation.item.impl.jooq.generation.tables.pojos.ItemCategoryRelationship.class);
    }

    /**
     * Create a new ItemCategoryRelationshipDao with an attached configuration
     */
    public ItemCategoryRelationshipDao(Configuration configuration) {
        super(ItemCategoryRelationship.ITEM_CATEGORY_RELATIONSHIP, com.wuda.foundation.item.impl.jooq.generation.tables.pojos.ItemCategoryRelationship.class, configuration);
    }

    @Override
    public ULong getId(com.wuda.foundation.item.impl.jooq.generation.tables.pojos.ItemCategoryRelationship object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.item.impl.jooq.generation.tables.pojos.ItemCategoryRelationship> fetchRangeOfId(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(ItemCategoryRelationship.ITEM_CATEGORY_RELATIONSHIP.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.wuda.foundation.item.impl.jooq.generation.tables.pojos.ItemCategoryRelationship> fetchById(ULong... values) {
        return fetch(ItemCategoryRelationship.ITEM_CATEGORY_RELATIONSHIP.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.wuda.foundation.item.impl.jooq.generation.tables.pojos.ItemCategoryRelationship fetchOneById(ULong value) {
        return fetchOne(ItemCategoryRelationship.ITEM_CATEGORY_RELATIONSHIP.ID, value);
    }

    /**
     * Fetch records that have <code>item_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.item.impl.jooq.generation.tables.pojos.ItemCategoryRelationship> fetchRangeOfItemId(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(ItemCategoryRelationship.ITEM_CATEGORY_RELATIONSHIP.ITEM_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>item_id IN (values)</code>
     */
    public List<com.wuda.foundation.item.impl.jooq.generation.tables.pojos.ItemCategoryRelationship> fetchByItemId(ULong... values) {
        return fetch(ItemCategoryRelationship.ITEM_CATEGORY_RELATIONSHIP.ITEM_ID, values);
    }

    /**
     * Fetch records that have <code>item_category_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.item.impl.jooq.generation.tables.pojos.ItemCategoryRelationship> fetchRangeOfItemCategoryId(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(ItemCategoryRelationship.ITEM_CATEGORY_RELATIONSHIP.ITEM_CATEGORY_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>item_category_id IN (values)</code>
     */
    public List<com.wuda.foundation.item.impl.jooq.generation.tables.pojos.ItemCategoryRelationship> fetchByItemCategoryId(ULong... values) {
        return fetch(ItemCategoryRelationship.ITEM_CATEGORY_RELATIONSHIP.ITEM_CATEGORY_ID, values);
    }

    /**
     * Fetch records that have <code>create_time BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.item.impl.jooq.generation.tables.pojos.ItemCategoryRelationship> fetchRangeOfCreateTime(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(ItemCategoryRelationship.ITEM_CATEGORY_RELATIONSHIP.CREATE_TIME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>create_time IN (values)</code>
     */
    public List<com.wuda.foundation.item.impl.jooq.generation.tables.pojos.ItemCategoryRelationship> fetchByCreateTime(LocalDateTime... values) {
        return fetch(ItemCategoryRelationship.ITEM_CATEGORY_RELATIONSHIP.CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>create_user_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.item.impl.jooq.generation.tables.pojos.ItemCategoryRelationship> fetchRangeOfCreateUserId(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(ItemCategoryRelationship.ITEM_CATEGORY_RELATIONSHIP.CREATE_USER_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>create_user_id IN (values)</code>
     */
    public List<com.wuda.foundation.item.impl.jooq.generation.tables.pojos.ItemCategoryRelationship> fetchByCreateUserId(ULong... values) {
        return fetch(ItemCategoryRelationship.ITEM_CATEGORY_RELATIONSHIP.CREATE_USER_ID, values);
    }

    /**
     * Fetch records that have <code>is_deleted BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.item.impl.jooq.generation.tables.pojos.ItemCategoryRelationship> fetchRangeOfIsDeleted(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(ItemCategoryRelationship.ITEM_CATEGORY_RELATIONSHIP.IS_DELETED, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>is_deleted IN (values)</code>
     */
    public List<com.wuda.foundation.item.impl.jooq.generation.tables.pojos.ItemCategoryRelationship> fetchByIsDeleted(ULong... values) {
        return fetch(ItemCategoryRelationship.ITEM_CATEGORY_RELATIONSHIP.IS_DELETED, values);
    }
}
/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.commons.impl.jooq.generation.tables.records;


import com.wuda.foundation.commons.impl.jooq.generation.tables.TreeNode;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UByte;
import org.jooq.types.ULong;


/**
 * 树形结构的节点。有很多数据是用树形结构组织的，比如商品分类，文章分类，组织架构等等，通常我们都是为它们单独设计一个表，比如商品分类表，部门表，然后每个表都写了差不多相同的处理逻辑，如何避免重复处理类似树形的数据呢？这个表的目的就是为了统一处理这些类似树形结构的表，以这个表为核心，扩展出商品分类，文章分类，部门等。owner 
 * type，owner identifi;er，use三个字段被引入进来的主要原因是：通常，在树的同一个level，不允许出现同名的节点，如果不引进这些标记归属的字段，那么看上去这个表的数
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TreeNodeRecord extends UpdatableRecordImpl<TreeNodeRecord> implements Record12<ULong, String, String, ULong, UByte, ULong, UByte, LocalDateTime, ULong, LocalDateTime, ULong, ULong> {

    private static final long serialVersionUID = 1898472457;

    /**
     * Setter for <code>foundation_commons.tree_node.tree_node_id</code>.
     */
    public void setTreeNodeId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>foundation_commons.tree_node.tree_node_id</code>.
     */
    public ULong getTreeNodeId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>foundation_commons.tree_node.name</code>. 节点名称
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>foundation_commons.tree_node.name</code>. 节点名称
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>foundation_commons.tree_node.description</code>. 节点的描述
     */
    public void setDescription(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>foundation_commons.tree_node.description</code>. 节点的描述
     */
    public String getDescription() {
        return (String) get(2);
    }

    /**
     * Setter for <code>foundation_commons.tree_node.parent_node_id</code>. 指向父节点ID
     */
    public void setParentNodeId(ULong value) {
        set(3, value);
    }

    /**
     * Getter for <code>foundation_commons.tree_node.parent_node_id</code>. 指向父节点ID
     */
    public ULong getParentNodeId() {
        return (ULong) get(3);
    }

    /**
     * Setter for <code>foundation_commons.tree_node.owner_type</code>. owner type
     */
    public void setOwnerType(UByte value) {
        set(4, value);
    }

    /**
     * Getter for <code>foundation_commons.tree_node.owner_type</code>. owner type
     */
    public UByte getOwnerType() {
        return (UByte) get(4);
    }

    /**
     * Setter for <code>foundation_commons.tree_node.owner_iendtifier</code>. owner的唯一标记符
     */
    public void setOwnerIendtifier(ULong value) {
        set(5, value);
    }

    /**
     * Getter for <code>foundation_commons.tree_node.owner_iendtifier</code>. owner的唯一标记符
     */
    public ULong getOwnerIendtifier() {
        return (ULong) get(5);
    }

    /**
     * Setter for <code>foundation_commons.tree_node.use</code>. 用途，比如用于商品分类，文章分类等。如果文章分类有单独设计一个表，那么这个文章分类表天然就暗含了用途的含义，即就是用于文章分类，而这里作为通用的表示树形结构的表，就使用这个字段来表明用途。
     */
    public void setUse(UByte value) {
        set(6, value);
    }

    /**
     * Getter for <code>foundation_commons.tree_node.use</code>. 用途，比如用于商品分类，文章分类等。如果文章分类有单独设计一个表，那么这个文章分类表天然就暗含了用途的含义，即就是用于文章分类，而这里作为通用的表示树形结构的表，就使用这个字段来表明用途。
     */
    public UByte getUse() {
        return (UByte) get(6);
    }

    /**
     * Setter for <code>foundation_commons.tree_node.create_time</code>.
     */
    public void setCreateTime(LocalDateTime value) {
        set(7, value);
    }

    /**
     * Getter for <code>foundation_commons.tree_node.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(7);
    }

    /**
     * Setter for <code>foundation_commons.tree_node.create_user_id</code>.
     */
    public void setCreateUserId(ULong value) {
        set(8, value);
    }

    /**
     * Getter for <code>foundation_commons.tree_node.create_user_id</code>.
     */
    public ULong getCreateUserId() {
        return (ULong) get(8);
    }

    /**
     * Setter for <code>foundation_commons.tree_node.last_modify_time</code>.
     */
    public void setLastModifyTime(LocalDateTime value) {
        set(9, value);
    }

    /**
     * Getter for <code>foundation_commons.tree_node.last_modify_time</code>.
     */
    public LocalDateTime getLastModifyTime() {
        return (LocalDateTime) get(9);
    }

    /**
     * Setter for <code>foundation_commons.tree_node.last_modify_user_id</code>.
     */
    public void setLastModifyUserId(ULong value) {
        set(10, value);
    }

    /**
     * Getter for <code>foundation_commons.tree_node.last_modify_user_id</code>.
     */
    public ULong getLastModifyUserId() {
        return (ULong) get(10);
    }

    /**
     * Setter for <code>foundation_commons.tree_node.is_deleted</code>.
     */
    public void setIsDeleted(ULong value) {
        set(11, value);
    }

    /**
     * Getter for <code>foundation_commons.tree_node.is_deleted</code>.
     */
    public ULong getIsDeleted() {
        return (ULong) get(11);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<ULong> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row12<ULong, String, String, ULong, UByte, ULong, UByte, LocalDateTime, ULong, LocalDateTime, ULong, ULong> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    @Override
    public Row12<ULong, String, String, ULong, UByte, ULong, UByte, LocalDateTime, ULong, LocalDateTime, ULong, ULong> valuesRow() {
        return (Row12) super.valuesRow();
    }

    @Override
    public Field<ULong> field1() {
        return TreeNode.TREE_NODE.TREE_NODE_ID;
    }

    @Override
    public Field<String> field2() {
        return TreeNode.TREE_NODE.NAME;
    }

    @Override
    public Field<String> field3() {
        return TreeNode.TREE_NODE.DESCRIPTION;
    }

    @Override
    public Field<ULong> field4() {
        return TreeNode.TREE_NODE.PARENT_NODE_ID;
    }

    @Override
    public Field<UByte> field5() {
        return TreeNode.TREE_NODE.OWNER_TYPE;
    }

    @Override
    public Field<ULong> field6() {
        return TreeNode.TREE_NODE.OWNER_IENDTIFIER;
    }

    @Override
    public Field<UByte> field7() {
        return TreeNode.TREE_NODE.USE;
    }

    @Override
    public Field<LocalDateTime> field8() {
        return TreeNode.TREE_NODE.CREATE_TIME;
    }

    @Override
    public Field<ULong> field9() {
        return TreeNode.TREE_NODE.CREATE_USER_ID;
    }

    @Override
    public Field<LocalDateTime> field10() {
        return TreeNode.TREE_NODE.LAST_MODIFY_TIME;
    }

    @Override
    public Field<ULong> field11() {
        return TreeNode.TREE_NODE.LAST_MODIFY_USER_ID;
    }

    @Override
    public Field<ULong> field12() {
        return TreeNode.TREE_NODE.IS_DELETED;
    }

    @Override
    public ULong component1() {
        return getTreeNodeId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public String component3() {
        return getDescription();
    }

    @Override
    public ULong component4() {
        return getParentNodeId();
    }

    @Override
    public UByte component5() {
        return getOwnerType();
    }

    @Override
    public ULong component6() {
        return getOwnerIendtifier();
    }

    @Override
    public UByte component7() {
        return getUse();
    }

    @Override
    public LocalDateTime component8() {
        return getCreateTime();
    }

    @Override
    public ULong component9() {
        return getCreateUserId();
    }

    @Override
    public LocalDateTime component10() {
        return getLastModifyTime();
    }

    @Override
    public ULong component11() {
        return getLastModifyUserId();
    }

    @Override
    public ULong component12() {
        return getIsDeleted();
    }

    @Override
    public ULong value1() {
        return getTreeNodeId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public String value3() {
        return getDescription();
    }

    @Override
    public ULong value4() {
        return getParentNodeId();
    }

    @Override
    public UByte value5() {
        return getOwnerType();
    }

    @Override
    public ULong value6() {
        return getOwnerIendtifier();
    }

    @Override
    public UByte value7() {
        return getUse();
    }

    @Override
    public LocalDateTime value8() {
        return getCreateTime();
    }

    @Override
    public ULong value9() {
        return getCreateUserId();
    }

    @Override
    public LocalDateTime value10() {
        return getLastModifyTime();
    }

    @Override
    public ULong value11() {
        return getLastModifyUserId();
    }

    @Override
    public ULong value12() {
        return getIsDeleted();
    }

    @Override
    public TreeNodeRecord value1(ULong value) {
        setTreeNodeId(value);
        return this;
    }

    @Override
    public TreeNodeRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public TreeNodeRecord value3(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public TreeNodeRecord value4(ULong value) {
        setParentNodeId(value);
        return this;
    }

    @Override
    public TreeNodeRecord value5(UByte value) {
        setOwnerType(value);
        return this;
    }

    @Override
    public TreeNodeRecord value6(ULong value) {
        setOwnerIendtifier(value);
        return this;
    }

    @Override
    public TreeNodeRecord value7(UByte value) {
        setUse(value);
        return this;
    }

    @Override
    public TreeNodeRecord value8(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    @Override
    public TreeNodeRecord value9(ULong value) {
        setCreateUserId(value);
        return this;
    }

    @Override
    public TreeNodeRecord value10(LocalDateTime value) {
        setLastModifyTime(value);
        return this;
    }

    @Override
    public TreeNodeRecord value11(ULong value) {
        setLastModifyUserId(value);
        return this;
    }

    @Override
    public TreeNodeRecord value12(ULong value) {
        setIsDeleted(value);
        return this;
    }

    @Override
    public TreeNodeRecord values(ULong value1, String value2, String value3, ULong value4, UByte value5, ULong value6, UByte value7, LocalDateTime value8, ULong value9, LocalDateTime value10, ULong value11, ULong value12) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TreeNodeRecord
     */
    public TreeNodeRecord() {
        super(TreeNode.TREE_NODE);
    }

    /**
     * Create a detached, initialised TreeNodeRecord
     */
    public TreeNodeRecord(ULong treeNodeId, String name, String description, ULong parentNodeId, UByte ownerType, ULong ownerIendtifier, UByte use, LocalDateTime createTime, ULong createUserId, LocalDateTime lastModifyTime, ULong lastModifyUserId, ULong isDeleted) {
        super(TreeNode.TREE_NODE);

        set(0, treeNodeId);
        set(1, name);
        set(2, description);
        set(3, parentNodeId);
        set(4, ownerType);
        set(5, ownerIendtifier);
        set(6, use);
        set(7, createTime);
        set(8, createUserId);
        set(9, lastModifyTime);
        set(10, lastModifyUserId);
        set(11, isDeleted);
    }
}

/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.commons.impl.jooq.generation.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;

import org.jooq.types.UByte;
import org.jooq.types.ULong;


/**
 * 树形结构的节点。有很多数据是用树形结构组织的，比如商品分类，文章分类，组织架构等等，通常我们都是为它们单独设计一个表，比如商品分类表，部门表，然后每个表都写了差不多相同的处理逻辑，如何避免重复处理类似树形的数据呢？这个表的目的就是为了统一处理这些类似树形结构的表，以这个表为核心，扩展出商品分类，文章分类，部门等。owner 
 * type，owner identifi;er，use三个字段被引入进来的主要原因是：通常，在树的同一个level，不允许出现同名的节点，如果不引进这些标记归属的字段，那么看上去这个表的数
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TreeNode implements Serializable {

    private static final long serialVersionUID = -1848875628;

    private ULong         treeNodeId;
    private String        name;
    private String        description;
    private ULong         parentNodeId;
    private UByte         ownerType;
    private ULong         ownerIendtifier;
    private UByte         use;
    private LocalDateTime createTime;
    private ULong         createUserId;
    private LocalDateTime lastModifyTime;
    private ULong         lastModifyUserId;
    private ULong         isDeleted;

    public TreeNode() {}

    public TreeNode(TreeNode value) {
        this.treeNodeId = value.treeNodeId;
        this.name = value.name;
        this.description = value.description;
        this.parentNodeId = value.parentNodeId;
        this.ownerType = value.ownerType;
        this.ownerIendtifier = value.ownerIendtifier;
        this.use = value.use;
        this.createTime = value.createTime;
        this.createUserId = value.createUserId;
        this.lastModifyTime = value.lastModifyTime;
        this.lastModifyUserId = value.lastModifyUserId;
        this.isDeleted = value.isDeleted;
    }

    public TreeNode(
        ULong         treeNodeId,
        String        name,
        String        description,
        ULong         parentNodeId,
        UByte         ownerType,
        ULong         ownerIendtifier,
        UByte         use,
        LocalDateTime createTime,
        ULong         createUserId,
        LocalDateTime lastModifyTime,
        ULong         lastModifyUserId,
        ULong         isDeleted
    ) {
        this.treeNodeId = treeNodeId;
        this.name = name;
        this.description = description;
        this.parentNodeId = parentNodeId;
        this.ownerType = ownerType;
        this.ownerIendtifier = ownerIendtifier;
        this.use = use;
        this.createTime = createTime;
        this.createUserId = createUserId;
        this.lastModifyTime = lastModifyTime;
        this.lastModifyUserId = lastModifyUserId;
        this.isDeleted = isDeleted;
    }

    public ULong getTreeNodeId() {
        return this.treeNodeId;
    }

    public void setTreeNodeId(ULong treeNodeId) {
        this.treeNodeId = treeNodeId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ULong getParentNodeId() {
        return this.parentNodeId;
    }

    public void setParentNodeId(ULong parentNodeId) {
        this.parentNodeId = parentNodeId;
    }

    public UByte getOwnerType() {
        return this.ownerType;
    }

    public void setOwnerType(UByte ownerType) {
        this.ownerType = ownerType;
    }

    public ULong getOwnerIendtifier() {
        return this.ownerIendtifier;
    }

    public void setOwnerIendtifier(ULong ownerIendtifier) {
        this.ownerIendtifier = ownerIendtifier;
    }

    public UByte getUse() {
        return this.use;
    }

    public void setUse(UByte use) {
        this.use = use;
    }

    public LocalDateTime getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public ULong getCreateUserId() {
        return this.createUserId;
    }

    public void setCreateUserId(ULong createUserId) {
        this.createUserId = createUserId;
    }

    public LocalDateTime getLastModifyTime() {
        return this.lastModifyTime;
    }

    public void setLastModifyTime(LocalDateTime lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    public ULong getLastModifyUserId() {
        return this.lastModifyUserId;
    }

    public void setLastModifyUserId(ULong lastModifyUserId) {
        this.lastModifyUserId = lastModifyUserId;
    }

    public ULong getIsDeleted() {
        return this.isDeleted;
    }

    public void setIsDeleted(ULong isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TreeNode (");

        sb.append(treeNodeId);
        sb.append(", ").append(name);
        sb.append(", ").append(description);
        sb.append(", ").append(parentNodeId);
        sb.append(", ").append(ownerType);
        sb.append(", ").append(ownerIendtifier);
        sb.append(", ").append(use);
        sb.append(", ").append(createTime);
        sb.append(", ").append(createUserId);
        sb.append(", ").append(lastModifyTime);
        sb.append(", ").append(lastModifyUserId);
        sb.append(", ").append(isDeleted);

        sb.append(")");
        return sb.toString();
    }
}

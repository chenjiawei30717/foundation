/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.commons.impl.jooq.generation;


import com.wuda.foundation.commons.impl.jooq.generation.tables.PropertyKeyDefinition;
import com.wuda.foundation.commons.impl.jooq.generation.tables.TreeNode;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables of the <code>foundation_commons</code> 
 * schema.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index PROPERTY_KEY_DEFINITION_FK_ATTRIBUTE_KEY_ID = Indexes0.PROPERTY_KEY_DEFINITION_FK_ATTRIBUTE_KEY_ID;
    public static final Index TREE_NODE_IDX_OWNER_AND_USE = Indexes0.TREE_NODE_IDX_OWNER_AND_USE;
    public static final Index TREE_NODE_IDX_PARENT = Indexes0.TREE_NODE_IDX_PARENT;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index PROPERTY_KEY_DEFINITION_FK_ATTRIBUTE_KEY_ID = Internal.createIndex("fk_attribute_key_id", PropertyKeyDefinition.PROPERTY_KEY_DEFINITION, new OrderField[] { PropertyKeyDefinition.PROPERTY_KEY_DEFINITION.PROPERTY_KEY_ID }, false);
        public static Index TREE_NODE_IDX_OWNER_AND_USE = Internal.createIndex("idx_owner_and_use", TreeNode.TREE_NODE, new OrderField[] { TreeNode.TREE_NODE.OWNER_TYPE, TreeNode.TREE_NODE.OWNER_IENDTIFIER, TreeNode.TREE_NODE.USE }, false);
        public static Index TREE_NODE_IDX_PARENT = Internal.createIndex("idx_parent", TreeNode.TREE_NODE, new OrderField[] { TreeNode.TREE_NODE.PARENT_NODE_ID }, false);
    }
}

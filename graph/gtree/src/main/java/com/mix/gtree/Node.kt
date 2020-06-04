package com.mix.gtree

/**
 * 树的节点
 */
data class Node(
    val id: String,
    val label: String,
    val warning: Boolean,
    val children: MutableList<Node>,
    var parentId: String?
) {

    fun compare(node: Node): Boolean {
        return node.id >= id
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Node

        if (id != other.id) return false
        if (label != other.label) return false
        if (warning != other.warning) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id.hashCode()
        result = 31 * result + label.hashCode()
        result = 31 * result + warning.hashCode()
        return result
    }

    override fun toString(): String {
        return """{"id": "$id","label": "$label","warning": $warning, "children": $children, "parentId": $parentId}""".trimIndent()
    }
}
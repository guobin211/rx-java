package com.mix.gtree

class GraphTree(private val array: List<String>) {

    fun createTree(): Node {
        var index = 0
        var root: Node = Node(index.toString(), array[index], false, mutableListOf(), null)
        for (s in array) {
            if (index != 0) {
                val node = Node(index.toString(), array[index], false, mutableListOf(), null)
                if (node.compare(root)) {
                    root.parentId = node.id
                    node.children.add(root)
                    root = node
                } else {
                    node.parentId = root.id
                    root.children.add(node)
                }
            }
            index += 1
        }
        return root
    }

    fun updateTree(): Unit {
        
    }
}

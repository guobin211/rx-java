package com.mix.gtree

fun testNode(): Unit {
    val list: MutableList<Node> = mutableListOf()
    val node: Node = Node("he1001", "核电一号机组", false, list, null)
    println(node)
}

fun testCreate(): Unit {
    val names = listOf<String>("a", "b", "c", "d", "e")
    val graphTree = GraphTree(names)
    val root = graphTree.createTree()
    print(root)
}

fun main() {
    // testNode()
    testCreate()
}

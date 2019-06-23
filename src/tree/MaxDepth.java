package tree;

import java.util.List;

/**
 * MaxDepth class
 *
 * @author GuoBin
 * @email guobin201314@gmail.com
 * @date 2019-06-20
 */
public class MaxDepth {
    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        int depth = 0;
        for (int i = 0; i < root.children.size(); i++) {
            depth = Math.max(depth, maxDepth(root.children.get(i)));
        }
        return depth + 1;
    }

    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int val, List<Node> children) {
            this.val = val;
            this.children = children;
        }
    };

}

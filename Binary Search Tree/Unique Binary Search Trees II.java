class Solution {
    public List<TreeNode> generateTrees(int n) {
        return solve(1, n);
    }
    
    private List<TreeNode> solve(int start, int end) {
        List<TreeNode> nodes = new ArrayList<>();
        if (start == end) {
            nodes.add(new TreeNode(start));
            return nodes;
        }
        for (int i = start; i <= end; i++) {
            if (i == end) {
                List<TreeNode> leftNodes = solve(start, end - 1);
                for (TreeNode leftNode : leftNodes) {
                    TreeNode root = new TreeNode(i);
                    root.left = leftNode;
                    nodes.add(root);
                }
            }
            else if (i == start) {
                List<TreeNode> rightNodes = solve(i + 1, end);
                for (TreeNode rightNode : rightNodes) {
                    TreeNode root = new TreeNode(i);
                    root.right = rightNode;
                    nodes.add(root);
                }
            }
            else {
                List<TreeNode> leftNodes = solve(start, i - 1);
                List<TreeNode> rightNodes = solve(i + 1, end);
                
                for (TreeNode leftNode : leftNodes) {
                    for (TreeNode rightNode : rightNodes) {
                        TreeNode root = new TreeNode(i);
                        root.left = leftNode;
                        root.right = rightNode;
                        nodes.add(root);
                    }
                }
            }
        }
        return nodes;
    }
    
}

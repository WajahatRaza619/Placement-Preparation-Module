class Solution {
public List preorderTraversal(TreeNode root) {
ArrayList list = new ArrayList<>();
TreeNode curr = root;
while(curr != null){
if(curr.left == null){
list.add(curr.val);
curr = curr.right;
}else{
TreeNode iop = curr.left;
while(iop.right != null && iop.right != curr){
iop = iop.right;
}
if(iop.right == null){
iop.right = curr;
list.add(curr.val);
curr = curr.left;
}
if(iop.right == curr){
iop.right = null;
curr = curr.right;
}
}
}
return list;
}
}

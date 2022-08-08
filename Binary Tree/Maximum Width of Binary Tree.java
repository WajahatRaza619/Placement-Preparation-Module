class Solution {
    static class Pair{
        TreeNode root;
        int idx;
        Pair(TreeNode root,int idx){
            this.root=root;
            this.idx=idx;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(root,0));
        int ans=0;
        while(!q.isEmpty()){
            int size=q.size();
            int lm=q.peek().idx;
            int rm=q.peek().idx;
            while(size-->0){
                Pair poll=q.poll();
                rm=poll.idx;
                if(poll.root.left!=null)
                    q.add(new Pair(poll.root.left,2*poll.idx+1));
                 if(poll.root.right!=null)
                    q.add(new Pair(poll.root.right,2*poll.idx+2));
            
            }
            ans=Math.max(ans,rm-lm+1);
        }
        return ans;
    }
}

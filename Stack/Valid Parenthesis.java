class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        char arr[]=s.toCharArray();
        
        for(int i=0;i<arr.length;i++){
          if(arr[i]=='(' || arr[i]=='{' || arr[i]=='['){
              stack.push(arr[i]);
          }else{
              if(stack.isEmpty()){
                  return false;
              }
              char c=stack.peek();
              if((arr[i]==')' && c=='(') || (arr[i]==']' && c=='[') || (arr[i]=='}' && c=='{')){
                stack.pop();
              }
              else{
              return false;
              }
          }
        }
        if(stack.isEmpty()){
            return true;
        }else{
return false;
        }
        
    }
}

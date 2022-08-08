public static int minimumNumber(int n, String password) {
    
      int d=0;
      int up=0;
      int lc=0;
      int spl=0;
      for(int i=0;i<password.length();i++){
          char c=password.charAt(i);
          if(c>='A' && c<='Z'){
              up=1;
          }
          else if(c>='a' && c<='z'){
              lc=1;
          }
          else if(Character.isDigit(c)){
              d=1;
          }
          else{
              spl=1;
          }
      }
      int req=4-(d+up+lc+spl);
      if(n+req<6){
          return 6-n;
      }else{
          return req;
      }
    }

}

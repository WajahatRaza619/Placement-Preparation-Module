 public static String pangrams(String s) {
        s=s.toLowerCase();
        if(s.length()<26){
            return "not pangram";
        }else{
        for(char c='a';c<='z';c++){
            if(s.indexOf(c)<0){
                return "not pangram";
            }
        }
        }
        return "pangram";
    }

}

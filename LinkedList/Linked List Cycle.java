 do{
	// if there are any excpetion then there is null -> not circle
        try{
        slowPointer = slowPointer.next;
        fastPointer = fastPointer.next.next;
        }catch(Exception e){
            return false;
        }
    }while (slowPointer != fastPointer);
    
    return slowPointer == fastPointer;
}

package StrategyPattern;

public class Context {
    Sort sort;
    
    Context(Sort sort){
        this.sort = sort;
    }
    
    int[] getSortedArray(int[] arr){
        return sort.sort(arr);
    }
    
    String getDescription(){
        return sort.sortDescription();
    }
}

package StrategyPattern;
public class InsertionSort implements Sort{

    @Override
    public int[] sort(int[] array) {
        
        int size = array.length;
        for (int i = 1; i < size; ++i) {
            
            int key = array[i];
            int j = i - 1;
            
            while(j >= 0 && array[j] > key){
                array[j+1] = array[j];
                j = j - 1;
            }
            array[j+1] = key;
            
        }
        
        return array;
    }

    @Override
    public String sortDescription() {
        return "Insertion Sort Algorithm";
    }
    
}

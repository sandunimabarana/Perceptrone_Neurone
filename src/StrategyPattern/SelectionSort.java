package StrategyPattern;

public class SelectionSort implements Sort{

    @Override
    public int[] sort(int[] array) {
        
        int size = array.length;
        for (int i = 0; i < size - 1; i++) {
            
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                
                if(array[j] < array[minIndex]){
                    minIndex = j;
                }
                
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;        
        }
        return array;
    }
    
    @Override
    public String sortDescription() {
        return "Selection Sort Algorithm";
    }
}

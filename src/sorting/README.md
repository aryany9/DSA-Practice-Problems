# Sorting

**Note: We will use Array as an Example for Sorting of elements for easy understanding.**

### Types of Sorts
- Bubble Sort
- Insertion Sort
- Selection Sort
- Merge Sort
- Quick Sort


### Pseudo Codes
- Bubble Sort
```
for(int i=0; i<array.length-1; i++){
    for(int j=0; j<array.length-i-1; j++){
        if(array[j] > array[j+1]){
            // SWAP
            int temp = array[j];
            array[j] = array[j+1];
            array[j+1] = temp;
        }
    }    
}
```

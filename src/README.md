## Types of "For Loops"

### Enhanced Loop
```
int[] numbers = 
 {1,2,3,4,5,6,7,8,9,10};

for (int item : numbers) {
   System.out.println(item);
}
```

### Shorter For Loop
```
for(int i = -1; ++i < max;) {
    //do something
 }
```
Notice that the counter increment was done before the comparison with max is done.

Also notice that the index i starts from -1 instead of normal 0.


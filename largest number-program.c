#include<stdio.h>
#include<stdlib.h>

int main(void)
    {  
        int i, n;
        int *ptr;

        //number of values
        printf("-------------------------\n");
        printf("enter total number of values:");
        scanf("%d", &n);

        //allocating mem to ptr
        ptr = (int*) malloc(n * sizeof(int));

        //taking values for arr
        printf("Enter values\n");
        printf("------------------------\n");
        for(i = 0; i < n; ++i)
            {
                printf("enter arr[i]:", i);
                scanf("%d", ptr + i);
            }
        
        //comparing values and storing largest in arr[0]
        for(i = 0; i < n; ++i)
            {
                if(*ptr < *(ptr + i))
                    {
                        *ptr = *(ptr + i);
                    }
            }
        //printing out largest number
        printf("The largest number in the array is\n");
        printf("-------------------------------------\n");
        printf("%d", *ptr);

        free(ptr);

        return 0;
    }
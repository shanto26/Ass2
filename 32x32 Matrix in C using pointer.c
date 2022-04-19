#include<stdio.h>
#include<stdlib.h>
#include <time.h>

int main(){
    clock_t begin = clock();

    int a[32][32], b[32][32], mul[32][32], r = 32, c = 32, i, j, k;


    for(i=0; i<r; i++){
        for(j=0; j<c; j++){
         a[i][j] = rand()%10;
        }
    }
    for(i=0; i<r; i++){
        for(j=0; j<c; j++){
            b[i][j] = rand()%5;

        }
    }

    for(i=0; i<r; i++){
        for(j=0; j<c; j++){
            int sum = 0;
            for(k=0; k <c; k++){
                sum += (*(*(a + i) + k)) * (*(*(b + k) + j));
            }
            *(*(mul + i) + j) = sum;
        }
    }


    for(i=0; i<r; i++){
        for(j=0; j<c; j++){
            printf("%d\t",a[i][j]);
        }
        printf("\n");
    }


    for(i=0; i<r; i++){
        for(j=0; j<c; j++){
            printf("%d\t",b[i][j]);
        }
        printf("\n");
    }


    for(i=0; i<r; i++){
        for(j=0; j<c; j++){
            printf("%d\t",mul[i][j]);
        }
        printf("\n");
    }

    clock_t end = clock();
    double time_spent = (double)(end - begin) / CLOCKS_PER_SEC;
    printf("%Time Spent: %f\n", time_spent);

}


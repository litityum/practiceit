int i = 0;
int j = 1;
for (int k = 1; k <= 12; k++){
    if ( k % 2 == 1){
        j += i;
        System.out.print(j + " ");
    }
    else{
        i += j;
        System.out.print(i + " ");
    }
}
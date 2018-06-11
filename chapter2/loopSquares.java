int z = 0;
for(int i = 1; i<=10; i++){
    for(int j = 1; j <= i; j++){
        z += i;
    }
    System.out.print(z + " ");
    z=0;
}
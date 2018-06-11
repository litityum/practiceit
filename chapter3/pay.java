public static double pay(double sal, int hours){
    return (sal * hours) + (Math.max(8 , hours)-8) * sal / 2;
}
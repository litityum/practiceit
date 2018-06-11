public static String season(int month, int day){
    if(month <= 2)
        return "Winter";
    if(month == 3 && day <= 15)
        return "Winter";
    else if(month <= 5)
        return "Spring";
    else if(month == 6 && day <= 15)
        return "Spring";
    else if(month <= 8)
        return "Summer";
    else if(month == 9 && day <= 15)
        return "Summer";
    else if(month == 12 && day >=16)
        return "Winter";
    else
        return "Fall";
}
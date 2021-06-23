package org.example;

public class Kata {
    public static int[] sortArray(int[] array) {
        int size = array.length;


        for (int i = 0; i < size - 1; i++){

            for (int j = 0; j < size - i - 1; j++){

                if ((array[j] %2 != 0) && (array[j+1] %2 != 0)){
                    int temp = array[j];
                    if (array[j]> array[j + 1]){

                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                    else
                    {
                        continue;
                    }
                }
            }
        }
        return array;
    }

    public class Kata {
        public static int[] sortArray(int[] array) {
            for(int i=0 ; i<array.length-1 ; i++){
                for(int j=i+1; j<array.length ; j++){
                    if(array[i]>array[j] && array[i]%2 == 1 && array[j]%2 == 1){
                        int aux=array[i];
                        array[i]=array[j];
                        array[j]=aux;
                    }
                }
            }
            return array;
        }
    }
}

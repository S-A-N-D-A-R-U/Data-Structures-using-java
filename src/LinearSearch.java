public class LinearSearch {

    public static void main(String[] args) {
        int[] array = {23, 56, 78, 34, 23, 77, 55, 11, 34, 78, 32, 66, 99};

        int index = linearSearch(array, 34);
        if(index!= -1){
            System.out.println("The value found at the index :" +index);
        }
        else{
            System.out.println("The value is not found ");
        }

    }

        private static int linearSearch( int[] array  , int value ){

            for( int i = 0 ; i < array.length; i++){
                if (array[i] == value) {
                    return i ;
                }

            }
            return -1 ;
        }
}

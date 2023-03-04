//Q4) Create a two dimensional array of integers and display:

 //       sum of all elements of each column
  //      sum of all elements of each row

public class Ques4 {

    public static void calulate(int[][] arr){

        System.out.println("rowise");
        for(int i = 0 ; i< arr.length ; i++){
            int sum = 0 ;
            for(int j= 0 ; j < arr[0].length ; j++){
                sum+= arr[i][j];

            }
            System.out.println("sum of row " + i+ " is " + sum);
        }
        System.out.println("colom_wise");
        for(int i = 0 ; i< arr.length ; i++){
            int sum = 0 ;
            for(int j= 0 ; j < arr[0].length ; j++){
                sum+= arr[j][i];

            }
            System.out.println("sum of col" + i + " is " + sum);
        }
    }

    public static void main (String [] args){
        int [][] arr = new int[][]{{9,8,7}, {2,3,4} , {4,6,7} };

        calulate(arr);
    }

}

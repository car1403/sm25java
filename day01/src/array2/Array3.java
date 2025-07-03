package array2;

import java.util.Random;

public class Array3 {
    public static void main(String[] args) {
        // 5행 5열의 배열에
        // 1~100까지의 random 한 숫자를 입력 한다.
        // 단, 중복 되서 들어가면 안된다.
        // 최종 배열을 출력
        int arr[][] = new int[3][3];
        Random rand = new Random();

        for(int i=0;i<3;i++){

            for(int j=0;j<3;j++){

                int num = rand.nextInt(100)+1;
                System.out.println("J:"+j+" "+num);

                if(i==0 && j==0){
                    arr[i][j] = num;
                }else{

                }

            }
        }

        for(int n[]: arr){
            for(int num: n){
                System.out.print(num+" ");
            }
            System.out.println();
        }

    }
}

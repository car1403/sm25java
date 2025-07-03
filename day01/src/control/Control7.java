package control;

import java.util.Scanner;

public class Control7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter Command:(arr1, arr2, arr3)");
            String cmd = sc.nextLine();
            if(cmd.equals("q")){
                System.out.println("Quit..)");
                break;
            }else if(cmd.equals("arr1")){
                // 1~10까지의 숫자를 하나 입력 받는다.
                System.out.println("Enter Number1(1~10):");
                String num1 = sc.nextLine();
                System.out.println("Enter Number2(1~10):");
                String num2 = sc.nextLine();
                System.out.printf("Input Number %s %s \n",num1,num2);
                System.out.printf("Plus: %s \n",num1+num2);
                int n1 = Integer.parseInt(num1);
                int n2 = Integer.parseInt(num2);
                System.out.printf("Add: %d \n",n1+n2);

            }else if(cmd.equals("arr2")){
                // 한개의 1~10까지의 숫자를 입력 받는다.
                // 해당 사이즈의 1차원 배열을 생성 한다.
                // 배열에 랜덤하게 1~10까지의 값을 입력 한다. 중복 되지 않게 입력
                // 1. 배열값을 출력
                // 2. 배열값이 합과 평균을 출력
                // 3. 최대, 최소 값 출력

            }else if(cmd.equals("arr3")){
                // 두개의 1~5까지의 숫자를 입력 받는다.
                // 해당 사이즈의 2차원 배열을 생성 한다.
                // 배열에 랜덤하게 1~30까지의 값을 입력 한다. 중복 되지 않게 입력
                // 1. 배열값을 출력
                // 2. 배열값이 합과 평균을 출력
                // 3. 최대, 최소 값 출력


            }else{
                System.out.println("Invalid Command...");
            }
        }
        sc.close();
    }
}

package baseball;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        // TODO: 프로그램 구현
        List<Integer> computer=new ArrayList<>();
        while(computer.size()<3){
            int randomNum= Randoms.pickNumberInRange(1,9);
            if(!computer.contains(randomNum)){
                computer.add(randomNum);
            }
        }


        String str=scanner.nextLine();
        int st=0;
        int ball=0;

        List<Integer> num=new ArrayList<>();
        for(int i=0;i<3;i++){
            num.add(str.charAt(i)-'0');
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(num.get(j)==computer.get(i)&&i==j){
                    st++;
                }
                else if(num.get(j)==computer.get(i)&&j!=i){
                    ball++;
                }
            }
        }

        if(st!=0&&ball==0)
            System.out.println(st+"스트라이크");
        else if(ball!=0&&st==0)
            System.out.println(ball+"볼");
        else if(st!=0&&ball!=0)
            System.out.println(ball+"볼"+st+"스트라이크");
        else
            System.out.println("낫싱");

    }
}

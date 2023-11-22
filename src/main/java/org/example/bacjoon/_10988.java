package org.example.bacjoon;
//티스토리 연동해야함
public class _10988 {
  public static void main(String[] args){
    int num1 =0;
    int num2 =1;
    int sum =1;
    int answer = 0;
    for(int i=0; i<166; i++){
      System.out.print(sum+" ");
      answer += sum;
      if(sum>100){
        System.out.println("오니?"+num2);
        System.out.println(answer-num2);
        break;
      }
      sum=num1+num2;
      num1=num2;
      num2=sum;
    }
  }
}

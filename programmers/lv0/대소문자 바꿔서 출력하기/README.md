--------------------------------------------------------------------------------------------------------------------------------------------------------------
[문제 설명]

영어 알파벳으로 이루어진 문자열 str이 주어집니다. 각 알파벳을 대문자는 소문자로 소문자는 대문자로 변환해서 출력하는 코드를 작성해 보세요.
--------------------------------------------------------------------------------------------------------------------------------------------------------------
[제한사항]

1 ≤ str의 길이 ≤ 20
str은 알파벳으로 이루어진 문자열입니다.
--------------------------------------------------------------------------------------------------------------------------------------------------------------
[입출력 예]

입력 #1
aBcDeFg
출력 #1
AbCdEfG
--------------------------------------------------------------------------------------------------------------------------------------------------------------
[풀이방법]

#1
import java.util.Scanner;
public class Solution1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String inputString = sc.next();
        // 문자열 입력받기. next()는 공백 전까지만 입력을 받음

        String result = "";
        // 결과를 담을 빈 문자열 준비

        for (int i = 0; i < inputString.length(); i++) {
            char choice = inputString.charAt(i);
            // inputString에 있는 문자열을 하나씩 꺼내서 choice에 저장

            if (Character.isUpperCase(choice))
            // choice의 값이 대문자라면 Character.isUpperCase(choice)은 true를 반환

                result += Character.toLowerCase(choice);
                // 빈 문자열인 result에 대문자인 choice값을 소문자로 변환해서 추가
            else
                result += Character.toUpperCase(choice);
                // choice값이 소문자이므로 대문자로 변환해서 result에 추가
        }
        System.out.print(result);
    }
}
--------------------------------------------------------------------------------------------------------------------------------------------------------------
[복습할 내용]

#1
        메서드                     설명                   예시
Character.isUpperCase(c)       대문자인지 확인         'A' → true
Character.isLowerCase(c)       소문자인지 확인         'a' → true
Character.toUpperCase(c)       대문자로 변환           'a' → 'A'
Character.toLowerCase(c)       소문자로 변환           'A' → 'a'

#2
char choice = inputString.charAt(i);
charAt(i)는 문자열에서 i번째 위치의 글자를 char 타입으로 꺼냄

#3
result += Character.toLowerCase(choice) 처럼 String에 += 를 반복하면
매번 새 String 객체가 생성됨
→ StringBuilder를 쓰면 하나의 객체에 계속 이어붙여서 더 효율적

StringBuilder sb = new StringBuilder();
sb.append(Character.toLowerCase(choice));  // 반복문 안에서
String result = sb.toString();             // 반복문 끝나고 한 번만
-------------------------------------------------------------------------------------------------------------------------------------------------------------- 

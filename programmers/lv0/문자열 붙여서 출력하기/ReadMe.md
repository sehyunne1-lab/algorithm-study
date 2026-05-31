----------------------------------------------------------------------------------------------
[문제 설명]

두 개의 문자열 str1, str2가 공백으로 구분되어 입력으로 주어집니다.
입출력 예와 같이 str1과 str2을 이어서 출력하는 코드를 작성해 보세요.
----------------------------------------------------------------------------------------------
[제한사항]

1 ≤ str1, str2의 길이 ≤ 10
----------------------------------------------------------------------------------------------
[입출력 예]

입력 #1
apple pen

출력 #1
applepen

입력 #2
Hello World!

출력 #2
HelloWorld!
----------------------------------------------------------------------------------------------
[풀이방법]

#1

import java.util.Scanner;
public class Solution1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String c = "";
        // 공백을 제거한 문자열을 담을 문자열 c 생성
        
        String ab = a + b;
        // a와 b를 합쳐줌

        for (int i = 0; i < ab.length(); i++) {
            if (ab.charAt(i) != ' ') {
            // ab를 하나씩 순회하며 공백이 아니라면 밑의 명령 실행

                c += ab.charAt(i);
                c에 그 공백이 아닌 문자를 대입
            }
        }
        System.out.print(c);
    }
}

#2
import java.util.Scanner;
public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        System.out.print((a + b).replace(" ", ""));
        // a와 b를 합치고 공백을 없앰
    }
}
----------------------------------------------------------------------------------------------
[복습할 내용]

#1
sc.next()는 공백 기준으로 잘라서 읽음
-> "apple pen" 입력 시: a = "apple", b = "pen" 으로 저장됨
-> 즉 a, b 안에는 공백이 없음

#2
String ab = a + b;
문자열 두 개를 + 로 이어붙일 수 있음

#3
for문으로 순회하며 특정 조건의 문자만 골라낼 때
if (ab.charAt(i) != ' ') 처럼 != 로 제외 조건을 걸 수 있음

#4
String.replace() — 문자열에서 특정 문자를 다른 문자로 교체

사용법
문자열.replace("바꿀 문자", "바꿔질 문자")

예시
"apple pen".replace(" ", "")   →   "applepen"
"hello".replace("l", "r")      →   "herro"

※ 공백 제거할 때는 바꿔질 문자를 ""(빈 문자열)로 넣으면 됨
----------------------------------------------------------------------------------------------

# 3단계 - 로또(자동)
## 기능 목록 (Core)
* 로또 구매에 유효한 금액인지 (1000원 이상인지, 1000원 단위인지) 확인한다.
* 로또 구매한 개수만큼 자동 로또 번호를 생성한다.
* 당첨 번호가 유효한 입력인지 확인한다.
* 자동로또번호와 당첨 번호를 비교하여 번호 일치 개수를 센다.
* 총 수익률(수익 / 구매비용, 소수점 2자리 이후 절삭)을 구한다.
## 기능 목록 (UI)
* 로또 구입 금액을 입력받는다.
* 로또 당첨 번호를 입력 받는다.
* 로또 당첨 통계를 출력한다.
* 총 수익률을 출력한다.
---------------
## 처리과정
1. 로또(자동) 프로그램 시작한다.
2. 로또 구입 금액을 입력받는다.
3. 유효한 구입 금액인지 확인해서
    1. 유효하지 않으면 종료한다.
4. 구입 금액만큼 로또 번호를 생성(구매)한다.
5. 지난 주 당첨 번호를 입력 받는다.
    1. 유효하지 않으면 재입력 받는다.
6. 구입한 로또와 당첨 번호를 비교한다.
    1. 일치하는 개수를 센다.
7. 로또들의 결과로 당첨 통계를 낸다.
8. 로또들의 결과 금액과 로또 구입 금액으로 수익률을 낸다.
9. 종료한다.
--------------
## 기능 요구사항
* 로또 구입 금액을 입력하면 구입 금액에 해당하는 로또를 발급해야 한다.
* 로또 1장의 가격은 1000원이다.

![img.png](img.png)

#### 힌트
* 로또 자동 생성은 Collections.shuffle() 메소드 활용한다.
* Collections.sort() 메소드를 활용해 정렬 가능하다.
* ArrayList의 contains() 메소드를 활용하면 어떤 값이 존재하는지 유무를 판단할 수 있다.
-----------

## 프로그래밍 요구사항
* 모든 기능을 TDD로 구현해 단위 테스트가 존재해야 한다. 단, UI(System.out, System.in) 로직은 제외 
    * 핵심 로직을 구현하는 코드와 UI를 담당하는 로직을 구분한다.
    * UI 로직을 InputView, ResultView와 같은 클래스를 추가해 분리한다.
* indent(인덴트, 들여쓰기) depth를 2를 넘지 않도록 구현한다. 1까지만 허용한다.
    * 예를 들어 while문 안에 if문이 있으면 들여쓰기는 2이다.
    * 힌트: indent(인덴트, 들여쓰기) depth를 줄이는 좋은 방법은 함수(또는 메소드)를 분리하면 된다.
* 함수(또는 메소드)의 길이가 15라인을 넘어가지 않도록 구현한다.
    * 함수(또는 메소드)가 한 가지 일만 잘 하도록 구현한다.
* 모든 로직에 단위 테스트를 구현한다. 단, UI(System.out, System.in) 로직은 제외
    * 핵심 로직을 구현하는 코드와 UI를 담당하는 로직을 구분한다.
    * UI 로직을 InputView, ResultView와 같은 클래스를 추가해 분리한다.
* 자바 코드 컨벤션을 지키면서 프로그래밍한다.
    * 참고문서: https://google.github.io/styleguide/javaguide.html 또는 https://myeonguni.tistory.com/1596
* else 예약어를 쓰지 않는다.
    * 힌트: if 조건절에서 값을 return하는 방식으로 구현하면 else를 사용하지 않아도 된다.
    * else를 쓰지 말라고 하니 switch/case로 구현하는 경우가 있는데 switch/case도 허용하지 않는다.
-----------
##기능 목록 및 commit 로그 요구사항  
기능을 구현하기 전에 README.md 파일에 구현할 기능 목록을 정리해 추가한다.
git의 commit 단위는 앞 단계에서 README.md 파일에 정리한 기능 목록 단위로 추가한다.  
####참고문서: AngularJS Commit Message Conventions
AngularJS Commit Message Conventions 중
commit message 종류를 다음과 같이 구분  
<code>
feat (feature)  
fix (bug fix)  
docs (documentation)  
style (formatting, missing semi colons, …)  
refactor  
test (when adding missing tests)  
chore (maintain)  
</code>  
  
**************
****************

# 2단계 - 문자열 덧셈 계산기
## 기능 목록
* 문자열이 null이나 0이면 0 반환한다.
* 문자열에 커스텀구분자가 있으면 적용한다.
* 문자열에서 구분자로 분리된 숫자문자열을 추출한다.
* 숫자문자열에서 구분자로 숫자들을 분해한다.
* 분해한 숫자들을 합산한다.

## Process
1. 문자열를 입력받는다.
2. 문자열이 null이나 0인지 확인한다.
    * 해당되면 -> 0 반환한다.
3. 문자열의 커스텀구분자가 설정되어있는지 확인한다.
    * 있으면 -> 구분자로 지정한다.
4. 설정된 구분자로 숫자문자열을 분해한다.
    * 음수가 있으면 -> 런타임 예외처리한다.
5. 분해한 숫자들을 합산한다.
6. 합산 값을 반환한다.
-----------

## 기능 요구사항
* 쉼표(,) 또는 콜론(:)을 구분자로 가지는 문자열을 전달하는 경우 구분자를 기준으로 분리한 각 숫자의 합을 반환 (예: “” => 0, "1,2" => 3, "1,2,3" => 6, “1,2:3” => 6)
* 앞의 기본 구분자(쉼표, 콜론)외에 커스텀 구분자를 지정할 수 있다. </br>
  커스텀 구분자는 문자열 앞부분의 “//”와 “\n” 사이에 위치하는 문자를 커스텀 구분자로 사용한다. </br>
  예를 들어 “//;\n1;2;3”과 같이 값을 입력할 경우 커스텀 구분자는 세미콜론(;)이며, 결과 값은 6이 반환되어야 한다.</br>
* 문자열 계산기에 숫자 이외의 값 또는 음수를 전달하는 경우 RuntimeException 예외를 throw한다.
## 프로그래밍 요구사항
* indent(들여쓰기) depth를 2단계에서 1단계로 줄여라.
* depth의 경우 if문을 사용하는 경우 1단계의 depth가 증가한다. </br>
  if문 안에 while문을 사용한다면 depth가 2단계가 된다.
* 메소드의 크기가 최대 10라인을 넘지 않도록 구현한다.
* method가 한 가지 일만 하도록 최대한 작게 만들어라.
* else를 사용하지 마라.

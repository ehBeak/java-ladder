# java-ladder

사다리 타기 미션 저장소

## 우아한테크코스 코드리뷰

- [온라인 코드 리뷰 과정](https://github.com/woowacourse/woowacourse-docs/blob/master/maincourse/README.md)

## 기능 요구사항

### 입력
- 참가자들의 이름 입력
  - [x] "참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)"을 출력한다.
  - [x] 참여할 사람의 이름입력 받고 ,로 구분한다.
- 실행 결과 입력
  - [x] "실행 결과를 입력하세요. (결과는 쉼표(,)로 구분하세요)"를 출력한다.
  - [x] 실행 결과를 입력받고 ,로 구분한다.
- 사다리 높이 입력
  - [x] "최대 사다리 높이는 몇 개인가요?" 을 출력한다.
  - [x]  최대 사다리의 높이를 입력 받는다.
- 보고 싶은 결과를 입력
  - [x] 보고 싶은 결과를 입력 받는다.
    - [x] "결과를 보고 싶은 사람은?"을 출력한다.
    - [x] "all"이나 원하는 사람의 이름을 출력한다.
  

### 참가자
- 참가자의 이름
  - [x] 참가자의 이름은 최대 5글자까지 부여할 수 있다.
  - [x] 참가자의 이름은 `null` 이거나 공백일 수 없다.
  - [x] 참가자의 이름은 "all"일 수 없다.

### 참가자들
- 참가자들
  - [x] 중복된 참가자들은 존재할 수 없다.
  - [x] 참가자의 수는 한 명 이상이어야 한다.

### 사다리 게임
- [x] 참가자의 결과를 알아낸다.
- [x] 모든 참가자의 결과를 알아낸다.
- [x] 사다리의 위치에 따라 결과를 제공한다.
- [x] 참가자의 크기와 결과의 크기가 동일해야 한다.

### 사다리
- 사다리
  - [x] 사다리의 행은 최대 사다리의 높이의 개수와 같다.
  - [x] 사다리의 행 내부의 라인은 랜덤하게 결정한다.
    - [x] 한 행에는 연속된 선이 존재하면 안된다.
  - [x] 최대 사다리의 높이는 양수가 되어야 한다.
  - [x] 참가자의 전체 이동 결과를 알아낸다.

- 사다리의 행 생성기
  - [x] 행 내부의 라인이 겹치지 않도록 생성할 수 있다.

- 사다리 행
  - [x] 연속되는 라인이 존재하는지 검증한다.
  - [x] 참가자들의 번호를 주면 이동할 수 있는지 아닌지 알려준다.
  - [x] 사다리 행을 타고 난 뒤, 참가자들의 위치를 알려준다.

### 위치
- [x] 참가자의 위치를 나타낸다.
- [x] 위치는 양수가 되어야 한다.


### 출력
- 참가자 이름 출력
  - [x] 참가자의 이름을 5자 기준으로 출력한다.
- 사다리 출력
  - [x] 랜덤하게 생성된 사다리를 출력한다.
- 사다리 실행 결과
  - [x] 사다리 실행 결과를 출력한다.
  - [x] 개인별 이름을 입력하면 개인별 결과를 출력한다.
  - [x] "all"을 입력하면 전체 참여자의 실행 결과를 출력한다.


### 예시
실행 결과
위 요구사항에 따라 4명의 사람을 위한 5개 높이 사다리를 만들 경우, 프로그램을 실행한 결과는 다음과 같다.
```
참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)
pobi,honux,crong,jk

실행 결과를 입력하세요. (결과는 쉼표(,)로 구분하세요)
꽝,5000,꽝,3000

최대 사다리 높이는 몇 개인가요?
5

사다리 결과

pobi  honux crong   jk
    |-----|     |-----|
    |     |-----|     |
    |-----|     |     |
    |     |-----|     |
    |-----|     |-----|
꽝    5000  꽝    3000

결과를 보고 싶은 사람은?
pobi

실행 결과
꽝

결과를 보고 싶은 사람은?
all

실행 결과
pobi : 꽝
honux : 3000
crong : 꽝
jk : 5000

```

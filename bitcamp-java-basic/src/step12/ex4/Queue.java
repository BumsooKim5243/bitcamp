// Queue : FIFO;
package step12.ex4;

import step12.ex2.LinkedList;

// Queue 사용의 예:
// => 인터넷 예약 처리할 때
// => single -thread 기반 node 서버의 요청처리
// => 마우스 또는 키보드 이벤트 처리(이벤트가 발생된 순서대로 처리)
public class Queue extends LinkedList {
    // 맨 뒤에 값을 넣는다.
    public void offer(Object value) {
        this.add(value);
    }
    // 맨 앞의 값을 꺼낸다.
    public Object poll() {
        return this.remove(0);
    }
}

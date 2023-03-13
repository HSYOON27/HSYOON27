# jQuery의 주요 명령

jQuery에서 사용할 수 있는 주요 명령은 다음과 같다.

| 함수 | 설명 |
| --- | --- |
| .css(이름, 값) | 이름에 해당하는 CSS 속성을 값으로 변경한다 |
| .css(이름) | 이름에 해당하는 CSS 속성을 반환한다 |
| .val(값) | 대상의 value를 변경한다 |
| .val() | 대상의 value를 반환한다 |
| .text(값) | 대상의 textContent를 변경한다 |
| .text() | 대상의 textContent를 반환한다 |
| .html(값) | 대상의 innerHTML을 변경한다 |
| .html() | 대상의 innerHTML을 반환한다 |
| .prop(이름, 값) | 대상의 태그 속성(property)을 변경한다 |
| .prop(이름) | 대상의 태그 속성(property)을 반환한다 |
| .attr(이름, 값) | 대상의 태그 속성(attribute)을 변경한다 |
| .attr(이름) | 대상의 태그 속성(attribute)을 반환한다 |
| .data(이름) | 대상의 커스텀 속성(data-)을 반환한다 |

# jQuery DOM 탐색 명령

jQuery에서 특정 태그를 기준으로 대상 태그를 탐색할 수 있는 명령을 제공한다.

| jQuery | Javascript | 설명 |
| --- | --- | --- |
| .next() | .nextElementSibling | 다음 태그를 선택 |
| .nextAll() | - | 뒤에 있는 모든 태그를 선택 |
| .prev() | .prevElementSibling | 이전 태그를 선택 |
| .prevAll() | - | 앞에 있는 모든 태그를 선택 |
| .parent() | .parentNode | 상위 태그를 선택 |
| .parents() | - | 상위 모든 태그를 선택 |
| .children() | .children | 하위 태그를 선택 |
| .find() | .querySelector() | 내부 태그를 검색 |
| .filter() | - | 선택된 대상을 조건으로 한번 더 필터링 |
| .first() | - | 선택된 대상 중 첫 번째 태그를 선택 |
| .last() | - | 선택된 대상 중 마지막 태그를 선택 |
| .eq(index) | - | 선택된 대상 중 지정된 index 위치의 태그를 선택 |

# jQuery 클래스 제어

| 함수 | 설명 |
| --- | --- |
| .addClass() | 클래스 추가 |
| .removeClass() | 클래스 제거 |
| .hasClass() | 클래스 검사 |
| .toggleClass() | 클래스 토글 |

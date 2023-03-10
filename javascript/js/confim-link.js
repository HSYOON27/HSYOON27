/**
 * 확인 메세지 출력 후 이동하는 링크 구현
 * 
 * 만든이 : 윤형석
 */

 //독립형 자바 스크립트 템플릿 

         

        window.addEventListener("load", function(){

            var confirmLinkList = document.querySelectorAll(".confirm-link");
            for(var i=0; i < confirmLinkList.length; i++){
                confirmLinkList[i].addEventListener("click", function(e){
                    //안내메세지 설정
                    var text = this.dataset.message || "정말 이동하시겠습니까?";
                    // var text;
                    // if(!this.dataset.message) {
                    //     text = "정말 이동하시겠습니까?";
                    // }
                    // else {
                    //     text = this.dataset.message;
                    // }

                    var choice = window.confirm(text);
                    if(choice == false) {
                        e.preventDefault();
                    }
                });
            }

        });
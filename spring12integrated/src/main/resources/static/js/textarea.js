
   $(function(){
            $('[name=boardContent]').summernote({
                placeholder: '내용 작성',
                tabsize: 4,//탭키를 누르면 띄어쓰기 몇 번 할지
                height: 250,//최초 표시될 높이(px)
                toolbar: [//메뉴 설정
                    ['style', ['style']],
                    ['font', ['bold', 'underline', 'clear']],
                    ['color', ['color']],
                    ['para', ['ul', 'ol', 'paragraph']],
                    ['table', ['table']],
                    ['insert', ['link', 'picture']]
                ]
            });
        });
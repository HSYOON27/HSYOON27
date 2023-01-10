package oop.inherit4;
//상위 클래스 
public class Files {
	// 공통 필드
		private String filename;
		private String filesize;
		
		public String getFilename() {
			return filename;
		}
		public void setFilename(String filename) {
			this.filename = filename;
		}
		public String getFilesize() {
			return filesize;
		}
		public void setFilesize(String filesize) {
			this.filesize = filesize;
		}
		
	//공통 메서드
		public void execute() {
			System.out.println("실행 기능");
		}
}

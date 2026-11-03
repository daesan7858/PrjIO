package ex01;

import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriter {

	public static void main(String[] args) throws IOException {
		
		// java 에서 "" 안에 \ 를 한 개만 넣으면 에러발생
		//           ""      \ -> \\
		// 특수기능 \t : tab, \n : enter, \r : enter, \f : 프린터 용지변경(form feed)
		// 특수문자가 아니라 경로로 표시하려면 "\" -> "\\"
		
		String 	[]	names 		= {"RM", "진", "슈가", "제이홉", "지민", "뷔", "정국"};

		String		filename 	= "D:\\san\\java\\PrjIO\\src\\ex01\\bts.txt";
		//== String	filename	= "D:/san/java/PrjIO/src/ex01";
		// System.out.println(filename);
		// 파일 생성 : open ~ close 하면 새로운 파일이 생성
		// java 는 open 명령을 new 할 때 실행함
		FileWriter	fw	=	new FileWriter(filename);
		
		for (int i = 0; i < names.length; i++) {
			fw.write( (i + 1) + "." + names[i] + "\n");
		}
		
		fw.close();
		
		System.out.println(filename + "이 저장되었습니다");

	}

}

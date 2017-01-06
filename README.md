# hwplib

한글과 컴퓨터(한컴)에서 만든 워드프로세서 "한글"의 파일에 대한 라이브러리입니다.

본 라이브러리는 JAVA로 구현되었으며, 한글 파일의 하부 구조인 Microsoft Compound File의 읽기 부분은 Apache-POI의 POIFS File System을 사용하여 처리합니다.
본 라이브러리는 한글과컴퓨터의 한글 문서 파일(.hwp) 공개 문서를 참고하여 개발하였습니다. 한컴에서 제공하는 문서(HWP 5.0)는 아래URL에서 받을 수 있습니다. 

http://www.hancom.com/etc/hwpDownload.do?gnb0=269&gnb1=271&gnb0=101&gnb1=140


2017.1.6
=========================================================================================

* 텍스트 추출기 모듈을 추가하였습니다. <br>

	HWPFile hwpFile = HWPReader.fromFile(filename); <br>
	String hwpText = TextExtractor.extract(hwpFile, TextExtractMethod.InsertControlTextBetweenParagraphText); <br> 
	
 	TextExtractor.extract()의 두번째 파라미터 값에 따라 세가지 추출 방법을 구현했습니다.
	
	/**
	 * 메인 문단에 포함된 텍스트만 추출함
	 */
	OnlyMainParagraph,
	/**
	 * 컨트롤의 텍스트를 문단 텍스트 사이에 삽입하여 추출함
	 */
	InsertControlTextBetweenParagraphText,
	/**
	 * 컨트롤의 텍스트를 문단 텍스트 뒤에 추가하여 추출함
	 */
	AppendControlTextAfterParagraphText
	
* 읽기 모듈에서 버그 수정하였습니다. <br>

* 소스 인코딩을 euc-kr에서 utf-8로 변경하였습니다. <br>

	

2016.12.23 
=========================================================================================
* 이 번 배포버전은 읽기 모듈 까지만 구현되었습니다. 쓰기 모듈은 추후 상황을 봐서 구현할 계획입니다. <br>
	사용법은 
	
	HWPFile hwpFile = HWPReader.fromFile(filename);  			// 파일을 읽는다. <br>	
	Section s = hwpFile.getBodyText().getSectionList().get(0); 		// 파일에서 첫번째 구역을 얻는다. <br>	
	Paragraph p = s.getParagraphList().get(0);				// 첫번째 구역에서 첫번째 문단을 얻는다. <br>
	...		
	
	입니다.
	
	각각의 객체들과 객체에 포함된 메소스들에 대해선 "/doc" 디렉토리에 있는 javadoc 문서를 참고하시기 바랍니다.


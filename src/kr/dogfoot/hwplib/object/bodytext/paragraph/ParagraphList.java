package kr.dogfoot.hwplib.object.bodytext.paragraph;

import java.util.ArrayList;

import kr.dogfoot.hwplib.object.bodytext.ParagraphListInterface;

/**
 * 문단 리스트를 나타내는 객체
 * 
 * @author neolord
 */
public class ParagraphList implements ParagraphListInterface {
	/**
	 * 문단 리스트
	 */
	private ArrayList<Paragraph> paragraphList;

	/**
	 * 생성자
	 */
	public ParagraphList() {
		paragraphList = new ArrayList<Paragraph>();
	}

	/**
	 * 새로운 문단를 생성하고 리스트에 추가한다.
	 * 
	 * @return 새로 생성된 문단
	 */
	@Override
	public Paragraph addNewParagraph() {
		Paragraph p = new Paragraph();
		paragraphList.add(p);
		return p;
	}

	/**
	 * 문단 리스트를 반환한다.
	 * 
	 * @return 문단 리스트
	 */
	@Override
	public ArrayList<Paragraph> getParagraphList() {
		return paragraphList;
	}
}
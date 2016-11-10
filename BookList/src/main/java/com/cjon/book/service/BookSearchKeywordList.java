package com.cjon.book.service;

import com.cjon.book.dto.BookDTO;

public class BookSearchKeywordList implements BookService {
	
	@Override
	public String execute(BookDTO dto){
		BookDAO dao = new BookDAO();
		System.out.println("in bskl : "+dto.getBtitle());
		String result = dao.select(dto);

		return result;
		
	}

}

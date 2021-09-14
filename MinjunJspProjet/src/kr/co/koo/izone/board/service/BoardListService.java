package kr.co.koo.izone.board.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.koo.izone.board.model.BoardDAO;
import kr.co.koo.izone.board.model.BoardVO;

public class BoardListService implements IBoardService {
	
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		BoardDAO dao = BoardDAO.getInstance();
		List<BoardVO> articles = dao.getBoardArticles();
		request.setAttribute("articles", articles);
	}
	
}



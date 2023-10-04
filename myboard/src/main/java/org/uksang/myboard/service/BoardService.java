package org.uksang.myboard.service;

import org.springframework.data.domain.Page;
import org.uksang.myboard.dto.BoardDTO;
import org.uksang.myboard.dto.PageRequestDTO;
import org.uksang.myboard.dto.PageResponseDTO;
import org.uksang.myboard.entity.Board;

public interface BoardService {

    Long register(BoardDTO boardDTO);

    BoardDTO readOne(Long bno);

    void modify(BoardDTO boardDTO);

    void remove(Long bno);

    PageResponseDTO<BoardDTO> list(PageRequestDTO pageRequestDTO);

}

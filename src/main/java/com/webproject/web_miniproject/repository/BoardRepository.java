package com.webproject.web_miniproject.repository;

import com.webproject.web_miniproject.domain.Board;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long>, CustomBoardRepository {
    
}

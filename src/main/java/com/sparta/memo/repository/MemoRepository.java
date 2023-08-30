package com.sparta.memo.repository;

import com.sparta.memo.entity.Memo;
import org.springframework.data.jpa.repository.JpaRepository;

//@Component// bean 객체로 등록하기

public interface MemoRepository extends JpaRepository<Memo, Long> { //DB 작업



}

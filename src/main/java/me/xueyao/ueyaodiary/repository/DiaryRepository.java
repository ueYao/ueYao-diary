package me.xueyao.ueyaodiary.repository;

import me.xueyao.ueyaodiary.domain.entity.Diary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Simon.Xue
 * @date 2023/11/27 21:16
 **/
@Repository
public interface DiaryRepository extends JpaRepository<Diary, Integer> {
}

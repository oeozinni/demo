package sbb.mysite.ex.question;

import org.springframework.data.jpa.repository.JpaRepository;
import sbb.mysite.ex.question.Question;

public interface QuestionRepository extends JpaRepository<Question, Integer> {

}

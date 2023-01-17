package sbb.mysite.ex;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import sbb.mysite.ex.question.Question;
import sbb.mysite.ex.question.QuestionRepository;

@SpringBootTest
class DemoApplicationTests {
	@Autowired
	private QuestionRepository questionRepository;
	@Test
	void testJpa() {
		List<Question> all = this.questionRepository.findAll();
		assertEquals(6, all.size());

		Question q = all.get(0);
		assertEquals("sbb가 무엇인가요?", q.getSubject());
	}

}

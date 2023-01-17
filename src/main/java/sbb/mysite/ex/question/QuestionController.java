package sbb.mysite.ex.question;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@Controller
public class QuestionController {

    private final QuestionRepository questionRepository;
    @GetMapping("/question/list")

    public String list(Model model) {
        List<Question> questionList = this.questionRepository.findAll();
        model.addAllAttributes("questionList", questionList);

        return "question_list"; //html 파일이름 리턴
    }
}

package dev.pedrobibiano.TreinoLab.Exercise;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ExerciseController {

    @GetMapping("/exercicio")
    public String Exercise(){
        return "exercicios";
    }

}

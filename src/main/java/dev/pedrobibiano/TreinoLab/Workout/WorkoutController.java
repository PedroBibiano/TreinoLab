package dev.pedrobibiano.TreinoLab.Workout;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class WorkoutController {

    @GetMapping("/treino")
    public String WorkoutController(){
        return "Treinos";
    }

}

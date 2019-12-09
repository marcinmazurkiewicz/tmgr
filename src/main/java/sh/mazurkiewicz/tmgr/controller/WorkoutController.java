package sh.mazurkiewicz.tmgr.controller;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import sh.mazurkiewicz.tmgr.domain.Workout;
import sh.mazurkiewicz.tmgr.service.ExerciseService;
import sh.mazurkiewicz.tmgr.service.WorkoutService;

@Controller("/workouts")
public class WorkoutController {

  private final WorkoutService workoutService;
  private final ExerciseService exerciseService;

  public WorkoutController(WorkoutService workoutService, ExerciseService exerciseService) {
    this.workoutService = workoutService;
    this.exerciseService = exerciseService;
  }

  @Get
  public Workout save() {
    Workout workout = new Workout();
//    workout.setExercise(exerciseService.getById());
    return workoutService.save(workout);
  }
}

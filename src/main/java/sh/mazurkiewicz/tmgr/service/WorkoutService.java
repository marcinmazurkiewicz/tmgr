package sh.mazurkiewicz.tmgr.service;

import javax.inject.Singleton;

import sh.mazurkiewicz.tmgr.domain.Workout;
import sh.mazurkiewicz.tmgr.interfaces.IWorkoutService;
import sh.mazurkiewicz.tmgr.repository.WorkoutRepository;

@Singleton
public class WorkoutService implements IWorkoutService {

  private final WorkoutRepository repository;

  public WorkoutService(WorkoutRepository repository) {
    this.repository = repository;
  }

  public Workout save(Workout workout) {
    return repository.save(workout);
  }
}

package sh.mazurkiewicz.tmgr.service;

import javax.inject.Inject;
import javax.inject.Singleton;

import sh.mazurkiewicz.tmgr.domain.Exercise;
import sh.mazurkiewicz.tmgr.interfaces.IExerciseService;
import sh.mazurkiewicz.tmgr.repository.ExerciseRepository;

@Singleton
public class ExerciseService implements IExerciseService {

  private final ExerciseRepository repository;

  @Inject
  public ExerciseService(ExerciseRepository repository) {
    this.repository = repository;
  }


  public Exercise save(Exercise exercise) {
    return repository.save(exercise);
  }

  public Exercise getById(Long id) {
    return repository.findById(id).get();
  }
}

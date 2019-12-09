package sh.mazurkiewicz.tmgr.repository;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;
import sh.mazurkiewicz.tmgr.domain.Exercise;

@Repository
public interface ExerciseRepository extends CrudRepository<Exercise, Long> {
}

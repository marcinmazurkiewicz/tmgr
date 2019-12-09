package sh.mazurkiewicz.tmgr.repository;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;
import sh.mazurkiewicz.tmgr.domain.Workout;

@Repository
public interface WorkoutRepository extends CrudRepository<Workout, Long> {
}

package sh.mazurkiewicz.tmgr.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="workouts")
public class Workout {

  private Long id;
  private LocalDateTime date;
  private long userId;
  private Exercise exercise;
  private List<WorkoutSet> sets;

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public LocalDateTime getDate() {
    return date;
  }

  public void setDate(LocalDateTime date) {
    this.date = date;
  }

  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }

  @ManyToOne
  @JoinColumn(name="exercise_id", nullable = false)
  public Exercise getExercise() {
    return exercise;
  }

  public void setExercise(Exercise exercise) {
    this.exercise = exercise;
  }

  @OneToMany(mappedBy = "workout")
  public List<WorkoutSet> getSets() {
    return sets;
  }

  public void setSets(List<WorkoutSet> sets) {
    this.sets = sets;
  }
}

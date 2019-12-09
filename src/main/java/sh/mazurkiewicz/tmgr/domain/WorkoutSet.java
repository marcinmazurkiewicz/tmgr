package sh.mazurkiewicz.tmgr.domain;

import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="sets")
public class WorkoutSet {

  private Long id;
  private int setNo;
  private int doneReps;
  private BigDecimal weight;
  private int weightMultiplier;
  private Workout workout;

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public int getSetNo() {
    return setNo;
  }

  public void setSetNo(int setNo) {
    this.setNo = setNo;
  }

  public int getDoneReps() {
    return doneReps;
  }

  public void setDoneReps(int doneReps) {
    this.doneReps = doneReps;
  }

  public BigDecimal getWeight() {
    return weight;
  }

  public void setWeight(BigDecimal weight) {
    this.weight = weight;
  }

  public int getWeightMultiplier() {
    return weightMultiplier;
  }

  public void setWeightMultiplier(int weightMultiplier) {
    this.weightMultiplier = weightMultiplier;
  }

  @ManyToOne
  @JoinColumn(name="workout_id", nullable = false)
  public Workout getWorkout() {
    return workout;
  }

  public void setWorkout(Workout workout) {
    this.workout = workout;
  }
}

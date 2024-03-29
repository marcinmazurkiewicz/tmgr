package sh.mazurkiewicz.tmgr.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="exercises")
public class Exercise {

  private long id;
  private String name;
  private String description;
  private String externalDescriptionUrl;
  private int suggestRepetitions;
  private int suggestSeries;

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  @Column
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Column
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Column
  public int getSuggestRepetitions() {
    return suggestRepetitions;
  }

  public void setSuggestRepetitions(int suggestRepetitions) {
    this.suggestRepetitions = suggestRepetitions;
  }

  @Column
  public int getSuggestSeries() {
    return suggestSeries;
  }

  public void setSuggestSeries(int suggestSeries) {
    this.suggestSeries = suggestSeries;
  }

  @Column(name="external_url")
  public String getExternalDescriptionUrl() {
    return externalDescriptionUrl;
  }

  public void setExternalDescriptionUrl(String externalDescriptionUrl) {
    this.externalDescriptionUrl = externalDescriptionUrl;
  }
}

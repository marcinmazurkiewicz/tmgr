package sh.mazurkiewicz.tmgr.controller;


import javax.inject.Inject;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import sh.mazurkiewicz.tmgr.domain.Exercise;
import sh.mazurkiewicz.tmgr.interfaces.IExerciseService;

@Controller("/samples")
public class ExerciseController {

  private final IExerciseService service;

  @Inject
  public ExerciseController(IExerciseService service) {
    this.service = service;
  }

  @Get
  public Exercise saveSample() {
    Exercise sample = new Exercise();
    sample.setName("cwiczenie 1");
    sample.setDescription("opis cwiczenia 1");
    sample.setSuggestRepetitions(15);
    sample.setSuggestSeries(4);
    sample.setExternalDescriptionUrl("www.www.www");
    return service.save(sample);
  }


}

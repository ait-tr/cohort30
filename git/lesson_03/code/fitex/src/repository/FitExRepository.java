package repository;

import model.FitEx;

import java.time.LocalDate;
import java.util.List;

public interface FitExRepository extends CrudRepository<FitEx>{

    List<FitEx> findFitExByDate(LocalDate dateFrom, LocalDate dateTo);

}

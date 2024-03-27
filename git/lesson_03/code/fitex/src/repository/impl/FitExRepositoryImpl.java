package repository.impl;

import model.FitEx;
import repository.FitExRepository;

import java.time.LocalDate;
import java.util.List;

public class FitExRepositoryImpl implements FitExRepository {
    @Override
    public void save(FitEx model) {

    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public void update(int id, FitEx model) {

    }

    @Override
    public FitEx findById(int id) {
        return null;
    }

    @Override
    public List<FitEx> findAll() {
        return null;
    }

    @Override
    public List<FitEx> findFitExByDate(LocalDate dateFrom, LocalDate dateTo) {
        return null;
    }
}

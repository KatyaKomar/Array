package by.task.komar.service;

import by.task.komar.entity.EntityArray;
import by.task.komar.exception.ArrayException;

public interface ArrayCalculationService {
    int sumOfArray(EntityArray array) throws ArrayException;

    double findAverage(EntityArray array) throws ArrayException;

    int countPositiveElements(EntityArray array) throws ArrayException;

    int countNegativeElements(EntityArray array) throws ArrayException;
}

package by.task.komar.service;

import by.task.komar.entity.EntityArray;
import by.task.komar.exception.ArrayException;

public interface ArraySortService {

    EntityArray quickSort(EntityArray arrayEntity) throws ArrayException;

    EntityArray countingSort(EntityArray arrayEntity) throws ArrayException;

    EntityArray mergeSort(EntityArray arrayEntity) throws ArrayException;
}
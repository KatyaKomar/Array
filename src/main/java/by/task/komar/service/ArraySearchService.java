package by.task.komar.service;

import by.task.komar.entity.EntityArray;
import by.task.komar.exception.ArrayException;

public interface ArraySearchService {

    int findMin(EntityArray array) throws ArrayException;

    int findMax(EntityArray array) throws ArrayException;
}
